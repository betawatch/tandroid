package org.telegram.messenger;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.ui.t60;
import org.telegram.ui.u60;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class we extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ we(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                synchronized (((MediaController) this.c).v1) {
                    i0.g3(new t6(23, this, (kj) this.b));
                }
                return;
            case 1:
                try {
                    ((Timer) ((org.telegram.ui.Components.pj) this.c).h).cancel();
                    ((org.telegram.ui.Components.pj) this.c).h = null;
                } catch (Exception e) {
                    f8.g(e, true);
                }
                Utilities.g.c(new org.telegram.ui.Components.voip.u(2, (org.telegram.ui.Components.pj) this.c, (String) this.b));
                return;
            case 2:
                u60 u60Var = (u60) this.c;
                try {
                    u60Var.f.cancel();
                    u60Var.f = null;
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                i0.g3(new t60(this, (String) this.b, 0));
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
                i0.g3(new xh.e3(7, f1Var, str));
                return;
        }
    }
}
