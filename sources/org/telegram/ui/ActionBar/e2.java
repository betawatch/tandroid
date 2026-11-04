package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.ui.hb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ e2(t2 t2Var, int i3) {
        this.a = i3;
        this.b = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t2 t2Var = this.b;
                j2 j2Var = t2Var.c;
                org.telegram.messenger.g0.E2(j2Var);
                t2Var.g1.getLayoutContainer().addView(j2Var);
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
                hs.f(h10.t0).k(hs.T2, new Object[0]);
                org.telegram.messenger.g0.i3(new hb1(19), 220L);
                break;
        }
    }
}
