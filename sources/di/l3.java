package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.el0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class l3 implements el0 {
    public final /* synthetic */ q4 a;

    public l3(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.el0
    public final boolean i() {
        return this.a.L0();
    }

    @Override // org.telegram.ui.Components.el0
    public final void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        q4 q4Var = this.a;
        Paint paint = q4Var.c2;
        aa.m0 m0Var = q4Var.E1;
        float f12 = -f10;
        float f13 = -f11;
        m0Var.w(f12, f13, q4Var.getMeasuredWidth() + f12, q4Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) m0Var.a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, (Paint) m0Var.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.el0
    public final void m() {
        ((p9) this.a.F1).b(false);
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.el0
    public final void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        q4 q4Var = this.a;
        if (z10) {
            org.telegram.ui.Components.g5.Z(q4Var.r2, 1, q4Var.q1, new k3(this, z10, x0Var, view));
        } else {
            q4Var.l0(new bi.s9(this, view, x0Var, z10, z11));
        }
    }
}
