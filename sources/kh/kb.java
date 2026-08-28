package kh;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class kb extends r6 {
    public final /* synthetic */ wb y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(wb wbVar, Activity activity, org.telegram.ui.Components.ba baVar, q6 q6Var) {
        super(activity, baVar, q6Var);
        this.y0 = wbVar;
    }

    @Override // kh.r6
    public final void b() {
        a8 a8Var = this.d;
        if (a8Var != null && !a8Var.u) {
            if (this.n != null) {
                Matrix matrix = a8Var.n0;
                Matrix matrix2 = this.S;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i9 = this.d.k0;
                if (i9 < 0) {
                    i9 = this.f;
                }
                float f10 = width * i9;
                float height = 1.0f / getHeight();
                int i10 = this.d.l0;
                if (i10 < 0) {
                    i10 = this.h;
                }
                matrix2.preScale(f10, height * i10);
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

    @Override // kh.r6
    public final void i() {
        ya yaVar;
        wb wbVar = this.y0;
        a8 a8Var = wbVar.G1;
        if (a8Var == null || !a8Var.u || !a8Var.K || (yaVar = wbVar.r1) == null || yaVar.N0 == null) {
            return;
        }
        for (int i9 = 0; i9 < wbVar.r1.N0.getChildCount(); i9++) {
            View childAt = wbVar.r1.N0.getChildAt(i9);
            if (childAt instanceof yf.e1) {
                ((yf.e1) childAt).s();
            }
        }
    }
}
