package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kj0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ c4 c;

    public /* synthetic */ u3(y3 y3Var, c4 c4Var, int i10) {
        this.a = i10;
        this.b = y3Var;
        this.c = c4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                f4 f4Var = this.b.l;
                e4 e4Var = f4Var.J2;
                h9 h9Var = e4Var.b;
                if (h9Var != null) {
                    h9Var.firstFrameRendered = false;
                    e4Var.f = false;
                    h9Var.setOnReadyListener(new f2(1, currentTimeMillis, runnable));
                    ((z8) f4Var.N1).g(false);
                    kj0 kj0Var = f4Var.w0;
                    if (kj0Var != null) {
                        kj0Var.setAnimation(this.c.u);
                    }
                    if (f4Var.O2 > 0 && l10.longValue() > f4Var.O2 - 1400) {
                        l10 = 0L;
                    }
                    f4Var.T0(l10.longValue(), true);
                    f4Var.R3 = false;
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    if (bool.booleanValue()) {
                        f4Var.f1(false);
                        break;
                    }
                } else {
                    ((z8) f4Var.N1).g(false);
                    f4Var.setActive(true);
                    f4Var.R3 = false;
                    f4Var.f1 = new e2(1, runnable);
                    if (bool.booleanValue()) {
                        f4Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    break;
                }
                break;
            default:
                Long l11 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                long currentTimeMillis2 = System.currentTimeMillis();
                f4 f4Var2 = this.b.l;
                e4 e4Var2 = f4Var2.J2;
                h9 h9Var2 = e4Var2.b;
                if (h9Var2 != null) {
                    h9Var2.firstFrameRendered = false;
                    e4Var2.f = false;
                    h9Var2.setOnReadyListener(new f2(2, currentTimeMillis2, runnable2));
                    ((z8) f4Var2.N1).g(false);
                    kj0 kj0Var2 = f4Var2.w0;
                    if (kj0Var2 != null) {
                        kj0Var2.setAnimation(this.c.u);
                    }
                    if (f4Var2.O2 > 0 && l11.longValue() > f4Var2.O2 - 1400) {
                        l11 = 0L;
                    }
                    f4Var2.T0(l11.longValue(), true);
                    f4Var2.R3 = false;
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        f4Var2.f1(false);
                        break;
                    }
                } else {
                    ((z8) f4Var2.N1).g(false);
                    f4Var2.setActive(true);
                    f4Var2.R3 = false;
                    f4Var2.f1 = new e2(2, runnable2);
                    if (bool2.booleanValue()) {
                        f4Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
