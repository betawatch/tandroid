package fi;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                ub ubVar = (ub) this.b;
                pg pgVar = (pg) this.c;
                ubVar.setInOutOffset(0.0f);
                if (!z10) {
                    pgVar.run();
                    break;
                }
                break;
            case 2:
                vi.r((vi) this.b, (org.telegram.ui.ActionBar.p) this.c);
                break;
            case 3:
                gi giVar = (gi) this.b;
                hh hhVar = (hh) this.c;
                vi viVar = (vi) giVar.d;
                viVar.z0.setTranslationY(0.0f);
                viVar.z0.k(viVar.l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                viewGroup.invalidate();
                hhVar.run();
                viVar.a2(0);
                break;
            default:
                sd0 sd0Var = (sd0) this.b;
                dc0 dc0Var = (dc0) this.c;
                LinkedList linkedList = sd0Var.M;
                sd0Var.L = null;
                dc0Var.D = null;
                dc0Var.z();
                if (!z10) {
                    dc0Var.h = 1.0f;
                    dc0Var.z();
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
