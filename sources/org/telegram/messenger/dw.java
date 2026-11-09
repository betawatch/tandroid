package org.telegram.messenger;

import android.app.Activity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLClassStore;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class dw extends c1 {
    public static volatile dw[] r = new dw[4];
    public final ArrayList a;
    public final SparseArray b;
    public final SparseArray c;
    public final SparseArray d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public boolean n;

    public dw(int i7) {
        super(i7);
        this.a = new ArrayList();
        this.b = new SparseArray();
        this.c = new SparseArray();
        this.d = new SparseArray();
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x010d, code lost:
    
        if (r0 > 1024) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010f, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0116, code lost:
    
        return !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0111, code lost:
    
        if (r0 > 15) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.security.MessageDigest] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.nio.Buffer, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean h(NativeByteBuffer nativeByteBuffer, byte[] bArr, byte[] bArr2, int i7, boolean z9, boolean z10) {
        byte[] bArr3;
        boolean z11 = false;
        boolean z12 = i7 == 1 ? false : z9;
        j2.n d02 = j2.n.d0(i7, z12, bArr, bArr2);
        Utilities.c(nativeByteBuffer.buffer, (byte[]) d02.b, (byte[]) d02.c, false, false, 24, nativeByteBuffer.limit() - 24);
        int readInt32 = nativeByteBuffer.readInt32(false);
        if (i7 == 2) {
            int i10 = z12 ? 8 : 0;
            ByteBuffer byteBuffer = nativeByteBuffer.buffer;
            if (!Utilities.d(bArr2, Utilities.p(bArr, i10 + 88, byteBuffer, 24, byteBuffer.limit()), 8)) {
                if (z10) {
                    Utilities.c(nativeByteBuffer.buffer, (byte[]) d02.b, (byte[]) d02.c, true, false, 24, nativeByteBuffer.limit() - 24);
                    nativeByteBuffer.position(24);
                }
                z11 = true;
            }
            if (readInt32 <= 0) {
                z11 = true;
            }
            if (readInt32 > nativeByteBuffer.limit() - 28) {
                z11 = true;
            }
            int limit = (nativeByteBuffer.limit() - 28) - readInt32;
            if (i7 != 2) {
                if (limit < 12) {
                    z11 = true;
                }
            }
        } else {
            int i11 = readInt32 + 28;
            if (i11 < nativeByteBuffer.buffer.limit() - 15 || i11 > nativeByteBuffer.buffer.limit()) {
                i11 = nativeByteBuffer.buffer.limit();
            }
            ?? r62 = nativeByteBuffer.buffer;
            int position = r62.position();
            int limit2 = r62.limit();
            try {
                try {
                    ?? messageDigest = MessageDigest.getInstance("SHA-1");
                    r62.position(24);
                    r62.limit(i11);
                    messageDigest.update(r62);
                    bArr3 = messageDigest.digest();
                } catch (Exception e10) {
                    a8.g(e10, true);
                    r62.limit(limit2);
                    r62.position(position);
                    bArr3 = new byte[20];
                }
                r62 = bArr3.length - 16;
                if (!Utilities.d(bArr2, bArr3, r62)) {
                    if (z10) {
                        Utilities.c(nativeByteBuffer.buffer, (byte[]) d02.b, (byte[]) d02.c, true, false, 24, nativeByteBuffer.limit() - 24);
                        nativeByteBuffer.position(24);
                    }
                    z11 = true;
                }
                if (readInt32 <= 0) {
                }
                if (readInt32 > nativeByteBuffer.limit() - 28) {
                }
                int limit3 = (nativeByteBuffer.limit() - 28) - readInt32;
                if (i7 != 2) {
                }
            } finally {
                r62.limit(limit2);
                r62.position(position);
            }
        }
    }

    public static dw i(int i7) {
        dw dwVar;
        dw dwVar2 = r[i7];
        if (dwVar2 != null) {
            return dwVar2;
        }
        synchronized (dw.class) {
            try {
                dwVar = r[i7];
                if (dwVar == null) {
                    dw[] dwVarArr = r;
                    dw dwVar3 = new dw(i7);
                    dwVarArr[i7] = dwVar3;
                    dwVar = dwVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dwVar;
    }

    public final void A(Activity activity, TLRPC.User user) {
        if (user == null || activity == null) {
            return;
        }
        if (getMessagesController().v2()) {
            org.telegram.ui.b.b(this.currentAccount);
            return;
        }
        this.n = true;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, activity, null);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        yr messagesStorage = getMessagesStorage();
        messagesStorage.H();
        tL_messages_getDhConfig.version = messagesStorage.x;
        u1Var.setOnCancelListener(new gm(this, getConnectionsManager().sendRequest(tL_messages_getDhConfig, new q6(this, activity, u1Var, user, 4), 2), 2));
        try {
            u1Var.show();
        } catch (Exception unused) {
        }
    }

    public final void a(TLRPC.EncryptedChat encryptedChat, int i7) {
        int X0 = g0.X0(encryptedChat.layer);
        if (i7 <= X0) {
            return;
        }
        if (encryptedChat.key_hash.length == 16) {
            try {
                byte[] o4 = Utilities.o(r1.length, encryptedChat.auth_key);
                byte[] bArr = new byte[36];
                System.arraycopy(encryptedChat.key_hash, 0, bArr, 0, 16);
                System.arraycopy(o4, 0, bArr, 16, 20);
                encryptedChat.key_hash = bArr;
                getMessagesStorage().V1(encryptedChat);
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        encryptedChat.layer = (i7 << 16) | (encryptedChat.layer & 65535);
        yr messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new eq(messagesStorage, encryptedChat, 2));
        if (X0 < 151) {
            w(encryptedChat, null);
        }
        g0.h3(new wv(this, encryptedChat, 0));
    }

    public final void b(TLRPC.EncryptedChat encryptedChat, ArrayList arrayList) {
        boolean z9;
        cw cwVar;
        TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer;
        int i7;
        int i10;
        int i11 = encryptedChat.id;
        SparseArray sparseArray = this.b;
        ArrayList arrayList2 = (ArrayList) sparseArray.get(i11);
        if (arrayList2 == null) {
            return;
        }
        Collections.sort(arrayList2, new jl(18));
        boolean z10 = false;
        while (true) {
            z9 = true;
            if (arrayList2.size() <= 0 || !((i7 = (tL_decryptedMessageLayer = (cwVar = (cw) arrayList2.get(0)).b).out_seq_no) == (i10 = encryptedChat.seq_in) || i10 == i7 - 2)) {
                break;
            }
            a(encryptedChat, tL_decryptedMessageLayer.layer);
            TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer2 = cwVar.b;
            encryptedChat.seq_in = tL_decryptedMessageLayer2.out_seq_no;
            encryptedChat.in_seq_no = tL_decryptedMessageLayer2.in_seq_no;
            arrayList2.remove(0);
            if (cwVar.e == 2) {
                encryptedChat.mtproto_seq = Math.min(encryptedChat.mtproto_seq, encryptedChat.seq_in);
            }
            TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
            TLRPC.Message l10 = l(encryptedChat2, cwVar.c, cwVar.a, cwVar.b.message, cwVar.d);
            if (l10 != null) {
                arrayList.add(l10);
            }
            z10 = true;
            encryptedChat = encryptedChat2;
        }
        TLRPC.EncryptedChat encryptedChat3 = encryptedChat;
        if (arrayList2.isEmpty()) {
            sparseArray.remove(encryptedChat3.id);
        }
        if (z10) {
            yr messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new yf(messagesStorage, encryptedChat3, z9, 10));
        }
    }

    public final TLRPC.TL_messageService c(int i7, int i10, int i11, long j3, TLRPC.EncryptedChat encryptedChat) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = new TLRPC.TL_decryptedMessageActionDeleteMessages();
        tL_messageService.action.encryptedAction.random_ids.add(Long.valueOf(j3));
        tL_messageService.id = i7;
        tL_messageService.local_id = i7;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = m5.F(encryptedChat.id);
        tL_messageService.send_state = 1;
        tL_messageService.seq_in = i11;
        tL_messageService.seq_out = i10;
        tL_messageService.peer_id = new TLRPC.TL_peerUser();
        if (encryptedChat.participant_id == getUserConfig().e()) {
            tL_messageService.peer_id.user_id = encryptedChat.admin_id;
        } else {
            tL_messageService.peer_id.user_id = encryptedChat.participant_id;
        }
        tL_messageService.date = 0;
        tL_messageService.random_id = j3;
        return tL_messageService;
    }

    public final TLRPC.TL_messageService d(TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessageAction decryptedMessageAction) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = decryptedMessageAction;
        int j3 = getUserConfig().j();
        tL_messageService.id = j3;
        tL_messageService.local_id = j3;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = m5.F(encryptedChat.id);
        tL_messageService.peer_id = new TLRPC.TL_peerUser();
        tL_messageService.send_state = 1;
        if (encryptedChat.participant_id == getUserConfig().e()) {
            tL_messageService.peer_id.user_id = encryptedChat.admin_id;
        } else {
            tL_messageService.peer_id.user_id = encryptedChat.participant_id;
        }
        if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
            tL_messageService.date = getConnectionsManager().getCurrentTime();
        } else {
            tL_messageService.date = 0;
        }
        getSendMessagesHelper().getClass();
        tL_messageService.random_id = gz.E();
        getUserConfig().v(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_messageService);
        getMessagesStorage().j1(arrayList, false, true, true, 0, false, 0, 0L);
        return tL_messageService;
    }

    public final void e(int i7, long j3, boolean z9) {
        NativeByteBuffer nativeByteBuffer;
        Exception e10;
        if (j3 == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(12);
            } catch (Exception e11) {
                nativeByteBuffer = null;
                e10 = e11;
            }
            try {
                nativeByteBuffer.writeInt32(100);
                nativeByteBuffer.writeInt32(i7);
                nativeByteBuffer.writeBool(z9);
            } catch (Exception e12) {
                e10 = e12;
                a8.g(e10, true);
                j3 = getMessagesStorage().z(nativeByteBuffer);
                TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption = new TLRPC.TL_messages_discardEncryption();
                tL_messages_discardEncryption.chat_id = i7;
                tL_messages_discardEncryption.delete_history = z9;
                getConnectionsManager().sendRequest(tL_messages_discardEncryption, new v4(this, j3, 3));
            }
            j3 = getMessagesStorage().z(nativeByteBuffer);
        }
        TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption2 = new TLRPC.TL_messages_discardEncryption();
        tL_messages_discardEncryption2.chat_id = i7;
        tL_messages_discardEncryption2.delete_history = z9;
        getConnectionsManager().sendRequest(tL_messages_discardEncryption2, new v4(this, j3, 3));
    }

    public final void f(int i7, boolean z9) {
        e(i7, 0L, z9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x021f, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_decryptedMessageService) r12).action instanceof org.telegram.tgnet.TLRPC.TL_decryptedMessageActionNotifyLayer) != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList g(TLRPC.EncryptedMessage encryptedMessage) {
        boolean z9;
        boolean z10;
        byte[] bArr;
        int i7;
        int i10;
        int i11;
        SparseArray sparseArray = this.c;
        SparseArray sparseArray2 = this.b;
        TLRPC.EncryptedChat b12 = getMessagesController().b1(encryptedMessage.chat_id, true);
        if (b12 == null || (b12 instanceof TLRPC.TL_encryptedChatDiscarded)) {
            return null;
        }
        try {
            try {
                if (b12 instanceof TLRPC.TL_encryptedChatWaiting) {
                    ArrayList arrayList = (ArrayList) sparseArray.get(b12.id);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        sparseArray.put(b12.id, arrayList);
                    }
                    TL_update.TL_updateNewEncryptedMessage tL_updateNewEncryptedMessage = new TL_update.TL_updateNewEncryptedMessage();
                    tL_updateNewEncryptedMessage.message = encryptedMessage;
                    arrayList.add(tL_updateNewEncryptedMessage);
                    return null;
                }
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(encryptedMessage.bytes.length);
                nativeByteBuffer.writeBytes(encryptedMessage.bytes);
                nativeByteBuffer.position(0);
                long readInt64 = nativeByteBuffer.readInt64(false);
                if (b12.key_fingerprint == readInt64) {
                    bArr = b12.auth_key;
                    z10 = false;
                } else {
                    long j3 = b12.future_key_fingerprint;
                    if (j3 == 0 || j3 != readInt64) {
                        z10 = false;
                        bArr = null;
                    } else {
                        bArr = b12.future_auth_key;
                        z10 = true;
                    }
                }
                if (bArr != null) {
                    byte[] readData = nativeByteBuffer.readData(16, false);
                    boolean z11 = z10;
                    boolean z12 = b12.admin_id == getUserConfig().e();
                    boolean z13 = b12.mtproto_seq == 0;
                    byte[] bArr2 = bArr;
                    if (h(nativeByteBuffer, bArr2, readData, 2, z12, z13)) {
                        i7 = 2;
                        i10 = 2;
                    } else {
                        if (!z13) {
                            return null;
                        }
                        i7 = 2;
                        try {
                            if (!h(nativeByteBuffer, bArr2, readData, 1, z12, false)) {
                                return null;
                            }
                            i10 = 1;
                        } catch (Exception e10) {
                            e = e10;
                            z9 = true;
                            a8.g(e, z9);
                            return null;
                        }
                    }
                    TLObject TLdeserialize = TLClassStore.Instance().TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(false), false);
                    nativeByteBuffer.reuse();
                    if (!z11) {
                        b12.key_use_count_in = (short) (b12.key_use_count_in + 1);
                    }
                    if (TLdeserialize instanceof TLRPC.TL_decryptedMessageLayer) {
                        TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer = (TLRPC.TL_decryptedMessageLayer) TLdeserialize;
                        if (b12.seq_in == 0 && b12.seq_out == 0) {
                            if (b12.admin_id == getUserConfig().e()) {
                                b12.seq_out = 1;
                                b12.seq_in = -2;
                            } else {
                                b12.seq_in = -1;
                            }
                        }
                        if (tL_decryptedMessageLayer.random_bytes.length < 15) {
                            if (!r2.a) {
                                return null;
                            }
                            a8.d("got random bytes less than needed");
                            return null;
                        }
                        if (r2.a) {
                            a8.b("current chat in_seq = " + b12.seq_in + " out_seq = " + b12.seq_out);
                            a8.b("got message with in_seq = " + tL_decryptedMessageLayer.in_seq_no + " out_seq = " + tL_decryptedMessageLayer.out_seq_no);
                        }
                        int i12 = tL_decryptedMessageLayer.out_seq_no;
                        int i13 = b12.seq_in;
                        if (i12 <= i13) {
                            return null;
                        }
                        if (i10 == 1 && (i11 = b12.mtproto_seq) != 0 && i12 >= i11) {
                            return null;
                        }
                        if (i13 != i12 - i7) {
                            if (r2.a) {
                                a8.d("got hole");
                            }
                            y(b12, b12.seq_in + i7, tL_decryptedMessageLayer.out_seq_no - i7, null);
                            ArrayList arrayList2 = (ArrayList) sparseArray2.get(b12.id);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                sparseArray2.put(b12.id, arrayList2);
                            }
                            if (arrayList2.size() < 4) {
                                cw cwVar = new cw();
                                cwVar.b = tL_decryptedMessageLayer;
                                cwVar.c = encryptedMessage.file;
                                cwVar.a = encryptedMessage.date;
                                cwVar.d = z11;
                                cwVar.e = i10;
                                arrayList2.add(cwVar);
                                return null;
                            }
                            sparseArray2.remove(b12.id);
                            TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = new TLRPC.TL_encryptedChatDiscarded();
                            tL_encryptedChatDiscarded.id = b12.id;
                            tL_encryptedChatDiscarded.user_id = b12.user_id;
                            tL_encryptedChatDiscarded.auth_key = b12.auth_key;
                            tL_encryptedChatDiscarded.key_create_date = b12.key_create_date;
                            tL_encryptedChatDiscarded.key_use_count_in = b12.key_use_count_in;
                            tL_encryptedChatDiscarded.key_use_count_out = b12.key_use_count_out;
                            tL_encryptedChatDiscarded.seq_in = b12.seq_in;
                            tL_encryptedChatDiscarded.seq_out = b12.seq_out;
                            g0.h3(new yv(this, tL_encryptedChatDiscarded, 1));
                            f(b12.id, false);
                            return null;
                        }
                        if (i10 == i7) {
                            b12.mtproto_seq = Math.min(b12.mtproto_seq, i13);
                        }
                        a(b12, tL_decryptedMessageLayer.layer);
                        b12.seq_in = tL_decryptedMessageLayer.out_seq_no;
                        b12.in_seq_no = tL_decryptedMessageLayer.in_seq_no;
                        yr messagesStorage = getMessagesStorage();
                        messagesStorage.a.c(new yf((Object) messagesStorage, (Object) b12, true, 10));
                        TLdeserialize = tL_decryptedMessageLayer.message;
                    } else if (TLdeserialize instanceof TLRPC.TL_decryptedMessageService) {
                    }
                    TLObject tLObject = TLdeserialize;
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.Message l10 = l(b12, encryptedMessage.file, encryptedMessage.date, tLObject, z11);
                    if (l10 != null) {
                        arrayList3.add(l10);
                    }
                    b(b12, arrayList3);
                    return arrayList3;
                }
                nativeByteBuffer.reuse();
                if (r2.a) {
                    a8.d(String.format("fingerprint mismatch %x", Long.valueOf(readInt64)));
                    return null;
                }
                return null;
            } catch (Exception e11) {
                e = e11;
                z9 = true;
            }
        } catch (Exception e12) {
            e = e12;
            z9 = true;
        }
    }

    public final void j(TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.EncryptedChat encryptedChat, TLRPC.InputEncryptedFile inputEncryptedFile, String str, ij ijVar) {
        if (decryptedMessage == null || encryptedChat.auth_key == null || (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) || (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting)) {
            return;
        }
        getSendMessagesHelper().f0(message, false);
        Utilities.d.c(new gn(this, encryptedChat, decryptedMessage, message, inputEncryptedFile, ijVar, str, 3));
    }

    public final void k(TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia, sy syVar) {
        for (int i7 = 0; i7 < tL_messages_sendEncryptedMultiMedia.files.size(); i7++) {
            j(tL_messages_sendEncryptedMultiMedia.messages.get(i7), (TLRPC.Message) syVar.z.get(i7), syVar.n, tL_messages_sendEncryptedMultiMedia.files.get(i7), (String) syVar.B.get(i7), (ij) syVar.x.get(i7));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:290:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.Message l(TLRPC.EncryptedChat encryptedChat, TLRPC.EncryptedFile encryptedFile, int i7, TLObject tLObject, boolean z9) {
        int i10;
        int i11;
        int i12;
        byte[] bArr;
        long g10;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        TLRPC.PhotoSize tL_photoSizeEmpty;
        byte[] bArr5;
        TLRPC.PhotoSize tL_photoSizeEmpty2;
        byte[] bArr6;
        if (tLObject != null) {
            long j3 = encryptedChat.admin_id;
            if (j3 == getUserConfig().e()) {
                j3 = encryptedChat.participant_id;
            }
            if (encryptedChat.exchange_id == 0 && encryptedChat.future_key_fingerprint == 0 && encryptedChat.key_use_count_in >= 120) {
                o(encryptedChat);
            }
            long j10 = encryptedChat.exchange_id;
            if (j10 == 0 && encryptedChat.future_key_fingerprint != 0 && !z9) {
                encryptedChat.future_auth_key = new byte[256];
                encryptedChat.future_key_fingerprint = 0L;
                getMessagesStorage().V1(encryptedChat);
            } else if (j10 != 0 && z9) {
                encryptedChat.key_fingerprint = encryptedChat.future_key_fingerprint;
                encryptedChat.auth_key = encryptedChat.future_auth_key;
                encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                encryptedChat.future_auth_key = new byte[256];
                encryptedChat.future_key_fingerprint = 0L;
                encryptedChat.key_use_count_in = (short) 0;
                encryptedChat.key_use_count_out = (short) 0;
                encryptedChat.exchange_id = 0L;
                getMessagesStorage().V1(encryptedChat);
            }
            if (tLObject instanceof TLRPC.TL_decryptedMessage) {
                TLRPC.TL_decryptedMessage tL_decryptedMessage = (TLRPC.TL_decryptedMessage) tLObject;
                TLRPC.TL_message_secret tL_message_secret = new TLRPC.TL_message_secret();
                tL_message_secret.ttl = tL_decryptedMessage.ttl;
                tL_message_secret.entities = tL_decryptedMessage.entities;
                tL_message_secret.message = tL_decryptedMessage.message;
                tL_message_secret.date = i7;
                int j11 = getUserConfig().j();
                tL_message_secret.id = j11;
                tL_message_secret.local_id = j11;
                tL_message_secret.silent = tL_decryptedMessage.silent;
                getUserConfig().v(false);
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message_secret.from_id = tL_peerUser;
                tL_peerUser.user_id = j3;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message_secret.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = getUserConfig().e();
                tL_message_secret.random_id = tL_decryptedMessage.random_id;
                tL_message_secret.unread = true;
                tL_message_secret.flags = 768;
                String str = tL_decryptedMessage.via_bot_name;
                if (str != null && str.length() > 0) {
                    tL_message_secret.via_bot_name = tL_decryptedMessage.via_bot_name;
                    tL_message_secret.flags |= 2048;
                }
                long j12 = tL_decryptedMessage.grouped_id;
                if (j12 != 0) {
                    tL_message_secret.grouped_id = j12;
                    tL_message_secret.flags |= 131072;
                }
                tL_message_secret.dialog_id = m5.F(encryptedChat.id);
                if (tL_decryptedMessage.reply_to_random_id != 0) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_message_secret.reply_to = tL_messageReplyHeader;
                    tL_messageReplyHeader.reply_to_random_id = tL_decryptedMessage.reply_to_random_id;
                    tL_message_secret.flags |= 8;
                }
                TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                if (decryptedMessageMedia == null || (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaEmpty)) {
                    tL_message_secret.media = new TLRPC.TL_messageMediaEmpty();
                } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaWebPage) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                    tL_message_secret.media = tL_messageMediaWebPage;
                    tL_messageMediaWebPage.webpage = new TLRPC.TL_webPageUrlPending();
                    tL_message_secret.media.webpage.url = tL_decryptedMessage.media.url;
                } else {
                    if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaContact) {
                        TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                        tL_message_secret.media = tL_messageMediaContact;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia2 = tL_decryptedMessage.media;
                        tL_messageMediaContact.last_name = decryptedMessageMedia2.last_name;
                        tL_messageMediaContact.first_name = decryptedMessageMedia2.first_name;
                        tL_messageMediaContact.phone_number = decryptedMessageMedia2.phone_number;
                        tL_messageMediaContact.user_id = decryptedMessageMedia2.user_id;
                        tL_messageMediaContact.vcard = "";
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaGeoPoint) {
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        tL_message_secret.media = tL_messageMediaGeo;
                        tL_messageMediaGeo.geo = new TLRPC.TL_geoPoint();
                        TLRPC.GeoPoint geoPoint = tL_message_secret.media.geo;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia3 = tL_decryptedMessage.media;
                        geoPoint.lat = decryptedMessageMedia3.lat;
                        geoPoint._long = decryptedMessageMedia3._long;
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaPhoto) {
                        byte[] bArr7 = decryptedMessageMedia.key;
                        if (bArr7 != null && bArr7.length == 32 && (bArr6 = decryptedMessageMedia.iv) != null && bArr6.length == 32) {
                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                            tL_message_secret.media = tL_messageMediaPhoto;
                            tL_messageMediaPhoto.flags |= 3;
                            if (TextUtils.isEmpty(tL_message_secret.message)) {
                                String str2 = tL_decryptedMessage.media.caption;
                                tL_message_secret.message = str2 != null ? str2 : "";
                            }
                            tL_message_secret.media.photo = new TLRPC.TL_photo();
                            TLRPC.Photo photo = tL_message_secret.media.photo;
                            photo.file_reference = new byte[0];
                            photo.date = tL_message_secret.date;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia4 = tL_decryptedMessage.media;
                            byte[] bArr8 = ((TLRPC.TL_decryptedMessageMediaPhoto) decryptedMessageMedia4).thumb;
                            if (bArr8 != null && bArr8.length != 0 && bArr8.length <= 6000 && decryptedMessageMedia4.thumb_w <= 100 && decryptedMessageMedia4.thumb_h <= 100) {
                                TLRPC.TL_photoCachedSize tL_photoCachedSize = new TLRPC.TL_photoCachedSize();
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia5 = tL_decryptedMessage.media;
                                tL_photoCachedSize.w = decryptedMessageMedia5.thumb_w;
                                tL_photoCachedSize.h = decryptedMessageMedia5.thumb_h;
                                tL_photoCachedSize.bytes = bArr8;
                                tL_photoCachedSize.type = "s";
                                tL_photoCachedSize.location = new TLRPC.TL_fileLocationUnavailable();
                                tL_message_secret.media.photo.sizes.add(tL_photoCachedSize);
                            }
                            int i13 = tL_message_secret.ttl;
                            if (i13 != 0) {
                                TLRPC.MessageMedia messageMedia = tL_message_secret.media;
                                messageMedia.ttl_seconds = i13;
                                messageMedia.flags |= 4;
                            }
                            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia6 = tL_decryptedMessage.media;
                            tL_photoSize_layer127.w = decryptedMessageMedia6.w;
                            tL_photoSize_layer127.h = decryptedMessageMedia6.h;
                            tL_photoSize_layer127.type = "x";
                            tL_photoSize_layer127.size = (int) encryptedFile.size;
                            TLRPC.TL_fileEncryptedLocation tL_fileEncryptedLocation = new TLRPC.TL_fileEncryptedLocation();
                            tL_photoSize_layer127.location = tL_fileEncryptedLocation;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia7 = tL_decryptedMessage.media;
                            tL_fileEncryptedLocation.key = decryptedMessageMedia7.key;
                            tL_fileEncryptedLocation.iv = decryptedMessageMedia7.iv;
                            tL_fileEncryptedLocation.dc_id = encryptedFile.dc_id;
                            tL_fileEncryptedLocation.volume_id = encryptedFile.id;
                            tL_fileEncryptedLocation.secret = encryptedFile.access_hash;
                            tL_fileEncryptedLocation.local_id = encryptedFile.key_fingerprint;
                            tL_message_secret.media.photo.sizes.add(tL_photoSize_layer127);
                        }
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaVideo) {
                        byte[] bArr9 = decryptedMessageMedia.key;
                        if (bArr9 != null && bArr9.length == 32 && (bArr5 = decryptedMessageMedia.iv) != null && bArr5.length == 32) {
                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                            tL_message_secret.media = tL_messageMediaDocument;
                            tL_messageMediaDocument.flags |= 3;
                            tL_messageMediaDocument.document = new TLRPC.TL_documentEncrypted();
                            TLRPC.Document document = tL_message_secret.media.document;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia8 = tL_decryptedMessage.media;
                            document.key = decryptedMessageMedia8.key;
                            document.iv = decryptedMessageMedia8.iv;
                            document.dc_id = encryptedFile.dc_id;
                            if (TextUtils.isEmpty(tL_message_secret.message)) {
                                String str3 = tL_decryptedMessage.media.caption;
                                tL_message_secret.message = str3 != null ? str3 : "";
                            }
                            TLRPC.Document document2 = tL_message_secret.media.document;
                            document2.date = i7;
                            document2.size = encryptedFile.size;
                            document2.id = encryptedFile.id;
                            document2.access_hash = encryptedFile.access_hash;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia9 = tL_decryptedMessage.media;
                            String str4 = decryptedMessageMedia9.mime_type;
                            document2.mime_type = str4;
                            if (str4 == null) {
                                document2.mime_type = "video/mp4";
                            }
                            byte[] bArr10 = ((TLRPC.TL_decryptedMessageMediaVideo) decryptedMessageMedia9).thumb;
                            if (bArr10 == null || bArr10.length == 0 || bArr10.length > 6000 || decryptedMessageMedia9.thumb_w > 100 || decryptedMessageMedia9.thumb_h > 100) {
                                tL_photoSizeEmpty2 = new TLRPC.TL_photoSizeEmpty();
                                tL_photoSizeEmpty2.type = "s";
                            } else {
                                tL_photoSizeEmpty2 = new TLRPC.TL_photoCachedSize();
                                tL_photoSizeEmpty2.bytes = bArr10;
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia10 = tL_decryptedMessage.media;
                                tL_photoSizeEmpty2.w = decryptedMessageMedia10.thumb_w;
                                tL_photoSizeEmpty2.h = decryptedMessageMedia10.thumb_h;
                                tL_photoSizeEmpty2.type = "s";
                                tL_photoSizeEmpty2.location = new TLRPC.TL_fileLocationUnavailable();
                            }
                            tL_message_secret.media.document.thumbs.add(tL_photoSizeEmpty2);
                            tL_message_secret.media.document.flags |= 1;
                            TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia11 = tL_decryptedMessage.media;
                            tL_documentAttributeVideo_layer159.w = decryptedMessageMedia11.w;
                            tL_documentAttributeVideo_layer159.h = decryptedMessageMedia11.h;
                            tL_documentAttributeVideo_layer159.duration = decryptedMessageMedia11.duration;
                            tL_documentAttributeVideo_layer159.supports_streaming = false;
                            tL_message_secret.media.document.attributes.add(tL_documentAttributeVideo_layer159);
                            int i14 = tL_message_secret.ttl;
                            if (i14 != 0) {
                                TLRPC.MessageMedia messageMedia2 = tL_message_secret.media;
                                messageMedia2.ttl_seconds = i14;
                                messageMedia2.flags |= 4;
                            }
                            if (i14 != 0) {
                                tL_message_secret.ttl = Math.max(tL_decryptedMessage.media.duration + 1, i14);
                            }
                        }
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaDocument) {
                        byte[] bArr11 = decryptedMessageMedia.key;
                        if (bArr11 != null && bArr11.length == 32 && (bArr4 = decryptedMessageMedia.iv) != null && bArr4.length == 32) {
                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                            tL_message_secret.media = tL_messageMediaDocument2;
                            tL_messageMediaDocument2.flags |= 3;
                            if (TextUtils.isEmpty(tL_message_secret.message)) {
                                String str5 = tL_decryptedMessage.media.caption;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                tL_message_secret.message = str5;
                            }
                            tL_message_secret.media.document = new TLRPC.TL_documentEncrypted();
                            TLRPC.Document document3 = tL_message_secret.media.document;
                            document3.id = encryptedFile.id;
                            document3.access_hash = encryptedFile.access_hash;
                            document3.date = i7;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia12 = tL_decryptedMessage.media;
                            document3.mime_type = decryptedMessageMedia12.mime_type;
                            if (decryptedMessageMedia12 instanceof TLRPC.TL_decryptedMessageMediaDocument_layer8) {
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = tL_decryptedMessage.media.file_name;
                                tL_message_secret.media.document.attributes.add(tL_documentAttributeFilename);
                            } else {
                                document3.attributes = decryptedMessageMedia12.attributes;
                            }
                            if (tL_message_secret.ttl > 0) {
                                int size = tL_message_secret.media.document.attributes.size();
                                for (int i15 = 0; i15 < size; i15++) {
                                    TLRPC.DocumentAttribute documentAttribute = tL_message_secret.media.document.attributes.get(i15);
                                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                        tL_message_secret.ttl = (int) Math.max(documentAttribute.duration + 1.0d, tL_message_secret.ttl);
                                        break;
                                    }
                                }
                                tL_message_secret.ttl = Math.max(tL_decryptedMessage.media.duration + 1, tL_message_secret.ttl);
                            }
                            TLRPC.Document document4 = tL_message_secret.media.document;
                            long j13 = tL_decryptedMessage.media.size;
                            document4.size = j13 != 0 ? Math.min(j13, encryptedFile.size) : encryptedFile.size;
                            TLRPC.Document document5 = tL_message_secret.media.document;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia13 = tL_decryptedMessage.media;
                            document5.key = decryptedMessageMedia13.key;
                            document5.iv = decryptedMessageMedia13.iv;
                            String str6 = document5.mime_type;
                            if (str6 == null) {
                                document5.mime_type = "";
                            } else if ("application/x-tgsticker".equals(str6) || "application/x-tgsdice".equals(tL_message_secret.media.document.mime_type)) {
                                tL_message_secret.media.document.mime_type = "application/x-bad_tgsticker";
                            }
                            byte[] bArr12 = ((TLRPC.TL_decryptedMessageMediaDocument) tL_decryptedMessage.media).thumb;
                            if (bArr12 == null || bArr12.length == 0 || bArr12.length > 20000) {
                                tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                                tL_photoSizeEmpty.type = "s";
                            } else {
                                tL_photoSizeEmpty = new TLRPC.TL_photoCachedSize();
                                tL_photoSizeEmpty.bytes = bArr12;
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia14 = tL_decryptedMessage.media;
                                tL_photoSizeEmpty.w = decryptedMessageMedia14.thumb_w;
                                tL_photoSizeEmpty.h = decryptedMessageMedia14.thumb_h;
                                tL_photoSizeEmpty.type = "s";
                                tL_photoSizeEmpty.location = new TLRPC.TL_fileLocationUnavailable();
                            }
                            tL_message_secret.media.document.thumbs.add(tL_photoSizeEmpty);
                            TLRPC.Document document6 = tL_message_secret.media.document;
                            document6.flags |= 1;
                            document6.dc_id = encryptedFile.dc_id;
                            if (ij.R4(tL_message_secret) || ij.j4(tL_message_secret)) {
                                tL_message_secret.media_unread = true;
                            }
                        }
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaExternalDocument) {
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
                        tL_message_secret.media = tL_messageMediaDocument3;
                        tL_messageMediaDocument3.flags |= 3;
                        tL_message_secret.message = "";
                        tL_messageMediaDocument3.document = new TLRPC.TL_document();
                        TLRPC.Document document7 = tL_message_secret.media.document;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia15 = tL_decryptedMessage.media;
                        document7.id = decryptedMessageMedia15.id;
                        document7.access_hash = decryptedMessageMedia15.access_hash;
                        document7.file_reference = new byte[0];
                        document7.date = decryptedMessageMedia15.date;
                        document7.attributes = decryptedMessageMedia15.attributes;
                        document7.mime_type = decryptedMessageMedia15.mime_type;
                        document7.dc_id = decryptedMessageMedia15.dc_id;
                        document7.size = decryptedMessageMedia15.size;
                        document7.thumbs.add(((TLRPC.TL_decryptedMessageMediaExternalDocument) decryptedMessageMedia15).thumb);
                        TLRPC.Document document8 = tL_message_secret.media.document;
                        document8.flags |= 1;
                        if (document8.mime_type == null) {
                            document8.mime_type = "";
                        }
                        if (ij.L2(tL_message_secret)) {
                            tL_message_secret.stickerVerified = 0;
                            getMediaDataController().n2(tL_message_secret, true);
                        }
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaAudio) {
                        byte[] bArr13 = decryptedMessageMedia.key;
                        if (bArr13 != null && bArr13.length == 32 && (bArr3 = decryptedMessageMedia.iv) != null && bArr3.length == 32) {
                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
                            tL_message_secret.media = tL_messageMediaDocument4;
                            tL_messageMediaDocument4.flags |= 3;
                            tL_messageMediaDocument4.document = new TLRPC.TL_documentEncrypted();
                            TLRPC.Document document9 = tL_message_secret.media.document;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia16 = tL_decryptedMessage.media;
                            document9.key = decryptedMessageMedia16.key;
                            document9.iv = decryptedMessageMedia16.iv;
                            document9.id = encryptedFile.id;
                            document9.access_hash = encryptedFile.access_hash;
                            document9.date = i7;
                            document9.size = encryptedFile.size;
                            document9.dc_id = encryptedFile.dc_id;
                            document9.mime_type = decryptedMessageMedia16.mime_type;
                            if (TextUtils.isEmpty(tL_message_secret.message)) {
                                String str7 = tL_decryptedMessage.media.caption;
                                tL_message_secret.message = str7 != null ? str7 : "";
                            }
                            TLRPC.Document document10 = tL_message_secret.media.document;
                            if (document10.mime_type == null) {
                                document10.mime_type = "audio/ogg";
                            }
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio.duration = tL_decryptedMessage.media.duration;
                            tL_documentAttributeAudio.voice = true;
                            tL_message_secret.media.document.attributes.add(tL_documentAttributeAudio);
                            int i16 = tL_message_secret.ttl;
                            if (i16 != 0) {
                                tL_message_secret.ttl = Math.max(tL_decryptedMessage.media.duration + 1, i16);
                            }
                            if (tL_message_secret.media.document.thumbs.isEmpty()) {
                                TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty3 = new TLRPC.TL_photoSizeEmpty();
                                tL_photoSizeEmpty3.type = "s";
                                tL_message_secret.media.document.thumbs.add(tL_photoSizeEmpty3);
                            }
                        }
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaVenue) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                        tL_message_secret.media = tL_messageMediaVenue;
                        tL_messageMediaVenue.geo = new TLRPC.TL_geoPoint();
                        TLRPC.MessageMedia messageMedia3 = tL_message_secret.media;
                        TLRPC.GeoPoint geoPoint2 = messageMedia3.geo;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia17 = tL_decryptedMessage.media;
                        geoPoint2.lat = decryptedMessageMedia17.lat;
                        geoPoint2._long = decryptedMessageMedia17._long;
                        messageMedia3.title = decryptedMessageMedia17.title;
                        messageMedia3.address = decryptedMessageMedia17.address;
                        messageMedia3.provider = decryptedMessageMedia17.provider;
                        messageMedia3.venue_id = decryptedMessageMedia17.venue_id;
                        messageMedia3.venue_type = "";
                    }
                }
                int i17 = tL_message_secret.ttl;
                if (i17 != 0) {
                    TLRPC.MessageMedia messageMedia4 = tL_message_secret.media;
                    if (messageMedia4.ttl_seconds == 0) {
                        messageMedia4.ttl_seconds = i17;
                        messageMedia4.flags |= 4;
                    }
                }
                String str8 = tL_message_secret.message;
                if (str8 != null) {
                    tL_message_secret.message = str8.replace((char) 8238, ' ');
                }
                return tL_message_secret;
            }
            if (tLObject instanceof TLRPC.TL_decryptedMessageService) {
                TLRPC.TL_decryptedMessageService tL_decryptedMessageService = (TLRPC.TL_decryptedMessageService) tLObject;
                TLRPC.DecryptedMessageAction decryptedMessageAction = tL_decryptedMessageService.action;
                if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages)) {
                    TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                    if (tL_decryptedMessageService.action instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
                        tL_messageService.action = tL_messageEncryptedAction;
                        TLRPC.DecryptedMessageAction decryptedMessageAction2 = tL_decryptedMessageService.action;
                        int i18 = decryptedMessageAction2.ttl_seconds;
                        if (i18 < 0 || i18 > 31536000) {
                            decryptedMessageAction2.ttl_seconds = 31536000;
                        }
                        encryptedChat.ttl = decryptedMessageAction2.ttl_seconds;
                        tL_messageEncryptedAction.encryptedAction = decryptedMessageAction2;
                        yr messagesStorage = getMessagesStorage();
                        messagesStorage.a.c(new eq(messagesStorage, encryptedChat, 0));
                    } else {
                        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction2 = new TLRPC.TL_messageEncryptedAction();
                        tL_messageService.action = tL_messageEncryptedAction2;
                        tL_messageEncryptedAction2.encryptedAction = tL_decryptedMessageService.action;
                    }
                    int j14 = getUserConfig().j();
                    tL_messageService.id = j14;
                    tL_messageService.local_id = j14;
                    getUserConfig().v(false);
                    tL_messageService.unread = true;
                    tL_messageService.flags = 256;
                    tL_messageService.date = i7;
                    TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                    tL_messageService.from_id = tL_peerUser3;
                    tL_peerUser3.user_id = j3;
                    TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                    tL_messageService.peer_id = tL_peerUser4;
                    tL_peerUser4.user_id = getUserConfig().e();
                    tL_messageService.dialog_id = m5.F(encryptedChat.id);
                    return tL_messageService;
                }
                if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionFlushHistory) {
                    g0.h3(new xv(this, m5.F(encryptedChat.id), 0));
                    return null;
                }
                if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionDeleteMessages) {
                    if (!decryptedMessageAction.random_ids.isEmpty()) {
                        this.h.addAll(tL_decryptedMessageService.action.random_ids);
                        return null;
                    }
                } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionReadMessages)) {
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNotifyLayer) {
                        a(encryptedChat, decryptedMessageAction.layer);
                        return null;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionRequestKey) {
                        long j15 = encryptedChat.exchange_id;
                        if (j15 != 0) {
                            if (j15 <= decryptedMessageAction.exchange_id) {
                                p(encryptedChat, null, j15);
                            } else if (r2.a) {
                                a8.b("we already have request key with higher exchange_id");
                                return null;
                            }
                        }
                        byte[] bArr14 = new byte[256];
                        Utilities.b.nextBytes(bArr14);
                        yr messagesStorage2 = getMessagesStorage();
                        messagesStorage2.H();
                        BigInteger bigInteger = new BigInteger(1, messagesStorage2.y);
                        getMessagesStorage().H();
                        BigInteger modPow = BigInteger.valueOf(r5.D).modPow(new BigInteger(1, bArr14), bigInteger);
                        BigInteger bigInteger2 = new BigInteger(1, tL_decryptedMessageService.action.g_a);
                        if (!Utilities.w(bigInteger2, bigInteger)) {
                            p(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        byte[] byteArray = modPow.toByteArray();
                        if (byteArray.length > 256) {
                            byte[] bArr15 = new byte[256];
                            System.arraycopy(byteArray, 1, bArr15, 0, 256);
                            byteArray = bArr15;
                        }
                        byte[] byteArray2 = bigInteger2.modPow(new BigInteger(1, bArr14), bigInteger).toByteArray();
                        if (byteArray2.length <= 256) {
                            if (byteArray2.length < 256) {
                                bArr2 = new byte[256];
                                System.arraycopy(byteArray2, 0, bArr2, 256 - byteArray2.length, byteArray2.length);
                                for (int i19 = 0; i19 < 256 - byteArray2.length; i19++) {
                                    bArr2[i19] = 0;
                                }
                            }
                            byte[] n10 = Utilities.n(byteArray2);
                            byte[] bArr16 = new byte[8];
                            System.arraycopy(n10, n10.length - 8, bArr16, 0, 8);
                            encryptedChat.exchange_id = tL_decryptedMessageService.action.exchange_id;
                            encryptedChat.future_auth_key = byteArray2;
                            encryptedChat.future_key_fingerprint = Utilities.g(bArr16);
                            encryptedChat.g_a_or_b = byteArray;
                            getMessagesStorage().V1(encryptedChat);
                            q(encryptedChat, null);
                            return null;
                        }
                        bArr2 = new byte[256];
                        System.arraycopy(byteArray2, byteArray2.length - 256, bArr2, 0, 256);
                        byteArray2 = bArr2;
                        byte[] n102 = Utilities.n(byteArray2);
                        byte[] bArr162 = new byte[8];
                        System.arraycopy(n102, n102.length - 8, bArr162, 0, 8);
                        encryptedChat.exchange_id = tL_decryptedMessageService.action.exchange_id;
                        encryptedChat.future_auth_key = byteArray2;
                        encryptedChat.future_key_fingerprint = Utilities.g(bArr162);
                        encryptedChat.g_a_or_b = byteArray;
                        getMessagesStorage().V1(encryptedChat);
                        q(encryptedChat, null);
                        return null;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAcceptKey) {
                        if (encryptedChat.exchange_id != decryptedMessageAction.exchange_id) {
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().V1(encryptedChat);
                            p(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        yr messagesStorage3 = getMessagesStorage();
                        messagesStorage3.H();
                        BigInteger bigInteger3 = new BigInteger(1, messagesStorage3.y);
                        BigInteger bigInteger4 = new BigInteger(1, tL_decryptedMessageService.action.g_b);
                        if (!Utilities.w(bigInteger4, bigInteger3)) {
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().V1(encryptedChat);
                            p(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        byte[] byteArray3 = bigInteger4.modPow(new BigInteger(1, encryptedChat.a_or_b), bigInteger3).toByteArray();
                        if (byteArray3.length <= 256) {
                            if (byteArray3.length < 256) {
                                bArr = new byte[256];
                                System.arraycopy(byteArray3, 0, bArr, 256 - byteArray3.length, byteArray3.length);
                                for (int i20 = 0; i20 < 256 - byteArray3.length; i20++) {
                                    bArr[i20] = 0;
                                }
                            }
                            byte[] n11 = Utilities.n(byteArray3);
                            byte[] bArr17 = new byte[8];
                            System.arraycopy(n11, n11.length - 8, bArr17, 0, 8);
                            g10 = Utilities.g(bArr17);
                            if (tL_decryptedMessageService.action.key_fingerprint != g10) {
                                encryptedChat.future_auth_key = byteArray3;
                                encryptedChat.future_key_fingerprint = g10;
                                getMessagesStorage().V1(encryptedChat);
                                s(encryptedChat, null);
                                return null;
                            }
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().V1(encryptedChat);
                            p(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        bArr = new byte[256];
                        System.arraycopy(byteArray3, byteArray3.length - 256, bArr, 0, 256);
                        byteArray3 = bArr;
                        byte[] n112 = Utilities.n(byteArray3);
                        byte[] bArr172 = new byte[8];
                        System.arraycopy(n112, n112.length - 8, bArr172, 0, 8);
                        g10 = Utilities.g(bArr172);
                        if (tL_decryptedMessageService.action.key_fingerprint != g10) {
                        }
                    } else {
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionCommitKey) {
                            if (encryptedChat.exchange_id == decryptedMessageAction.exchange_id) {
                                long j16 = encryptedChat.future_key_fingerprint;
                                if (j16 == decryptedMessageAction.key_fingerprint) {
                                    long j17 = encryptedChat.key_fingerprint;
                                    byte[] bArr18 = encryptedChat.auth_key;
                                    encryptedChat.key_fingerprint = j16;
                                    encryptedChat.auth_key = encryptedChat.future_auth_key;
                                    encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                                    encryptedChat.future_auth_key = bArr18;
                                    encryptedChat.future_key_fingerprint = j17;
                                    encryptedChat.key_use_count_in = (short) 0;
                                    encryptedChat.key_use_count_out = (short) 0;
                                    encryptedChat.exchange_id = 0L;
                                    getMessagesStorage().V1(encryptedChat);
                                    v(encryptedChat, null);
                                    return null;
                                }
                            }
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().V1(encryptedChat);
                            p(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAbortKey) {
                            if (encryptedChat.exchange_id == decryptedMessageAction.exchange_id) {
                                encryptedChat.future_auth_key = new byte[256];
                                encryptedChat.future_key_fingerprint = 0L;
                                encryptedChat.exchange_id = 0L;
                                getMessagesStorage().V1(encryptedChat);
                                return null;
                            }
                        } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNoop) && (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionResend) && (i10 = decryptedMessageAction.end_seq_no) >= (i11 = encryptedChat.in_seq_no) && i10 >= (i12 = decryptedMessageAction.start_seq_no)) {
                            if (i12 < i11) {
                                decryptedMessageAction.start_seq_no = i11;
                            }
                            long j18 = decryptedMessageAction.start_seq_no;
                            long j19 = i10;
                            long j20 = j19 - j18;
                            if (j18 >= 0 && j19 >= 0 && j19 < 2147483647L && j20 >= 0 && j20 <= 10000) {
                                getMessagesStorage().a.c(new t8(this, j18, encryptedChat, j19, 7));
                                return null;
                            }
                        }
                    }
                } else if (!decryptedMessageAction.random_ids.isEmpty()) {
                    int currentTime = getConnectionsManager().getCurrentTime();
                    yr messagesStorage4 = getMessagesStorage();
                    messagesStorage4.a.c(new wq(messagesStorage4, encryptedChat.id, tL_decryptedMessageService.action.random_ids, 1, currentTime, currentTime));
                    return null;
                }
            } else if (r2.a) {
                a8.d("unknown message " + tLObject);
                return null;
            }
        } else if (r2.a) {
            a8.d("unknown TLObject");
        }
        return null;
    }

    public final void m() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        g0.h3(new bw(this, new ArrayList(arrayList), 1));
        ArrayList arrayList2 = new ArrayList(arrayList);
        yr messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        if (!arrayList2.isEmpty()) {
            messagesStorage.a.c(new sp(messagesStorage, arrayList2, 3));
        }
        arrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(TL_update.TL_updateEncryption tL_updateEncryption, ConcurrentHashMap concurrentHashMap) {
        long j3;
        TLRPC.EncryptedChat encryptedChat;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.EncryptedChat encryptedChat2 = tL_updateEncryption.chat;
        long F = m5.F(encryptedChat2.id);
        TLRPC.EncryptedChat b12 = getMessagesController().b1(encryptedChat2.id, false);
        if ((encryptedChat2 instanceof TLRPC.TL_encryptedChatRequested) && b12 == null) {
            long j10 = encryptedChat2.participant_id;
            if (j10 == getUserConfig().e()) {
                j10 = encryptedChat2.admin_id;
            }
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
            if (a22 == null) {
                a22 = (TLRPC.User) concurrentHashMap.get(Long.valueOf(j10));
            }
            encryptedChat2.user_id = j10;
            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
            tL_dialog.id = F;
            tL_dialog.folder_id = encryptedChat2.folder_id;
            tL_dialog.unread_count = 0;
            tL_dialog.top_message = 0;
            tL_dialog.last_message_date = tL_updateEncryption.date;
            getMessagesController().U3(encryptedChat2, false);
            j3 = F;
            g0.h3(new a4(this, tL_dialog, F, 7));
            yr messagesStorage = getMessagesStorage();
            encryptedChat = encryptedChat2;
            messagesStorage.a.c(new em(messagesStorage, encryptedChat, a22, tL_dialog, 20));
            int i7 = encryptedChat.id;
            SparseArray sparseArray = this.e;
            if (sparseArray.get(i7) == null) {
                sparseArray.put(encryptedChat.id, encryptedChat);
                TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
                tL_messages_getDhConfig.random_length = 256;
                yr messagesStorage2 = getMessagesStorage();
                messagesStorage2.H();
                tL_messages_getDhConfig.version = messagesStorage2.x;
                getConnectionsManager().sendRequest(tL_messages_getDhConfig, new zv(this, encryptedChat, 0));
            }
        } else {
            j3 = F;
            encryptedChat = encryptedChat2;
            if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
                if (b12 != null) {
                    encryptedChat.user_id = b12.user_id;
                    encryptedChat.auth_key = b12.auth_key;
                    encryptedChat.key_create_date = b12.key_create_date;
                    encryptedChat.key_use_count_in = b12.key_use_count_in;
                    encryptedChat.key_use_count_out = b12.key_use_count_out;
                    encryptedChat.ttl = b12.ttl;
                    encryptedChat.seq_in = b12.seq_in;
                    encryptedChat.seq_out = b12.seq_out;
                    encryptedChat.admin_id = b12.admin_id;
                    encryptedChat.mtproto_seq = b12.mtproto_seq;
                }
                g0.h3(new lg(this, b12, encryptedChat, 25));
            } else if ((b12 instanceof TLRPC.TL_encryptedChatWaiting) && ((bArr = b12.auth_key) == null || bArr.length == 1)) {
                encryptedChat.a_or_b = b12.a_or_b;
                encryptedChat.user_id = b12.user_id;
                yr messagesStorage3 = getMessagesStorage();
                messagesStorage3.H();
                BigInteger bigInteger = new BigInteger(1, messagesStorage3.y);
                BigInteger bigInteger2 = new BigInteger(1, encryptedChat.g_a_or_b);
                if (Utilities.w(bigInteger2, bigInteger)) {
                    byte[] byteArray = bigInteger2.modPow(new BigInteger(1, encryptedChat.a_or_b), bigInteger).toByteArray();
                    if (byteArray.length > 256) {
                        bArr2 = new byte[256];
                        System.arraycopy(byteArray, byteArray.length - 256, bArr2, 0, 256);
                    } else {
                        if (byteArray.length < 256) {
                            bArr2 = new byte[256];
                            System.arraycopy(byteArray, 0, bArr2, 256 - byteArray.length, byteArray.length);
                            for (int i10 = 0; i10 < 256 - byteArray.length; i10++) {
                                bArr2[i10] = 0;
                            }
                        }
                        byte[] n10 = Utilities.n(byteArray);
                        bArr3 = new byte[8];
                        System.arraycopy(n10, n10.length - 8, bArr3, 0, 8);
                        if (encryptedChat.key_fingerprint != Utilities.g(bArr3)) {
                            encryptedChat.auth_key = byteArray;
                            encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                            encryptedChat.seq_in = -2;
                            encryptedChat.seq_out = 1;
                            getMessagesStorage().V1(encryptedChat);
                            getMessagesController().U3(encryptedChat, false);
                            int i11 = encryptedChat.id;
                            SparseArray sparseArray2 = this.c;
                            ArrayList arrayList = (ArrayList) sparseArray2.get(i11);
                            if (arrayList != null) {
                                getMessagesController().N3(arrayList, null, null, false, 0);
                                sparseArray2.remove(encryptedChat.id);
                            }
                            g0.h3(new wv(this, encryptedChat, 1));
                        } else {
                            TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = new TLRPC.TL_encryptedChatDiscarded();
                            tL_encryptedChatDiscarded.id = encryptedChat.id;
                            tL_encryptedChatDiscarded.user_id = encryptedChat.user_id;
                            tL_encryptedChatDiscarded.auth_key = encryptedChat.auth_key;
                            tL_encryptedChatDiscarded.key_create_date = encryptedChat.key_create_date;
                            tL_encryptedChatDiscarded.key_use_count_in = encryptedChat.key_use_count_in;
                            tL_encryptedChatDiscarded.key_use_count_out = encryptedChat.key_use_count_out;
                            tL_encryptedChatDiscarded.seq_in = encryptedChat.seq_in;
                            tL_encryptedChatDiscarded.seq_out = encryptedChat.seq_out;
                            tL_encryptedChatDiscarded.admin_id = encryptedChat.admin_id;
                            tL_encryptedChatDiscarded.mtproto_seq = encryptedChat.mtproto_seq;
                            getMessagesStorage().V1(tL_encryptedChatDiscarded);
                            g0.h3(new yv(this, tL_encryptedChatDiscarded, 0));
                            f(encryptedChat.id, false);
                        }
                    }
                    byteArray = bArr2;
                    byte[] n102 = Utilities.n(byteArray);
                    bArr3 = new byte[8];
                    System.arraycopy(n102, n102.length - 8, bArr3, 0, 8);
                    if (encryptedChat.key_fingerprint != Utilities.g(bArr3)) {
                    }
                } else {
                    f(encryptedChat.id, false);
                }
            } else if (b12 == null && this.n) {
                this.f.add(tL_updateEncryption);
            }
        }
        if ((encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) && encryptedChat.history_deleted) {
            g0.h3(new xv(this, j3, 3));
        }
    }

    public final void o(TLRPC.EncryptedChat encryptedChat) {
        byte[] bArr = new byte[256];
        Utilities.b.nextBytes(bArr);
        getMessagesStorage().H();
        BigInteger valueOf = BigInteger.valueOf(r2.D);
        BigInteger bigInteger = new BigInteger(1, bArr);
        yr messagesStorage = getMessagesStorage();
        messagesStorage.H();
        byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage.y)).toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr2 = new byte[256];
            System.arraycopy(byteArray, 1, bArr2, 0, 256);
            byteArray = bArr2;
        }
        getSendMessagesHelper().getClass();
        encryptedChat.exchange_id = gz.E();
        encryptedChat.a_or_b = bArr;
        encryptedChat.g_a = byteArray;
        getMessagesStorage().V1(encryptedChat);
        x(encryptedChat, null);
    }

    public final void p(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, long j3) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionAbortKey tL_decryptedMessageActionAbortKey = new TLRPC.TL_decryptedMessageActionAbortKey();
                tL_decryptedMessageService.action = tL_decryptedMessageActionAbortKey;
                tL_decryptedMessageActionAbortKey.exchange_id = j3;
                message = d(encryptedChat, tL_decryptedMessageActionAbortKey);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void q(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionAcceptKey tL_decryptedMessageActionAcceptKey = new TLRPC.TL_decryptedMessageActionAcceptKey();
                tL_decryptedMessageService.action = tL_decryptedMessageActionAcceptKey;
                tL_decryptedMessageActionAcceptKey.exchange_id = encryptedChat.exchange_id;
                tL_decryptedMessageActionAcceptKey.key_fingerprint = encryptedChat.future_key_fingerprint;
                tL_decryptedMessageActionAcceptKey.g_b = encryptedChat.g_a_or_b;
                message = d(encryptedChat, tL_decryptedMessageActionAcceptKey);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void r(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionFlushHistory tL_decryptedMessageActionFlushHistory = new TLRPC.TL_decryptedMessageActionFlushHistory();
                tL_decryptedMessageService.action = tL_decryptedMessageActionFlushHistory;
                message = d(encryptedChat, tL_decryptedMessageActionFlushHistory);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void s(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionCommitKey tL_decryptedMessageActionCommitKey = new TLRPC.TL_decryptedMessageActionCommitKey();
                tL_decryptedMessageService.action = tL_decryptedMessageActionCommitKey;
                tL_decryptedMessageActionCommitKey.exchange_id = encryptedChat.exchange_id;
                tL_decryptedMessageActionCommitKey.key_fingerprint = encryptedChat.future_key_fingerprint;
                message = d(encryptedChat, tL_decryptedMessageActionCommitKey);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void t(TLRPC.EncryptedChat encryptedChat, ArrayList arrayList, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionDeleteMessages tL_decryptedMessageActionDeleteMessages = new TLRPC.TL_decryptedMessageActionDeleteMessages();
                tL_decryptedMessageService.action = tL_decryptedMessageActionDeleteMessages;
                tL_decryptedMessageActionDeleteMessages.random_ids = arrayList;
                message = d(encryptedChat, tL_decryptedMessageActionDeleteMessages);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void u(TLRPC.EncryptedChat encryptedChat, ArrayList arrayList, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionReadMessages tL_decryptedMessageActionReadMessages = new TLRPC.TL_decryptedMessageActionReadMessages();
                tL_decryptedMessageService.action = tL_decryptedMessageActionReadMessages;
                tL_decryptedMessageActionReadMessages.random_ids = arrayList;
                message = d(encryptedChat, tL_decryptedMessageActionReadMessages);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void v(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionNoop tL_decryptedMessageActionNoop = new TLRPC.TL_decryptedMessageActionNoop();
                tL_decryptedMessageService.action = tL_decryptedMessageActionNoop;
                message = d(encryptedChat, tL_decryptedMessageActionNoop);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void w(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            Integer valueOf = Integer.valueOf(encryptedChat.id);
            ArrayList arrayList = this.a;
            if (arrayList.contains(valueOf)) {
                return;
            }
            arrayList.add(Integer.valueOf(encryptedChat.id));
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionNotifyLayer tL_decryptedMessageActionNotifyLayer = new TLRPC.TL_decryptedMessageActionNotifyLayer();
                tL_decryptedMessageService.action = tL_decryptedMessageActionNotifyLayer;
                tL_decryptedMessageActionNotifyLayer.layer = qs.h2;
                message = d(encryptedChat, tL_decryptedMessageActionNotifyLayer);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void x(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionRequestKey tL_decryptedMessageActionRequestKey = new TLRPC.TL_decryptedMessageActionRequestKey();
                tL_decryptedMessageService.action = tL_decryptedMessageActionRequestKey;
                tL_decryptedMessageActionRequestKey.exchange_id = encryptedChat.exchange_id;
                tL_decryptedMessageActionRequestKey.g_a = encryptedChat.g_a;
                message = d(encryptedChat, tL_decryptedMessageActionRequestKey);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void y(TLRPC.EncryptedChat encryptedChat, int i7, int i10, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            int i11 = encryptedChat.id;
            SparseArray sparseArray = this.d;
            SparseIntArray sparseIntArray = (SparseIntArray) sparseArray.get(i11);
            if (sparseIntArray == null || sparseIntArray.indexOfKey(i7) < 0) {
                if (sparseIntArray == null) {
                    sparseIntArray = new SparseIntArray();
                    sparseArray.put(encryptedChat.id, sparseIntArray);
                }
                sparseIntArray.put(i7, i10);
                TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
                if (message != null) {
                    tL_decryptedMessageService.action = message.action.encryptedAction;
                } else {
                    TLRPC.TL_decryptedMessageActionResend tL_decryptedMessageActionResend = new TLRPC.TL_decryptedMessageActionResend();
                    tL_decryptedMessageService.action = tL_decryptedMessageActionResend;
                    tL_decryptedMessageActionResend.start_seq_no = i7;
                    tL_decryptedMessageActionResend.end_seq_no = i10;
                    message = d(encryptedChat, tL_decryptedMessageActionResend);
                }
                TLRPC.Message message2 = message;
                tL_decryptedMessageService.random_id = message2.random_id;
                j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
            }
        }
    }

    public final void z(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionSetMessageTTL tL_decryptedMessageActionSetMessageTTL = new TLRPC.TL_decryptedMessageActionSetMessageTTL();
                tL_decryptedMessageService.action = tL_decryptedMessageActionSetMessageTTL;
                tL_decryptedMessageActionSetMessageTTL.ttl_seconds = encryptedChat.ttl;
                message = d(encryptedChat, tL_decryptedMessageActionSetMessageTTL);
                ij ijVar = new ij(this.currentAccount, message, false, false);
                ijVar.k.send_state = 1;
                ijVar.V1 = true;
                getMessagesController().l5(0, message.dialog_id, k5.k(ijVar));
                getNotificationCenter().k(qs.s, new Object[0]);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }
}
