package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ri0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ b4 c;

    public /* synthetic */ t3(x3 x3Var, b4 b4Var, int i10) {
        this.a = i10;
        this.b = x3Var;
        this.c = b4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                e4 e4Var = this.b.l;
                d4 d4Var = e4Var.I2;
                h9 h9Var = d4Var.b;
                if (h9Var != null) {
                    h9Var.firstFrameRendered = false;
                    d4Var.f = false;
                    h9Var.setOnReadyListener(new e2(1, currentTimeMillis, runnable));
                    ((z8) e4Var.M1).g(false);
                    ri0 ri0Var = e4Var.v0;
                    if (ri0Var != null) {
                        ri0Var.setAnimation(this.c.u);
                    }
                    if (e4Var.N2 > 0 && l10.longValue() > e4Var.N2 - 1400) {
                        l10 = 0L;
                    }
                    e4Var.T0(l10.longValue(), true);
                    e4Var.Q3 = false;
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    if (bool.booleanValue()) {
                        e4Var.f1(false);
                        break;
                    }
                } else {
                    ((z8) e4Var.M1).g(false);
                    e4Var.setActive(true);
                    e4Var.Q3 = false;
                    e4Var.e1 = new d2(1, runnable);
                    if (bool.booleanValue()) {
                        e4Var.f1(false);
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
                e4 e4Var2 = this.b.l;
                d4 d4Var2 = e4Var2.I2;
                h9 h9Var2 = d4Var2.b;
                if (h9Var2 != null) {
                    h9Var2.firstFrameRendered = false;
                    d4Var2.f = false;
                    h9Var2.setOnReadyListener(new e2(2, currentTimeMillis2, runnable2));
                    ((z8) e4Var2.M1).g(false);
                    ri0 ri0Var2 = e4Var2.v0;
                    if (ri0Var2 != null) {
                        ri0Var2.setAnimation(this.c.u);
                    }
                    if (e4Var2.N2 > 0 && l11.longValue() > e4Var2.N2 - 1400) {
                        l11 = 0L;
                    }
                    e4Var2.T0(l11.longValue(), true);
                    e4Var2.Q3 = false;
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        e4Var2.f1(false);
                        break;
                    }
                } else {
                    ((z8) e4Var2.M1).g(false);
                    e4Var2.setActive(true);
                    e4Var2.Q3 = false;
                    e4Var2.e1 = new d2(2, runnable2);
                    if (bool2.booleanValue()) {
                        e4Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
