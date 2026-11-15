package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class g8 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p8 b;

    public /* synthetic */ g8(p8 p8Var, int i7) {
        this.a = i7;
        this.b = p8Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        p8 p8Var = this.b;
        switch (i7) {
            case 0:
                l0.x(p8Var.currentAccount).z(new t1(3, p8Var, (z10) obj), true, false);
                break;
            case 1:
                String str = (String) obj;
                if (str == null) {
                    xb I = cc.a0(p8Var).I(R.raw.contact_check, hd.M0(2131743188, null), hd.M0(2131743186, null));
                    I.j = 5000;
                    I.j();
                    p8Var.a.g3.O(true);
                    break;
                } else {
                    cc.a0(p8Var).e0(str, false);
                    break;
                }
            default:
                p8.f0(p8Var, (Boolean) obj);
                break;
        }
    }
}
