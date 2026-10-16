package fi;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                wb wbVar = (wb) this.b;
                qg qgVar = (qg) this.c;
                wbVar.setInOutOffset(0.0f);
                if (!z10) {
                    qgVar.run();
                    break;
                }
                break;
            case 2:
                vi.t((vi) this.b, (org.telegram.messenger.video.f) this.c);
                break;
            case 3:
                gi giVar = (gi) this.b;
                hh hhVar = (hh) this.c;
                vi viVar = (vi) giVar.d;
                viVar.C0.setTranslationY(0.0f);
                viVar.C0.l(viVar.o2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) viVar).containerView;
                viewGroup.invalidate();
                hhVar.run();
                viVar.e2(0);
                break;
            default:
                re0 re0Var = (re0) this.b;
                cd0 cd0Var = (cd0) this.c;
                LinkedList linkedList = re0Var.Q;
                re0Var.P = null;
                cd0Var.D = null;
                cd0Var.z();
                if (!z10) {
                    cd0Var.h = 1.0f;
                    cd0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        re0Var.R.poll();
                        break;
                    }
                }
                break;
        }
    }
}
