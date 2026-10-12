package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b71;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;

    public /* synthetic */ r7(i8 i8Var, int i10) {
        this.a = i10;
        this.b = i8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                i8 i8Var = this.b;
                i8Var.getClass();
                if (wallettransaction != null) {
                    i8Var.b0 = wallettransaction.fee;
                    i8Var.x0();
                    break;
                }
                break;
            case 1:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                i8 i8Var2 = this.b;
                i8Var2.n = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    i8Var2.d = walletuseraddress;
                    if (walletuseraddress != null) {
                        i8Var2.f = walletuseraddress.address;
                    }
                    b71 b71Var = i8Var2.a;
                    if (b71Var != null) {
                        b71Var.W2.N(true);
                    }
                    i8Var2.w0();
                    i8Var2.n0();
                    m7 m7Var = i8Var2.s;
                    if (m7Var != null) {
                        m7Var.a(i8Var2.f, i8Var2.e);
                        break;
                    }
                } else {
                    i8Var2.finishFragment();
                    break;
                }
                break;
            case 2:
                i8 i8Var3 = this.b;
                i8Var3.d0 = (String) obj;
                i8Var3.e0 = ((Boolean) obj2).booleanValue();
                i8Var3.M.setText(i8Var3.d0);
                i8Var3.M.setVisibility(TextUtils.isEmpty(i8Var3.d0) ? 8 : 0);
                i8Var3.y0();
                break;
            case 3:
                i8 i8Var4 = this.b;
                i8Var4.d0 = (String) obj;
                i8Var4.e0 = ((Boolean) obj2).booleanValue();
                i8Var4.M.setText(i8Var4.d0);
                i8Var4.M.setVisibility(TextUtils.isEmpty(i8Var4.d0) ? 8 : 0);
                i8Var4.y0();
                break;
            default:
                i8.b0(this.b, (TL_wallet.walletUserAddress) obj);
                break;
        }
    }
}
