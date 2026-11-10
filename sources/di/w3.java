package di;

import org.telegram.messenger.z10;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w3 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;
    public final /* synthetic */ g4 c;

    public /* synthetic */ w3(a4 a4Var, g4 g4Var, int i7) {
        this.a = i7;
        this.b = a4Var;
        this.c = g4Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                j4 j4Var = this.b.x;
                i4 i4Var = j4Var.v2;
                p9 p9Var = (p9) i4Var.c;
                if (p9Var != null) {
                    p9Var.firstFrameRendered = false;
                    i4Var.a = false;
                    p9Var.setOnReadyListener(new e2(1, currentTimeMillis, runnable));
                    ((h9) j4Var.z1).g(false);
                    ch0 ch0Var = j4Var.i0;
                    if (ch0Var != null) {
                        ch0Var.setAnimation(this.c.u);
                    }
                    if (j4Var.A2 > 0 && l10.longValue() > j4Var.A2 - 1400) {
                        l10 = 0L;
                    }
                    j4Var.R0(l10.longValue(), true);
                    j4Var.D3 = false;
                    org.telegram.messenger.g0.i3(runnable, 400L);
                    if (bool.booleanValue()) {
                        j4Var.d1(false);
                        break;
                    }
                } else {
                    ((h9) j4Var.z1).g(false);
                    j4Var.setActive(true);
                    j4Var.D3 = false;
                    j4Var.R0 = new d2(1, runnable);
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
                i4 i4Var2 = j4Var2.v2;
                p9 p9Var2 = (p9) i4Var2.c;
                if (p9Var2 != null) {
                    p9Var2.firstFrameRendered = false;
                    i4Var2.a = false;
                    p9Var2.setOnReadyListener(new e2(2, currentTimeMillis2, runnable2));
                    ((h9) j4Var2.z1).g(false);
                    ch0 ch0Var2 = j4Var2.i0;
                    if (ch0Var2 != null) {
                        ch0Var2.setAnimation(this.c.u);
                    }
                    if (j4Var2.A2 > 0 && l11.longValue() > j4Var2.A2 - 1400) {
                        l11 = 0L;
                    }
                    j4Var2.R0(l11.longValue(), true);
                    j4Var2.D3 = false;
                    org.telegram.messenger.g0.i3(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        j4Var2.d1(false);
                        break;
                    }
                } else {
                    ((h9) j4Var2.z1).g(false);
                    j4Var2.setActive(true);
                    j4Var2.D3 = false;
                    j4Var2.R0 = new d2(2, runnable2);
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
