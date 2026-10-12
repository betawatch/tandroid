package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.fl0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class j4 implements fl0 {
    public final /* synthetic */ q5 a;

    public j4(q5 q5Var) {
        this.a = q5Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final boolean n() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.fl0
    public final void r(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        q5 q5Var = this.a;
        if (z10) {
            org.telegram.ui.Components.g5.Z(q5Var.C2, 1, q5Var.B1, new i4(this, z10, i1Var, view));
        } else {
            q5Var.n0(new h4(this, view, i1Var, z10, z11));
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final void w(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        q5 q5Var = this.a;
        Paint paint = q5Var.n2;
        com.google.firebase.messaging.m mVar = q5Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        mVar.z(f12, f13, q5Var.getMeasuredWidth() + f12, q5Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) mVar.a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, (Paint) mVar.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final void y() {
        ((jb) this.a.Q1).b(false);
    }
}
