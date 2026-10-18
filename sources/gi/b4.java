package gi;

import ai.b5;
import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wc0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                b5 b5Var = (b5) this.b;
                gh ghVar = (gh) this.c;
                ti tiVar = (ti) b5Var.d;
                tiVar.C0.setTranslationY(0.0f);
                tiVar.C0.l(tiVar.o2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) tiVar).containerView;
                viewGroup.invalidate();
                ghVar.run();
                tiVar.e2(0);
                break;
            default:
                le0 le0Var = (le0) this.b;
                wc0 wc0Var = (wc0) this.c;
                LinkedList linkedList = le0Var.U;
                le0Var.T = null;
                wc0Var.D = null;
                wc0Var.y();
                if (!z10) {
                    wc0Var.h = 1.0f;
                    wc0Var.y();
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
