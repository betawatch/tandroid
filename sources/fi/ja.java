package fi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ja extends y5 {
    public final /* synthetic */ va C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(va vaVar, Activity activity, org.telegram.ui.Components.y9 y9Var, x5 x5Var) {
        super(activity, y9Var, x5Var);
        this.C0 = vaVar;
    }

    @Override // fi.y5
    public final void b() {
        e7 e7Var = this.d;
        if (e7Var != null && !e7Var.u) {
            if (this.n != null) {
                Matrix matrix = e7Var.n0;
                Matrix matrix2 = this.W;
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
                Matrix matrix3 = this.j0;
                matrix3.reset();
                this.i0.invert(matrix3);
                this.n.setTransform(matrix2);
                this.n.invalidate();
            }
            invalidate();
        }
        this.C0.i();
    }

    @Override // fi.y5
    public final void i() {
        x9 x9Var;
        va vaVar = this.C0;
        e7 e7Var = vaVar.K1;
        if (e7Var == null || !e7Var.u || !e7Var.K || (x9Var = vaVar.v1) == null || x9Var.A0 == null) {
            return;
        }
        for (int i7 = 0; i7 < vaVar.v1.A0.getChildCount(); i7++) {
            View childAt = vaVar.v1.A0.getChildAt(i7);
            if (childAt instanceof tg.u0) {
                ((tg.u0) childAt).s();
            }
        }
    }
}
