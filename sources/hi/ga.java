package hi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ga extends x5 {
    public final /* synthetic */ sa D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(sa saVar, Activity activity, org.telegram.ui.Components.u9 u9Var, w5 w5Var) {
        super(activity, u9Var, w5Var);
        this.D0 = saVar;
    }

    @Override // hi.x5
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

    @Override // hi.x5
    public final void i() {
        u9 u9Var;
        sa saVar = this.D0;
        d7 d7Var = saVar.L1;
        if (d7Var == null || !d7Var.u || !d7Var.K || (u9Var = saVar.w1) == null || u9Var.B0 == null) {
            return;
        }
        for (int i7 = 0; i7 < saVar.w1.B0.getChildCount(); i7++) {
            View childAt = saVar.w1.B0.getChildAt(i7);
            if (childAt instanceof tg.u0) {
                ((tg.u0) childAt).s();
            }
        }
    }
}
