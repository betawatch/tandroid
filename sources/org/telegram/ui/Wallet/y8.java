package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ y8(m9 m9Var, int i7) {
        this.a = i7;
        this.b = m9Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                m9.g0(this.b, (TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                m9 m9Var = this.b;
                m9Var.getClass();
                if (wallettransaction != null) {
                    m9Var.e0 = wallettransaction.fee;
                    m9Var.D0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                m9 m9Var2 = this.b;
                m9Var2.r = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    m9Var2.e = walletuseraddress;
                    if (walletuseraddress != null) {
                        m9Var2.h = walletuseraddress.address;
                    }
                    fi.w3 w3Var = m9Var2.a;
                    if (w3Var != null) {
                        w3Var.f3.O(true);
                    }
                    m9Var2.C0();
                    m9Var2.t0();
                    q8 q8Var = m9Var2.w;
                    if (q8Var != null) {
                        q8Var.a(m9Var2.h, m9Var2.f);
                        break;
                    }
                } else {
                    m9Var2.finishFragment();
                    break;
                }
                break;
            case 3:
                m9 m9Var3 = this.b;
                m9Var3.g0 = (String) obj;
                m9Var3.h0 = ((Boolean) obj2).booleanValue();
                m9Var3.P.setText(m9Var3.g0);
                m9Var3.P.setVisibility(TextUtils.isEmpty(m9Var3.g0) ? 8 : 0);
                m9Var3.E0();
                break;
            default:
                m9 m9Var4 = this.b;
                m9Var4.g0 = (String) obj;
                m9Var4.h0 = ((Boolean) obj2).booleanValue();
                m9Var4.P.setText(m9Var4.g0);
                m9Var4.P.setVisibility(TextUtils.isEmpty(m9Var4.g0) ? 8 : 0);
                m9Var4.E0();
                break;
        }
    }
}
