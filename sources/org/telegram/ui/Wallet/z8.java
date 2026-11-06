package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z8 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n9 b;

    public /* synthetic */ z8(n9 n9Var, int i7) {
        this.a = i7;
        this.b = n9Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                n9.g0(this.b, (TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                n9 n9Var = this.b;
                n9Var.getClass();
                if (wallettransaction != null) {
                    n9Var.e0 = wallettransaction.fee;
                    n9Var.D0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                n9 n9Var2 = this.b;
                n9Var2.r = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    n9Var2.e = walletuseraddress;
                    if (walletuseraddress != null) {
                        n9Var2.h = walletuseraddress.address;
                    }
                    fi.w3 w3Var = n9Var2.a;
                    if (w3Var != null) {
                        w3Var.f3.O(true);
                    }
                    n9Var2.C0();
                    n9Var2.t0();
                    r8 r8Var = n9Var2.w;
                    if (r8Var != null) {
                        r8Var.a(n9Var2.h, n9Var2.f);
                        break;
                    }
                } else {
                    n9Var2.finishFragment();
                    break;
                }
                break;
            case 3:
                n9 n9Var3 = this.b;
                n9Var3.g0 = (String) obj;
                n9Var3.h0 = ((Boolean) obj2).booleanValue();
                n9Var3.P.setText(n9Var3.g0);
                n9Var3.P.setVisibility(TextUtils.isEmpty(n9Var3.g0) ? 8 : 0);
                n9Var3.E0();
                break;
            default:
                n9 n9Var4 = this.b;
                n9Var4.g0 = (String) obj;
                n9Var4.h0 = ((Boolean) obj2).booleanValue();
                n9Var4.P.setText(n9Var4.g0);
                n9Var4.P.setVisibility(TextUtils.isEmpty(n9Var4.g0) ? 8 : 0);
                n9Var4.E0();
                break;
        }
    }
}
