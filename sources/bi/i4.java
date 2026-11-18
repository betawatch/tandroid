package bi;

import android.content.Context;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Base64;
import c8.bb;
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
import org.telegram.messenger.f9;
import org.telegram.messenger.ks;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;
import org.telegram.ui.o60;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4 implements q10 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ i4(int i7, org.telegram.ui.Wallet.u0 u0Var, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, org.telegram.ui.Wallet.y2 y2Var) {
        this.c = i7;
        this.d = u0Var;
        this.b = str;
        this.e = bArr;
        this.f = bArr2;
        this.g = sendtransfer;
        this.h = y2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0334  */
    @Override // org.telegram.messenger.q10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        CancellationToken cancellationToken;
        o60 o60Var;
        String str;
        TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction;
        String str2;
        int i7;
        String str3;
        ByteBuffer wrap;
        switch (this.a) {
            case 0:
                x10 x10Var = (x10) this.d;
                Context context = (Context) this.b;
                int i10 = this.c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.e;
                lc lcVar = (lc) this.f;
                Boolean bool = (Boolean) this.g;
                q10 q10Var = (q10) this.h;
                TL_stars.StarGiftOnchainSalePayload starGiftOnchainSalePayload = (TL_stars.StarGiftOnchainSalePayload) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                x10Var.a(Boolean.FALSE);
                boolean z10 = starGiftOnchainSalePayload instanceof TL_stars.TL_payments_starGiftOnchainFixedSalePayload;
                org.telegram.ui.Wallet.p0 p0Var = null;
                try {
                    if (z10) {
                        TL_stars.TL_payments_starGiftOnchainFixedSalePayload tL_payments_starGiftOnchainFixedSalePayload = (TL_stars.TL_payments_starGiftOnchainFixedSalePayload) starGiftOnchainSalePayload;
                        ArrayList<TL_stars.TL_payments_starGiftOnchainOfferTxMessage> arrayList = tL_payments_starGiftOnchainFixedSalePayload.messages;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            org.telegram.ui.Wallet.p0 a10 = org.telegram.ui.Wallet.p0.a(tL_payments_starGiftOnchainFixedSalePayload.messages);
                            ArrayList<TL_stars.TL_payments_starGiftOnchainOfferTxMessage> arrayList2 = tL_payments_starGiftOnchainFixedSalePayload.gasless_messages;
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                org.telegram.ui.Wallet.p0 a11 = org.telegram.ui.Wallet.p0.a(tL_payments_starGiftOnchainFixedSalePayload.gasless_messages);
                                List list = a11.g;
                                if (list == null) {
                                    list = Collections.singletonList(a11);
                                }
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        p0Var = a11;
                                    } else if (((org.telegram.ui.Wallet.p0) it.next()).e != 3) {
                                    }
                                }
                                a10.f = p0Var;
                            }
                            p0Var = a10;
                        }
                    } else if (starGiftOnchainSalePayload instanceof TL_stars.TL_payments_starGiftOnchainSalePayload) {
                        TL_stars.TL_payments_starGiftOnchainSalePayload tL_payments_starGiftOnchainSalePayload = (TL_stars.TL_payments_starGiftOnchainSalePayload) starGiftOnchainSalePayload;
                        if (!TextUtils.isEmpty(tL_payments_starGiftOnchainSalePayload.nft_address)) {
                            p0Var = new org.telegram.ui.Wallet.p0(tL_payments_starGiftOnchainSalePayload.nft_address, tL_payments_starGiftOnchainSalePayload.amount, tL_payments_starGiftOnchainSalePayload.payload, null, 3);
                        }
                    }
                    if (p0Var == null) {
                        u4.r(context, i10, i6Var, lcVar, tL_error, bool);
                        break;
                    } else {
                        List list2 = p0Var.g;
                        if (list2 == null) {
                            list2 = Collections.singletonList(p0Var);
                        }
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((org.telegram.ui.Wallet.p0) it2.next()).e != 3) {
                                u4.q(context, i10, i6Var, lcVar, "WALLET_UNSUPPORTED_SEND_MODE", Boolean.valueOf(z10));
                                break;
                            }
                        }
                        q10Var.a(p0Var, Boolean.valueOf(z10));
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    u4.q(context, i10, i6Var, lcVar, "WALLET_UNSUPPORTED_SEND_MODE", Boolean.valueOf(z10));
                    return;
                }
                break;
            case 1:
                CancellationToken cancellationToken2 = (CancellationToken) this.d;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.e;
                Runnable[] runnableArr = (Runnable[]) this.f;
                androidx.emoji2.text.n nVar = (androidx.emoji2.text.n) this.g;
                Context context2 = (Context) this.b;
                o60 o60Var2 = (o60) this.h;
                int i11 = this.c;
                TLRPC.TL_auth_firebasePnvIntent tL_auth_firebasePnvIntent = (TLRPC.TL_auth_firebasePnvIntent) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!cancellationToken2.isCancellationRequested()) {
                    if (tL_auth_firebasePnvIntent == null || tL_error2 != null) {
                        taskCompletionSource.trySetException(new ConnectionsManager.RequestException(tL_error2));
                        break;
                    } else {
                        try {
                            cancellationToken = cancellationToken2;
                            try {
                                o60Var = o60Var2;
                            } catch (Exception unused) {
                                o60Var = o60Var2;
                                str = null;
                                if (str == null) {
                                }
                            }
                            try {
                                str = org.telegram.ui.web.v0.A(new JSONArray().put(org.telegram.ui.web.v0.B("protocol", "openid4vp-v1-unsigned", "data", org.telegram.ui.web.v0.C("response_type", "vp_token", "response_mode", "dc_api", "nonce", tL_auth_firebasePnvIntent.nonce, "dcql_query", org.telegram.ui.web.v0.A(new JSONArray().put(new JSONObject(tL_auth_firebasePnvIntent.digital_credential_payload)), "credentials")))), "requests").toString();
                            } catch (Exception unused2) {
                                str = null;
                                if (str == null) {
                                }
                            }
                        } catch (Exception unused3) {
                            cancellationToken = cancellationToken2;
                        }
                        if (str == null) {
                            taskCompletionSource.trySetException(new Exception("Failed to create Firebase PNV payload"));
                            break;
                        } else {
                            v0.o oVar = new v0.o(str);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(oVar);
                            v0.m mVar = new v0.m(hd.f.l(arrayList3), false);
                            CancellationSignal cancellationSignal = new CancellationSignal();
                            runnableArr[0] = new org.telegram.messenger.a(cancellationSignal, 11);
                            if (cancellationToken.isCancellationRequested()) {
                                cancellationSignal.cancel();
                                break;
                            } else {
                                nVar.d(context2, mVar, cancellationSignal, new d3.b(1), new f9(cancellationToken, taskCompletionSource, o60Var, i11, runnableArr));
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                int i12 = this.c;
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.d;
                String str4 = (String) this.b;
                byte[] bArr = (byte[]) this.e;
                byte[] bArr2 = (byte[]) this.f;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.g;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) this.h;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    TLRPC.Update update = updates.update;
                    tL_updateSentWalletTransaction = update instanceof TL_update.TL_updateSentWalletTransaction ? (TL_update.TL_updateSentWalletTransaction) update : null;
                    ArrayList<TLRPC.Update> arrayList4 = updates.updates;
                    int size = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TLRPC.Update update2 = arrayList4.get(i13);
                        i13++;
                        TLRPC.Update update3 = update2;
                        if (update3 instanceof TL_update.TL_updateSentWalletTransaction) {
                            tL_updateSentWalletTransaction = (TL_update.TL_updateSentWalletTransaction) update3;
                        }
                    }
                    Utilities.d.c(new org.telegram.tgnet.g(i12, updates, 2));
                } else {
                    tL_updateSentWalletTransaction = null;
                }
                if (tL_error3 != null && "WALLET_KEY_MISMATCH".equals(tL_error3.text)) {
                    u0Var.K();
                }
                byte b10 = 1;
                if (tL_updateSentWalletTransaction != null && !TextUtils.isEmpty(tL_updateSentWalletTransaction.msg_hash)) {
                    TLRPC.TL_widgetQueryTypeSentTransaction tL_widgetQueryTypeSentTransaction = new TLRPC.TL_widgetQueryTypeSentTransaction();
                    TLRPC.TL_userWallet tL_userWallet = new TLRPC.TL_userWallet();
                    tL_userWallet.address = str4;
                    tL_userWallet.balance = u0Var.A();
                    if (bArr2 != null) {
                        tL_userWallet.public_key = bArr;
                        tL_userWallet.state_init = bArr2;
                    }
                    tL_widgetQueryTypeSentTransaction.wallet = tL_userWallet;
                    String str5 = tL_updateSentWalletTransaction.msg_hash;
                    byte[] bArr3 = sendtransfer.data_normal;
                    try {
                        wrap = ByteBuffer.wrap(bArr3);
                    } catch (RuntimeException | NoSuchAlgorithmException unused4) {
                    }
                    if (wrap.getInt() != -1242653582) {
                        str2 = str5;
                        str3 = null;
                        i7 = 2;
                    } else {
                        byte b11 = wrap.get();
                        int i14 = b11 & 7;
                        int i15 = wrap.get() & 255;
                        if (i14 >= 1) {
                            int i16 = 4;
                            if (i14 <= 4 && i15 >= 1) {
                                char c10 = '\b';
                                if (i15 <= 8) {
                                    int d = (int) bb.d(i14, wrap);
                                    long d2 = bb.d(i14, wrap);
                                    bb.d(i14, wrap);
                                    bb.d(i15, wrap);
                                    if (d2 == 1 && d >= 1 && d <= bArr3.length) {
                                        int d10 = (int) bb.d(i14, wrap);
                                        if ((b11 & 128) != 0) {
                                            wrap.position((i15 * d) + wrap.position());
                                        }
                                        byte[][] bArr4 = new byte[d][];
                                        int[][] iArr = new int[d][];
                                        int[] iArr2 = new int[d];
                                        int i17 = 0;
                                        while (i17 < d) {
                                            char c11 = c10;
                                            try {
                                                int i18 = wrap.get() & 255;
                                                i7 = 2;
                                                try {
                                                    int i19 = wrap.get() & 255;
                                                    if (i18 <= i16) {
                                                        iArr2[i17] = i19;
                                                        byte[] bArr5 = new byte[(i19 + 1) / 2];
                                                        bArr4[i17] = bArr5;
                                                        wrap.get(bArr5);
                                                        iArr[i17] = new int[i18];
                                                        int i20 = 0;
                                                        while (i20 < i18) {
                                                            int i21 = i18;
                                                            iArr[i17][i20] = (int) bb.d(i14, wrap);
                                                            int i22 = iArr[i17][i20];
                                                            if (i22 > i17 && i22 < d) {
                                                                i20++;
                                                                i18 = i21;
                                                            }
                                                        }
                                                        i17++;
                                                        c10 = c11;
                                                        i16 = 4;
                                                    }
                                                } catch (RuntimeException | NoSuchAlgorithmException unused5) {
                                                }
                                            } catch (RuntimeException | NoSuchAlgorithmException unused6) {
                                                i7 = 2;
                                            }
                                            str2 = str5;
                                            str3 = null;
                                        }
                                        i7 = 2;
                                        int[] iArr3 = new int[d];
                                        byte[][] bArr6 = new byte[d][];
                                        int i23 = d - 1;
                                        while (i23 >= 0) {
                                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                            messageDigest.update((byte) iArr[i23].length);
                                            messageDigest.update((byte) iArr2[i23]);
                                            messageDigest.update(bArr4[i23]);
                                            int[] iArr4 = iArr[i23];
                                            int length = iArr4.length;
                                            int i24 = 0;
                                            while (i24 < length) {
                                                int i25 = iArr4[i24];
                                                byte b12 = b10;
                                                str2 = str5;
                                                try {
                                                    iArr3[i23] = Math.max(iArr3[i23], iArr3[i25] + 1);
                                                    messageDigest.update((byte) (iArr3[i25] >> 8));
                                                    messageDigest.update((byte) iArr3[i25]);
                                                    i24++;
                                                    b10 = b12;
                                                    str5 = str2;
                                                } catch (RuntimeException | NoSuchAlgorithmException unused7) {
                                                }
                                            }
                                            byte b13 = b10;
                                            String str6 = str5;
                                            for (int i26 : iArr[i23]) {
                                                messageDigest.update(bArr6[i26]);
                                            }
                                            bArr6[i23] = messageDigest.digest();
                                            i23--;
                                            b10 = b13;
                                            str5 = str6;
                                        }
                                        byte b14 = b10;
                                        str2 = str5;
                                        int b15 = bb.b(bArr4[d10], iArr[d10]);
                                        if (b15 < 0) {
                                            str3 = null;
                                        } else {
                                            byte[] bArr7 = new byte[35];
                                            bb.c(0, bArr7);
                                            for (int i27 = 0; i27 < 267; i27++) {
                                                int i28 = i27 + 4;
                                                if (bb.a(i28, bArr4[d10])) {
                                                    bb.c(i28, bArr7);
                                                }
                                            }
                                            bb.c(ks.z4, bArr7);
                                            bb.c(ks.A4, bArr7);
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
                    y2Var.d = false;
                    if (!y2Var.f) {
                        y2Var.f = true;
                        y2Var.b.d(tL_widgetQueryTypeSentTransaction);
                    }
                    if (!y2Var.e) {
                        y2Var.a.dismiss();
                        break;
                    }
                } else {
                    lc.c0(org.telegram.ui.Wallet.l2.z(tL_error3, "widget sendTransfer"));
                    fi.e eVar = (tL_error3 == null || tL_error3.code != 400) ? new fi.e(27) : new fi.e(26);
                    y2Var.d = false;
                    if (!y2Var.f) {
                        y2Var.f = true;
                        eVar.a(y2Var.b);
                    }
                    if (!y2Var.e) {
                        y2Var.a.dismiss();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ i4(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, androidx.emoji2.text.n nVar, Context context, o60 o60Var, int i7) {
        this.d = cancellationToken;
        this.e = taskCompletionSource;
        this.f = runnableArr;
        this.g = nVar;
        this.b = context;
        this.h = o60Var;
        this.c = i7;
    }

    public /* synthetic */ i4(x10 x10Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, lc lcVar, Boolean bool, q10 q10Var) {
        this.d = x10Var;
        this.b = context;
        this.c = i7;
        this.e = i6Var;
        this.f = lcVar;
        this.g = bool;
        this.h = q10Var;
    }
}
