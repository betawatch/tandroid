package ci;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class zb extends b7 {
    public final /* synthetic */ lc C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(lc lcVar, Activity activity, org.telegram.ui.Components.ja jaVar, a7 a7Var) {
        super(activity, jaVar, a7Var);
        this.C0 = lcVar;
    }

    @Override // ci.b7
    public final void b() {
        l8 l8Var = this.d;
        if (l8Var != null && !l8Var.u) {
            if (this.n != null) {
                Matrix matrix = l8Var.n0;
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
        nb nbVar;
        lc lcVar = this.C0;
        l8 l8Var = lcVar.K1;
        if (l8Var == null || !l8Var.u || !l8Var.K || (nbVar = lcVar.v1) == null || nbVar.R0 == null) {
            return;
        }
        for (int i10 = 0; i10 < lcVar.v1.R0.getChildCount(); i10++) {
            View childAt = lcVar.v1.R0.getChildAt(i10);
            if (childAt instanceof qg.h1) {
                ((qg.h1) childAt).s();
            }
        }
    }
}
