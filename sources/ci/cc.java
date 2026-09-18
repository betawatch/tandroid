package ci;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class cc extends d7 {
    public final /* synthetic */ oc C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(oc ocVar, Activity activity, org.telegram.ui.Components.ja jaVar, c7 c7Var) {
        super(activity, jaVar, c7Var);
        this.C0 = ocVar;
    }

    @Override // ci.d7
    public final void b() {
        o8 o8Var = this.d;
        if (o8Var != null && !o8Var.u) {
            if (this.n != null) {
                Matrix matrix = o8Var.n0;
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

    @Override // ci.d7
    public final void i() {
        qb qbVar;
        oc ocVar = this.C0;
        o8 o8Var = ocVar.K1;
        if (o8Var == null || !o8Var.u || !o8Var.K || (qbVar = ocVar.v1) == null || qbVar.R0 == null) {
            return;
        }
        for (int i10 = 0; i10 < ocVar.v1.R0.getChildCount(); i10++) {
            View childAt = ocVar.v1.R0.getChildAt(i10);
            if (childAt instanceof qg.e1) {
                ((qg.e1) childAt).s();
            }
        }
    }
}
