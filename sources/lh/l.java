package lh;

import android.view.ViewGroup;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.xw;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class l extends zf.b {
    public final boolean d;
    public final /* synthetic */ xw e;

    public l(xw xwVar, boolean z10) {
        this.e = xwVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        boolean z10 = this.d;
        xw xwVar = this.e;
        return (z10 ? xwVar.y : xwVar.x).size();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        o oVar = (o) n1Var.a;
        oVar.b = i10;
        boolean z10 = this.d;
        xw xwVar = this.e;
        if (z10) {
            oVar.setDialogId(((m) xwVar.y.get(i10)).c);
        } else {
            oVar.setDialogId(((m) xwVar.x.get(i10)).c);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        o oVar = new o(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        oVar.J = z10;
        if (z10) {
            oVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new vk0(oVar);
    }
}
