package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w8 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;

    public /* synthetic */ w8(l9 l9Var, int i10) {
        this.a = i10;
        this.b = l9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                l9.b0(this.b, (TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                l9 l9Var = this.b;
                l9Var.getClass();
                if (wallettransaction != null) {
                    l9Var.b0 = wallettransaction.fee;
                    l9Var.x0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                l9 l9Var2 = this.b;
                l9Var2.n = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    l9Var2.d = walletuseraddress;
                    if (walletuseraddress != null) {
                        l9Var2.f = walletuseraddress.address;
                    }
                    u61 u61Var = l9Var2.a;
                    if (u61Var != null) {
                        u61Var.W2.N(true);
                    }
                    l9Var2.w0();
                    l9Var2.n0();
                    n8 n8Var = l9Var2.s;
                    if (n8Var != null) {
                        n8Var.a(l9Var2.f, l9Var2.e);
                        break;
                    }
                } else {
                    l9Var2.finishFragment();
                    break;
                }
                break;
            case 3:
                l9 l9Var3 = this.b;
                l9Var3.d0 = (String) obj;
                l9Var3.e0 = ((Boolean) obj2).booleanValue();
                l9Var3.M.setText(l9Var3.d0);
                l9Var3.M.setVisibility(TextUtils.isEmpty(l9Var3.d0) ? 8 : 0);
                l9Var3.y0();
                break;
            default:
                l9 l9Var4 = this.b;
                l9Var4.d0 = (String) obj;
                l9Var4.e0 = ((Boolean) obj2).booleanValue();
                l9Var4.M.setText(l9Var4.d0);
                l9Var4.M.setVisibility(TextUtils.isEmpty(l9Var4.d0) ? 8 : 0);
                l9Var4.y0();
                break;
        }
    }
}
