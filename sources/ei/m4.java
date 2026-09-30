package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wi;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                p4 p4Var = (p4) this.b;
                Runnable runnable = (Runnable) this.c;
                if (hVar == p4Var.G) {
                    p4Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = p4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = p4Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = p4Var.s;
                        p4Var.s = true;
                        p4Var.setOffsetY(f11);
                        p4Var.h = -1.0f;
                        p4Var.s = z11;
                    }
                    p4Var.n = -2.14748365E9f;
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
                wi.r((wi) this.b, (org.telegram.messenger.video.o) this.c);
                break;
            case 3:
                hi hiVar = (hi) this.b;
                hh hhVar = (hh) this.c;
                wi wiVar = (wi) hiVar.d;
                wiVar.z0.setTranslationY(0.0f);
                wiVar.z0.k(wiVar.l2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) wiVar).containerView;
                viewGroup.invalidate();
                hhVar.run();
                wiVar.a2(0);
                break;
            default:
                ee0 ee0Var = (ee0) this.b;
                oc0 oc0Var = (oc0) this.c;
                LinkedList linkedList = ee0Var.M;
                ee0Var.L = null;
                oc0Var.D = null;
                oc0Var.z();
                if (!z10) {
                    oc0Var.h = 1.0f;
                    oc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        ee0Var.N.poll();
                        break;
                    }
                }
                break;
        }
    }
}
