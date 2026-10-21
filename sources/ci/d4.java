package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d4 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;
    public final /* synthetic */ n4 c;

    public /* synthetic */ d4(h4 h4Var, n4 n4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
        this.c = n4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                q4 q4Var = this.b.l;
                p4 p4Var = q4Var.M2;
                z9 z9Var = (z9) p4Var.c;
                if (z9Var != null) {
                    z9Var.firstFrameRendered = false;
                    p4Var.a = false;
                    z9Var.setOnReadyListener(new l2(1, currentTimeMillis, runnable));
                    ((r9) q4Var.Q1).g(false);
                    yj0 yj0Var = q4Var.z0;
                    if (yj0Var != null) {
                        yj0Var.setAnimation(this.c.u);
                    }
                    if (q4Var.R2 > 0 && l4.longValue() > q4Var.R2 - 1400) {
                        l4 = 0L;
                    }
                    q4Var.T0(l4.longValue(), true);
                    q4Var.U3 = false;
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    if (bool.booleanValue()) {
                        q4Var.f1(false);
                        break;
                    }
                } else {
                    ((r9) q4Var.Q1).g(false);
                    q4Var.setActive(true);
                    q4Var.U3 = false;
                    q4Var.i1 = new k2(1, runnable);
                    if (bool.booleanValue()) {
                        q4Var.f1(false);
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
                q4 q4Var2 = this.b.l;
                p4 p4Var2 = q4Var2.M2;
                z9 z9Var2 = (z9) p4Var2.c;
                if (z9Var2 != null) {
                    z9Var2.firstFrameRendered = false;
                    p4Var2.a = false;
                    z9Var2.setOnReadyListener(new l2(2, currentTimeMillis2, runnable2));
                    ((r9) q4Var2.Q1).g(false);
                    yj0 yj0Var2 = q4Var2.z0;
                    if (yj0Var2 != null) {
                        yj0Var2.setAnimation(this.c.u);
                    }
                    if (q4Var2.R2 > 0 && l10.longValue() > q4Var2.R2 - 1400) {
                        l10 = 0L;
                    }
                    q4Var2.T0(l10.longValue(), true);
                    q4Var2.U3 = false;
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        q4Var2.f1(false);
                        break;
                    }
                } else {
                    ((r9) q4Var2.Q1).g(false);
                    q4Var2.setActive(true);
                    q4Var2.U3 = false;
                    q4Var2.i1 = new k2(2, runnable2);
                    if (bool2.booleanValue()) {
                        q4Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
