package bi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class nd extends e8 {
    public final /* synthetic */ ce C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(ce ceVar, Activity activity, org.telegram.ui.Components.ia iaVar, d8 d8Var) {
        super(activity, iaVar, d8Var);
        this.C0 = ceVar;
    }

    @Override // bi.e8
    public final void b() {
        r9 r9Var = this.d;
        if (r9Var != null && !r9Var.u) {
            if (this.n != null) {
                Matrix matrix = r9Var.n0;
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

    @Override // bi.e8
    public final void i() {
        ad adVar;
        ce ceVar = this.C0;
        r9 r9Var = ceVar.K1;
        if (r9Var == null || !r9Var.u || !r9Var.K || (adVar = ceVar.v1) == null || adVar.R0 == null) {
            return;
        }
        for (int i10 = 0; i10 < ceVar.v1.R0.getChildCount(); i10++) {
            View childAt = ceVar.v1.R0.getChildAt(i10);
            if (childAt instanceof pg.e1) {
                ((pg.e1) childAt).s();
            }
        }
    }
}
