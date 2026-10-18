package ci;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.bl0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class l3 implements bl0 {
    public final /* synthetic */ p4 a;

    public l3(p4 p4Var) {
        this.a = p4Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.bl0
    public final boolean k() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.bl0
    public final void l(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        p4 p4Var = this.a;
        if (z10) {
            org.telegram.ui.Components.f5.Z(p4Var.C2, 1, p4Var.B1, new k3(this, z10, i1Var, view));
        } else {
            p4Var.n0(new ai.x9(this, view, i1Var, z10, z11));
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public final void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        p4 p4Var = this.a;
        Paint paint = p4Var.n2;
        com.google.firebase.messaging.l lVar = p4Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        lVar.E(f12, f13, p4Var.getMeasuredWidth() + f12, p4Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) lVar.a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, (Paint) lVar.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public final void q() {
        ((q9) this.a.Q1).b(false);
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ boolean s() {
        return false;
    }
}
