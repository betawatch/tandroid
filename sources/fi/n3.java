package fi;

import org.telegram.messenger.u10;
import org.telegram.ui.Components.ph0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class n3 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ w3 c;

    public /* synthetic */ n3(r3 r3Var, w3 w3Var, int i7) {
        this.a = i7;
        this.b = r3Var;
        this.c = w3Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                z3 z3Var = this.b.x;
                y3 y3Var = z3Var.w2;
                e9 e9Var = (e9) y3Var.c;
                if (e9Var != null) {
                    e9Var.firstFrameRendered = false;
                    y3Var.a = false;
                    e9Var.setOnReadyListener(new y1(1, currentTimeMillis, runnable));
                    ((w8) z3Var.A1).g(false);
                    ph0 ph0Var = z3Var.j0;
                    if (ph0Var != null) {
                        ph0Var.setAnimation(this.c.u);
                    }
                    if (z3Var.B2 > 0 && l10.longValue() > z3Var.B2 - 1400) {
                        l10 = 0L;
                    }
                    z3Var.R0(l10.longValue(), true);
                    z3Var.E3 = false;
                    org.telegram.messenger.g0.h3(runnable, 400L);
                    if (bool.booleanValue()) {
                        z3Var.d1(false);
                        break;
                    }
                } else {
                    ((w8) z3Var.A1).g(false);
                    z3Var.setActive(true);
                    z3Var.E3 = false;
                    z3Var.S0 = new ai.z0(2, runnable);
                    if (bool.booleanValue()) {
                        z3Var.d1(false);
                    }
                    org.telegram.messenger.g0.h3(runnable, 400L);
                    break;
                }
                break;
            default:
                Long l11 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                long currentTimeMillis2 = System.currentTimeMillis();
                z3 z3Var2 = this.b.x;
                y3 y3Var2 = z3Var2.w2;
                e9 e9Var2 = (e9) y3Var2.c;
                if (e9Var2 != null) {
                    e9Var2.firstFrameRendered = false;
                    y3Var2.a = false;
                    e9Var2.setOnReadyListener(new y1(2, currentTimeMillis2, runnable2));
                    ((w8) z3Var2.A1).g(false);
                    ph0 ph0Var2 = z3Var2.j0;
                    if (ph0Var2 != null) {
                        ph0Var2.setAnimation(this.c.u);
                    }
                    if (z3Var2.B2 > 0 && l11.longValue() > z3Var2.B2 - 1400) {
                        l11 = 0L;
                    }
                    z3Var2.R0(l11.longValue(), true);
                    z3Var2.E3 = false;
                    org.telegram.messenger.g0.h3(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        z3Var2.d1(false);
                        break;
                    }
                } else {
                    ((w8) z3Var2.A1).g(false);
                    z3Var2.setActive(true);
                    z3Var2.E3 = false;
                    z3Var2.S0 = new ai.z0(3, runnable2);
                    if (bool2.booleanValue()) {
                        z3Var2.d1(false);
                    }
                    org.telegram.messenger.g0.h3(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
