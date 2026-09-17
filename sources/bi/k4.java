package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class k4 implements ek0 {
    public final /* synthetic */ o5 a;

    public k4(o5 o5Var) {
        this.a = o5Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public final void B(View view, ah.j1 j1Var, boolean z10, boolean z11) {
        a3.j0 j0Var = new a3.j0(this, j1Var, view, 4);
        if (z10) {
            j0Var.run();
        } else {
            this.a.n0(j0Var);
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean n() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean t() {
        ((gb) this.a.Q1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
