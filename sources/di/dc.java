package di;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class dc extends d7 {
    public final /* synthetic */ pc C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(pc pcVar, Activity activity, org.telegram.ui.Components.ja jaVar, c7 c7Var) {
        super(activity, jaVar, c7Var);
        this.C0 = pcVar;
    }

    @Override // di.d7
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

    @Override // di.d7
    public final void i() {
        rb rbVar;
        pc pcVar = this.C0;
        o8 o8Var = pcVar.K1;
        if (o8Var == null || !o8Var.u || !o8Var.K || (rbVar = pcVar.v1) == null || rbVar.R0 == null) {
            return;
        }
        for (int i10 = 0; i10 < pcVar.v1.R0.getChildCount(); i10++) {
            View childAt = pcVar.v1.R0.getChildAt(i10);
            if (childAt instanceof rg.g1) {
                ((rg.g1) childAt).s();
            }
        }
    }
}
