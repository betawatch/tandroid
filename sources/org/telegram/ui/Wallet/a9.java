package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a9 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o9 b;

    public /* synthetic */ a9(o9 o9Var, int i7) {
        this.a = i7;
        this.b = o9Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                o9.g0(this.b, (TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                o9 o9Var = this.b;
                o9Var.getClass();
                if (wallettransaction != null) {
                    o9Var.e0 = wallettransaction.fee;
                    o9Var.D0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                o9 o9Var2 = this.b;
                o9Var2.r = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    o9Var2.e = walletuseraddress;
                    if (walletuseraddress != null) {
                        o9Var2.h = walletuseraddress.address;
                    }
                    fi.w3 w3Var = o9Var2.a;
                    if (w3Var != null) {
                        w3Var.f3.O(true);
                    }
                    o9Var2.C0();
                    o9Var2.t0();
                    s8 s8Var = o9Var2.w;
                    if (s8Var != null) {
                        s8Var.a(o9Var2.h, o9Var2.f);
                        break;
                    }
                } else {
                    o9Var2.finishFragment();
                    break;
                }
                break;
            case 3:
                o9 o9Var3 = this.b;
                o9Var3.g0 = (String) obj;
                o9Var3.h0 = ((Boolean) obj2).booleanValue();
                o9Var3.P.setText(o9Var3.g0);
                o9Var3.P.setVisibility(TextUtils.isEmpty(o9Var3.g0) ? 8 : 0);
                o9Var3.E0();
                break;
            default:
                o9 o9Var4 = this.b;
                o9Var4.g0 = (String) obj;
                o9Var4.h0 = ((Boolean) obj2).booleanValue();
                o9Var4.P.setText(o9Var4.g0);
                o9Var4.P.setVisibility(TextUtils.isEmpty(o9Var4.g0) ? 8 : 0);
                o9Var4.E0();
                break;
        }
    }
}
