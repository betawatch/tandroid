package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ak0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                p4 p4Var = q4Var.B2;
                x9 x9Var = (x9) p4Var.c;
                if (x9Var != null) {
                    x9Var.firstFrameRendered = false;
                    p4Var.a = false;
                    x9Var.setOnReadyListener(new k2(1, currentTimeMillis, runnable));
                    ((p9) q4Var.F1).g(false);
                    ak0 ak0Var = q4Var.o0;
                    if (ak0Var != null) {
                        ak0Var.setAnimation(this.c.u);
                    }
                    if (q4Var.G2 > 0 && l4.longValue() > q4Var.G2 - 1400) {
                        l4 = 0L;
                    }
                    q4Var.R0(l4.longValue(), true);
                    q4Var.J3 = false;
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    if (bool.booleanValue()) {
                        q4Var.d1(false);
                        break;
                    }
                } else {
                    ((p9) q4Var.F1).g(false);
                    q4Var.setActive(true);
                    q4Var.J3 = false;
                    q4Var.X0 = new j2(1, runnable);
                    if (bool.booleanValue()) {
                        q4Var.d1(false);
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
                p4 p4Var2 = q4Var2.B2;
                x9 x9Var2 = (x9) p4Var2.c;
                if (x9Var2 != null) {
                    x9Var2.firstFrameRendered = false;
                    p4Var2.a = false;
                    x9Var2.setOnReadyListener(new k2(2, currentTimeMillis2, runnable2));
                    ((p9) q4Var2.F1).g(false);
                    ak0 ak0Var2 = q4Var2.o0;
                    if (ak0Var2 != null) {
                        ak0Var2.setAnimation(this.c.u);
                    }
                    if (q4Var2.G2 > 0 && l10.longValue() > q4Var2.G2 - 1400) {
                        l10 = 0L;
                    }
                    q4Var2.R0(l10.longValue(), true);
                    q4Var2.J3 = false;
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        q4Var2.d1(false);
                        break;
                    }
                } else {
                    ((p9) q4Var2.F1).g(false);
                    q4Var2.setActive(true);
                    q4Var2.J3 = false;
                    q4Var2.X0 = new j2(2, runnable2);
                    if (bool2.booleanValue()) {
                        q4Var2.d1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
