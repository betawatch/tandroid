package bg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f2 extends f2.p0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ h2 d;

    public f2(h2 h2Var, Context context) {
        this.d = h2Var;
        this.c = context;
    }

    @Override // f2.p0
    public final int h() {
        return 14;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        g2 g2Var = (g2) n1Var.a;
        ViewGroup.LayoutParams layoutParams = g2Var.getLayoutParams();
        h2 h2Var = this.d;
        layoutParams.height = ((h2Var.getHeight() - h2Var.getPaddingTop()) - h2Var.getPaddingBottom()) / 2;
        ag.h1 h1Var = h2Var.W2;
        if (h1Var != null) {
            g2Var.a = h1Var.b(i10);
            g2Var.invalidate();
            g2Var.b = h2Var.V2 == i10 ? 1.0f : 0.0f;
            g2Var.invalidate();
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new vk0(new g2(this.d, this.c));
    }
}
