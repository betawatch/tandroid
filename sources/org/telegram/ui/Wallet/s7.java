package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.e71;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;

    public /* synthetic */ s7(j8 j8Var, int i10) {
        this.a = i10;
        this.b = j8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                j8 j8Var = this.b;
                j8Var.getClass();
                if (wallettransaction != null) {
                    j8Var.b0 = wallettransaction.fee;
                    j8Var.x0();
                    break;
                }
                break;
            case 1:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                j8 j8Var2 = this.b;
                j8Var2.n = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    j8Var2.d = walletuseraddress;
                    if (walletuseraddress != null) {
                        j8Var2.f = walletuseraddress.address;
                    }
                    e71 e71Var = j8Var2.a;
                    if (e71Var != null) {
                        e71Var.W2.N(true);
                    }
                    j8Var2.w0();
                    j8Var2.n0();
                    n7 n7Var = j8Var2.s;
                    if (n7Var != null) {
                        n7Var.a(j8Var2.f, j8Var2.e);
                        break;
                    }
                } else {
                    j8Var2.finishFragment();
                    break;
                }
                break;
            case 2:
                j8 j8Var3 = this.b;
                j8Var3.d0 = (String) obj;
                j8Var3.e0 = ((Boolean) obj2).booleanValue();
                j8Var3.M.setText(j8Var3.d0);
                j8Var3.M.setVisibility(TextUtils.isEmpty(j8Var3.d0) ? 8 : 0);
                j8Var3.y0();
                break;
            case 3:
                j8 j8Var4 = this.b;
                j8Var4.d0 = (String) obj;
                j8Var4.e0 = ((Boolean) obj2).booleanValue();
                j8Var4.M.setText(j8Var4.d0);
                j8Var4.M.setVisibility(TextUtils.isEmpty(j8Var4.d0) ? 8 : 0);
                j8Var4.y0();
                break;
            default:
                j8.b0(this.b, (TL_wallet.walletUserAddress) obj);
                break;
        }
    }
}
