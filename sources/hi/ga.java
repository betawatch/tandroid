package hi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class ga extends v5 {
    public final /* synthetic */ sa D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(sa saVar, Activity activity, org.telegram.ui.Components.ca caVar, u5 u5Var) {
        super(activity, caVar, u5Var);
        this.D0 = saVar;
    }

    @Override // hi.v5
    public final void b() {
        c7 c7Var = this.d;
        if (c7Var != null && !c7Var.u) {
            if (this.n != null) {
                Matrix matrix = c7Var.n0;
                Matrix matrix2 = this.a0;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i7 = this.d.k0;
                if (i7 < 0) {
                    i7 = this.f;
                }
                float f10 = width * i7;
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

    @Override // hi.v5
    public final void i() {
        u9 u9Var;
        sa saVar = this.D0;
        c7 c7Var = saVar.L1;
        if (c7Var == null || !c7Var.u || !c7Var.K || (u9Var = saVar.w1) == null || u9Var.B0 == null) {
            return;
        }
        for (int i7 = 0; i7 < saVar.w1.B0.getChildCount(); i7++) {
            View childAt = saVar.w1.B0.getChildAt(i7);
            if (childAt instanceof tg.v0) {
                ((tg.v0) childAt).s();
            }
        }
    }
}
