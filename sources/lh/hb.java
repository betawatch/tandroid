package lh;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class hb extends q6 {
    public final /* synthetic */ sb y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(sb sbVar, Activity activity, org.telegram.ui.Components.z9 z9Var, p6 p6Var) {
        super(activity, z9Var, p6Var);
        this.y0 = sbVar;
    }

    @Override // lh.q6
    public final void b() {
        z7 z7Var = this.d;
        if (z7Var != null && !z7Var.u) {
            if (this.n != null) {
                Matrix matrix = z7Var.n0;
                Matrix matrix2 = this.S;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.k0;
                if (i10 < 0) {
                    i10 = this.f;
                }
                float f10 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f10, height * i11);
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

    @Override // lh.q6
    public final void i() {
        va vaVar;
        sb sbVar = this.y0;
        z7 z7Var = sbVar.G1;
        if (z7Var == null || !z7Var.u || !z7Var.K || (vaVar = sbVar.r1) == null || vaVar.N0 == null) {
            return;
        }
        for (int i10 = 0; i10 < sbVar.r1.N0.getChildCount(); i10++) {
            View childAt = sbVar.r1.N0.getChildAt(i10);
            if (childAt instanceof zf.e1) {
                ((zf.e1) childAt).s();
            }
        }
    }
}
