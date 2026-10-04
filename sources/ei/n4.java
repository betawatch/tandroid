package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.xi;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class n4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                q4 q4Var = (q4) this.b;
                Runnable runnable = (Runnable) this.c;
                if (hVar == q4Var.G) {
                    q4Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = q4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = q4Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = q4Var.s;
                        q4Var.s = true;
                        q4Var.setOffsetY(f11);
                        q4Var.h = -1.0f;
                        q4Var.s = z11;
                    }
                    q4Var.n = -2.14748365E9f;
                    break;
                }
                break;
            case 1:
                vb vbVar = (vb) this.b;
                qg qgVar = (qg) this.c;
                vbVar.setInOutOffset(0.0f);
                if (!z10) {
                    qgVar.run();
                    break;
                }
                break;
            case 2:
                xi.u((xi) this.b, (org.telegram.messenger.video.o) this.c);
                break;
            case 3:
                fi fiVar = (fi) this.b;
                ih ihVar = (ih) this.c;
                xi xiVar = (xi) fiVar.d;
                xiVar.z0.setTranslationY(0.0f);
                xiVar.z0.k(xiVar.l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) xiVar).containerView;
                viewGroup.invalidate();
                ihVar.run();
                xiVar.X1(0);
                break;
            default:
                ee0 ee0Var = (ee0) this.b;
                pc0 pc0Var = (pc0) this.c;
                LinkedList linkedList = ee0Var.M;
                ee0Var.L = null;
                pc0Var.D = null;
                pc0Var.z();
                if (!z10) {
                    pc0Var.h = 1.0f;
                    pc0Var.z();
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
