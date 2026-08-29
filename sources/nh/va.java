package nh;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class va extends f6 {
    public final /* synthetic */ gb y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(gb gbVar, Activity activity, org.telegram.ui.Components.ga gaVar, e6 e6Var) {
        super(activity, gaVar, e6Var);
        this.y0 = gbVar;
    }

    @Override // nh.f6
    public final void b() {
        o7 o7Var = this.d;
        if (o7Var != null && !o7Var.u) {
            if (this.n != null) {
                Matrix matrix = o7Var.n0;
                Matrix matrix2 = this.S;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.k0;
                if (i10 < 0) {
                    i10 = this.f;
                }
                float f9 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f9, height * i11);
                matrix2.postScale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                Matrix matrix3 = this.f0;
                matrix3.reset();
                this.e0.invert(matrix3);
                this.n.setTransform(matrix2);
                this.n.invalidate();
            }
            invalidate();
        }
        this.y0.j();
    }

    @Override // nh.f6
    public final void i() {
        ja jaVar;
        gb gbVar = this.y0;
        o7 o7Var = gbVar.G1;
        if (o7Var == null || !o7Var.u || !o7Var.K || (jaVar = gbVar.r1) == null || jaVar.N0 == null) {
            return;
        }
        for (int i10 = 0; i10 < gbVar.r1.N0.getChildCount(); i10++) {
            View childAt = gbVar.r1.N0.getChildAt(i10);
            if (childAt instanceof bg.d2) {
                ((bg.d2) childAt).s();
            }
        }
    }
}
