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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.f71;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                k0 k0Var = (k0) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                String str = (String) this.d;
                byte[] bArr = (byte[]) obj;
                k0Var.getClass();
                if (bArr != null) {
                    TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                    walletuseraddress.user_id = 0L;
                    walletuseraddress.address = str;
                    walletuseraddress.public_key = bArr;
                    k0Var.I.put(str, walletuseraddress);
                    callback2.run(walletuseraddress, null);
                    break;
                } else {
                    callback2.run(null, null);
                    break;
                }
            case 1:
                d2 d2Var = (d2) this.b;
                z1 z1Var = (z1) this.c;
                ii.c cVar = (ii.c) this.d;
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
                AndroidUtilities.runOnUIThread(new m6((Object) d2Var3, (Object) tonconnectsession, (String) obj, (Object) jVar, 6));
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
                ci.d dVar = (ci.d) this.b;
                i2[] i2VarArr = (i2[]) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                String str4 = (String) obj;
                dVar.setLoading(false);
                if (!TextUtils.isEmpty(str4)) {
                    new ad(i2VarArr[0].topBulletinContainer, e6Var).e0(str4, false);
                    break;
                } else {
                    i2VarArr[0].dismiss();
                    break;
                }
            case 6:
                l7 l7Var = (l7) this.c;
                k0 k0Var2 = (k0) this.b;
                k0Var2.h0(new org.telegram.messenger.camera.i((Object) k0Var2, (Object) new q(l7Var, (Utilities.Callback) obj, (ArrayList) this.d, k0Var2), true, false, 2));
                break;
            case 7:
                s8 s8Var = (s8) this.c;
                k0 k0Var3 = (k0) this.b;
                TLRPC.User user = (TLRPC.User) this.d;
                String str5 = (String) obj;
                if (!s8Var.n) {
                    if (!TextUtils.isEmpty(str5) && k0.b(s8Var.e, k0Var3.r())) {
                        a0 a0Var = new a0(k0Var3, str5, s8Var.d, null, new n(s8Var, k0Var3, user, str5));
                        k0Var3.h0(a0Var);
                        s8Var.h = new m(a0Var, 1);
                        break;
                    } else {
                        s8Var.f = false;
                        s8Var.V.setLoading(false);
                        ad.a0(s8Var).e0(TextUtils.isEmpty(str5) ? LocaleController.getString(R.string.WalletRecipientUnavailable) : "WALLET_CHANGED", false);
                        break;
                    }
                }
                break;
            case 8:
                ((org.telegram.ui.Cells.i6) ((View) obj)).u((TLRPC.User) this.b, null, (CharSequence) this.c, (CharSequence) this.d, false, false);
                break;
            default:
                ci.d dVar2 = (ci.d) this.b;
                i2 i2Var = (i2) this.c;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.d;
                String str6 = (String) obj;
                dVar2.setLoading(false);
                if (str6 != null) {
                    ad.c0(str6, i2Var.topBulletinContainer, e6Var2);
                    break;
                } else {
                    i2Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ o(f71 f71Var, k0 k0Var, Object obj, int i10) {
        this.a = i10;
        this.c = f71Var;
        this.b = k0Var;
        this.d = obj;
    }
}
