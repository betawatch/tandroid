package ai;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.pk0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class u4 implements pk0 {
    public final /* synthetic */ e6 a;

    public u4(e6 e6Var) {
        this.a = e6Var;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        e6 e6Var = this.a;
        if (z10) {
            org.telegram.ui.Components.e5.a0(e6Var.C2, 1, e6Var.B1, new t4(this, z10, o0Var, view));
        } else {
            e6Var.n0(new s4(this, view, o0Var, z10, z11));
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public final boolean k() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.pk0
    public final void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        e6 e6Var = this.a;
        Paint paint = e6Var.n2;
        com.google.firebase.messaging.n nVar = e6Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        nVar.z(f12, f13, e6Var.getMeasuredWidth() + f12, e6Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, (Paint) nVar.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public final void n() {
        ((ac) this.a.Q1).b(false);
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean p() {
        return false;
    }
}
