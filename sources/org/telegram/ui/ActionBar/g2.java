package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ g2(v2 v2Var, int i7) {
        this.a = i7;
        this.b = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v2 v2Var = this.b;
                l2 l2Var = v2Var.c;
                org.telegram.messenger.g0.E2(l2Var);
                v2Var.f1.getLayoutContainer().addView(l2Var);
                break;
            case 1:
                this.b.dismiss();
                break;
            case 2:
                try {
                    this.b.K();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.b.dismiss();
                qs.f(p10.s0).k(qs.T2, new Object[0]);
                org.telegram.messenger.g0.i3(new org.telegram.ui.Wallet.z(19), 220L);
                break;
        }
    }
}
