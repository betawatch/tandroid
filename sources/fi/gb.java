package fi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class gb extends o6 {
    public final /* synthetic */ sb C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(sb sbVar, Activity activity, org.telegram.ui.Components.la laVar, n6 n6Var) {
        super(activity, laVar, n6Var);
        this.C0 = sbVar;
    }

    @Override // fi.o6
    public final void b() {
        w7 w7Var = this.d;
        if (w7Var != null && !w7Var.u) {
            if (this.n != null) {
                Matrix matrix = w7Var.n0;
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

    @Override // fi.o6
    public final void i() {
        ta taVar;
        sb sbVar = this.C0;
        w7 w7Var = sbVar.K1;
        if (w7Var == null || !w7Var.u || !w7Var.K || (taVar = sbVar.v1) == null || taVar.G0 == null) {
            return;
        }
        for (int i10 = 0; i10 < sbVar.v1.G0.getChildCount(); i10++) {
            View childAt = sbVar.v1.G0.getChildAt(i10);
            if (childAt instanceof sg.g1) {
                ((sg.g1) childAt).s();
            }
        }
    }
}
