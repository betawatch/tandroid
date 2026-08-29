package lh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class d3 implements ek0 {
    public final /* synthetic */ d4 a;

    public d3(d4 d4Var) {
        this.a = d4Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public final void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
        d4 d4Var = this.a;
        Paint paint = d4Var.j2;
        bg.c2 c2Var = d4Var.L1;
        float f12 = -f10;
        float f13 = -f11;
        c2Var.w(f12, f13, d4Var.getMeasuredWidth() + f12, d4Var.getMeasuredHeight() + f13);
        if (f9 > 0.0f) {
            canvas.drawRoundRect(rectF, f9, f9, (Paint) c2Var.d);
            canvas.drawRoundRect(rectF, f9, f9, paint);
        } else {
            canvas.drawRect(rectF, (Paint) c2Var.d);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public final void H() {
        ((z8) this.a.M1).b(false);
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final void Q(View view, kg.q0 q0Var, boolean z10, boolean z11) {
        d4 d4Var = this.a;
        if (z10) {
            org.telegram.ui.Components.c5.a0(d4Var.y2, 1, d4Var.x1, new c3(this, z10, q0Var, view));
        } else {
            d4Var.n0(new ag.w0(this, view, q0Var, z10, z11));
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean w() {
        return this.a.N0();
    }
}
