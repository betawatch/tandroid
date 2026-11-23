package hi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class bb extends f6 {
    public final /* synthetic */ nb D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(nb nbVar, Activity activity, org.telegram.ui.Components.ba baVar, e6 e6Var) {
        super(activity, baVar, e6Var);
        this.D0 = nbVar;
    }

    @Override // hi.f6
    public final void b() {
        x7 x7Var = this.d;
        if (x7Var != null && !x7Var.u) {
            if (this.n != null) {
                Matrix matrix = x7Var.n0;
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

    @Override // hi.f6
    public final void i() {
        pa paVar;
        nb nbVar = this.D0;
        x7 x7Var = nbVar.L1;
        if (x7Var == null || !x7Var.u || !x7Var.K || (paVar = nbVar.w1) == null || paVar.B0 == null) {
            return;
        }
        for (int i7 = 0; i7 < nbVar.w1.B0.getChildCount(); i7++) {
            View childAt = nbVar.w1.B0.getChildAt(i7);
            if (childAt instanceof tg.z0) {
                ((tg.z0) childAt).s();
            }
        }
    }
}
