package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class e8 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;

    public /* synthetic */ e8(m8 m8Var, int i7) {
        this.a = i7;
        this.b = m8Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        m8 m8Var = this.b;
        switch (i7) {
            case 0:
                l0.x(m8Var.currentAccount).z(new t1(2, m8Var, (c20) obj), true, false);
                break;
            case 1:
                String str = (String) obj;
                if (str == null) {
                    cc I = hc.a0(m8Var).I(R.raw.contact_check, id.M0(2131743188, null), id.M0(2131743186, null));
                    I.j = 5000;
                    I.j();
                    m8Var.a.f3.O(true);
                    break;
                } else {
                    hc.a0(m8Var).e0(str, false);
                    break;
                }
            default:
                m8.f0(m8Var, (Boolean) obj);
                break;
        }
    }
}
