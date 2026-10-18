package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xj0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c4 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;
    public final /* synthetic */ m4 c;

    public /* synthetic */ c4(g4 g4Var, m4 m4Var, int i10) {
        this.a = i10;
        this.b = g4Var;
        this.c = m4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                p4 p4Var = this.b.l;
                o4 o4Var = p4Var.M2;
                y9 y9Var = (y9) o4Var.c;
                if (y9Var != null) {
                    y9Var.firstFrameRendered = false;
                    o4Var.a = false;
                    y9Var.setOnReadyListener(new k2(1, currentTimeMillis, runnable));
                    ((q9) p4Var.Q1).g(false);
                    xj0 xj0Var = p4Var.z0;
                    if (xj0Var != null) {
                        xj0Var.setAnimation(this.c.u);
                    }
                    if (p4Var.R2 > 0 && l4.longValue() > p4Var.R2 - 1400) {
                        l4 = 0L;
                    }
                    p4Var.T0(l4.longValue(), true);
                    p4Var.U3 = false;
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    if (bool.booleanValue()) {
                        p4Var.f1(false);
                        break;
                    }
                } else {
                    ((q9) p4Var.Q1).g(false);
                    p4Var.setActive(true);
                    p4Var.U3 = false;
                    p4Var.i1 = new j2(1, runnable);
                    if (bool.booleanValue()) {
                        p4Var.f1(false);
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
                p4 p4Var2 = this.b.l;
                o4 o4Var2 = p4Var2.M2;
                y9 y9Var2 = (y9) o4Var2.c;
                if (y9Var2 != null) {
                    y9Var2.firstFrameRendered = false;
                    o4Var2.a = false;
                    y9Var2.setOnReadyListener(new k2(2, currentTimeMillis2, runnable2));
                    ((q9) p4Var2.Q1).g(false);
                    xj0 xj0Var2 = p4Var2.z0;
                    if (xj0Var2 != null) {
                        xj0Var2.setAnimation(this.c.u);
                    }
                    if (p4Var2.R2 > 0 && l10.longValue() > p4Var2.R2 - 1400) {
                        l10 = 0L;
                    }
                    p4Var2.T0(l10.longValue(), true);
                    p4Var2.U3 = false;
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        p4Var2.f1(false);
                        break;
                    }
                } else {
                    ((q9) p4Var2.Q1).g(false);
                    p4Var2.setActive(true);
                    p4Var2.U3 = false;
                    p4Var2.i1 = new j2(2, runnable2);
                    if (bool2.booleanValue()) {
                        p4Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
