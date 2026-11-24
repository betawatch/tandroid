package org.telegram.ui.Wallet;

import android.util.Base64;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public class WalletEngine2 implements AutoCloseable {
    private static final long NFT_ATTACHED_NANOGRAMS = 100000000;
    private static final long NFT_FORWARD_NANOGRAMS = 10000000;
    private static String[] mnemonicWordlist;
    public final String address;
    private volatile boolean closed;
    public final int currentAccount;
    private String nftPreviewAddress;
    private String nftPreviewComment;
    private String nftPreviewOperationId;
    private String nftPreviewRecipient;
    private f pendingSend;
    private long ptr;
    public final byte[] publicKey;
    private ScheduledFuture<?> resolutionTask;
    private final HttpTransport transport;
    private final ScheduledExecutorService worker = Executors.newSingleThreadScheduledExecutor(new x20(10));
    private long nextAuxiliaryRequestId = -1;

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    public static class HttpTransport {
        private boolean closed;
        public final int currentAccount;
        private final HashMap<Long, e> pending = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
        static class HostException extends RuntimeException {
            final int kind;

            public HostException(int i) {
                super("Wallet provider request failed");
                this.kind = i;
            }
        }

        public HttpTransport(int i) {
            this.currentAccount = i;
        }

        private ConnectionsManager getConnectionsManager() {
            return ConnectionsManager.getInstance(this.currentAccount);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$execute$0(e eVar, TL_toncenter.apiResponse apiresponse, TLRPC.TL_error tL_error) {
            TLRPC.TL_dataJSON tL_dataJSON;
            String str;
            if (tL_error != null) {
                eVar.a(null, new HostException(3));
            } else if (apiresponse == null || (tL_dataJSON = apiresponse.response) == null || (str = tL_dataJSON.data) == null) {
                eVar.a(null, new HostException(7));
            } else {
                eVar.a(str.getBytes(StandardCharsets.UTF_8), null);
            }
        }

        public void cancel(long j) {
            synchronized (this.pending) {
                e eVar = this.pending.get(Long.valueOf(j));
                if (eVar != null) {
                    eVar.a(null, new HostException(6));
                }
            }
        }

        public void close() {
            synchronized (this.pending) {
                this.closed = true;
                Iterator<e> it = this.pending.values().iterator();
                while (it.hasNext()) {
                    it.next().a(null, new HostException(6));
                }
            }
        }

        public byte[] execute(long j, String str, boolean z, byte[] bArr, long j2) {
            int i;
            HashMap<Long, e> hashMap;
            try {
                URI create = URI.create(str);
                if (!"https".equalsIgnoreCase(create.getScheme()) || !"toncenter.com".equalsIgnoreCase(create.getHost()) || create.getRawUserInfo() != null || create.getRawFragment() != null || ((create.getPort() != -1 && create.getPort() != 443) || j2 <= 0)) {
                    throw new HostException(4);
                }
                TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                performapirequest.post = z;
                performapirequest.endpoint = create.getRawPath();
                performapirequest.query = create.getRawQuery();
                performapirequest.payload = bArr.length == 0 ? null : new String(bArr, StandardCharsets.UTF_8);
                e eVar = new e();
                long nanoTime = System.nanoTime();
                byte b = 1;
                try {
                    try {
                        HashMap<Long, e> hashMap2 = this.pending;
                        try {
                            synchronized (hashMap2) {
                                try {
                                    try {
                                        if (this.closed) {
                                            throw new HostException(6);
                                        }
                                        try {
                                            this.pending.put(Long.valueOf(j), eVar);
                                            try {
                                                eVar.b = getConnectionsManager().sendRequestTyped(performapirequest, new hc(b), new n4b(eVar, (byte) 12), na7.q1(this.currentAccount).r3, 0);
                                            } catch (Throwable th) {
                                                th = th;
                                                hashMap = hashMap2;
                                                i = 6;
                                                try {
                                                    throw th;
                                                } catch (InterruptedException unused) {
                                                    Thread.currentThread().interrupt();
                                                    eVar.a(null, new HostException(i));
                                                    throw new HostException(i);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            hashMap = hashMap2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    i = 6;
                                    hashMap = hashMap2;
                                }
                            }
                            try {
                                if (!eVar.a.await(Math.max(0L, TimeUnit.MILLISECONDS.toNanos(j2) - (System.nanoTime() - nanoTime)), TimeUnit.NANOSECONDS)) {
                                    eVar.a(null, new HostException(2));
                                }
                                HostException hostException = eVar.d;
                                if (hostException != null) {
                                    throw hostException;
                                }
                                byte[] bArr2 = eVar.c;
                                synchronized (this.pending) {
                                    this.pending.remove(Long.valueOf(j));
                                    if (eVar.d != null && eVar.b != 0) {
                                        getConnectionsManager().cancelRequest(eVar.b, true);
                                    }
                                }
                                return bArr2;
                            } catch (InterruptedException unused2) {
                                i = 6;
                                Thread.currentThread().interrupt();
                                eVar.a(null, new HostException(i));
                                throw new HostException(i);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (InterruptedException unused3) {
                        i = 6;
                    }
                } catch (Throwable th6) {
                    synchronized (this.pending) {
                        this.pending.remove(Long.valueOf(j));
                        if (eVar.d != null && eVar.b != 0) {
                            getConnectionsManager().cancelRequest(eVar.b, true);
                        }
                        throw th6;
                    }
                }
            } catch (IllegalArgumentException unused4) {
                throw new HostException(4);
            }
        }
    }

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    /* loaded from: classes2.dex */
    public static final class ImportedWalletProof {
        public final byte[] publicKey;
        public final byte[] signature;
        public final int timestamp;

        private ImportedWalletProof(byte[] bArr, int i, byte[] bArr2) {
            this.publicKey = bArr;
            this.timestamp = i;
            this.signature = bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    static class PreparedRotation {
        final byte[] newPublicKey;
        final y05 newSecretPhrase;
        final TL_wallet.sendTransfer transfer;

        public PreparedRotation(String str, String str2, byte[] bArr, byte[] bArr2) {
            if (bArr2 != null) {
                try {
                    if (bArr2.length == 32 && bArr != null && bArr.length != 0) {
                        this.transfer = new PreparedSend(str, str2, null).transfer;
                        this.newSecretPhrase = new y05(bArr);
                        this.newPublicKey = bArr2;
                        Arrays.fill(bArr, (byte) 0);
                        return;
                    }
                } catch (Throwable th) {
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    throw th;
                }
            }
            throw new IllegalArgumentException("Invalid key rotation result");
        }
    }

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    private static class PreparedSend {
        final String encryptedCommentBody;
        final TL_wallet.sendTransfer transfer;

        public PreparedSend(String str, String str2, String str3) {
            TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
            this.transfer = sendtransfer;
            sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
            sendtransfer.random_id = Utilities.b.nextLong();
            sendtransfer.data_normal = decodeTransferBoc(str);
            sendtransfer.normalMessageBodyHash = WalletEngine2.nativeMessageBodyHash(str);
            byte[] decodeTransferBoc = str2 == null ? null : decodeTransferBoc(str2);
            sendtransfer.data_gasless = decodeTransferBoc;
            if (decodeTransferBoc != null) {
                sendtransfer.gaslessMessageBodyHash = WalletEngine2.nativeMessageBodyHash(str2);
            }
            this.encryptedCommentBody = str3;
        }

        private static byte[] decodeTransferBoc(String str) {
            byte[] decode = Base64.decode(str, 0);
            if (decode.length != 0 && decode.length <= 16384) {
                return decode;
            }
            w26.j("WALLET_TRANSFER_DATA_INVALID");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    static class RotationCallbacks extends SendCallbacks {
        private final i8c onReplacement;

        public RotationCallbacks(final i8c i8cVar, i8c i8cVar2) {
            super(new k8c() { // from class: org.telegram.ui.Wallet.h
                @Override // k8c
                public final void a(Object obj, Object obj2, Object obj3) {
                    i8c.this.a((WalletEngine2.SendPhase) obj, (String) obj2);
                }
            });
            this.onReplacement = i8cVar2;
        }

        private /* synthetic */ void lambda$replacement$1(byte[] bArr, y05 y05Var) {
            this.onReplacement.a(y05Var, bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Void lambda$replacement$2(byte[] bArr, byte[] bArr2) {
            y05 y05Var = new y05(bArr);
            try {
                lambda$replacement$1(bArr2, y05Var);
                y05Var.close();
                return null;
            } catch (Throwable th) {
                y05Var.close();
                throw th;
            }
        }

        private void replacement(final byte[] bArr, final byte[] bArr2) {
            boolean z;
            try {
                FutureTask futureTask = new FutureTask(new Callable() { // from class: org.telegram.ui.Wallet.g
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Void lambda$replacement$2;
                        lambda$replacement$2 = WalletEngine2.RotationCallbacks.this.lambda$replacement$2(bArr, bArr2);
                        return lambda$replacement$2;
                    }
                });
                gl.d3(futureTask);
                z = false;
                while (true) {
                    try {
                        try {
                            futureTask.get();
                            break;
                        } catch (Throwable th) {
                            th = th;
                            Arrays.fill(bArr, (byte) 0);
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (ExecutionException unused2) {
                        throw new IllegalStateException("Could not save replacement recovery phrase");
                    }
                }
                if (z) {
                    throw new IllegalStateException("Key rotation was interrupted before submission");
                }
                Arrays.fill(bArr, (byte) 0);
                if (z) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    static class SendCallbacks {
        final k8c callback;
        String error;
        SendPhase phase = SendPhase.IDLE;
        String transactionHash;

        public SendCallbacks(k8c k8cVar) {
            this.callback = k8cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$dispatch$0(SendPhase sendPhase, String str, String str2) {
            this.callback.a(sendPhase, str, str2);
        }

        public void dispatch(SendPhase sendPhase, String str, String str2) {
            gl.d3(new d(this, sendPhase, str, str2));
        }

        public synchronized void failed(String str) {
            SendPhase sendPhase = this.phase;
            if (sendPhase != SendPhase.SUBMISSION_UNKNOWN) {
                sendPhase = SendPhase.FAILED;
            }
            state(sendPhase.nativeValue, str, null);
        }

        public synchronized void state(int i, String str, String str2) {
            SendPhase fromNative = SendPhase.fromNative(i);
            if (this.phase == fromNative && Objects.equals(this.error, str) && Objects.equals(this.transactionHash, str2)) {
                return;
            }
            this.phase = fromNative;
            this.error = str;
            this.transactionHash = str2;
            dispatch(fromNative, str, str2);
        }
    }

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    public enum SendPhase {
        IDLE(1),
        VALIDATING(2),
        AUTHORIZING(3),
        PREPARING(4),
        PERSISTING(5),
        READY_TO_SUBMIT(6),
        SUBMITTING(7),
        SUBMISSION_UNKNOWN(8),
        SUBMITTED(9),
        HANDED_OFF(10),
        CONFIRMED(11),
        REPLACED(12),
        SEQUENCE_NUMBER_CONSUMED(13),
        EXPIRED(14),
        SUPERSEDED(15),
        FAILED(16),
        CANCELLED(17);

        private final int nativeValue;

        SendPhase(int i) {
            this.nativeValue = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static SendPhase fromNative(int i) {
            for (SendPhase sendPhase : values()) {
                if (sendPhase.nativeValue == i) {
                    return sendPhase;
                }
            }
            w26.j(de9.k(i, "Unknown native send phase: "));
            return null;
        }
    }

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    private static class SendResolution {
        final String error;
        final String operationId;
        final SendPhase phase;
        final long retryAfterMs;
        final String transactionHash;

        public SendResolution(String str, int i, String str2, String str3, long j) {
            this.operationId = str;
            this.phase = SendPhase.fromNative(i);
            this.transactionHash = str2;
            this.error = str3;
            this.retryAfterMs = j;
        }
    }

    public WalletEngine2(int i, String str, byte[] bArr) {
        this.currentAccount = i;
        this.address = str;
        byte[] bArr2 = (byte[]) bArr.clone();
        this.publicKey = bArr2;
        HttpTransport httpTransport = new HttpTransport(i);
        this.transport = httpTransport;
        this.ptr = nativeCreate(i, str, bArr2, httpTransport, org.telegram.messenger.a.b.getNoBackupFilesDir().getAbsolutePath() + "/wallet-engine");
    }

    public static ImportedWalletProof createImportProof(y05 y05Var, String str, String str2, int i) {
        return createProof(y05Var, str, str2, i, true);
    }

    public static ImportedWalletProof createOwnershipProof(y05 y05Var, String str, String str2, int i) {
        return createProof(y05Var, str, str2, i, false);
    }

    private static ImportedWalletProof createProof(y05 y05Var, String str, String str2, int i, boolean z) {
        if (y05Var == null || y05Var.d()) {
            w26.j("Recovery phrase is required");
            return null;
        }
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || i <= 0) {
            w26.j("Challenge domain, payload and positive timestamp are required");
            return null;
        }
        byte[] c = y05Var.c();
        try {
            Charset charset = StandardCharsets.UTF_8;
            return nativeCreateImportProof(c, str.getBytes(charset), str2.getBytes(charset), i, z);
        } finally {
            Arrays.fill(c, (byte) 0);
        }
    }

    private static TL_wallet.walletTransaction createTransaction(String str, long j) {
        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
        wallettransactionpeeraddress.address = nativeTransactionAddress(str);
        wallettransaction.peer = wallettransactionpeeraddress;
        wallettransaction.amount = j;
        return wallettransaction;
    }

    private static byte[] decodeEncryptedComment(String str) {
        if (str == null || str.isEmpty() || str.length() > 1368 || !str.matches("[A-Za-z0-9+/]+={0,2}")) {
            w26.j("Invalid encrypted comment base64");
            return null;
        }
        byte[] decode = Base64.decode(str, 2);
        if (decode.length >= 64 && decode.length <= 1024 && decode.length % 16 == 0) {
            return decode;
        }
        w26.j("Invalid encrypted comment size");
        return null;
    }

    public static String decryptComment(y05 y05Var, String str, String str2) {
        byte[] bArr = null;
        if (y05Var == null || y05Var.d()) {
            w26.j("Recovery phrase is required");
            return null;
        }
        if (!isValidAddress(str)) {
            w26.j("Valid sender address is required");
            return null;
        }
        String encryptedCommentBody = encryptedCommentBody(decodeEncryptedComment(str2));
        byte[] c = y05Var.c();
        try {
            bArr = nativeDecryptRawComment(c, str, encryptedCommentBody);
            return new String(bArr, StandardCharsets.UTF_8);
        } finally {
            Arrays.fill(c, (byte) 0);
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
            }
        }
    }

    private String decryptMessageComment(byte[] bArr, JSONObject jSONObject) {
        String optString = jSONObject.optString("source", null);
        JSONObject optJSONObject = jSONObject.optJSONObject("message_content");
        String optString2 = optJSONObject == null ? null : optJSONObject.optString("body", null);
        if (optString != null && !optString.isEmpty() && optString2 != null && !optString2.isEmpty()) {
            return new String(nativeDecryptComment(this.ptr, bArr, optString, optString2), StandardCharsets.UTF_8);
        }
        sc8.j("Encrypted transaction message is incomplete");
        return null;
    }

    private String decryptTransactionCommentResponse(byte[] bArr, byte[] bArr2) {
        JSONArray optJSONArray = new JSONObject(new String(bArr2, StandardCharsets.UTF_8)).optJSONArray("transactions");
        if (optJSONArray == null) {
            sc8.j("Toncenter returned an invalid transaction response");
            return null;
        }
        if (optJSONArray.length() == 0) {
            sc8.j("Transaction not found");
            return null;
        }
        RuntimeException e = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
            JSONObject jSONObject = optJSONArray.getJSONObject(i3);
            JSONObject optJSONObject = jSONObject.optJSONObject("in_msg");
            if (isEncryptedComment(optJSONObject)) {
                i++;
                try {
                    str = decryptMessageComment(bArr, optJSONObject);
                    i2++;
                } catch (RuntimeException e2) {
                    e = e2;
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("out_msgs");
            if (optJSONArray2 != null) {
                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i4);
                    if (isEncryptedComment(jSONObject2)) {
                        i++;
                        try {
                            str = decryptMessageComment(bArr, jSONObject2);
                            i2++;
                        } catch (RuntimeException e3) {
                            e = e3;
                        }
                    }
                }
            }
        }
        if (i == 0) {
            sc8.j("Transaction has no encrypted comment");
            return null;
        }
        if (i2 == 0) {
            if (e == null) {
                throw new IllegalStateException("Transaction comment could not be decrypted");
            }
            throw e;
        }
        if (i2 == 1) {
            return str;
        }
        sc8.j("Transaction contains multiple decryptable comments");
        return null;
    }

    private static String encryptedCommentBody(byte[] bArr) {
        int g = ug8.g(bArr.length, -91, kk7.K1, 1);
        int length = bArr.length + 4 + (g << 1) + g;
        int i = length - 1;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length + 11);
        byteArrayOutputStream.write(new byte[]{-75, -18, -100, 114, 1, 2, (byte) g, 1, 0, (byte) (i >> 8), (byte) i, 0}, 0, 12);
        int i2 = 0;
        int i3 = 0;
        while (i2 < g) {
            int min = Math.min(i2 == 0 ? 35 : 127, bArr.length - i3);
            int i4 = i2 + 1;
            int i5 = i4 < g ? 1 : 0;
            byteArrayOutputStream.write(i5);
            byteArrayOutputStream.write(((i2 == 0 ? 4 : 0) + min) << 1);
            if (i2 == 0) {
                byteArrayOutputStream.write(33);
                byteArrayOutputStream.write(kk7.n1);
                byteArrayOutputStream.write(kk7.u3);
                byteArrayOutputStream.write(75);
            }
            byteArrayOutputStream.write(bArr, i3, min);
            if (i5 != 0) {
                byteArrayOutputStream.write(i4);
            }
            i3 += min;
            i2 = i4;
        }
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        w26.j("Invalid BOC reference");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        w26.j("Invalid encrypted comment snake");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b6, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String encryptedCommentPayload(String str) {
        int i;
        if (str == null || str.length() > 8192) {
            w26.j("Invalid encrypted comment BOC");
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(Base64.decode(str, 0));
        if (wrap.getInt() != -1242653582) {
            w26.j("Invalid BOC magic");
            return null;
        }
        byte b = wrap.get();
        int i2 = b & 7;
        int i3 = wrap.get() & 255;
        if ((b & 56) != 0) {
            w26.j("Unsupported BOC flags");
            return null;
        }
        int readBocInt = readBocInt(wrap, i2);
        int readBocInt2 = readBocInt(wrap, i2);
        int readBocInt3 = readBocInt(wrap, i2);
        int readBocInt4 = readBocInt(wrap, i3);
        if (readBocInt < 1 || readBocInt > 1028 || readBocInt2 != 1 || readBocInt3 != 0) {
            w26.j("Invalid encrypted comment cells");
            return null;
        }
        int readBocInt5 = readBocInt(wrap, i2);
        if (readBocInt5 >= readBocInt) {
            w26.j("Invalid BOC root");
            return null;
        }
        if ((b & 128) != 0) {
            for (int i4 = 0; i4 < readBocInt; i4++) {
                readBocInt(wrap, i3);
            }
        }
        if (readBocInt4 != wrap.remaining() - ((b & 64) != 0 ? 4 : 0)) {
            w26.j("Invalid BOC size");
            return null;
        }
        int position = wrap.position() + readBocInt4;
        wrap.limit(position);
        byte[][] bArr = new byte[readBocInt][];
        int[] iArr = new int[readBocInt];
        while (true) {
            if (i >= readBocInt) {
                if (wrap.position() != position) {
                    w26.j("Invalid BOC cell data");
                    return null;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (readBocInt5 != -1) {
                    int size = byteArrayOutputStream.size();
                    byte[] bArr2 = bArr[readBocInt5];
                    if (size + bArr2.length > 1028) {
                        w26.j("Encrypted comment is too long");
                        return null;
                    }
                    byteArrayOutputStream.write(bArr2, 0, bArr2.length);
                    readBocInt5 = iArr[readBocInt5];
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (byteArray.length < 4 || ByteBuffer.wrap(byteArray).getInt() != 560454219) {
                    w26.j("Invalid encrypted comment opcode");
                    return null;
                }
                String encodeToString = Base64.encodeToString(Arrays.copyOfRange(byteArray, 4, byteArray.length), 2);
                decodeEncryptedComment(encodeToString);
                return encodeToString;
            }
            int i5 = wrap.get() & 255;
            byte b2 = wrap.get();
            int i6 = b2 & 255;
            if (i5 > 1 || (b2 & 1) != 0) {
                break;
            }
            byte[] bArr3 = new byte[i6 / 2];
            bArr[i] = bArr3;
            wrap.get(bArr3);
            int readBocInt6 = i5 != 0 ? readBocInt(wrap, i2) : -1;
            iArr[i] = readBocInt6;
            i = (i5 == 0 || (readBocInt6 > i && readBocInt6 < readBocInt)) ? i + 1 : 0;
        }
    }

    private static byte[] encryptedCommentPreview(int i) {
        if (i > 960) {
            w26.j("The encrypted comment exceeds 960 UTF-8 bytes");
            return null;
        }
        int i2 = ((16 - (i % 16)) % 16) + i + 64;
        int g = ug8.g(i2, -91, kk7.K1, 1);
        int i3 = i2 + 4 + (g << 1) + g;
        int i4 = i3 - 1;
        ByteBuffer allocate = ByteBuffer.allocate(i3 + 11);
        allocate.putInt(-1242653582);
        allocate.put((byte) 1);
        allocate.put((byte) 2);
        allocate.put((byte) g).put((byte) 1).put((byte) 0);
        allocate.putShort((short) i4).put((byte) 0);
        int i5 = 0;
        while (i5 < g) {
            int min = Math.min(i2, i5 == 0 ? 35 : 127);
            int i6 = i5 + 1;
            int i7 = i6 < g ? 1 : 0;
            allocate.put((byte) i7);
            allocate.put((byte) (((i5 == 0 ? 4 : 0) + min) << 1));
            if (i5 == 0) {
                allocate.putInt(560454219);
            }
            allocate.position(allocate.position() + min);
            if (i7 != 0) {
                allocate.put((byte) i6);
            }
            i2 -= min;
            i5 = i6;
        }
        return Base64.encode(allocate.array(), 2);
    }

    private static String errorMessage(Exception exc) {
        return exc.getMessage() == null ? "NULL_ERROR" : exc.getMessage();
    }

    public static String[] getMnemonicWordlist() {
        String[] strArr = mnemonicWordlist;
        if (strArr != null) {
            return strArr;
        }
        String[] mnemonicWordlist2 = mnemonicWordlist();
        mnemonicWordlist = mnemonicWordlist2;
        return mnemonicWordlist2;
    }

    public static boolean isEncryptedComment(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        Object opt = jSONObject.opt("opcode");
        if (opt instanceof Number) {
            return (((Number) opt).longValue() & 4294967295L) == 560454219;
        }
        if (opt instanceof String) {
            return (Long.decode((String) opt).longValue() & 4294967295L) == 560454219;
        }
        return false;
    }

    public static boolean isFailedPhase(SendPhase sendPhase) {
        if (sendPhase == null) {
            return false;
        }
        switch (sendPhase.ordinal()) {
        }
        return false;
    }

    public static boolean isFinalPhase(SendPhase sendPhase) {
        if (sendPhase == null) {
            return false;
        }
        switch (sendPhase.ordinal()) {
        }
        return false;
    }

    public static boolean isPendingPhase(SendPhase sendPhase) {
        return (sendPhase == null || sendPhase == SendPhase.IDLE || isFinalPhase(sendPhase)) ? false : true;
    }

    public static boolean isTgWalletSecretPhrase(y05 y05Var) {
        try {
            secretPhraseToPublicKey(y05Var);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean isValidAddress(String str) {
        return (str == null || str.isEmpty() || !nativeIsValidAddress(str)) ? false : true;
    }

    public static native boolean isValidCellBoc(String str);

    public static boolean isValidRecipientAddress(String str) {
        if (isValidAddress(str)) {
            return str.indexOf(58) >= 0 || (Base64.decode(str.replace('-', '+').replace('_', '/'), 2)[0] & 128) == 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$balance$17(i8c i8cVar) {
        String message;
        Long l = null;
        try {
            l = Long.valueOf(nativeBalance(this.ptr));
            message = null;
        } catch (RuntimeException e) {
            message = e.getMessage() == null ? "NULL_ERROR" : e.getMessage();
        }
        gl.d3(new wbc(i8cVar, l, message, (byte) 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$56() {
        ScheduledFuture<?> scheduledFuture = this.resolutionTask;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        try {
            nativeClose(this.ptr);
        } finally {
            this.ptr = 0L;
            this.worker.shutdown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$decryptTransactionComment$48(String str, byte[] bArr, i8c i8cVar) {
        String message;
        String str2 = null;
        try {
            try {
                String str3 = "https://toncenter.com/api/v3/transactions?hash=" + URLEncoder.encode(str, "UTF-8") + "&limit=1";
                HttpTransport httpTransport = this.transport;
                long j = this.nextAuxiliaryRequestId;
                this.nextAuxiliaryRequestId = j - 1;
                String decryptTransactionCommentResponse = decryptTransactionCommentResponse(bArr, httpTransport.execute(j, str3, false, new byte[0], 15000L));
                Arrays.fill(bArr, (byte) 0);
                str2 = decryptTransactionCommentResponse;
                message = null;
            } catch (Exception e) {
                message = e.getMessage() == null ? "Could not decrypt transaction comment" : e.getMessage();
                Arrays.fill(bArr, (byte) 0);
            }
            gl.d3(new wbc(i8cVar, str2, message, (byte) 15));
        } catch (Throwable th) {
            Arrays.fill(bArr, (byte) 0);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$emulateRotateKey$32(i8c i8cVar, TL_wallet.walletTransaction wallettransaction, String str) {
        if (this.closed) {
            wallettransaction = null;
        }
        if (this.closed) {
            str = "NO_WALLET_ENGINE";
        }
        i8cVar.a(wallettransaction, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$emulateRotateKey$33(i8c i8cVar) {
        String errorMessage;
        TL_wallet.walletTransaction wallettransaction;
        try {
        } catch (RuntimeException e) {
            errorMessage = errorMessage(e);
            wallettransaction = null;
        }
        if (this.closed) {
            throw new IllegalStateException("NO_WALLET_ENGINE");
        }
        wallettransaction = nativeEmulateRotateKey(this.ptr, this.address);
        errorMessage = null;
        gl.d3(new qnc(this, i8cVar, wallettransaction, errorMessage, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$emulateSend$18(AtomicBoolean atomicBoolean, i8c i8cVar, TL_wallet.walletTransaction wallettransaction, String str) {
        if (atomicBoolean.get()) {
            return;
        }
        i8cVar.a(wallettransaction, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$emulateSend$19(AtomicBoolean atomicBoolean, byte[] bArr, byte[] bArr2, String str, long j, i8c i8cVar) {
        TL_wallet.walletTransaction nativeEmulateSend;
        String str2;
        if (atomicBoolean.get()) {
            return null;
        }
        if (bArr != null && bArr2 != null) {
            try {
                bArr = encryptedCommentPreview(bArr.length);
            } catch (RuntimeException e) {
                str2 = errorMessage(e);
                nativeEmulateSend = null;
            }
        }
        nativeEmulateSend = nativeEmulateSend(this.ptr, str, j, bArr, bArr2 != null);
        str2 = null;
        gl.d3(new rnc(atomicBoolean, i8cVar, nativeEmulateSend, str2));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$emulateSend$20(AtomicBoolean atomicBoolean, i8c i8cVar) {
        if (atomicBoolean.get()) {
            return;
        }
        i8cVar.a(null, "NO_WALLET_ENGINE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$emulateSend$21(AtomicBoolean atomicBoolean, FutureTask futureTask) {
        atomicBoolean.set(true);
        futureTask.cancel(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$emulateSendNFT$22(AtomicBoolean atomicBoolean, i8c i8cVar, TL_wallet.walletTransaction wallettransaction, String str) {
        if (atomicBoolean.get()) {
            return;
        }
        if (this.closed) {
            wallettransaction = null;
        }
        if (this.closed) {
            str = "NO_WALLET_ENGINE";
        }
        i8cVar.a(wallettransaction, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$emulateSendNFT$23(AtomicBoolean atomicBoolean, String str, String str2, String str3, i8c i8cVar) {
        TL_wallet.walletTransaction wallettransaction;
        String errorMessage;
        if (atomicBoolean.get()) {
            return null;
        }
        try {
        } catch (RuntimeException e) {
            e = e;
            wallettransaction = null;
        }
        if (this.closed) {
            throw new IllegalStateException("NO_WALLET_ENGINE");
        }
        String uuid = UUID.randomUUID().toString();
        wallettransaction = nativeEmulateSendNFT(this.ptr, str, str2, str3 == null ? null : str3.getBytes(StandardCharsets.UTF_8), uuid, NFT_ATTACHED_NANOGRAMS, NFT_FORWARD_NANOGRAMS);
        try {
            this.nftPreviewRecipient = str;
            this.nftPreviewAddress = str2;
            this.nftPreviewComment = str3;
            this.nftPreviewOperationId = uuid;
            errorMessage = null;
        } catch (RuntimeException e2) {
            e = e2;
            errorMessage = errorMessage(e);
            gl.d3(new tsa(this, atomicBoolean, i8cVar, wallettransaction, errorMessage, (byte) 8));
            return null;
        }
        gl.d3(new tsa(this, atomicBoolean, i8cVar, wallettransaction, errorMessage, (byte) 8));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$emulateSendNFT$24(AtomicBoolean atomicBoolean, i8c i8cVar) {
        if (atomicBoolean.get()) {
            return;
        }
        i8cVar.a(null, "NO_WALLET_ENGINE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$emulateSendNFT$25(AtomicBoolean atomicBoolean, i8c i8cVar) {
        if (atomicBoolean.get()) {
            return;
        }
        i8cVar.a(null, "NO_WALLET_ENGINE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$emulateSendNFT$26(AtomicBoolean atomicBoolean, FutureTask futureTask) {
        atomicBoolean.set(true);
        futureTask.cancel(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getTransactionByHash$42(String str, p8c p8cVar) {
        TL_wallet.walletTransaction wallettransaction;
        try {
            String str2 = "https://toncenter.com/api/v3/transactions?hash=" + URLEncoder.encode(str, "UTF-8") + "&limit=1";
            HttpTransport httpTransport = this.transport;
            long j = this.nextAuxiliaryRequestId;
            this.nextAuxiliaryRequestId = j - 1;
            wallettransaction = parseTransactionResponse(httpTransport.execute(j, str2, false, new byte[0], 15000L));
        } catch (Exception e) {
            fa4.g(e, true);
            wallettransaction = null;
        }
        gl.d3(new mhc(p8cVar, wallettransaction, (byte) 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$new$0(Runnable runnable) {
        return new Thread(runnable, "WalletEngine2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareRotateKey$37(m8c m8cVar, PreparedRotation preparedRotation, String str) {
        try {
            if (this.closed) {
                m8cVar.a(null, null, null, "NO_WALLET_ENGINE");
            } else if (preparedRotation == null) {
                m8cVar.a(null, null, null, str);
            } else {
                m8cVar.a(preparedRotation.transfer, preparedRotation.newSecretPhrase, preparedRotation.newPublicKey, null);
            }
        } finally {
            if (preparedRotation != null) {
                preparedRotation.newSecretPhrase.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareRotateKey$38(byte[] bArr, String str, m8c m8cVar) {
        String str2;
        PreparedRotation preparedRotation;
        PreparedRotation preparedRotation2 = null;
        try {
            try {
                resolveBeforeNewSend();
            } catch (RuntimeException e) {
                e = e;
            }
            if (isPendingPhase(nativeResolvePending(this.ptr).phase)) {
                throw new IllegalStateException("Previous wallet send is still unresolved");
            }
            PreparedRotation nativePrepareRotateKey = nativePrepareRotateKey(this.ptr, bArr, str);
            if (nativePrepareRotateKey != null) {
                Arrays.fill(bArr, (byte) 0);
                preparedRotation = nativePrepareRotateKey;
                str2 = null;
                gl.d3(new d(this, m8cVar, preparedRotation, str2, (byte) 0));
            }
            try {
                throw new IllegalStateException("Could not prepare key rotation");
            } catch (RuntimeException e2) {
                e = e2;
                preparedRotation2 = nativePrepareRotateKey;
                String errorMessage = errorMessage(e);
                Arrays.fill(bArr, (byte) 0);
                str2 = errorMessage;
                preparedRotation = preparedRotation2;
                gl.d3(new d(this, m8cVar, preparedRotation, str2, (byte) 0));
            }
        } catch (Throwable th) {
            Arrays.fill(bArr, (byte) 0);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareSend$52(k8c k8cVar, TL_wallet.sendTransfer sendtransfer, String str, String str2) {
        if (this.closed) {
            sendtransfer = null;
        }
        if (this.closed) {
            str = null;
        }
        if (this.closed) {
            str2 = "NO_WALLET_ENGINE";
        }
        k8cVar.a(sendtransfer, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$prepareSend$53(byte[] bArr, String str, long j, byte[] bArr2, byte[] bArr3, String str2, k8c k8cVar) {
        TL_wallet.sendTransfer sendtransfer;
        String str3;
        String errorMessage;
        try {
            try {
                resolveBeforeNewSend();
            } finally {
                Arrays.fill(bArr, (byte) 0);
            }
        } catch (RuntimeException e) {
            e = e;
            sendtransfer = null;
            str3 = null;
        }
        if (isPendingPhase(nativeResolvePending(this.ptr).phase)) {
            throw new IllegalStateException("Previous wallet send is still unresolved");
        }
        PreparedSend nativePrepareSend = nativePrepareSend(this.ptr, bArr, str, j, bArr2, bArr3, str2, UUID.randomUUID().toString());
        if (nativePrepareSend != null) {
            String str4 = nativePrepareSend.encryptedCommentBody;
            String encryptedCommentPayload = str4 == null ? null : encryptedCommentPayload(str4);
            try {
                str3 = encryptedCommentPayload;
                sendtransfer = nativePrepareSend.transfer;
            } catch (RuntimeException e2) {
                e = e2;
                str3 = encryptedCommentPayload;
                sendtransfer = null;
                errorMessage = errorMessage(e);
                gl.d3(new tsa(this, k8cVar, sendtransfer, sendtransfer != null ? str3 : null, errorMessage, (byte) 9));
            }
        } else {
            sendtransfer = null;
            str3 = null;
        }
        try {
            if (this.closed) {
                errorMessage = "NO_WALLET_ENGINE";
                sendtransfer = null;
            } else {
                errorMessage = sendtransfer == null ? "Could not prepare transfer" : null;
            }
        } catch (RuntimeException e3) {
            e = e3;
            errorMessage = errorMessage(e);
            gl.d3(new tsa(this, k8cVar, sendtransfer, sendtransfer != null ? str3 : null, errorMessage, (byte) 9));
        }
        gl.d3(new tsa(this, k8cVar, sendtransfer, sendtransfer != null ? str3 : null, errorMessage, (byte) 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareSendNFT$27(i8c i8cVar) {
        i8cVar.a(null, this.closed ? "NO_WALLET_ENGINE" : "Recovery phrase is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareSendNFT$28(i8c i8cVar, TL_wallet.sendTransfer sendtransfer, String str) {
        if (this.closed) {
            sendtransfer = null;
        }
        if (this.closed) {
            str = "NO_WALLET_ENGINE";
        }
        i8cVar.a(sendtransfer, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[Catch: RuntimeException -> 0x008e, all -> 0x00ae, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x008e, blocks: (B:16:0x005f, B:18:0x0065, B:30:0x0072, B:31:0x0079, B:48:0x007a, B:49:0x0083, B:50:0x0084, B:51:0x008d), top: B:5:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[Catch: RuntimeException -> 0x008e, all -> 0x00ae, TRY_ENTER, TryCatch #2 {RuntimeException -> 0x008e, blocks: (B:16:0x005f, B:18:0x0065, B:30:0x0072, B:31:0x0079, B:48:0x007a, B:49:0x0083, B:50:0x0084, B:51:0x008d), top: B:5:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004d A[Catch: all -> 0x0090, RuntimeException -> 0x0095, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:4:0x0004, B:7:0x0008, B:9:0x0019, B:12:0x0046, B:32:0x004d, B:11:0x003e), top: B:3:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$prepareSendNFT$29(String str, String str2, String str3, byte[] bArr, i8c i8cVar) {
        Throwable th;
        byte[] bArr2;
        byte[] bArr3;
        String str4;
        TL_wallet.sendTransfer sendtransfer;
        String str5;
        PreparedSend nativePrepareSendNFT;
        TL_wallet.sendTransfer sendtransfer2 = null;
        try {
            try {
                try {
                    try {
                    } catch (RuntimeException e) {
                        e = e;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bArr2 = bArr;
                    th = th;
                    Arrays.fill(bArr2, (byte) 0);
                    throw th;
                }
            } catch (RuntimeException e2) {
                e = e2;
                bArr3 = bArr;
            }
            if (this.closed) {
                throw new IllegalStateException("NO_WALLET_ENGINE");
            }
            resolveBeforeNewSend();
            if (isPendingPhase(nativeResolvePending(this.ptr).phase)) {
                throw new IllegalStateException("Previous wallet send is still unresolved");
            }
            if (this.nftPreviewOperationId != null) {
                try {
                    if (Objects.equals(str, this.nftPreviewRecipient) && Objects.equals(str2, this.nftPreviewAddress) && Objects.equals(str3, this.nftPreviewComment)) {
                        str5 = this.nftPreviewOperationId;
                        bArr3 = bArr;
                        nativePrepareSendNFT = nativePrepareSendNFT(this.ptr, bArr3, str, str2, str3 != null ? null : str3.getBytes(StandardCharsets.UTF_8), str5, NFT_ATTACHED_NANOGRAMS, NFT_FORWARD_NANOGRAMS);
                        if (nativePrepareSendNFT != null) {
                            throw new IllegalStateException("Could not prepare NFT transfer");
                        }
                        TL_wallet.sendTransfer sendtransfer3 = nativePrepareSendNFT.transfer;
                        try {
                            this.nftPreviewOperationId = null;
                            Arrays.fill(bArr3, (byte) 0);
                            sendtransfer = sendtransfer3;
                            str4 = null;
                        } catch (RuntimeException e3) {
                            e = e3;
                            sendtransfer2 = sendtransfer3;
                            String errorMessage = errorMessage(e);
                            Arrays.fill(bArr3, (byte) 0);
                            str4 = errorMessage;
                            sendtransfer = sendtransfer2;
                            gl.d3(new mnc(this, i8cVar, sendtransfer, str4, (byte) 2));
                            return;
                        }
                        gl.d3(new mnc(this, i8cVar, sendtransfer, str4, (byte) 2));
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bArr2 = bArr;
                    Arrays.fill(bArr2, (byte) 0);
                    throw th;
                }
            }
            str5 = UUID.randomUUID().toString();
            bArr3 = bArr;
            nativePrepareSendNFT = nativePrepareSendNFT(this.ptr, bArr3, str, str2, str3 != null ? null : str3.getBytes(StandardCharsets.UTF_8), str5, NFT_ATTACHED_NANOGRAMS, NFT_FORWARD_NANOGRAMS);
            if (nativePrepareSendNFT != null) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareTonConnectTransfer$4(i8c i8cVar, TL_wallet.sendTransfer sendtransfer, String str) {
        if (this.closed) {
            sendtransfer = null;
        }
        if (this.closed) {
            str = "Wallet engine is closed";
        }
        i8cVar.a(sendtransfer, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareTonConnectTransfer$5(byte[] bArr, v25 v25Var, String str, i8c i8cVar) {
        byte[] bArr2;
        RuntimeException runtimeException;
        String str2;
        TL_wallet.sendTransfer sendtransfer;
        TL_wallet.sendTransfer sendtransfer2 = null;
        try {
            try {
                try {
                } catch (RuntimeException e) {
                    e = e;
                    runtimeException = e;
                    String h = w25.h("wallet-engine transaction", runtimeException);
                    Arrays.fill(bArr2, (byte) 0);
                    str2 = h;
                    sendtransfer = sendtransfer2;
                    gl.d3(new mnc(this, i8cVar, sendtransfer, str2, (byte) 0));
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                Arrays.fill(bArr, (byte) 0);
                throw th2;
            }
        } catch (RuntimeException e2) {
            e = e2;
            bArr2 = bArr;
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            Arrays.fill(bArr, (byte) 0);
            throw th22;
        }
        if (this.closed) {
            throw new IllegalStateException("Wallet engine is closed");
        }
        resolveBeforeNewSend();
        if (isPendingPhase(nativeResolvePending(this.ptr).phase)) {
            throw new IllegalStateException("Previous wallet send is still unresolved");
        }
        bArr2 = bArr;
        TL_wallet.sendTransfer sendtransfer3 = nativePrepareTonConnectTransfer(this.ptr, bArr2, v25Var.a(), v25Var.a, str).transfer;
        try {
            sendtransfer3.data_gasless = null;
            sendtransfer3.gaslessMessageBodyHash = null;
            Arrays.fill(bArr2, (byte) 0);
            sendtransfer = sendtransfer3;
            str2 = null;
        } catch (RuntimeException e3) {
            runtimeException = e3;
            sendtransfer2 = sendtransfer3;
            String h2 = w25.h("wallet-engine transaction", runtimeException);
            Arrays.fill(bArr2, (byte) 0);
            str2 = h2;
            sendtransfer = sendtransfer2;
            gl.d3(new mnc(this, i8cVar, sendtransfer, str2, (byte) 0));
        }
        gl.d3(new mnc(this, i8cVar, sendtransfer, str2, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareTonConnectTransferPair$7(i8c i8cVar, TL_wallet.sendTransfer sendtransfer, String str) {
        if (this.closed) {
            sendtransfer = null;
        }
        if (this.closed) {
            str = "Wallet engine is closed";
        }
        i8cVar.a(sendtransfer, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$prepareTonConnectTransferPair$8(byte[] bArr, v25 v25Var, String str, v25 v25Var2, i8c i8cVar) {
        byte[] bArr2;
        RuntimeException runtimeException;
        String str2;
        TL_wallet.sendTransfer sendtransfer;
        TL_wallet.sendTransfer sendtransfer2 = null;
        try {
            try {
                try {
                } catch (RuntimeException e) {
                    e = e;
                    runtimeException = e;
                    String h = w25.h("wallet-engine transaction", runtimeException);
                    Arrays.fill(bArr2, (byte) 0);
                    str2 = h;
                    sendtransfer = sendtransfer2;
                    gl.d3(new mnc(this, i8cVar, sendtransfer, str2, (byte) 1));
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                Arrays.fill(bArr, (byte) 0);
                throw th2;
            }
        } catch (RuntimeException e2) {
            e = e2;
            bArr2 = bArr;
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            Arrays.fill(bArr, (byte) 0);
            throw th22;
        }
        if (this.closed) {
            throw new IllegalStateException("Wallet engine is closed");
        }
        resolveBeforeNewSend();
        if (isPendingPhase(nativeResolvePending(this.ptr).phase)) {
            throw new IllegalStateException("Previous wallet send is still unresolved");
        }
        bArr2 = bArr;
        TL_wallet.sendTransfer sendtransfer3 = nativePrepareTonConnectTransfer(this.ptr, bArr2, v25Var.a(), v25Var.a, str).transfer;
        try {
            sendtransfer3.data_gasless = null;
            sendtransfer3.gaslessMessageBodyHash = null;
            try {
                TL_wallet.sendTransfer sendtransfer4 = nativePrepareTonConnectTransfer(this.ptr, bArr2, v25Var2.a(), v25Var2.a, str + ":gasless").transfer;
                sendtransfer3.data_gasless = sendtransfer4.data_gasless;
                sendtransfer3.gaslessMessageBodyHash = sendtransfer4.data_gasless == null ? null : sendtransfer4.gaslessMessageBodyHash;
            } catch (RuntimeException e3) {
                fa4.g(e3, true);
            }
            Arrays.fill(bArr2, (byte) 0);
            sendtransfer = sendtransfer3;
            str2 = null;
        } catch (RuntimeException e4) {
            runtimeException = e4;
            sendtransfer2 = sendtransfer3;
            String h2 = w25.h("wallet-engine transaction", runtimeException);
            Arrays.fill(bArr2, (byte) 0);
            str2 = h2;
            sendtransfer = sendtransfer2;
            gl.d3(new mnc(this, i8cVar, sendtransfer, str2, (byte) 1));
        }
        gl.d3(new mnc(this, i8cVar, sendtransfer, str2, (byte) 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$previewSignMessage$10(p8c p8cVar, String str) {
        if (this.closed) {
            str = "Wallet engine is closed";
        }
        p8cVar.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$previewSignMessage$11(v25 v25Var, p8c p8cVar) {
        String h;
        try {
        } catch (RuntimeException e) {
            h = w25.h("preview signing", e);
        }
        if (this.closed) {
            throw new IllegalStateException("Wallet engine is closed");
        }
        nativePreviewSignMessage(this.ptr, v25Var.a(), v25Var.a);
        h = null;
        gl.d3(new tnc(this, p8cVar, h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$previewTonConnect$1(i8c i8cVar, TL_wallet.walletTransaction wallettransaction, String str) {
        if (this.closed) {
            wallettransaction = null;
        }
        if (this.closed) {
            str = "Wallet engine is closed";
        }
        i8cVar.a(wallettransaction, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$previewTonConnect$2(v25 v25Var, i8c i8cVar) {
        String h;
        TL_wallet.walletTransaction wallettransaction;
        try {
        } catch (RuntimeException e) {
            h = w25.h("wallet-engine transaction", e);
            wallettransaction = null;
        }
        if (this.closed) {
            throw new IllegalStateException("Wallet engine is closed");
        }
        wallettransaction = nativePreviewTonConnect(this.ptr, v25Var.a(), v25Var.a);
        h = null;
        gl.d3(new qnc(this, i8cVar, wallettransaction, h, (byte) 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$rotateKey$55(RotationCallbacks rotationCallbacks, byte[] bArr, String str) {
        try {
            try {
                resolveBeforeNewSend();
                rotationCallbacks.state(SendPhase.VALIDATING.nativeValue, null, null);
                nativeRotateKey(this.ptr, bArr, str, rotationCallbacks);
            } catch (RuntimeException e) {
                rotationCallbacks.failed(errorMessage(e));
            }
        } finally {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signMessage$13(i8c i8cVar, String str, String str2) {
        if (this.closed) {
            str = null;
        }
        if (this.closed) {
            str2 = "Wallet engine is closed";
        }
        i8cVar.a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signMessage$14(byte[] bArr, v25 v25Var, String str, i8c i8cVar) {
        String str2;
        String str3;
        try {
            try {
                try {
                } catch (RuntimeException e) {
                    e = e;
                    String h = w25.h("sign message", e);
                    Arrays.fill(bArr, (byte) 0);
                    str2 = h;
                    str3 = null;
                    gl.d3(new rnc(this, i8cVar, str3, str2, (byte) 0));
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                Arrays.fill(bArr, (byte) 0);
                throw th2;
            }
        } catch (RuntimeException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            Arrays.fill(bArr, (byte) 0);
            throw th22;
        }
        if (this.closed) {
            throw new IllegalStateException("Wallet engine is closed");
        }
        String nativeSignMessage = nativeSignMessage(this.ptr, bArr, v25Var.a(), v25Var.a, str);
        Arrays.fill(bArr, (byte) 0);
        str3 = nativeSignMessage;
        str2 = null;
        gl.d3(new rnc(this, i8cVar, str3, str2, (byte) 0));
    }

    private static native String[] mnemonicWordlist();

    private static native long nativeBalance(long j);

    private static native void nativeClose(long j);

    private static native long nativeCreate(int i, String str, byte[] bArr, HttpTransport httpTransport, String str2);

    private static native ImportedWalletProof nativeCreateImportProof(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, boolean z);

    private static native byte[] nativeDecryptComment(long j, byte[] bArr, String str, String str2);

    private static native byte[] nativeDecryptRawComment(byte[] bArr, String str, String str2);

    private static native TL_wallet.walletTransaction nativeEmulateRotateKey(long j, String str);

    private static native TL_wallet.walletTransaction nativeEmulateSend(long j, String str, long j2, byte[] bArr, boolean z);

    private static native TL_wallet.walletTransaction nativeEmulateSendNFT(long j, String str, String str2, byte[] bArr, String str3, long j2, long j3);

    private static native boolean nativeIsValidAddress(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native String nativeMessageBodyHash(String str);

    private static native PreparedRotation nativePrepareRotateKey(long j, byte[] bArr, String str);

    private static native PreparedSend nativePrepareSend(long j, byte[] bArr, String str, long j2, byte[] bArr2, byte[] bArr3, String str2, String str3);

    private static native PreparedSend nativePrepareSendNFT(long j, byte[] bArr, String str, String str2, byte[] bArr2, String str3, long j2, long j3);

    private static native PreparedSend nativePrepareTonConnectTransfer(long j, byte[] bArr, String[] strArr, long j2, String str);

    private static native void nativePreviewSignMessage(long j, String[] strArr, long j2);

    private static native TL_wallet.walletTransaction nativePreviewTonConnect(long j, String[] strArr, long j2);

    private static native SendResolution nativeResolvePending(long j);

    private static native void nativeRotateKey(long j, byte[] bArr, String str, RotationCallbacks rotationCallbacks);

    private static native String nativeSecretPhraseToAddress(byte[] bArr);

    private static native byte[] nativeSecretPhraseToPublicKey(byte[] bArr);

    private static native TL_wallet.walletTransaction nativeSend(long j, byte[] bArr, String str, long j2, byte[] bArr2, byte[] bArr3, String str2, SendCallbacks sendCallbacks);

    private static native String nativeSignMessage(long j, byte[] bArr, String[] strArr, long j2, String str);

    private static native byte[] nativeTonConnectCrypto(byte[] bArr, byte[] bArr2);

    private static native String nativeTransactionAddress(String str);

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r4.length() != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TL_wallet.walletTransaction parseTransactionResponse(byte[] bArr) {
        JSONArray jSONArray = new JSONObject(new String(bArr, StandardCharsets.UTF_8)).getJSONArray("transactions");
        boolean z = true;
        if (jSONArray.length() != 1) {
            return null;
        }
        JSONObject jSONObject = jSONArray.getJSONObject(0);
        JSONObject optJSONObject = jSONObject.optJSONObject("in_msg");
        JSONArray jSONArray2 = jSONObject.getJSONArray("out_msgs");
        String str = "source";
        boolean z2 = (optJSONObject == null || optJSONObject.isNull("source") || optJSONObject.getString("source").isEmpty()) ? false : true;
        if (!z2) {
            if (jSONArray2.length() == 1) {
                optJSONObject = jSONArray2.getJSONObject(0);
                str = "destination";
                if (optJSONObject.isNull(str)) {
                    return null;
                }
                long parseLong = Long.parseLong(optJSONObject.getString("value"));
                long parseLong2 = Long.parseLong(jSONObject.getString("total_fees"));
                if (parseLong < 0 || parseLong2 < 0) {
                    return null;
                }
                TL_wallet.walletTransaction createTransaction = createTransaction(optJSONObject.getString(str), parseLong);
                createTransaction.incoming = z2;
                createTransaction.tx_hash = jSONObject.getString("hash");
                StringBuilder sb = new StringBuilder("chain:");
                sb.append(createTransaction.tx_hash);
                sb.append(z2 ? ":in:0" : ":out:0");
                createTransaction.id = sb.toString();
                long j = jSONObject.getLong("now");
                int i = (int) j;
                if (j != i) {
                    throw new ArithmeticException();
                }
                createTransaction.date = i;
                createTransaction.fee = parseLong2;
                if (!jSONObject.getJSONObject("description").getBoolean("aborted") && !optJSONObject.optBoolean("bounced", false)) {
                    z = false;
                }
                createTransaction.failed = z;
                createTransaction.phase = z ? SendPhase.FAILED : SendPhase.CONFIRMED;
                createTransaction.comment_encrypted = isEncryptedComment(optJSONObject);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("message_content");
                JSONObject optJSONObject3 = optJSONObject2 != null ? optJSONObject2.optJSONObject("decoded") : null;
                if (createTransaction.comment_encrypted) {
                    createTransaction.comment = encryptedCommentPayload(optJSONObject2.getString("body"));
                    return createTransaction;
                }
                if (optJSONObject3 != null && "text_comment".equals(optJSONObject3.optString(TeXSymbolParser.TYPE_ATTR))) {
                    createTransaction.comment = optJSONObject3.getString("comment");
                }
                return createTransaction;
            }
            return null;
        }
    }

    private static int readBocInt(ByteBuffer byteBuffer, int i) {
        if (i < 1 || i > 4) {
            w26.j("Invalid BOC integer size");
            return 0;
        }
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (byteBuffer.get() & 255);
        }
        if (j <= 2147483647L) {
            return (int) j;
        }
        w26.j("BOC integer overflow");
        return 0;
    }

    private void resolveBeforeNewSend() {
        if (this.closed) {
            sc8.j("NO_WALLET_ENGINE");
        }
    }

    private long resolvePendingSend() {
        return 4000L;
    }

    public static boolean sameTonConnectAddress(String str, String str2) {
        return isValidAddress(str) && isValidAddress(str2) && nativeTransactionAddress(str).equals(nativeTransactionAddress(str2));
    }

    public static String secretPhraseToAddress(y05 y05Var) {
        if (y05Var == null || y05Var.d()) {
            w26.j("Recovery phrase is required");
            return null;
        }
        byte[] c = y05Var.c();
        try {
            return nativeSecretPhraseToAddress(c);
        } finally {
            Arrays.fill(c, (byte) 0);
        }
    }

    public static byte[] secretPhraseToAnchorPublicKey(y05 y05Var) {
        y05 y05Var2;
        if (y05Var == null || y05Var.d()) {
            w26.j("Recovery phrase is required");
            return null;
        }
        int g = y05Var.g();
        if (g != 12 && g != 24) {
            w26.j("Recovery phrase must contain 12 or 24 words");
            return null;
        }
        synchronized (y05Var) {
            y05Var.a();
            int i = 0;
            while (true) {
                byte[] bArr = y05Var.a;
                if (i >= bArr.length || !y05.e(bArr[i])) {
                    break;
                }
                i++;
            }
            int i2 = 0;
            int i3 = i;
            while (true) {
                byte[] bArr2 = y05Var.a;
                if (i2 >= 12) {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr2, i, i3);
                    try {
                        y05Var2 = new y05(copyOfRange);
                    } finally {
                        Arrays.fill(copyOfRange, (byte) 0);
                    }
                } else {
                    if (i3 == bArr2.length) {
                        throw new IllegalArgumentException("Not enough recovery words");
                    }
                    while (true) {
                        byte[] bArr3 = y05Var.a;
                        if (i3 >= bArr3.length || y05.e(bArr3[i3])) {
                            break;
                        }
                        i3++;
                    }
                    i2++;
                    if (i2 < 12) {
                        while (true) {
                            byte[] bArr4 = y05Var.a;
                            if (i3 < bArr4.length && y05.e(bArr4[i3])) {
                                i3++;
                            }
                        }
                    }
                }
            }
        }
        try {
            byte[] secretPhraseToPublicKey = secretPhraseToPublicKey(y05Var2);
            y05Var2.close();
            return secretPhraseToPublicKey;
        } catch (Throwable th) {
            try {
                y05Var2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] secretPhraseToPublicKey(y05 y05Var) {
        if (y05Var == null || y05Var.d()) {
            w26.j("Recovery phrase is required");
            return null;
        }
        byte[] c = y05Var.c();
        try {
            return nativeSecretPhraseToPublicKey(c);
        } finally {
            Arrays.fill(c, (byte) 0);
        }
    }

    private static void setTransactionPhase(TL_wallet.walletTransaction wallettransaction, int i) {
        SendPhase fromNative = SendPhase.fromNative(i);
        wallettransaction.phase = fromNative;
        wallettransaction.failed = isFailedPhase(fromNative);
        wallettransaction.pending = !wallettransaction.preview && isPendingPhase(wallettransaction.phase);
    }

    public static JSONObject signData(y05 y05Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONObject jSONObject, String str2, int i) {
        JSONObject jSONObject2 = tonConnectCrypto(y05Var, tonconnectsession, str, bArr, new JSONObject().put("signData", jSONObject).put("signDomain", str2).put("timestamp", i));
        return new JSONObject().put("signature", jSONObject2.getString("signature")).put("address", jSONObject2.getString("address")).put("timestamp", i).put("domain", str2).put("payload", jSONObject);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x011b, code lost:
    
        r0 = r0.toByteArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0121, code lost:
    
        if (r0.length < 4) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x012b, code lost:
    
        if (java.nio.ByteBuffer.wrap(r0).getInt() != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0136, code lost:
    
        return new java.lang.String(r0, 4, r0.length - 4, java.nio.charset.StandardCharsets.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0137, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f0, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f8, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f9, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00ff, code lost:
    
        if (r0.position() == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0101, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0102, code lost:
    
        r0 = new java.io.ByteArrayOutputStream();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0107, code lost:
    
        if (r7 == (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0109, code lost:
    
        r1 = r0.size();
        r3 = r8[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0111, code lost:
    
        if ((r1 + r3.length) <= 1028) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0114, code lost:
    
        r0.write(r3, 0, r3.length);
        r7 = r9[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0113, code lost:
    
        return r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String textCommentFromBody(String str) {
        String str2;
        String str3 = null;
        if (str == null || str.length() > 8192) {
            return null;
        }
        try {
            ByteBuffer wrap = ByteBuffer.wrap(Base64.decode(str, 0));
            if (wrap.getInt() != -1242653582) {
                return null;
            }
            byte b = wrap.get();
            int i = b & 7;
            int i2 = wrap.get() & 255;
            if ((b & 56) != 0) {
                return null;
            }
            int readBocInt = readBocInt(wrap, i);
            int readBocInt2 = readBocInt(wrap, i);
            int readBocInt3 = readBocInt(wrap, i);
            int readBocInt4 = readBocInt(wrap, i2);
            int i3 = 1;
            if (readBocInt < 1 || readBocInt > 1028 || readBocInt2 != 1 || readBocInt3 != 0) {
                return null;
            }
            int readBocInt5 = readBocInt(wrap, i);
            if (readBocInt5 >= readBocInt) {
                return null;
            }
            if ((b & 128) != 0) {
                for (int i4 = 0; i4 < readBocInt; i4++) {
                    readBocInt(wrap, i2);
                }
            }
            if (readBocInt4 != wrap.remaining() - ((b & 64) != 0 ? 4 : 0)) {
                return null;
            }
            int position = wrap.position() + readBocInt4;
            wrap.limit(position);
            byte[][] bArr = new byte[readBocInt][];
            int[] iArr = new int[readBocInt];
            int i5 = 0;
            while (true) {
                if (i5 >= readBocInt) {
                    break;
                }
                byte b2 = wrap.get();
                byte b3 = wrap.get();
                str2 = str3;
                int i6 = b3 & 255;
                int i7 = b2 & 7;
                if ((b2 & 248) != 0 || i7 > i3) {
                    break;
                }
                int i8 = (i6 + i3) >> i3;
                try {
                    int i9 = i3;
                    if (wrap.remaining() < (i7 * i) + i8) {
                        return str2;
                    }
                    byte[] bArr2 = new byte[i8];
                    bArr[i5] = bArr2;
                    wrap.get(bArr2);
                    int i10 = b3 & 1;
                    if (i7 == 0) {
                        if (i10 != 0 && i8 > 0) {
                            int i11 = i8 - 1;
                            int i12 = bArr[i5][i11] & 255;
                            int i13 = 0;
                            while (i13 < 8 && (i12 & (i9 << i13)) == 0) {
                                i13++;
                            }
                            if (i13 == 8) {
                                return str2;
                            }
                            int i14 = i12 & (~(i9 << i13));
                            if (i14 == 0) {
                                bArr[i5] = Arrays.copyOf(bArr[i5], i11);
                            } else {
                                bArr[i5][i11] = (byte) i14;
                            }
                        }
                    } else if (i10 != 0) {
                        return str2;
                    }
                    int readBocInt6 = i7 != 0 ? readBocInt(wrap, i) : -1;
                    iArr[i5] = readBocInt6;
                    if (i7 == 0 || (readBocInt6 > i5 && readBocInt6 < readBocInt)) {
                        i5++;
                        str3 = str2;
                        i3 = i9;
                    }
                } catch (Exception unused) {
                    return str2;
                }
                return str2;
            }
        } catch (Exception unused2) {
            return str3;
        }
    }

    public static String toUserFriendlyAddress(String str) {
        return nativeTransactionAddress(str);
    }

    public static JSONObject tonConnectCrypto(y05 y05Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONObject jSONObject) {
        String str2;
        byte[] bArr2 = null;
        if (tonconnectsession == null || tonconnectsession.nonce == null || (str2 = tonconnectsession.dapp_client_id) == null || y05Var == null || str == null || bArr == null) {
            w26.j("Missing TON Connect crypto parameters");
            return null;
        }
        jSONObject.put("dappClientId", str2);
        jSONObject.put("sessionNonce", Base64.encodeToString(tonconnectsession.nonce, 2));
        jSONObject.put("clientId", tonconnectsession.client_id);
        jSONObject.put("walletPublicKey", Base64.encodeToString(bArr, 2));
        jSONObject.put("walletAddress", str);
        byte[] c = y05Var.c();
        try {
            String jSONObject2 = jSONObject.toString();
            Charset charset = StandardCharsets.UTF_8;
            bArr2 = nativeTonConnectCrypto(c, jSONObject2.getBytes(charset));
            return new JSONObject(new String(bArr2, charset));
        } finally {
            Arrays.fill(c, (byte) 0);
            if (bArr2 != null) {
                Arrays.fill(bArr2, (byte) 0);
            }
        }
    }

    public synchronized void balance(i8c i8cVar) {
        this.worker.execute(new pnc(this, i8cVar, (byte) 2));
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.transport.close();
        this.worker.execute(new kbc(this, (byte) 24));
    }

    public void decryptTransactionComment(y05 y05Var, String str, i8c i8cVar) {
        if (i8cVar == null) {
            w26.j("Result callback is required");
            return;
        }
        if (y05Var == null || y05Var.d()) {
            gl.d3(new c05(i8cVar, (byte) 11));
            return;
        }
        if (str == null || str.isEmpty()) {
            gl.d3(new c05(i8cVar, (byte) 12));
            return;
        }
        if (this.closed) {
            gl.d3(new c05(i8cVar, (byte) 13));
            return;
        }
        byte[] c = y05Var.c();
        try {
            this.worker.execute(new rnc(this, str, c, i8cVar));
        } catch (RejectedExecutionException unused) {
            Arrays.fill(c, (byte) 0);
            gl.d3(new c05(i8cVar, (byte) 14));
        }
    }

    public void emulateRotateKey(i8c i8cVar) {
        if (i8cVar == null) {
            w26.j("Result callback is required");
        } else {
            if (this.closed) {
                gl.d3(new c05(i8cVar, (byte) 9));
                return;
            }
            try {
                this.worker.execute(new pnc(this, i8cVar, (byte) 0));
            } catch (RejectedExecutionException unused) {
                gl.d3(new c05(i8cVar, (byte) 10));
            }
        }
    }

    public Runnable emulateSend(final String str, final long j, String str2, final byte[] bArr, final i8c i8cVar) {
        final byte[] bytes = str2 == null ? null : str2.getBytes(StandardCharsets.UTF_8);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        FutureTask futureTask = new FutureTask(new Callable() { // from class: unc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$emulateSend$19;
                lambda$emulateSend$19 = WalletEngine2.this.lambda$emulateSend$19(atomicBoolean, bytes, bArr, str, j, i8cVar);
                return lambda$emulateSend$19;
            }
        });
        byte b = 0;
        try {
            this.worker.execute(futureTask);
        } catch (RejectedExecutionException unused) {
            gl.d3(new vnc(atomicBoolean, i8cVar, b));
        }
        return new wnc(atomicBoolean, futureTask, b);
    }

    public synchronized Runnable emulateSendNFT(String str, String str2, String str3, i8c i8cVar) {
        WalletEngine2 walletEngine2;
        try {
            try {
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                walletEngine2 = this;
                FutureTask futureTask = new FutureTask(new nwb(walletEngine2, atomicBoolean, str, str2, str3, i8cVar, (byte) 1));
                if (walletEngine2.closed) {
                    gl.d3(new vnc(atomicBoolean, i8cVar, (byte) 1));
                } else {
                    try {
                        walletEngine2.worker.execute(futureTask);
                    } catch (RejectedExecutionException unused) {
                        gl.d3(new vnc(atomicBoolean, i8cVar, (byte) 2));
                    }
                }
                wnc wncVar = new wnc(atomicBoolean, futureTask, (byte) 1);
                return wncVar;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            walletEngine2 = this;
            Throwable th22 = th;
            throw th22;
        }
    }

    public void getTransactionByHash(String str, p8c p8cVar) {
        if (p8cVar == null) {
            w26.j("Result callback is required");
            return;
        }
        if (str == null || str.isEmpty() || this.closed) {
            gl.d3(new mn0(p8cVar, (byte) 15));
            return;
        }
        try {
            this.worker.execute(new tnc(this, str, p8cVar));
        } catch (RejectedExecutionException unused) {
            gl.d3(new mn0(p8cVar, (byte) 16));
        }
    }

    public void prepareRotateKey(y05 y05Var, String str, final m8c m8cVar) {
        final m8c m8cVar2;
        if (m8cVar == null) {
            w26.j("Result callback is required");
            return;
        }
        final byte b = 0;
        if (this.closed) {
            gl.d3(new Runnable() { // from class: snc
                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    m8c m8cVar3 = m8cVar;
                    switch (b2) {
                        case 0:
                            m8cVar3.a(null, null, null, "NO_WALLET_ENGINE");
                            break;
                        case 1:
                            m8cVar3.a(null, null, null, "Recovery phrase is required");
                            break;
                        default:
                            m8cVar3.a(null, null, null, "NO_WALLET_ENGINE");
                            break;
                    }
                }
            });
            return;
        }
        if (y05Var == null || y05Var.d()) {
            final byte b2 = 1;
            gl.d3(new Runnable() { // from class: snc
                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    m8c m8cVar3 = m8cVar;
                    switch (b22) {
                        case 0:
                            m8cVar3.a(null, null, null, "NO_WALLET_ENGINE");
                            break;
                        case 1:
                            m8cVar3.a(null, null, null, "Recovery phrase is required");
                            break;
                        default:
                            m8cVar3.a(null, null, null, "NO_WALLET_ENGINE");
                            break;
                    }
                }
            });
            return;
        }
        byte[] c = y05Var.c();
        try {
            m8cVar2 = m8cVar;
            try {
                this.worker.execute(new rnc(this, c, str, m8cVar2, (byte) 2));
            } catch (RejectedExecutionException unused) {
                Arrays.fill(c, (byte) 0);
                final byte b3 = 2;
                gl.d3(new Runnable() { // from class: snc
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b3;
                        m8c m8cVar3 = m8cVar2;
                        switch (b22) {
                            case 0:
                                m8cVar3.a(null, null, null, "NO_WALLET_ENGINE");
                                break;
                            case 1:
                                m8cVar3.a(null, null, null, "Recovery phrase is required");
                                break;
                            default:
                                m8cVar3.a(null, null, null, "NO_WALLET_ENGINE");
                                break;
                        }
                    }
                });
            }
        } catch (RejectedExecutionException unused2) {
            m8cVar2 = m8cVar;
        }
    }

    public void prepareSend(y05 y05Var, String str, long j, String str2, byte[] bArr, String str3, final k8c k8cVar) {
        if (k8cVar == null) {
            w26.j("Result callback is required");
            return;
        }
        if (this.closed) {
            final byte b = 1;
            gl.d3(new Runnable() { // from class: nnc
                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    k8c k8cVar2 = k8cVar;
                    switch (b2) {
                        case 0:
                            k8cVar2.a(null, null, "NO_WALLET_ENGINE");
                            break;
                        case 1:
                            k8cVar2.a(null, null, "NO_WALLET_ENGINE");
                            break;
                        default:
                            k8cVar2.a(null, null, "Recovery phrase is required");
                            break;
                    }
                }
            });
            return;
        }
        if (y05Var == null || y05Var.d()) {
            final byte b2 = 2;
            gl.d3(new Runnable() { // from class: nnc
                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    k8c k8cVar2 = k8cVar;
                    switch (b22) {
                        case 0:
                            k8cVar2.a(null, null, "NO_WALLET_ENGINE");
                            break;
                        case 1:
                            k8cVar2.a(null, null, "NO_WALLET_ENGINE");
                            break;
                        default:
                            k8cVar2.a(null, null, "Recovery phrase is required");
                            break;
                    }
                }
            });
            return;
        }
        byte[] bArr2 = bArr == null ? null : (byte[]) bArr.clone();
        byte[] c = y05Var.c();
        try {
            this.worker.execute(new kg3(this, c, str, j, str2 != null ? str2.getBytes(StandardCharsets.UTF_8) : null, bArr2, str3, k8cVar, (byte) 4));
        } catch (RejectedExecutionException unused) {
            final byte b3 = 0;
            Arrays.fill(c, (byte) 0);
            gl.d3(new Runnable() { // from class: nnc
                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b3;
                    k8c k8cVar2 = k8cVar;
                    switch (b22) {
                        case 0:
                            k8cVar2.a(null, null, "NO_WALLET_ENGINE");
                            break;
                        case 1:
                            k8cVar2.a(null, null, "NO_WALLET_ENGINE");
                            break;
                        default:
                            k8cVar2.a(null, null, "Recovery phrase is required");
                            break;
                    }
                }
            });
        }
    }

    public synchronized void prepareSendNFT(y05 y05Var, String str, String str2, String str3, i8c i8cVar) {
        WalletEngine2 walletEngine2;
        i8c i8cVar2;
        try {
            try {
                if (this.closed || y05Var == null || y05Var.d()) {
                    gl.d3(new pnc(this, i8cVar, (byte) 1));
                    return;
                }
                byte[] c = y05Var.c();
                try {
                    walletEngine2 = this;
                    i8cVar2 = i8cVar;
                    try {
                        this.worker.execute(new foa(walletEngine2, str, str2, str3, c, i8cVar2, (byte) 10));
                    } catch (RejectedExecutionException unused) {
                        Arrays.fill(c, (byte) 0);
                        gl.d3(new c05(i8cVar2, (byte) 15));
                    }
                } catch (RejectedExecutionException unused2) {
                    walletEngine2 = this;
                    i8cVar2 = i8cVar;
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void prepareTonConnectTransfer(y05 y05Var, v25 v25Var, String str, i8c i8cVar) {
        i8c i8cVar2;
        byte[] c = y05Var.c();
        try {
            i8cVar2 = i8cVar;
        } catch (RejectedExecutionException e) {
            e = e;
            i8cVar2 = i8cVar;
        }
        try {
            this.worker.execute(new onc(this, c, v25Var, str, i8cVar2, (byte) 1));
        } catch (RejectedExecutionException e2) {
            e = e2;
            RejectedExecutionException rejectedExecutionException = e;
            Arrays.fill(c, (byte) 0);
            gl.d3(new fzb(i8cVar2, w25.h("schedule transaction signing", rejectedExecutionException), (byte) 2));
        }
    }

    public void prepareTonConnectTransferPair(y05 y05Var, v25 v25Var, v25 v25Var2, String str, i8c i8cVar) {
        i8c i8cVar2;
        byte[] c = y05Var.c();
        try {
            i8cVar2 = i8cVar;
        } catch (RejectedExecutionException e) {
            e = e;
            i8cVar2 = i8cVar;
        }
        try {
            this.worker.execute(new foa(this, c, v25Var, str, v25Var2, i8cVar2, (byte) 9));
        } catch (RejectedExecutionException e2) {
            e = e2;
            RejectedExecutionException rejectedExecutionException = e;
            Arrays.fill(c, (byte) 0);
            gl.d3(new fzb(i8cVar2, w25.h("schedule transaction signing", rejectedExecutionException), (byte) 1));
        }
    }

    public void previewSignMessage(v25 v25Var, p8c p8cVar) {
        try {
            this.worker.execute(new wbc(this, v25Var, p8cVar, (byte) 13));
        } catch (RejectedExecutionException unused) {
            gl.d3(new mn0(p8cVar, (byte) 14));
        }
    }

    public void previewTonConnect(v25 v25Var, i8c i8cVar) {
        try {
            this.worker.execute(new wbc(this, v25Var, i8cVar, (byte) 16));
        } catch (RejectedExecutionException e) {
            gl.d3(new fzb(i8cVar, w25.h("schedule transaction preview", e), (byte) 3));
        }
    }

    public void rotateKey(y05 y05Var, i8c i8cVar, i8c i8cVar2) {
        RotationCallbacks rotationCallbacks = new RotationCallbacks(i8cVar2, i8cVar);
        if (y05Var == null || y05Var.d() || i8cVar == null) {
            rotationCallbacks.failed("Current recovery phrase and replacement callback are required");
            return;
        }
        byte[] c = y05Var.c();
        try {
            this.worker.execute(new d(this, rotationCallbacks, c, UUID.randomUUID().toString(), (byte) 1));
        } catch (RejectedExecutionException unused) {
            Arrays.fill(c, (byte) 0);
            rotationCallbacks.failed("NO_WALLET_ENGINE");
        }
    }

    public void signMessage(y05 y05Var, v25 v25Var, String str, i8c i8cVar) {
        i8c i8cVar2;
        byte[] c = y05Var.c();
        try {
            i8cVar2 = i8cVar;
        } catch (RejectedExecutionException unused) {
            i8cVar2 = i8cVar;
        }
        try {
            this.worker.execute(new onc(this, c, v25Var, str, i8cVar2, (byte) 0));
        } catch (RejectedExecutionException unused2) {
            Arrays.fill(c, (byte) 0);
            gl.d3(new c05(i8cVar2, (byte) 8));
        }
    }

    public synchronized Runnable emulateSendNFT(String str, String str2, i8c i8cVar) {
        return emulateSendNFT(str, str2, null, i8cVar);
    }

    public synchronized void prepareSendNFT(y05 y05Var, String str, String str2, i8c i8cVar) {
        prepareSendNFT(y05Var, str, str2, null, i8cVar);
    }
}
