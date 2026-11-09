package org.telegram.messenger;

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
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.bd0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class f9 implements v10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ f9(int i7, org.telegram.ui.Wallet.l0 l0Var, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, org.telegram.ui.Wallet.s2 s2Var) {
        this.b = i7;
        this.c = l0Var;
        this.d = str;
        this.e = bArr;
        this.f = bArr2;
        this.g = sendtransfer;
        this.h = s2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032e  */
    @Override // org.telegram.messenger.v10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        CancellationToken cancellationToken;
        String str;
        TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction;
        String str2;
        int i7;
        String str3;
        ByteBuffer wrap;
        switch (this.a) {
            case 0:
                CancellationToken cancellationToken2 = (CancellationToken) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                Runnable[] runnableArr = (Runnable[]) this.e;
                k0.b bVar = (k0.b) this.f;
                Context context = (Context) this.g;
                bd0 bd0Var = (bd0) this.h;
                int i10 = this.b;
                TLRPC.TL_auth_firebasePnvIntent tL_auth_firebasePnvIntent = (TLRPC.TL_auth_firebasePnvIntent) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!cancellationToken2.isCancellationRequested()) {
                    if (tL_auth_firebasePnvIntent == null || tL_error != null) {
                        taskCompletionSource.trySetException(new ConnectionsManager.RequestException(tL_error));
                        break;
                    } else {
                        try {
                            cancellationToken = cancellationToken2;
                            try {
                                str = org.telegram.ui.web.x0.A(new JSONArray().put(org.telegram.ui.web.x0.B("protocol", "openid4vp-v1-unsigned", "data", org.telegram.ui.web.x0.C("response_type", "vp_token", "response_mode", "dc_api", "nonce", tL_auth_firebasePnvIntent.nonce, "dcql_query", org.telegram.ui.web.x0.A(new JSONArray().put(new JSONObject(tL_auth_firebasePnvIntent.digital_credential_payload)), "credentials")))), "requests").toString();
                            } catch (Exception unused) {
                                str = null;
                                if (str != null) {
                                }
                            }
                        } catch (Exception unused2) {
                            cancellationToken = cancellationToken2;
                        }
                        if (str != null) {
                            taskCompletionSource.trySetException(new Exception("Failed to create Firebase PNV payload"));
                            break;
                        } else {
                            v0.p pVar = new v0.p(str);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(pVar);
                            v0.n nVar = new v0.n(hd.f.l(arrayList), false);
                            CancellationSignal cancellationSignal = new CancellationSignal();
                            runnableArr[0] = new a(cancellationSignal, 11);
                            if (cancellationToken.isCancellationRequested()) {
                                cancellationSignal.cancel();
                                break;
                            } else {
                                bVar.c(context, nVar, cancellationSignal, new d3.b(1), new h9(cancellationToken, taskCompletionSource, bd0Var, i10, runnableArr));
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                int i11 = this.b;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.c;
                String str4 = (String) this.d;
                byte[] bArr = (byte[]) this.e;
                byte[] bArr2 = (byte[]) this.f;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.g;
                org.telegram.ui.Wallet.s2 s2Var = (org.telegram.ui.Wallet.s2) this.h;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    TLRPC.Update update = updates.update;
                    tL_updateSentWalletTransaction = update instanceof TL_update.TL_updateSentWalletTransaction ? (TL_update.TL_updateSentWalletTransaction) update : null;
                    ArrayList<TLRPC.Update> arrayList2 = updates.updates;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TLRPC.Update update2 = arrayList2.get(i12);
                        i12++;
                        TLRPC.Update update3 = update2;
                        if (update3 instanceof TL_update.TL_updateSentWalletTransaction) {
                            tL_updateSentWalletTransaction = (TL_update.TL_updateSentWalletTransaction) update3;
                        }
                    }
                    Utilities.d.c(new org.telegram.tgnet.g(i11, updates, 2));
                } else {
                    tL_updateSentWalletTransaction = null;
                }
                if (tL_error2 != null && "WALLET_KEY_MISMATCH".equals(tL_error2.text)) {
                    l0Var.E();
                }
                byte b10 = 1;
                if (tL_updateSentWalletTransaction != null && !TextUtils.isEmpty(tL_updateSentWalletTransaction.msg_hash)) {
                    TLRPC.TL_widgetQueryTypeSentTransaction tL_widgetQueryTypeSentTransaction = new TLRPC.TL_widgetQueryTypeSentTransaction();
                    TLRPC.TL_userWallet tL_userWallet = new TLRPC.TL_userWallet();
                    tL_userWallet.address = str4;
                    tL_userWallet.balance = l0Var.v();
                    if (bArr2 != null) {
                        tL_userWallet.public_key = bArr;
                        tL_userWallet.state_init = bArr2;
                    }
                    tL_widgetQueryTypeSentTransaction.wallet = tL_userWallet;
                    String str5 = tL_updateSentWalletTransaction.msg_hash;
                    byte[] bArr3 = sendtransfer.data_normal;
                    try {
                        wrap = ByteBuffer.wrap(bArr3);
                    } catch (RuntimeException | NoSuchAlgorithmException unused3) {
                    }
                    if (wrap.getInt() != -1242653582) {
                        str2 = str5;
                        str3 = null;
                        i7 = 2;
                    } else {
                        byte b11 = wrap.get();
                        int i13 = b11 & 7;
                        int i14 = wrap.get() & 255;
                        if (i13 >= 1) {
                            int i15 = 4;
                            if (i13 <= 4 && i14 >= 1) {
                                char c10 = '\b';
                                if (i14 <= 8) {
                                    int d = (int) c8.wa.d(i13, wrap);
                                    long d2 = c8.wa.d(i13, wrap);
                                    c8.wa.d(i13, wrap);
                                    c8.wa.d(i14, wrap);
                                    if (d2 == 1 && d >= 1 && d <= bArr3.length) {
                                        int d10 = (int) c8.wa.d(i13, wrap);
                                        if ((b11 & 128) != 0) {
                                            wrap.position((i14 * d) + wrap.position());
                                        }
                                        byte[][] bArr4 = new byte[d][];
                                        int[][] iArr = new int[d][];
                                        int[] iArr2 = new int[d];
                                        int i16 = 0;
                                        while (i16 < d) {
                                            char c11 = c10;
                                            try {
                                                int i17 = wrap.get() & 255;
                                                i7 = 2;
                                                try {
                                                    int i18 = wrap.get() & 255;
                                                    if (i17 <= i15) {
                                                        iArr2[i16] = i18;
                                                        byte[] bArr5 = new byte[(i18 + 1) / 2];
                                                        bArr4[i16] = bArr5;
                                                        wrap.get(bArr5);
                                                        iArr[i16] = new int[i17];
                                                        int i19 = 0;
                                                        while (i19 < i17) {
                                                            int i20 = i17;
                                                            iArr[i16][i19] = (int) c8.wa.d(i13, wrap);
                                                            int i21 = iArr[i16][i19];
                                                            if (i21 > i16 && i21 < d) {
                                                                i19++;
                                                                i17 = i20;
                                                            }
                                                        }
                                                        i16++;
                                                        c10 = c11;
                                                        i15 = 4;
                                                    }
                                                } catch (RuntimeException | NoSuchAlgorithmException unused4) {
                                                }
                                            } catch (RuntimeException | NoSuchAlgorithmException unused5) {
                                                i7 = 2;
                                            }
                                            str2 = str5;
                                            str3 = null;
                                        }
                                        i7 = 2;
                                        int[] iArr3 = new int[d];
                                        byte[][] bArr6 = new byte[d][];
                                        int i22 = d - 1;
                                        while (i22 >= 0) {
                                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                            messageDigest.update((byte) iArr[i22].length);
                                            messageDigest.update((byte) iArr2[i22]);
                                            messageDigest.update(bArr4[i22]);
                                            int[] iArr4 = iArr[i22];
                                            int length = iArr4.length;
                                            int i23 = 0;
                                            while (i23 < length) {
                                                int i24 = iArr4[i23];
                                                byte b12 = b10;
                                                str2 = str5;
                                                try {
                                                    iArr3[i22] = Math.max(iArr3[i22], iArr3[i24] + 1);
                                                    messageDigest.update((byte) (iArr3[i24] >> 8));
                                                    messageDigest.update((byte) iArr3[i24]);
                                                    i23++;
                                                    b10 = b12;
                                                    str5 = str2;
                                                } catch (RuntimeException | NoSuchAlgorithmException unused6) {
                                                }
                                            }
                                            byte b13 = b10;
                                            String str6 = str5;
                                            for (int i25 : iArr[i22]) {
                                                messageDigest.update(bArr6[i25]);
                                            }
                                            bArr6[i22] = messageDigest.digest();
                                            i22--;
                                            b10 = b13;
                                            str5 = str6;
                                        }
                                        byte b14 = b10;
                                        str2 = str5;
                                        int b15 = c8.wa.b(bArr4[d10], iArr[d10]);
                                        if (b15 < 0) {
                                            str3 = null;
                                        } else {
                                            byte[] bArr7 = new byte[35];
                                            c8.wa.c(0, bArr7);
                                            for (int i26 = 0; i26 < 267; i26++) {
                                                int i27 = i26 + 4;
                                                if (c8.wa.a(i27, bArr4[d10])) {
                                                    c8.wa.c(i27, bArr7);
                                                }
                                            }
                                            c8.wa.c(qs.z4, bArr7);
                                            c8.wa.c(qs.A4, bArr7);
                                            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
                                            messageDigest2.update(b14);
                                            messageDigest2.update((byte) 69);
                                            messageDigest2.update(bArr7);
                                            messageDigest2.update((byte) (iArr3[b15] >> 8));
                                            messageDigest2.update((byte) iArr3[b15]);
                                            messageDigest2.update(bArr6[b15]);
                                            str3 = Utilities.f(messageDigest2.digest()).toLowerCase(Locale.ROOT);
                                        }
                                    }
                                }
                            }
                        }
                        str2 = str5;
                        i7 = 2;
                        str3 = null;
                    }
                    tL_widgetQueryTypeSentTransaction.msg_hash = str3 != null ? Base64.encodeToString(Utilities.v(str3), i7) : str2;
                    s2Var.d = false;
                    if (!s2Var.f) {
                        s2Var.f = true;
                        s2Var.b.d(tL_widgetQueryTypeSentTransaction);
                    }
                    if (!s2Var.e) {
                        s2Var.a.dismiss();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.hc.b0(org.telegram.ui.Wallet.d2.z(tL_error2, "widget sendTransfer"));
                    di.e eVar = (tL_error2 == null || tL_error2.code != 400) ? new di.e(27) : new di.e(26);
                    s2Var.d = false;
                    if (!s2Var.f) {
                        s2Var.f = true;
                        eVar.a(s2Var.b);
                    }
                    if (!s2Var.e) {
                        s2Var.a.dismiss();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ f9(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, k0.b bVar, Context context, bd0 bd0Var, int i7) {
        this.c = cancellationToken;
        this.d = taskCompletionSource;
        this.e = runnableArr;
        this.f = bVar;
        this.g = context;
        this.h = bd0Var;
        this.b = i7;
    }
}
