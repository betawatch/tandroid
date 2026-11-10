package jg;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.messenger.x4;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.nj;
import org.telegram.ui.y50;
import org.telegram.ui.z50;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                org.telegram.messenger.g0.h3(new ha.b(14, s1Var, str));
                return;
            case 1:
                synchronized (((MediaController) this.c).w1) {
                    org.telegram.messenger.g0.h3(new x4(25, this, (ij) this.b));
                }
                return;
            case 2:
                try {
                    ((Timer) ((nj) this.c).h).cancel();
                    ((nj) this.c).h = null;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                Utilities.g.c(new h41(9, (nj) this.c, (String) this.b));
                return;
            default:
                z50 z50Var = (z50) this.c;
                try {
                    z50Var.f.cancel();
                    z50Var.f = null;
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                org.telegram.messenger.g0.h3(new y50(this, (String) this.b, 0));
                return;
        }
    }
}
