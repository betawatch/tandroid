package di;

import org.telegram.messenger.z10;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v3 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ f4 c;

    public /* synthetic */ v3(z3 z3Var, f4 f4Var, int i7) {
        this.a = i7;
        this.b = z3Var;
        this.c = f4Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                i4 i4Var = this.b.x;
                h4 h4Var = i4Var.v2;
                o9 o9Var = (o9) h4Var.c;
                if (o9Var != null) {
                    o9Var.firstFrameRendered = false;
                    h4Var.a = false;
                    o9Var.setOnReadyListener(new e2(1, currentTimeMillis, runnable));
                    ((g9) i4Var.z1).g(false);
                    ch0 ch0Var = i4Var.i0;
                    if (ch0Var != null) {
                        ch0Var.setAnimation(this.c.u);
                    }
                    if (i4Var.A2 > 0 && l10.longValue() > i4Var.A2 - 1400) {
                        l10 = 0L;
                    }
                    i4Var.R0(l10.longValue(), true);
                    i4Var.D3 = false;
                    org.telegram.messenger.g0.i3(runnable, 400L);
                    if (bool.booleanValue()) {
                        i4Var.d1(false);
                        break;
                    }
                } else {
                    ((g9) i4Var.z1).g(false);
                    i4Var.setActive(true);
                    i4Var.D3 = false;
                    i4Var.R0 = new d2(1, runnable);
                    if (bool.booleanValue()) {
                        i4Var.d1(false);
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
                i4 i4Var2 = this.b.x;
                h4 h4Var2 = i4Var2.v2;
                o9 o9Var2 = (o9) h4Var2.c;
                if (o9Var2 != null) {
                    o9Var2.firstFrameRendered = false;
                    h4Var2.a = false;
                    o9Var2.setOnReadyListener(new e2(2, currentTimeMillis2, runnable2));
                    ((g9) i4Var2.z1).g(false);
                    ch0 ch0Var2 = i4Var2.i0;
                    if (ch0Var2 != null) {
                        ch0Var2.setAnimation(this.c.u);
                    }
                    if (i4Var2.A2 > 0 && l11.longValue() > i4Var2.A2 - 1400) {
                        l11 = 0L;
                    }
                    i4Var2.R0(l11.longValue(), true);
                    i4Var2.D3 = false;
                    org.telegram.messenger.g0.i3(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        i4Var2.d1(false);
                        break;
                    }
                } else {
                    ((g9) i4Var2.z1).g(false);
                    i4Var2.setActive(true);
                    i4Var2.D3 = false;
                    i4Var2.R0 = new d2(2, runnable2);
                    if (bool2.booleanValue()) {
                        i4Var2.d1(false);
                    }
                    org.telegram.messenger.g0.i3(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
