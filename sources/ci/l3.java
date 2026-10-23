package ci;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.fl0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class l3 implements fl0 {
    public final /* synthetic */ p4 a;

    public l3(p4 p4Var) {
        this.a = p4Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final boolean l() {
        return this.a.M0();
    }

    @Override // org.telegram.ui.Components.fl0
    public final void m(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        p4 p4Var = this.a;
        if (z10) {
            org.telegram.ui.Components.f5.a0(p4Var.C2, 1, p4Var.B1, new k3(this, z10, i1Var, view));
        } else {
            p4Var.m0(new ai.x9(this, view, i1Var, z10, z11));
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final void s(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        p4 p4Var = this.a;
        Paint paint = p4Var.n2;
        com.google.firebase.messaging.l lVar = p4Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        lVar.w(f12, f13, p4Var.getMeasuredWidth() + f12, p4Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) lVar.a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, (Paint) lVar.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final void u() {
        ((q9) this.a.Q1).b(false);
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean w() {
        return false;
    }
}
