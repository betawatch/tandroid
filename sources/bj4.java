// default package

import android.content.Context;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class bj4 implements icc {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ bj4(int i, c cVar, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, n55 n55Var) {
        this.b = i;
        this.c = cVar;
        this.d = str;
        this.e = bArr;
        this.f = bArr2;
        this.g = sendtransfer;
        this.h = n55Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e9  */
    @Override // icc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction;
        String str2;
        String str3;
        ByteBuffer wrap;
        a35 a35Var;
        a35 a35Var2;
        switch (this.a) {
            case 0:
                CancellationToken cancellationToken = (CancellationToken) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                Runnable[] runnableArr = (Runnable[]) this.e;
                vj0 vj0Var = (vj0) this.f;
                Context context = (Context) this.g;
                z56 z56Var = (z56) this.h;
                int i = this.b;
                TLRPC.TL_auth_firebasePnvIntent tL_auth_firebasePnvIntent = (TLRPC.TL_auth_firebasePnvIntent) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!cancellationToken.isCancellationRequested()) {
                    if (tL_auth_firebasePnvIntent == null || tL_error != null) {
                        taskCompletionSource.trySetException(new ConnectionsManager.RequestException(tL_error));
                        break;
                    } else {
                        try {
                            str = rv0.x(new JSONArray().put(rv0.y("protocol", "openid4vp-v1-unsigned", "data", rv0.z("response_type", "vp_token", "response_mode", "dc_api", "nonce", tL_auth_firebasePnvIntent.nonce, "dcql_query", rv0.x(new JSONArray().put(new JSONObject(tL_auth_firebasePnvIntent.digital_credential_payload)), "credentials")))), "requests").toString();
                        } catch (Exception unused) {
                            str = null;
                        }
                        if (str == null) {
                            taskCompletionSource.trySetException(new Exception("Failed to create Firebase PNV payload"));
                            break;
                        } else {
                            cv4 cv4Var = new cv4(str);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(cv4Var);
                            av4 av4Var = new av4(sl2.k(arrayList), false);
                            CancellationSignal cancellationSignal = new CancellationSignal();
                            runnableArr[0] = new lw3(cancellationSignal, (byte) 29);
                            if (cancellationToken.isCancellationRequested()) {
                                cancellationSignal.cancel();
                                break;
                            } else {
                                vj0Var.d(context, av4Var, cancellationSignal, new ic((byte) 0), new cj4(cancellationToken, taskCompletionSource, z56Var, i, runnableArr));
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                int i2 = this.b;
                c cVar = (c) this.c;
                String str4 = (String) this.d;
                byte[] bArr = (byte[]) this.e;
                byte[] bArr2 = (byte[]) this.f;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.g;
                n55 n55Var = (n55) this.h;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                byte b = 2;
                if (updates != null) {
                    TLRPC.Update update = updates.update;
                    tL_updateSentWalletTransaction = update instanceof TL_update.TL_updateSentWalletTransaction ? (TL_update.TL_updateSentWalletTransaction) update : null;
                    ArrayList<TLRPC.Update> arrayList2 = updates.updates;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TLRPC.Update update2 = arrayList2.get(i3);
                        i3++;
                        TLRPC.Update update3 = update2;
                        if (update3 instanceof TL_update.TL_updateSentWalletTransaction) {
                            tL_updateSentWalletTransaction = (TL_update.TL_updateSentWalletTransaction) update3;
                        }
                    }
                    Utilities.d.c(new ne(i2, updates, b));
                } else {
                    tL_updateSentWalletTransaction = null;
                }
                if (tL_error2 != null && "WALLET_KEY_MISMATCH".equals(tL_error2.text)) {
                    cVar.J();
                }
                if (tL_updateSentWalletTransaction == null || TextUtils.isEmpty(tL_updateSentWalletTransaction.msg_hash)) {
                    d31.c0(a55.z(tL_error2, "widget sendTransfer"));
                    bm0 bm0Var = (tL_error2 == null || tL_error2.code != 400) ? new bm0((byte) 14) : new bm0((byte) 13);
                    n55Var.d = false;
                    if (!n55Var.f) {
                        n55Var.f = true;
                        bm0Var.a(n55Var.b);
                    }
                    if (!n55Var.e) {
                        n55Var.a.dismiss();
                        break;
                    }
                } else {
                    TLRPC.TL_widgetQueryTypeSentTransaction tL_widgetQueryTypeSentTransaction = new TLRPC.TL_widgetQueryTypeSentTransaction();
                    TLRPC.TL_userWallet tL_userWallet = new TLRPC.TL_userWallet();
                    tL_userWallet.address = str4;
                    tL_userWallet.balance = cVar.z();
                    if (bArr2 != null) {
                        tL_userWallet.public_key = bArr;
                        tL_userWallet.state_init = bArr2;
                    }
                    tL_widgetQueryTypeSentTransaction.wallet = tL_userWallet;
                    String str5 = tL_updateSentWalletTransaction.msg_hash;
                    byte[] bArr3 = sendtransfer.data_normal;
                    try {
                        wrap = ByteBuffer.wrap(bArr3);
                    } catch (RuntimeException | NoSuchAlgorithmException unused2) {
                    }
                    if (wrap.getInt() == -1242653582) {
                        byte b2 = wrap.get();
                        int i4 = b2 & 7;
                        int i5 = wrap.get() & 255;
                        if (i4 >= 1) {
                            int i6 = 4;
                            if (i4 <= 4 && i5 >= 1) {
                                char c = '\b';
                                if (i5 <= 8) {
                                    int d = (int) u2f.d(i4, wrap);
                                    long d2 = u2f.d(i4, wrap);
                                    u2f.d(i4, wrap);
                                    u2f.d(i5, wrap);
                                    if (d2 == 1 && d >= 1 && d <= bArr3.length) {
                                        int d3 = (int) u2f.d(i4, wrap);
                                        if ((b2 & 128) != 0) {
                                            wrap.position((i5 * d) + wrap.position());
                                        }
                                        byte[][] bArr4 = new byte[d][];
                                        int[][] iArr = new int[d][];
                                        int[] iArr2 = new int[d];
                                        int i7 = 0;
                                        while (i7 < d) {
                                            int i8 = wrap.get() & 255;
                                            int i9 = wrap.get() & 255;
                                            if (i8 <= i6) {
                                                iArr2[i7] = i9;
                                                byte[] bArr5 = new byte[(i9 + 1) / 2];
                                                bArr4[i7] = bArr5;
                                                wrap.get(bArr5);
                                                iArr[i7] = new int[i8];
                                                int i10 = 0;
                                                while (i10 < i8) {
                                                    char c2 = c;
                                                    iArr[i7][i10] = (int) u2f.d(i4, wrap);
                                                    int i11 = iArr[i7][i10];
                                                    if (i11 > i7 && i11 < d) {
                                                        i10++;
                                                        c = c2;
                                                    }
                                                }
                                                i7++;
                                                i6 = 4;
                                            }
                                        }
                                        int[] iArr3 = new int[d];
                                        byte[][] bArr6 = new byte[d][];
                                        int i12 = d - 1;
                                        while (i12 >= 0) {
                                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                            messageDigest.update((byte) iArr[i12].length);
                                            messageDigest.update((byte) iArr2[i12]);
                                            messageDigest.update(bArr4[i12]);
                                            int[] iArr4 = iArr[i12];
                                            int length = iArr4.length;
                                            int i13 = 0;
                                            while (i13 < length) {
                                                int i14 = iArr4[i13];
                                                str2 = str5;
                                                try {
                                                    iArr3[i12] = Math.max(iArr3[i12], iArr3[i14] + 1);
                                                    messageDigest.update((byte) (iArr3[i14] >> 8));
                                                    messageDigest.update((byte) iArr3[i14]);
                                                    i13++;
                                                    str5 = str2;
                                                } catch (RuntimeException | NoSuchAlgorithmException unused3) {
                                                }
                                            }
                                            String str6 = str5;
                                            for (int i15 : iArr[i12]) {
                                                messageDigest.update(bArr6[i15]);
                                            }
                                            bArr6[i12] = messageDigest.digest();
                                            i12--;
                                            str5 = str6;
                                        }
                                        str2 = str5;
                                        int b3 = u2f.b(bArr4[d3], iArr[d3]);
                                        if (b3 >= 0) {
                                            byte[] bArr7 = new byte[35];
                                            u2f.c(0, bArr7);
                                            for (int i16 = 0; i16 < 267; i16++) {
                                                int i17 = i16 + 4;
                                                if (u2f.a(i17, bArr4[d3])) {
                                                    u2f.c(i17, bArr7);
                                                }
                                            }
                                            u2f.c(jn7.y4, bArr7);
                                            u2f.c(jn7.z4, bArr7);
                                            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
                                            messageDigest2.update((byte) 1);
                                            messageDigest2.update((byte) 69);
                                            messageDigest2.update(bArr7);
                                            messageDigest2.update((byte) (iArr3[b3] >> 8));
                                            messageDigest2.update((byte) iArr3[b3]);
                                            messageDigest2.update(bArr6[b3]);
                                            str3 = Utilities.f(messageDigest2.digest()).toLowerCase(Locale.ROOT);
                                            tL_widgetQueryTypeSentTransaction.msg_hash = str3 != null ? Base64.encodeToString(Utilities.v(str3), 2) : str2;
                                            n55Var.d = false;
                                            if (!n55Var.f) {
                                                n55Var.f = true;
                                                n55Var.b.d(tL_widgetQueryTypeSentTransaction);
                                            }
                                            if (!n55Var.e) {
                                                n55Var.a.dismiss();
                                                break;
                                            }
                                        }
                                        str3 = null;
                                        tL_widgetQueryTypeSentTransaction.msg_hash = str3 != null ? Base64.encodeToString(Utilities.v(str3), 2) : str2;
                                        n55Var.d = false;
                                        if (!n55Var.f) {
                                        }
                                        if (!n55Var.e) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    str2 = str5;
                    str3 = null;
                    tL_widgetQueryTypeSentTransaction.msg_hash = str3 != null ? Base64.encodeToString(Utilities.v(str3), 2) : str2;
                    n55Var.d = false;
                    if (!n55Var.f) {
                    }
                    if (!n55Var.e) {
                    }
                }
                break;
            default:
                pcc pccVar = (pcc) this.c;
                Context context2 = (Context) this.g;
                int i18 = this.b;
                vnb vnbVar = (vnb) this.d;
                d31 d31Var = (d31) this.e;
                Boolean bool = (Boolean) this.f;
                icc iccVar = (icc) this.h;
                TL_stars.StarGiftOnchainSalePayload starGiftOnchainSalePayload = (TL_stars.StarGiftOnchainSalePayload) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                pccVar.a(Boolean.FALSE);
                boolean z = starGiftOnchainSalePayload instanceof TL_stars.TL_payments_starGiftOnchainFixedSalePayload;
                try {
                    if (z) {
                        TL_stars.TL_payments_starGiftOnchainFixedSalePayload tL_payments_starGiftOnchainFixedSalePayload = (TL_stars.TL_payments_starGiftOnchainFixedSalePayload) starGiftOnchainSalePayload;
                        ArrayList<TL_stars.TL_payments_starGiftOnchainOfferTxMessage> arrayList3 = tL_payments_starGiftOnchainFixedSalePayload.messages;
                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                            a35 a = a35.a(tL_payments_starGiftOnchainFixedSalePayload.messages);
                            ArrayList<TL_stars.TL_payments_starGiftOnchainOfferTxMessage> arrayList4 = tL_payments_starGiftOnchainFixedSalePayload.gasless_messages;
                            if (arrayList4 != null && !arrayList4.isEmpty()) {
                                a35 a2 = a35.a(tL_payments_starGiftOnchainFixedSalePayload.gasless_messages);
                                List list = a2.g;
                                if (list == null) {
                                    list = Collections.singletonList(a2);
                                }
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        a35Var2 = a2;
                                    } else if (((a35) it.next()).e != 3) {
                                        a35Var2 = null;
                                    }
                                }
                                a.f = a35Var2;
                            }
                            a35Var = a;
                        }
                        a35Var = null;
                    } else {
                        if (starGiftOnchainSalePayload instanceof TL_stars.TL_payments_starGiftOnchainSalePayload) {
                            TL_stars.TL_payments_starGiftOnchainSalePayload tL_payments_starGiftOnchainSalePayload = (TL_stars.TL_payments_starGiftOnchainSalePayload) starGiftOnchainSalePayload;
                            if (!TextUtils.isEmpty(tL_payments_starGiftOnchainSalePayload.nft_address)) {
                                a35Var = new a35(tL_payments_starGiftOnchainSalePayload.nft_address, tL_payments_starGiftOnchainSalePayload.amount, tL_payments_starGiftOnchainSalePayload.payload, null, 3);
                            }
                        }
                        a35Var = null;
                    }
                    if (a35Var == null) {
                        it7.u(context2, i18, vnbVar, d31Var, tL_error3, bool);
                        break;
                    } else {
                        List list2 = a35Var.g;
                        if (list2 == null) {
                            list2 = Collections.singletonList(a35Var);
                        }
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((a35) it2.next()).e != 3) {
                                it7.t(context2, i18, vnbVar, d31Var, "WALLET_UNSUPPORTED_SEND_MODE", Boolean.valueOf(z));
                                break;
                            }
                        }
                        iccVar.a(a35Var, Boolean.valueOf(z));
                        break;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    it7.t(context2, i18, vnbVar, d31Var, "WALLET_UNSUPPORTED_SEND_MODE", Boolean.valueOf(z));
                }
                break;
        }
    }

    public /* synthetic */ bj4(pcc pccVar, Context context, int i, vnb vnbVar, d31 d31Var, Boolean bool, icc iccVar) {
        this.c = pccVar;
        this.g = context;
        this.b = i;
        this.d = vnbVar;
        this.e = d31Var;
        this.f = bool;
        this.h = iccVar;
    }

    public /* synthetic */ bj4(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, vj0 vj0Var, Context context, z56 z56Var, int i) {
        this.c = cancellationToken;
        this.d = taskCompletionSource;
        this.e = runnableArr;
        this.f = vj0Var;
        this.g = context;
        this.h = z56Var;
        this.b = i;
    }
}
