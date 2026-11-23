package jg;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.z4;
import org.telegram.ui.Components.ek;
import org.telegram.ui.ss;
import org.telegram.ui.w50;
import org.telegram.ui.x50;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class q1 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.c;
                try {
                    s1Var.n.cancel();
                    s1Var.n = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                String str = (String) this.b;
                s1Var.getClass();
                org.telegram.messenger.g0.g3(new hi.c(26, s1Var, str));
                return;
            case 1:
                synchronized (((MediaController) this.c).x1) {
                    org.telegram.messenger.g0.g3(new z4(25, this, (gj) this.b));
                }
                return;
            case 2:
                try {
                    ((Timer) ((ek) this.c).h).cancel();
                    ((ek) this.c).h = null;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                Utilities.g.c(new ss(0, (ek) this.c, (String) this.b));
                return;
            default:
                x50 x50Var = (x50) this.c;
                try {
                    x50Var.f.cancel();
                    x50Var.f = null;
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                org.telegram.messenger.g0.g3(new w50(this, (String) this.b, 0));
                return;
        }
    }
}
