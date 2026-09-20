package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                tb tbVar = (tb) this.b;
                og ogVar = (og) this.c;
                tbVar.setInOutOffset(0.0f);
                if (!z10) {
                    ogVar.run();
                    break;
                }
                break;
            case 2:
                vi.r((vi) this.b, (org.telegram.messenger.video.o) this.c);
                break;
            case 3:
                gi giVar = (gi) this.b;
                gh ghVar = (gh) this.c;
                vi viVar = (vi) giVar.d;
                viVar.z0.setTranslationY(0.0f);
                viVar.z0.k(viVar.l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                viewGroup.invalidate();
                ghVar.run();
                viVar.a2(0);
                break;
            default:
                ae0 ae0Var = (ae0) this.b;
                kc0 kc0Var = (kc0) this.c;
                LinkedList linkedList = ae0Var.M;
                ae0Var.L = null;
                kc0Var.D = null;
                kc0Var.z();
                if (!z10) {
                    kc0Var.h = 1.0f;
                    kc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        ae0Var.N.poll();
                        break;
                    }
                }
                break;
        }
    }
}
