package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lj0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p5 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;
    public final /* synthetic */ b6 c;

    public /* synthetic */ p5(v5 v5Var, b6 b6Var, int i10) {
        this.a = i10;
        this.b = v5Var;
        this.c = b6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                e6 e6Var = this.b.l;
                d6 d6Var = e6Var.M2;
                ic icVar = (ic) d6Var.c;
                if (icVar != null) {
                    icVar.firstFrameRendered = false;
                    d6Var.a = false;
                    icVar.setOnReadyListener(new o3(1, currentTimeMillis, runnable));
                    ((ac) e6Var.Q1).g(false);
                    lj0 lj0Var = e6Var.z0;
                    if (lj0Var != null) {
                        lj0Var.setAnimation(this.c.u);
                    }
                    if (e6Var.R2 > 0 && l4.longValue() > e6Var.R2 - 1400) {
                        l4 = 0L;
                    }
                    e6Var.T0(l4.longValue(), true);
                    e6Var.U3 = false;
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    if (bool.booleanValue()) {
                        e6Var.f1(false);
                        break;
                    }
                } else {
                    ((ac) e6Var.Q1).g(false);
                    e6Var.setActive(true);
                    e6Var.U3 = false;
                    e6Var.i1 = new n3(1, runnable);
                    if (bool.booleanValue()) {
                        e6Var.f1(false);
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
                e6 e6Var2 = this.b.l;
                d6 d6Var2 = e6Var2.M2;
                ic icVar2 = (ic) d6Var2.c;
                if (icVar2 != null) {
                    icVar2.firstFrameRendered = false;
                    d6Var2.a = false;
                    icVar2.setOnReadyListener(new o3(2, currentTimeMillis2, runnable2));
                    ((ac) e6Var2.Q1).g(false);
                    lj0 lj0Var2 = e6Var2.z0;
                    if (lj0Var2 != null) {
                        lj0Var2.setAnimation(this.c.u);
                    }
                    if (e6Var2.R2 > 0 && l10.longValue() > e6Var2.R2 - 1400) {
                        l10 = 0L;
                    }
                    e6Var2.T0(l10.longValue(), true);
                    e6Var2.U3 = false;
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        e6Var2.f1(false);
                        break;
                    }
                } else {
                    ((ac) e6Var2.Q1).g(false);
                    e6Var2.setActive(true);
                    e6Var2.U3 = false;
                    e6Var2.i1 = new n3(2, runnable2);
                    if (bool2.booleanValue()) {
                        e6Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
