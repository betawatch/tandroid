// default package

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class gbb extends mm8 {
    public final /* synthetic */ rbb D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbb(rbb rbbVar, Activity activity, tl0 tl0Var, o00 o00Var) {
        super(activity, tl0Var, o00Var);
        this.D0 = rbbVar;
    }

    @Override // mm8
    public final void a() {
        c8b c8bVar = this.d;
        if (c8bVar != null && !c8bVar.u) {
            if (this.n != null) {
                Matrix matrix = c8bVar.n0;
                Matrix matrix2 = this.a0;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i = this.d.k0;
                if (i < 0) {
                    i = this.f;
                }
                float f = width * i;
                float height = 1.0f / getHeight();
                int i2 = this.d.l0;
                if (i2 < 0) {
                    i2 = this.h;
                }
                matrix2.preScale(f, height * i2);
                matrix2.postScale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                Matrix matrix3 = this.k0;
                matrix3.reset();
                this.j0.invert(matrix3);
                this.n.setTransform(matrix2);
                this.n.invalidate();
            }
            invalidate();
        }
        this.D0.g();
    }

    @Override // mm8
    public final void h() {
        vab vabVar;
        rbb rbbVar = this.D0;
        c8b c8bVar = rbbVar.L1;
        if (c8bVar == null || !c8bVar.u || !c8bVar.K || (vabVar = rbbVar.w1) == null || vabVar.B0 == null) {
            return;
        }
        for (int i = 0; i < rbbVar.w1.B0.getChildCount(); i++) {
            View childAt = rbbVar.w1.B0.getChildAt(i);
            if (childAt instanceof b47) {
                ((b47) childAt).s();
            }
        }
    }
}
