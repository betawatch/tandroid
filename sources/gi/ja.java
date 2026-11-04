package gi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ja extends y5 {
    public final /* synthetic */ va D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(va vaVar, Activity activity, org.telegram.ui.Components.x9 x9Var, x5 x5Var) {
        super(activity, x9Var, x5Var);
        this.D0 = vaVar;
    }

    @Override // gi.y5
    public final void b() {
        f7 f7Var = this.d;
        if (f7Var != null && !f7Var.u) {
            if (this.n != null) {
                Matrix matrix = f7Var.n0;
                Matrix matrix2 = this.a0;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i3 = this.d.k0;
                if (i3 < 0) {
                    i3 = this.f;
                }
                float f10 = width * i3;
                float height = 1.0f / getHeight();
                int i10 = this.d.l0;
                if (i10 < 0) {
                    i10 = this.h;
                }
                matrix2.preScale(f10, height * i10);
                matrix2.postScale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                Matrix matrix3 = this.k0;
                matrix3.reset();
                this.j0.invert(matrix3);
                this.n.setTransform(matrix2);
                this.n.invalidate();
            }
            invalidate();
        }
        this.D0.i();
    }

    @Override // gi.y5
    public final void i() {
        x9 x9Var;
        va vaVar = this.D0;
        f7 f7Var = vaVar.L1;
        if (f7Var == null || !f7Var.u || !f7Var.K || (x9Var = vaVar.w1) == null || x9Var.B0 == null) {
            return;
        }
        for (int i3 = 0; i3 < vaVar.w1.B0.getChildCount(); i3++) {
            View childAt = vaVar.w1.B0.getChildAt(i3);
            if (childAt instanceof ug.t0) {
                ((ug.t0) childAt).s();
            }
        }
    }
}
