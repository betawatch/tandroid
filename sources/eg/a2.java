package eg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.fl0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class a2 extends f2.p0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ c2 d;

    public a2(c2 c2Var, Context context) {
        this.d = c2Var;
        this.c = context;
    }

    @Override // f2.p0
    public final int h() {
        return 14;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        b2 b2Var = (b2) m1Var.a;
        ViewGroup.LayoutParams layoutParams = b2Var.getLayoutParams();
        c2 c2Var = this.d;
        layoutParams.height = ((c2Var.getHeight() - c2Var.getPaddingTop()) - c2Var.getPaddingBottom()) / 2;
        dg.e1 e1Var = c2Var.X2;
        if (e1Var != null) {
            b2Var.a = e1Var.b(i10);
            b2Var.invalidate();
            b2Var.b = c2Var.W2 == i10 ? 1.0f : 0.0f;
            b2Var.invalidate();
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new fl0(new b2(this.d, this.c));
    }
}
