package fi;

import org.telegram.messenger.w10;
import org.telegram.ui.Components.fh0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p3 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;
    public final /* synthetic */ y3 c;

    public /* synthetic */ p3(t3 t3Var, y3 y3Var, int i7) {
        this.a = i7;
        this.b = t3Var;
        this.c = y3Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                b4 b4Var = this.b.x;
                a4 a4Var = b4Var.w2;
                h9 h9Var = (h9) a4Var.c;
                if (h9Var != null) {
                    h9Var.firstFrameRendered = false;
                    a4Var.a = false;
                    h9Var.setOnReadyListener(new a2(1, currentTimeMillis, runnable));
                    ((z8) b4Var.A1).g(false);
                    fh0 fh0Var = b4Var.j0;
                    if (fh0Var != null) {
                        fh0Var.setAnimation(this.c.u);
                    }
                    if (b4Var.B2 > 0 && l10.longValue() > b4Var.B2 - 1400) {
                        l10 = 0L;
                    }
                    b4Var.R0(l10.longValue(), true);
                    b4Var.E3 = false;
                    org.telegram.messenger.g0.i3(runnable, 400L);
                    if (bool.booleanValue()) {
                        b4Var.d1(false);
                        break;
                    }
                } else {
                    ((z8) b4Var.A1).g(false);
                    b4Var.setActive(true);
                    b4Var.E3 = false;
                    b4Var.S0 = new ai.z0(2, runnable);
                    if (bool.booleanValue()) {
                        b4Var.d1(false);
                    }
                    org.telegram.messenger.g0.i3(runnable, 400L);
                    break;
                }
                break;
            default:
                Long l11 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                long currentTimeMillis2 = System.currentTimeMillis();
                b4 b4Var2 = this.b.x;
                a4 a4Var2 = b4Var2.w2;
                h9 h9Var2 = (h9) a4Var2.c;
                if (h9Var2 != null) {
                    h9Var2.firstFrameRendered = false;
                    a4Var2.a = false;
                    h9Var2.setOnReadyListener(new a2(2, currentTimeMillis2, runnable2));
                    ((z8) b4Var2.A1).g(false);
                    fh0 fh0Var2 = b4Var2.j0;
                    if (fh0Var2 != null) {
                        fh0Var2.setAnimation(this.c.u);
                    }
                    if (b4Var2.B2 > 0 && l11.longValue() > b4Var2.B2 - 1400) {
                        l11 = 0L;
                    }
                    b4Var2.R0(l11.longValue(), true);
                    b4Var2.E3 = false;
                    org.telegram.messenger.g0.i3(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        b4Var2.d1(false);
                        break;
                    }
                } else {
                    ((z8) b4Var2.A1).g(false);
                    b4Var2.setActive(true);
                    b4Var2.E3 = false;
                    b4Var2.S0 = new ai.z0(3, runnable2);
                    if (bool2.booleanValue()) {
                        b4Var2.d1(false);
                    }
                    org.telegram.messenger.g0.i3(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
