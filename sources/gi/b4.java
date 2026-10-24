package gi;

import ai.c5;
import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.yc0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                e4 e4Var = (e4) this.b;
                Runnable runnable = (Runnable) this.c;
                if (hVar == e4Var.G) {
                    e4Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = e4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = e4Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = e4Var.s;
                        e4Var.s = true;
                        e4Var.setOffsetY(f11);
                        e4Var.h = -1.0f;
                        e4Var.s = z11;
                    }
                    e4Var.n = -2.14748365E9f;
                    break;
                }
                break;
            case 1:
                ub ubVar = (ub) this.b;
                pg pgVar = (pg) this.c;
                ubVar.setInOutOffset(0.0f);
                if (!z10) {
                    pgVar.run();
                    break;
                }
                break;
            case 2:
                ti.s((ti) this.b, (lg) this.c);
                break;
            case 3:
                c5 c5Var = (c5) this.b;
                gh ghVar = (gh) this.c;
                ti tiVar = (ti) c5Var.d;
                tiVar.C0.setTranslationY(0.0f);
                tiVar.C0.l(tiVar.o2);
                viewGroup = ((org.telegram.ui.ActionBar.h3) tiVar).containerView;
                viewGroup.invalidate();
                ghVar.run();
                tiVar.i2(0);
                break;
            default:
                pe0 pe0Var = (pe0) this.b;
                yc0 yc0Var = (yc0) this.c;
                LinkedList linkedList = pe0Var.U;
                pe0Var.T = null;
                yc0Var.D = null;
                yc0Var.y();
                if (!z10) {
                    yc0Var.h = 1.0f;
                    yc0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        pe0Var.V.poll();
                        break;
                    }
                }
                break;
        }
    }
}
