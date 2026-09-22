package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                sb sbVar = (sb) this.b;
                ng ngVar = (ng) this.c;
                sbVar.setInOutOffset(0.0f);
                if (!z10) {
                    ngVar.run();
                    break;
                }
                break;
            case 2:
                vi.r((vi) this.b, (org.telegram.ui.ActionBar.p) this.c);
                break;
            case 3:
                gi giVar = (gi) this.b;
                fh fhVar = (fh) this.c;
                vi viVar = (vi) giVar.d;
                viVar.z0.setTranslationY(0.0f);
                viVar.z0.k(viVar.l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                viewGroup.invalidate();
                fhVar.run();
                viVar.a2(0);
                break;
            default:
                sd0 sd0Var = (sd0) this.b;
                cc0 cc0Var = (cc0) this.c;
                LinkedList linkedList = sd0Var.M;
                sd0Var.L = null;
                cc0Var.D = null;
                cc0Var.z();
                if (!z10) {
                    cc0Var.h = 1.0f;
                    cc0Var.z();
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
