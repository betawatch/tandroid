package ei;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class jb extends r6 {
    public final /* synthetic */ vb C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(vb vbVar, Activity activity, org.telegram.ui.Components.ja jaVar, q6 q6Var) {
        super(activity, jaVar, q6Var);
        this.C0 = vbVar;
    }

    @Override // ei.r6
    public final void b() {
        a8 a8Var = this.d;
        if (a8Var != null && !a8Var.u) {
            if (this.n != null) {
                Matrix matrix = a8Var.n0;
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
        this.C0.i();
    }

    @Override // ei.r6
    public final void i() {
        xa xaVar;
        vb vbVar = this.C0;
        a8 a8Var = vbVar.K1;
        if (a8Var == null || !a8Var.u || !a8Var.K || (xaVar = vbVar.v1) == null || xaVar.R0 == null) {
            return;
        }
        for (int i10 = 0; i10 < vbVar.v1.R0.getChildCount(); i10++) {
            View childAt = vbVar.v1.R0.getChildAt(i10);
            if (childAt instanceof rg.f1) {
                ((rg.f1) childAt).s();
            }
        }
    }
}
