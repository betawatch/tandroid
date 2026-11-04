package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class y8 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ y8(m9 m9Var, int i3) {
        this.a = i3;
        this.b = m9Var;
    }

    @Override // org.telegram.messenger.n10
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
                    m9Var.f0 = wallettransaction.fee;
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
                    ai.h4 h4Var = m9Var2.a;
                    if (h4Var != null) {
                        h4Var.g3.O(true);
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
                m9Var3.h0 = (String) obj;
                m9Var3.i0 = ((Boolean) obj2).booleanValue();
                m9Var3.Q.setText(m9Var3.h0);
                m9Var3.Q.setVisibility(TextUtils.isEmpty(m9Var3.h0) ? 8 : 0);
                m9Var3.E0();
                break;
            default:
                m9 m9Var4 = this.b;
                m9Var4.h0 = (String) obj;
                m9Var4.i0 = ((Boolean) obj2).booleanValue();
                m9Var4.Q.setText(m9Var4.h0);
                m9Var4.Q.setVisibility(TextUtils.isEmpty(m9Var4.h0) ? 8 : 0);
                m9Var4.E0();
                break;
        }
    }
}
