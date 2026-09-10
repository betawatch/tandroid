package di;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.yi;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class q4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                t4 t4Var = (t4) this.b;
                Runnable runnable = (Runnable) this.c;
                if (hVar == t4Var.G) {
                    t4Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = t4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = t4Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = t4Var.s;
                        t4Var.s = true;
                        t4Var.setOffsetY(f11);
                        t4Var.h = -1.0f;
                        t4Var.s = z11;
                    }
                    t4Var.n = -2.14748365E9f;
                    break;
                }
                break;
            case 1:
                tb tbVar = (tb) this.b;
                rg rgVar = (rg) this.c;
                tbVar.setInOutOffset(0.0f);
                if (!z10) {
                    rgVar.run();
                    break;
                }
                break;
            case 2:
                yi.r((yi) this.b, (gf) this.c);
                break;
            case 3:
                ji jiVar = (ji) this.b;
                jh jhVar = (jh) this.c;
                yi yiVar = (yi) jiVar.d;
                yiVar.z0.setTranslationY(0.0f);
                yiVar.z0.k(yiVar.l2);
                viewGroup = ((org.telegram.ui.ActionBar.h3) yiVar).containerView;
                viewGroup.invalidate();
                jhVar.run();
                yiVar.a2(0);
                break;
            default:
                be0 be0Var = (be0) this.b;
                lc0 lc0Var = (lc0) this.c;
                LinkedList linkedList = be0Var.M;
                be0Var.L = null;
                lc0Var.D = null;
                lc0Var.z();
                if (!z10) {
                    lc0Var.h = 1.0f;
                    lc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        be0Var.N.poll();
                        break;
                    }
                }
                break;
        }
    }
}
