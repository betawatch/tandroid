package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                j0 j0Var = (j0) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                String str = (String) this.d;
                byte[] bArr = (byte[]) obj;
                j0Var.getClass();
                if (bArr != null) {
                    TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                    walletuseraddress.user_id = 0L;
                    walletuseraddress.address = str;
                    walletuseraddress.public_key = bArr;
                    j0Var.I.put(str, walletuseraddress);
                    callback2.run(walletuseraddress, null);
                    break;
                } else {
                    callback2.run(null, null);
                    break;
                }
            case 1:
                d2 d2Var = (d2) this.b;
                z1 z1Var = (z1) this.c;
                ji.c cVar = (ji.c) this.d;
                String str2 = (String) obj;
                d2Var.getClass();
                z1Var.p = !z1Var.n && !d2Var.i(z1Var) && d2Var.y(z1Var) && str2 == null;
                cVar.run(null, str2);
                break;
            case 2:
                d2 d2Var2 = (d2) this.b;
                z1 z1Var2 = (z1) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String str3 = (String) obj;
                d2Var2.getClass();
                z1Var2.m = false;
                if (z1Var2.r == null && d2Var2.g == z1Var2) {
                    d2Var2.g = null;
                }
                callback.run(str3);
                break;
            case 3:
                d2 d2Var3 = (d2) this.b;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                j jVar = (j) this.d;
                d2Var3.getClass();
                AndroidUtilities.runOnUIThread(new l6((Object) d2Var3, (Object) tonconnectsession, (String) obj, (Object) jVar, 6));
                break;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.b;
                n3 n3Var = (n3) this.c;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) this.d;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    n3Var.run(wallettransaction2);
                    break;
                }
                break;
            case 5:
                di.d dVar = (di.d) this.b;
                i2[] i2VarArr = (i2[]) this.c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                String str4 = (String) obj;
                dVar.setLoading(false);
                if (!TextUtils.isEmpty(str4)) {
                    new zc(i2VarArr[0].topBulletinContainer, c6Var).e0(str4, false);
                    break;
                } else {
                    i2VarArr[0].dismiss();
                    break;
                }
            case 6:
                k7 k7Var = (k7) this.c;
                j0 j0Var2 = (j0) this.b;
                j0Var2.h0(new e2.o0((Object) j0Var2, (Object) new q(k7Var, (Utilities.Callback) obj, (ArrayList) this.d, j0Var2), true, false, 3));
                break;
            case 7:
                r8 r8Var = (r8) this.c;
                j0 j0Var3 = (j0) this.b;
                TLRPC.User user = (TLRPC.User) this.d;
                String str5 = (String) obj;
                if (!r8Var.n) {
                    if (!TextUtils.isEmpty(str5) && j0.b(r8Var.e, j0Var3.r())) {
                        z zVar = new z(j0Var3, str5, r8Var.d, null, new n(r8Var, j0Var3, user, str5));
                        j0Var3.h0(zVar);
                        r8Var.h = new m(zVar, 1);
                        break;
                    } else {
                        r8Var.f = false;
                        r8Var.V.setLoading(false);
                        zc.a0(r8Var).e0(TextUtils.isEmpty(str5) ? LocaleController.getString(R.string.WalletRecipientUnavailable) : "WALLET_CHANGED", false);
                        break;
                    }
                }
                break;
            case 8:
                ((org.telegram.ui.Cells.i6) ((View) obj)).u((TLRPC.User) this.b, null, (CharSequence) this.c, (CharSequence) this.d, false, false);
                break;
            default:
                di.d dVar2 = (di.d) this.b;
                i2 i2Var = (i2) this.c;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.d;
                String str6 = (String) obj;
                dVar2.setLoading(false);
                if (str6 != null) {
                    zc.c0(str6, i2Var.topBulletinContainer, c6Var2);
                    break;
                } else {
                    i2Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ o(c71 c71Var, j0 j0Var, Object obj, int i10) {
        this.a = i10;
        this.c = c71Var;
        this.b = j0Var;
        this.d = obj;
    }
}
