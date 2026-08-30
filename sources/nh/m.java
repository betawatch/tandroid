package nh;

import android.view.ViewGroup;
import org.telegram.ui.Components.el0;
import org.telegram.ui.gx;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class m extends bg.c {
    public final boolean d;
    public final /* synthetic */ gx e;

    public m(gx gxVar, boolean z4) {
        this.e = gxVar;
        this.d = z4;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // f2.o0
    public final int h() {
        boolean z4 = this.d;
        gx gxVar = this.e;
        return (z4 ? gxVar.y : gxVar.x).size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        p pVar = (p) l1Var.a;
        pVar.b = i10;
        boolean z4 = this.d;
        gx gxVar = this.e;
        if (z4) {
            pVar.setDialogId(((n) gxVar.y.get(i10)).c);
        } else {
            pVar.setDialogId(((n) gxVar.x.get(i10)).c);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        p pVar = new p(this.e, viewGroup.getContext());
        boolean z4 = this.d;
        pVar.K = z4;
        if (z4) {
            pVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new el0(pVar);
    }
}
