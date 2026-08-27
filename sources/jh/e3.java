package jh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.vj0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class e3 implements vj0 {
    public final /* synthetic */ e4 a;

    public e3(e4 e4Var) {
        this.a = e4Var;
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.vj0
    public final boolean m() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.vj0
    public final void n(View view, ig.q0 q0Var, boolean z10, boolean z11) {
        e4 e4Var = this.a;
        if (z10) {
            org.telegram.ui.Components.y4.a0(e4Var.y2, 1, e4Var.x1, new d3(this, z10, q0Var, view));
        } else {
            e4Var.n0(new cg.c(this, view, q0Var, z10, z11));
        }
    }

    @Override // org.telegram.ui.Components.vj0
    public final void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
        e4 e4Var = this.a;
        Paint paint = e4Var.j2;
        com.google.firebase.messaging.m mVar = e4Var.L1;
        float f13 = -f11;
        float f14 = -f12;
        mVar.w(f13, f14, e4Var.getMeasuredWidth() + f13, e4Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) mVar.a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, (Paint) mVar.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.vj0
    public final void s() {
        ((z8) this.a.M1).b(false);
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ boolean t() {
        return false;
    }
}
