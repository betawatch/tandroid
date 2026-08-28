package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;
    public final /* synthetic */ f4 c;

    public /* synthetic */ x3(b4 b4Var, f4 f4Var, int i9) {
        this.a = i9;
        this.b = b4Var;
        this.c = f4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                i4 i4Var = this.b.l;
                h4 h4Var = i4Var.I2;
                l9 l9Var = h4Var.b;
                if (l9Var != null) {
                    l9Var.firstFrameRendered = false;
                    h4Var.f = false;
                    l9Var.setOnReadyListener(new f2(1, currentTimeMillis, runnable));
                    ((d9) i4Var.M1).g(false);
                    pi0 pi0Var = i4Var.v0;
                    if (pi0Var != null) {
                        pi0Var.setAnimation(this.c.u);
                    }
                    if (i4Var.N2 > 0 && l10.longValue() > i4Var.N2 - 1400) {
                        l10 = 0L;
                    }
                    i4Var.T0(l10.longValue(), true);
                    i4Var.Q3 = false;
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    if (bool.booleanValue()) {
                        i4Var.f1(false);
                        break;
                    }
                } else {
                    ((d9) i4Var.M1).g(false);
                    i4Var.setActive(true);
                    i4Var.Q3 = false;
                    i4Var.e1 = new e2(1, runnable);
                    if (bool.booleanValue()) {
                        i4Var.f1(false);
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
                i4 i4Var2 = this.b.l;
                h4 h4Var2 = i4Var2.I2;
                l9 l9Var2 = h4Var2.b;
                if (l9Var2 != null) {
                    l9Var2.firstFrameRendered = false;
                    h4Var2.f = false;
                    l9Var2.setOnReadyListener(new f2(2, currentTimeMillis2, runnable2));
                    ((d9) i4Var2.M1).g(false);
                    pi0 pi0Var2 = i4Var2.v0;
                    if (pi0Var2 != null) {
                        pi0Var2.setAnimation(this.c.u);
                    }
                    if (i4Var2.N2 > 0 && l11.longValue() > i4Var2.N2 - 1400) {
                        l11 = 0L;
                    }
                    i4Var2.T0(l11.longValue(), true);
                    i4Var2.Q3 = false;
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        i4Var2.f1(false);
                        break;
                    }
                } else {
                    ((d9) i4Var2.M1).g(false);
                    i4Var2.setActive(true);
                    i4Var2.Q3 = false;
                    i4Var2.e1 = new e2(2, runnable2);
                    if (bool2.booleanValue()) {
                        i4Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
