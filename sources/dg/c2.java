package dg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.dl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c2 extends f2.o0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ e2 d;

    public c2(e2 e2Var, Context context) {
        this.d = e2Var;
        this.c = context;
    }

    @Override // f2.o0
    public final int h() {
        return 14;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        d2 d2Var = (d2) l1Var.a;
        ViewGroup.LayoutParams layoutParams = d2Var.getLayoutParams();
        e2 e2Var = this.d;
        layoutParams.height = ((e2Var.getHeight() - e2Var.getPaddingTop()) - e2Var.getPaddingBottom()) / 2;
        cg.f1 f1Var = e2Var.X2;
        if (f1Var != null) {
            d2Var.a = f1Var.b(i10);
            d2Var.invalidate();
            d2Var.b = e2Var.W2 == i10 ? 1.0f : 0.0f;
            d2Var.invalidate();
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new dl0(new d2(this.d, this.c));
    }
}
