package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z8 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o9 b;

    public /* synthetic */ z8(o9 o9Var, int i10) {
        this.a = i10;
        this.b = o9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                o9.b0(this.b, (TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                o9 o9Var = this.b;
                o9Var.getClass();
                if (wallettransaction != null) {
                    o9Var.b0 = wallettransaction.fee;
                    o9Var.x0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                o9 o9Var2 = this.b;
                o9Var2.n = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    o9Var2.d = walletuseraddress;
                    if (walletuseraddress != null) {
                        o9Var2.f = walletuseraddress.address;
                    }
                    u61 u61Var = o9Var2.a;
                    if (u61Var != null) {
                        u61Var.W2.N(true);
                    }
                    o9Var2.w0();
                    o9Var2.n0();
                    q8 q8Var = o9Var2.s;
                    if (q8Var != null) {
                        q8Var.a(o9Var2.f, o9Var2.e);
                        break;
                    }
                } else {
                    o9Var2.finishFragment();
                    break;
                }
                break;
            case 3:
                o9 o9Var3 = this.b;
                o9Var3.d0 = (String) obj;
                o9Var3.e0 = ((Boolean) obj2).booleanValue();
                o9Var3.M.setText(o9Var3.d0);
                o9Var3.M.setVisibility(TextUtils.isEmpty(o9Var3.d0) ? 8 : 0);
                o9Var3.y0();
                break;
            default:
                o9 o9Var4 = this.b;
                o9Var4.d0 = (String) obj;
                o9Var4.e0 = ((Boolean) obj2).booleanValue();
                o9Var4.M.setText(o9Var4.d0);
                o9Var4.M.setVisibility(TextUtils.isEmpty(o9Var4.d0) ? 8 : 0);
                o9Var4.y0();
                break;
        }
    }
}
