package jh;

import android.view.ViewGroup;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class l extends xf.b {
    public final boolean d;
    public final /* synthetic */ yw e;

    public l(yw ywVar, boolean z10) {
        this.e = ywVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override // f2.q0
    public final int h() {
        boolean z10 = this.d;
        yw ywVar = this.e;
        return (z10 ? ywVar.y : ywVar.x).size();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        o oVar = (o) o1Var.a;
        oVar.b = i10;
        boolean z10 = this.d;
        yw ywVar = this.e;
        if (z10) {
            oVar.setDialogId(((m) ywVar.y.get(i10)).c);
        } else {
            oVar.setDialogId(((m) ywVar.x.get(i10)).c);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        o oVar = new o(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        oVar.J = z10;
        if (z10) {
            oVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new lk0(oVar);
    }
}
