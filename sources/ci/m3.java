package ci;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.cl0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class m3 implements cl0 {
    public final /* synthetic */ q4 a;

    public m3(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.cl0
    public final boolean m() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.cl0
    public final void o(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        q4 q4Var = this.a;
        if (z10) {
            org.telegram.ui.Components.f5.Z(q4Var.C2, 1, q4Var.B1, new l3(this, z10, i1Var, view));
        } else {
            q4Var.n0(new ai.x9(this, view, i1Var, z10, z11));
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public final void q(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
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

    @Override // org.telegram.ui.Components.cl0
    public final void v() {
        ((r9) this.a.Q1).b(false);
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ boolean w() {
        return false;
    }
}
