package ci;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class yb extends b7 {
    public final /* synthetic */ kc C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(kc kcVar, Activity activity, org.telegram.ui.Components.ka kaVar, a7 a7Var) {
        super(activity, kaVar, a7Var);
        this.C0 = kcVar;
    }

    @Override // ci.b7
    public final void b() {
        k8 k8Var = this.d;
        if (k8Var != null && !k8Var.u) {
            if (this.n != null) {
                Matrix matrix = k8Var.n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.k0;
                if (i10 < 0) {
                    i10 = this.f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                Matrix matrix3 = this.j0;
                matrix3.reset();
                this.i0.invert(matrix3);
                this.n.setTransform(matrix2);
                this.n.invalidate();
            }
            invalidate();
        }
        this.C0.j();
    }

    @Override // ci.b7
    public final void i() {
        mb mbVar;
        kc kcVar = this.C0;
        k8 k8Var = kcVar.K1;
        if (k8Var == null || !k8Var.u || !k8Var.K || (mbVar = kcVar.v1) == null || mbVar.R0 == null) {
            return;
        }
        for (int i10 = 0; i10 < kcVar.v1.R0.getChildCount(); i10++) {
            View childAt = kcVar.v1.R0.getChildAt(i10);
            if (childAt instanceof qg.e1) {
                ((qg.e1) childAt).s();
            }
        }
    }
}
