package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.k20;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ii;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e9 implements k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r9 b;

    public /* synthetic */ e9(r9 r9Var, int i10) {
        this.a = i10;
        this.b = r9Var;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                r9.g0(this.b, (TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                r9 r9Var = this.b;
                r9Var.getClass();
                if (wallettransaction != null) {
                    r9Var.e0 = wallettransaction.fee;
                    r9Var.D0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                r9 r9Var2 = this.b;
                r9Var2.r = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    r9Var2.e = walletuseraddress;
                    if (walletuseraddress != null) {
                        r9Var2.h = walletuseraddress.address;
                    }
                    ii iiVar = r9Var2.a;
                    if (iiVar != null) {
                        iiVar.f3.O(true);
                    }
                    r9Var2.C0();
                    r9Var2.t0();
                    w8 w8Var = r9Var2.w;
                    if (w8Var != null) {
                        w8Var.a(r9Var2.h, r9Var2.f);
                        break;
                    }
                } else {
                    r9Var2.finishFragment();
                    break;
                }
                break;
            case 3:
                r9 r9Var3 = this.b;
                r9Var3.g0 = (String) obj;
                r9Var3.h0 = ((Boolean) obj2).booleanValue();
                r9Var3.P.setText(r9Var3.g0);
                r9Var3.P.setVisibility(TextUtils.isEmpty(r9Var3.g0) ? 8 : 0);
                r9Var3.E0();
                break;
            default:
                r9 r9Var4 = this.b;
                r9Var4.g0 = (String) obj;
                r9Var4.h0 = ((Boolean) obj2).booleanValue();
                r9Var4.P.setText(r9Var4.g0);
                r9Var4.P.setVisibility(TextUtils.isEmpty(r9Var4.g0) ? 8 : 0);
                r9Var4.E0();
                break;
        }
    }
}
