package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f8 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;

    public /* synthetic */ f8(n8 n8Var, int i7) {
        this.a = i7;
        this.b = n8Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        n8 n8Var = this.b;
        switch (i7) {
            case 0:
                m0.x(n8Var.currentAccount).z(new u1(2, n8Var, (c20) obj), true, false);
                break;
            case 1:
                String str = (String) obj;
                if (str == null) {
                    cc I = hc.a0(n8Var).I(R.raw.contact_check, id.M0(2131743191, null), id.M0(2131743189, null));
                    I.j = 5000;
                    I.j();
                    n8Var.a.f3.O(true);
                    break;
                } else {
                    hc.a0(n8Var).e0(str, false);
                    break;
                }
            default:
                n8.f0(n8Var, (Boolean) obj);
                break;
        }
    }
}
