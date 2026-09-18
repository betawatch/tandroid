package ai;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.fk0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class u4 implements fk0 {
    public final /* synthetic */ f6 a;

    public u4(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // org.telegram.ui.Components.fk0
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        f6 f6Var = this.a;
        if (z10) {
            org.telegram.ui.Components.c5.a0(f6Var.C2, 1, f6Var.B1, new t4(this, z10, p0Var, view));
        } else {
            f6Var.n0(new s4(this, view, p0Var, z10, z11));
        }
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.fk0
    public final boolean k() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.fk0
    public final void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        f6 f6Var = this.a;
        Paint paint = f6Var.n2;
        com.google.firebase.messaging.n nVar = f6Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        nVar.z(f12, f13, f6Var.getMeasuredWidth() + f12, f6Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, (Paint) nVar.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.fk0
    public final void o() {
        ((ac) this.a.Q1).b(false);
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ boolean q() {
        return false;
    }
}
