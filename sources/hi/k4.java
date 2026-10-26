package hi;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.uc0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                ti.w((ti) this.b, (kg) this.c);
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
                tiVar.h2(0);
                break;
            default:
                le0 le0Var = (le0) this.b;
                uc0 uc0Var = (uc0) this.c;
                LinkedList linkedList = le0Var.U;
                le0Var.T = null;
                uc0Var.D = null;
                uc0Var.y();
                if (!z10) {
                    uc0Var.h = 1.0f;
                    uc0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        le0Var.V.poll();
                        break;
                    }
                }
                break;
        }
    }
}
