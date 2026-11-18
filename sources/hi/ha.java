package hi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class ha extends w5 {
    public final /* synthetic */ ta D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(ta taVar, Activity activity, org.telegram.ui.Components.ca caVar, v5 v5Var) {
        super(activity, caVar, v5Var);
        this.D0 = taVar;
    }

    @Override // hi.w5
    public final void b() {
        d7 d7Var = this.d;
        if (d7Var != null && !d7Var.u) {
            if (this.n != null) {
                Matrix matrix = d7Var.n0;
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

    @Override // hi.w5
    public final void i() {
        v9 v9Var;
        ta taVar = this.D0;
        d7 d7Var = taVar.L1;
        if (d7Var == null || !d7Var.u || !d7Var.K || (v9Var = taVar.w1) == null || v9Var.B0 == null) {
            return;
        }
        for (int i7 = 0; i7 < taVar.w1.B0.getChildCount(); i7++) {
            View childAt = taVar.w1.B0.getChildAt(i7);
            if (childAt instanceof tg.u0) {
                ((tg.u0) childAt).s();
            }
        }
    }
}
