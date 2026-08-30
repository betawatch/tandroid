package nh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ok0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class e3 implements ok0 {
    public final /* synthetic */ d4 a;

    public e3(d4 d4Var) {
        this.a = d4Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void i(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        d4 d4Var = this.a;
        if (z4) {
            org.telegram.ui.Components.z4.a0(d4Var.z2, 1, d4Var.y1, new d3(this, z4, q0Var, view));
        } else {
            d4Var.n0(new cg.u0(this, view, q0Var, z4, z10));
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean j() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.ok0
    public final void n(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
        d4 d4Var = this.a;
        Paint paint = d4Var.k2;
        a9.a aVar = d4Var.M1;
        float f13 = -f11;
        float f14 = -f12;
        aVar.w(f13, f14, d4Var.getMeasuredWidth() + f13, d4Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) aVar.a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, (Paint) aVar.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public final void o() {
        ((z8) this.a.N1).b(false);
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean s() {
        return false;
    }
}
