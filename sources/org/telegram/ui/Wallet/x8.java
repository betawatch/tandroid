package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x8 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;

    public /* synthetic */ x8(l9 l9Var, int i7) {
        this.a = i7;
        this.b = l9Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                l9.g0(this.b, (TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                l9 l9Var = this.b;
                l9Var.getClass();
                if (wallettransaction != null) {
                    l9Var.e0 = wallettransaction.fee;
                    l9Var.D0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                l9 l9Var2 = this.b;
                l9Var2.r = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    l9Var2.e = walletuseraddress;
                    if (walletuseraddress != null) {
                        l9Var2.h = walletuseraddress.address;
                    }
                    fi.w3 w3Var = l9Var2.a;
                    if (w3Var != null) {
                        w3Var.f3.O(true);
                    }
                    l9Var2.C0();
                    l9Var2.t0();
                    p8 p8Var = l9Var2.w;
                    if (p8Var != null) {
                        p8Var.a(l9Var2.h, l9Var2.f);
                        break;
                    }
                } else {
                    l9Var2.finishFragment();
                    break;
                }
                break;
            case 3:
                l9 l9Var3 = this.b;
                l9Var3.g0 = (String) obj;
                l9Var3.h0 = ((Boolean) obj2).booleanValue();
                l9Var3.P.setText(l9Var3.g0);
                l9Var3.P.setVisibility(TextUtils.isEmpty(l9Var3.g0) ? 8 : 0);
                l9Var3.E0();
                break;
            default:
                l9 l9Var4 = this.b;
                l9Var4.g0 = (String) obj;
                l9Var4.h0 = ((Boolean) obj2).booleanValue();
                l9Var4.P.setText(l9Var4.g0);
                l9Var4.P.setVisibility(TextUtils.isEmpty(l9Var4.g0) ? 8 : 0);
                l9Var4.E0();
                break;
        }
    }
}
