package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class k4 implements ek0 {
    public final /* synthetic */ o5 a;

    public k4(o5 o5Var) {
        this.a = o5Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public final void B(View view, ah.j1 j1Var, boolean z10, boolean z11) {
        a3.k0 k0Var = new a3.k0(this, j1Var, view, 4);
        if (z10) {
            k0Var.run();
        } else {
            this.a.n0(k0Var);
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
