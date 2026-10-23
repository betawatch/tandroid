package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d71;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j9 b;

    public /* synthetic */ u8(j9 j9Var, int i10) {
        this.a = i10;
        this.b = j9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                j9.b0(this.b, (TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                j9 j9Var = this.b;
                j9Var.getClass();
                if (wallettransaction != null) {
                    j9Var.d0 = wallettransaction.fee;
                    j9Var.y0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                j9 j9Var2 = this.b;
                j9Var2.n = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    j9Var2.d = walletuseraddress;
                    if (walletuseraddress != null) {
                        j9Var2.f = walletuseraddress.address;
                    }
                    d71 d71Var = j9Var2.a;
                    if (d71Var != null) {
                        d71Var.Z2.N(true);
                    }
                    j9Var2.x0();
                    j9Var2.o0();
                    l8 l8Var = j9Var2.s;
                    if (l8Var != null) {
                        l8Var.a(j9Var2.f, j9Var2.e);
                        break;
                    }
                } else {
                    j9Var2.finishFragment();
                    break;
                }
                break;
            case 3:
                j9 j9Var3 = this.b;
                j9Var3.f0 = (String) obj;
                j9Var3.g0 = ((Boolean) obj2).booleanValue();
                j9Var3.O.setText(j9Var3.f0);
                j9Var3.O.setVisibility(TextUtils.isEmpty(j9Var3.f0) ? 8 : 0);
                j9Var3.z0();
                break;
            default:
                j9 j9Var4 = this.b;
                j9Var4.f0 = (String) obj;
                j9Var4.g0 = ((Boolean) obj2).booleanValue();
                j9Var4.O.setText(j9Var4.f0);
                j9Var4.O.setVisibility(TextUtils.isEmpty(j9Var4.f0) ? 8 : 0);
                j9Var4.z0();
                break;
        }
    }
}
