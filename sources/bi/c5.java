package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bk0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c5 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;
    public final /* synthetic */ n5 c;

    public /* synthetic */ c5(h5 h5Var, n5 n5Var, int i10) {
        this.a = i10;
        this.b = h5Var;
        this.c = n5Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                q5 q5Var = this.b.l;
                p5 p5Var = q5Var.M2;
                rb rbVar = (rb) p5Var.c;
                if (rbVar != null) {
                    rbVar.firstFrameRendered = false;
                    p5Var.a = false;
                    rbVar.setOnReadyListener(new e3(1, currentTimeMillis, runnable));
                    ((jb) q5Var.Q1).g(false);
                    bk0 bk0Var = q5Var.z0;
                    if (bk0Var != null) {
                        bk0Var.setAnimation(this.c.u);
                    }
                    if (q5Var.R2 > 0 && l4.longValue() > q5Var.R2 - 1400) {
                        l4 = 0L;
                    }
                    q5Var.T0(l4.longValue(), true);
                    q5Var.U3 = false;
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    if (bool.booleanValue()) {
                        q5Var.f1(false);
                        break;
                    }
                } else {
                    ((jb) q5Var.Q1).g(false);
                    q5Var.setActive(true);
                    q5Var.U3 = false;
                    q5Var.i1 = new d3(1, runnable);
                    if (bool.booleanValue()) {
                        q5Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    break;
                }
                break;
            default:
                Long l10 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                long currentTimeMillis2 = System.currentTimeMillis();
                q5 q5Var2 = this.b.l;
                p5 p5Var2 = q5Var2.M2;
                rb rbVar2 = (rb) p5Var2.c;
                if (rbVar2 != null) {
                    rbVar2.firstFrameRendered = false;
                    p5Var2.a = false;
                    rbVar2.setOnReadyListener(new e3(2, currentTimeMillis2, runnable2));
                    ((jb) q5Var2.Q1).g(false);
                    bk0 bk0Var2 = q5Var2.z0;
                    if (bk0Var2 != null) {
                        bk0Var2.setAnimation(this.c.u);
                    }
                    if (q5Var2.R2 > 0 && l10.longValue() > q5Var2.R2 - 1400) {
                        l10 = 0L;
                    }
                    q5Var2.T0(l10.longValue(), true);
                    q5Var2.U3 = false;
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        q5Var2.f1(false);
                        break;
                    }
                } else {
                    ((jb) q5Var2.Q1).g(false);
                    q5Var2.setActive(true);
                    q5Var2.U3 = false;
                    q5Var2.i1 = new d3(2, runnable2);
                    if (bool2.booleanValue()) {
                        q5Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
