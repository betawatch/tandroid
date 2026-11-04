package ei;

import org.telegram.messenger.r10;
import org.telegram.ui.Components.fh0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x3 implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;
    public final /* synthetic */ g4 c;

    public /* synthetic */ x3(b4 b4Var, g4 g4Var, int i3) {
        this.a = i3;
        this.b = b4Var;
        this.c = g4Var;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                j4 j4Var = this.b.x;
                i4 i4Var = j4Var.w2;
                q9 q9Var = (q9) i4Var.c;
                if (q9Var != null) {
                    q9Var.firstFrameRendered = false;
                    i4Var.a = false;
                    q9Var.setOnReadyListener(new i2(1, currentTimeMillis, runnable));
                    ((i9) j4Var.A1).g(false);
                    fh0 fh0Var = j4Var.j0;
                    if (fh0Var != null) {
                        fh0Var.setAnimation(this.c.u);
                    }
                    if (j4Var.B2 > 0 && l10.longValue() > j4Var.B2 - 1400) {
                        l10 = 0L;
                    }
                    j4Var.R0(l10.longValue(), true);
                    j4Var.E3 = false;
                    org.telegram.messenger.g0.i3(runnable, 400L);
                    if (bool.booleanValue()) {
                        j4Var.d1(false);
                        break;
                    }
                } else {
                    ((i9) j4Var.A1).g(false);
                    j4Var.setActive(true);
                    j4Var.E3 = false;
                    j4Var.S0 = new h2(1, runnable);
                    if (bool.booleanValue()) {
                        j4Var.d1(false);
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
                j4 j4Var2 = this.b.x;
                i4 i4Var2 = j4Var2.w2;
                q9 q9Var2 = (q9) i4Var2.c;
                if (q9Var2 != null) {
                    q9Var2.firstFrameRendered = false;
                    i4Var2.a = false;
                    q9Var2.setOnReadyListener(new i2(2, currentTimeMillis2, runnable2));
                    ((i9) j4Var2.A1).g(false);
                    fh0 fh0Var2 = j4Var2.j0;
                    if (fh0Var2 != null) {
                        fh0Var2.setAnimation(this.c.u);
                    }
                    if (j4Var2.B2 > 0 && l11.longValue() > j4Var2.B2 - 1400) {
                        l11 = 0L;
                    }
                    j4Var2.R0(l11.longValue(), true);
                    j4Var2.E3 = false;
                    org.telegram.messenger.g0.i3(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        j4Var2.d1(false);
                        break;
                    }
                } else {
                    ((i9) j4Var2.A1).g(false);
                    j4Var2.setActive(true);
                    j4Var2.E3 = false;
                    j4Var2.S0 = new h2(2, runnable2);
                    if (bool2.booleanValue()) {
                        j4Var2.d1(false);
                    }
                    org.telegram.messenger.g0.i3(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
