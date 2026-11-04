package kg;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.y4;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.p11;
import org.telegram.ui.p50;
import org.telegram.ui.q50;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m1 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m1(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o1 o1Var = (o1) this.c;
                try {
                    o1Var.n.cancel();
                    o1Var.n = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                String str = (String) this.b;
                o1Var.getClass();
                org.telegram.messenger.g0.h3(new ii.e(15, o1Var, str));
                return;
            case 1:
                synchronized (((MediaController) this.c).x1) {
                    org.telegram.messenger.g0.h3(new y4(25, this, (zi) this.b));
                }
                return;
            case 2:
                try {
                    ((Timer) ((nj) this.c).h).cancel();
                    ((nj) this.c).h = null;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                Utilities.g.c(new p11(13, (nj) this.c, (String) this.b));
                return;
            default:
                q50 q50Var = (q50) this.c;
                try {
                    q50Var.f.cancel();
                    q50Var.f = null;
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                org.telegram.messenger.g0.h3(new p50(this, (String) this.b, 0));
                return;
        }
    }
}
