package ci;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.bl0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class m3 implements bl0 {
    public final /* synthetic */ q4 a;

    public m3(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Components.bl0
    public final boolean k() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.bl0
    public final void l(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        q4 q4Var = this.a;
        if (z10) {
            org.telegram.ui.Components.f5.Z(q4Var.C2, 1, q4Var.B1, new l3(this, z10, i1Var, view));
        } else {
            q4Var.n0(new ai.x9(this, view, i1Var, z10, z11));
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public final void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        q4 q4Var = this.a;
        Paint paint = q4Var.n2;
        com.google.firebase.messaging.l lVar = q4Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        lVar.E(f12, f13, q4Var.getMeasuredWidth() + f12, q4Var.getMeasuredHeight() + f13);
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
        ((r9) this.a.Q1).b(false);
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ boolean r() {
        return false;
    }
}
