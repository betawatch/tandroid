package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.yi;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                o4 o4Var = (o4) this.b;
                Runnable runnable = (Runnable) this.c;
                if (hVar == o4Var.G) {
                    o4Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = o4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = o4Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = o4Var.s;
                        o4Var.s = true;
                        o4Var.setOffsetY(f11);
                        o4Var.h = -1.0f;
                        o4Var.s = z11;
                    }
                    o4Var.n = -2.14748365E9f;
                    break;
                }
                break;
            case 1:
                xb xbVar = (xb) this.b;
                rg rgVar = (rg) this.c;
                xbVar.setInOutOffset(0.0f);
                if (!z10) {
                    rgVar.run();
                    break;
                }
                break;
            case 2:
                yi.t((yi) this.b, (org.telegram.messenger.video.f) this.c);
                break;
            case 3:
                ji jiVar = (ji) this.b;
                jh jhVar = (jh) this.c;
                yi yiVar = (yi) jiVar.d;
                yiVar.C0.setTranslationY(0.0f);
                yiVar.C0.l(yiVar.o2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) yiVar).containerView;
                viewGroup.invalidate();
                jhVar.run();
                yiVar.e2(0);
                break;
            default:
                te0 te0Var = (te0) this.b;
                cd0 cd0Var = (cd0) this.c;
                LinkedList linkedList = te0Var.Q;
                te0Var.P = null;
                cd0Var.D = null;
                cd0Var.z();
                if (!z10) {
                    cd0Var.h = 1.0f;
                    cd0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        te0Var.R.poll();
                        break;
                    }
                }
                break;
        }
    }
}
