package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                i9.c0(this.b, (TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                i9 i9Var = this.b;
                i9Var.getClass();
                if (wallettransaction != null) {
                    i9Var.e0 = wallettransaction.fee;
                    i9Var.z0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                i9 i9Var2 = this.b;
                i9Var2.r = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    i9Var2.e = walletuseraddress;
                    if (walletuseraddress != null) {
                        i9Var2.h = walletuseraddress.address;
                    }
                    m71 m71Var = i9Var2.a;
                    if (m71Var != null) {
                        m71Var.g3.O(true);
                    }
                    i9Var2.y0();
                    i9Var2.p0();
                    k8 k8Var = i9Var2.v;
                    if (k8Var != null) {
                        k8Var.a(i9Var2.h, i9Var2.f);
                        break;
                    }
                } else {
                    i9Var2.finishFragment();
                    break;
                }
                break;
            case 3:
                i9 i9Var3 = this.b;
                i9Var3.g0 = (String) obj;
                i9Var3.h0 = ((Boolean) obj2).booleanValue();
                i9Var3.P.setText(i9Var3.g0);
                i9Var3.P.setVisibility(TextUtils.isEmpty(i9Var3.g0) ? 8 : 0);
                i9Var3.A0();
                break;
            default:
                i9 i9Var4 = this.b;
                i9Var4.g0 = (String) obj;
                i9Var4.h0 = ((Boolean) obj2).booleanValue();
                i9Var4.P.setText(i9Var4.g0);
                i9Var4.P.setVisibility(TextUtils.isEmpty(i9Var4.g0) ? 8 : 0);
                i9Var4.A0();
                break;
        }
    }
}
