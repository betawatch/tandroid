package org.telegram.messenger;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.ui.u60;
import org.telegram.ui.v60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ve extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ve(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                synchronized (((MediaController) this.c).v1) {
                    i0.g3(new t6(23, this, (jj) this.b));
                }
                return;
            case 1:
                try {
                    ((Timer) ((org.telegram.ui.Components.pj) this.c).h).cancel();
                    ((org.telegram.ui.Components.pj) this.c).h = null;
                } catch (Exception e) {
                    f8.g(e, true);
                }
                Utilities.g.c(new org.telegram.ui.xs(1, (org.telegram.ui.Components.pj) this.c, (String) this.b));
                return;
            case 2:
                v60 v60Var = (v60) this.c;
                try {
                    v60Var.f.cancel();
                    v60Var.f = null;
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                i0.g3(new u60(this, (String) this.b, 0));
                return;
            default:
                zf.f1 f1Var = (zf.f1) this.c;
                try {
                    f1Var.n.cancel();
                    f1Var.n = null;
                } catch (Exception e10) {
                    f8.g(e10, true);
                }
                String str = (String) this.b;
                f1Var.getClass();
                i0.g3(new yh.o(6, f1Var, str));
                return;
        }
    }
}
