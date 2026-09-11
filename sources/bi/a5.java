package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.aj0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class a5 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f5 b;
    public final /* synthetic */ l5 c;

    public /* synthetic */ a5(f5 f5Var, l5 l5Var, int i10) {
        this.a = i10;
        this.b = f5Var;
        this.c = l5Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                o5 o5Var = this.b.l;
                n5 n5Var = o5Var.M2;
                ob obVar = (ob) n5Var.c;
                if (obVar != null) {
                    obVar.firstFrameRendered = false;
                    n5Var.a = false;
                    obVar.setOnReadyListener(new b3(1, currentTimeMillis, runnable));
                    ((gb) o5Var.Q1).g(false);
                    aj0 aj0Var = o5Var.z0;
                    if (aj0Var != null) {
                        aj0Var.setAnimation(this.c.u);
                    }
                    if (o5Var.R2 > 0 && l4.longValue() > o5Var.R2 - 1400) {
                        l4 = 0L;
                    }
                    o5Var.T0(l4.longValue(), true);
                    o5Var.U3 = false;
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    if (bool.booleanValue()) {
                        o5Var.f1(false);
                        break;
                    }
                } else {
                    ((gb) o5Var.Q1).g(false);
                    o5Var.setActive(true);
                    o5Var.U3 = false;
                    o5Var.i1 = new a3(1, runnable);
                    if (bool.booleanValue()) {
                        o5Var.f1(false);
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
                o5 o5Var2 = this.b.l;
                n5 n5Var2 = o5Var2.M2;
                ob obVar2 = (ob) n5Var2.c;
                if (obVar2 != null) {
                    obVar2.firstFrameRendered = false;
                    n5Var2.a = false;
                    obVar2.setOnReadyListener(new b3(2, currentTimeMillis2, runnable2));
                    ((gb) o5Var2.Q1).g(false);
                    aj0 aj0Var2 = o5Var2.z0;
                    if (aj0Var2 != null) {
                        aj0Var2.setAnimation(this.c.u);
                    }
                    if (o5Var2.R2 > 0 && l10.longValue() > o5Var2.R2 - 1400) {
                        l10 = 0L;
                    }
                    o5Var2.T0(l10.longValue(), true);
                    o5Var2.U3 = false;
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        o5Var2.f1(false);
                        break;
                    }
                } else {
                    ((gb) o5Var2.Q1).g(false);
                    o5Var2.setActive(true);
                    o5Var2.U3 = false;
                    o5Var2.i1 = new a3(2, runnable2);
                    if (bool2.booleanValue()) {
                        o5Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
