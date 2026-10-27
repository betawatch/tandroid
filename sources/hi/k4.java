package hi;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.vc0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        oi.q qVar;
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                n4 n4Var = (n4) this.b;
                Runnable runnable = (Runnable) this.c;
                if (hVar == n4Var.G) {
                    n4Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = n4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = n4Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = n4Var.s;
                        n4Var.s = true;
                        n4Var.setOffsetY(f11);
                        n4Var.h = -1.0f;
                        n4Var.s = z11;
                    }
                    n4Var.n = -2.14748365E9f;
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
                ti.r((ti) this.b, (kg) this.c);
                break;
            case 3:
                bi.x4 x4Var = (bi.x4) this.b;
                gh ghVar = (gh) this.c;
                ti tiVar = (ti) x4Var.d;
                tiVar.C0.setTranslationY(0.0f);
                tiVar.C0.l(tiVar.o2);
                qVar = ((org.telegram.ui.ActionBar.k3) tiVar).glassEngine;
                qVar.g();
                viewGroup = ((org.telegram.ui.ActionBar.k3) tiVar).containerView;
                viewGroup.invalidate();
                ghVar.run();
                tiVar.i2(0);
                break;
            default:
                me0 me0Var = (me0) this.b;
                vc0 vc0Var = (vc0) this.c;
                LinkedList linkedList = me0Var.U;
                me0Var.T = null;
                vc0Var.D = null;
                vc0Var.y();
                if (!z10) {
                    vc0Var.h = 1.0f;
                    vc0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        me0Var.V.poll();
                        break;
                    }
                }
                break;
        }
    }
}
