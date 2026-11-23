package fi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.wi0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class x2 implements wi0 {
    public final /* synthetic */ z3 a;

    public x2(z3 z3Var) {
        this.a = z3Var;
    }

    @Override // org.telegram.ui.Components.wi0
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        z3 z3Var = this.a;
        if (z10) {
            org.telegram.ui.Components.b5.X(z3Var.m2, 1, z3Var.l1, new w2(this, z10, p0Var, view));
        } else {
            z3Var.l0(new aa.c0(this, view, p0Var, z10, z11));
        }
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean l() {
        return true;
    }

    @Override // org.telegram.ui.Components.wi0
    public final boolean n() {
        return this.a.L0();
    }

    @Override // org.telegram.ui.Components.wi0
    public final void q(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
        z3 z3Var = this.a;
        Paint paint = z3Var.X1;
        a8.b8 b8Var = z3Var.z1;
        float f13 = -f11;
        float f14 = -f12;
        b8Var.k(f13, f14, z3Var.getMeasuredWidth() + f13, z3Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) b8Var.a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, (Paint) b8Var.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.wi0
    public final void r() {
        ((w8) this.a.A1).b(false);
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean t() {
        return false;
    }
}
