package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wi;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                og ogVar = (og) this.c;
                ubVar.setInOutOffset(0.0f);
                if (!z10) {
                    ogVar.run();
                    break;
                }
                break;
            case 2:
                wi.r((wi) this.b, (org.telegram.ui.ActionBar.p) this.c);
                break;
            case 3:
                hi hiVar = (hi) this.b;
                gh ghVar = (gh) this.c;
                wi wiVar = (wi) hiVar.d;
                wiVar.z0.setTranslationY(0.0f);
                wiVar.z0.k(wiVar.l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) wiVar).containerView;
                viewGroup.invalidate();
                ghVar.run();
                wiVar.a2(0);
                break;
            default:
                sd0 sd0Var = (sd0) this.b;
                bc0 bc0Var = (bc0) this.c;
                LinkedList linkedList = sd0Var.M;
                sd0Var.L = null;
                bc0Var.D = null;
                bc0Var.z();
                if (!z10) {
                    bc0Var.h = 1.0f;
                    bc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        sd0Var.N.poll();
                        break;
                    }
                }
                break;
        }
    }
}
