package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.r20;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l8 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8 b;

    public /* synthetic */ l8(t8 t8Var, int i10) {
        this.a = i10;
        this.b = t8Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        int i10 = this.a;
        t8 t8Var = this.b;
        switch (i10) {
            case 0:
                k0.x(t8Var.currentAccount).z(new ih.s(26, t8Var, (r20) obj), true, false);
                break;
            case 1:
                String str = (String) obj;
                if (str == null) {
                    wb I = cc.a0(t8Var).I(R.raw.contact_check, dd.L0(2131743214, null), dd.L0(2131743212, null));
                    I.j = 5000;
                    I.j();
                    t8Var.a.f3.O(true);
                    break;
                } else {
                    cc.a0(t8Var).e0(str, false);
                    break;
                }
            default:
                t8.f0(t8Var, (Boolean) obj);
                break;
        }
    }
}
