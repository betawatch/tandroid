package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.w61;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ t8(i9 i9Var, int i10) {
        this.a = i10;
        this.b = i9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                i9.b0(this.b, (TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                i9 i9Var = this.b;
                i9Var.getClass();
                if (wallettransaction != null) {
                    i9Var.b0 = wallettransaction.fee;
                    i9Var.x0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                i9 i9Var2 = this.b;
                i9Var2.n = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    i9Var2.d = walletuseraddress;
                    if (walletuseraddress != null) {
                        i9Var2.f = walletuseraddress.address;
                    }
                    w61 w61Var = i9Var2.a;
                    if (w61Var != null) {
                        w61Var.W2.N(true);
                    }
                    i9Var2.w0();
                    i9Var2.n0();
                    k8 k8Var = i9Var2.s;
                    if (k8Var != null) {
                        k8Var.a(i9Var2.f, i9Var2.e);
                        break;
                    }
                } else {
                    i9Var2.finishFragment();
                    break;
                }
                break;
            case 3:
                i9 i9Var3 = this.b;
                i9Var3.d0 = (String) obj;
                i9Var3.e0 = ((Boolean) obj2).booleanValue();
                i9Var3.M.setText(i9Var3.d0);
                i9Var3.M.setVisibility(TextUtils.isEmpty(i9Var3.d0) ? 8 : 0);
                i9Var3.y0();
                break;
            default:
                i9 i9Var4 = this.b;
                i9Var4.d0 = (String) obj;
                i9Var4.e0 = ((Boolean) obj2).booleanValue();
                i9Var4.M.setText(i9Var4.d0);
                i9Var4.M.setVisibility(TextUtils.isEmpty(i9Var4.d0) ? 8 : 0);
                i9Var4.y0();
                break;
        }
    }
}
