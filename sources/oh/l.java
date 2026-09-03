package oh;

import android.view.ViewGroup;
import org.telegram.ui.Components.el0;
import org.telegram.ui.hx;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class l extends cg.c {
    public final boolean d;
    public final /* synthetic */ hx e;

    public l(hx hxVar, boolean z4) {
        this.e = hxVar;
        this.d = z4;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        boolean z4 = this.d;
        hx hxVar = this.e;
        return (z4 ? hxVar.y : hxVar.x).size();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        o oVar = (o) m1Var.a;
        oVar.b = i10;
        boolean z4 = this.d;
        hx hxVar = this.e;
        if (z4) {
            oVar.setDialogId(((m) hxVar.y.get(i10)).c);
        } else {
            oVar.setDialogId(((m) hxVar.x.get(i10)).c);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        o oVar = new o(this.e, viewGroup.getContext());
        boolean z4 = this.d;
        oVar.K = z4;
        if (z4) {
            oVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new el0(oVar);
    }
}
