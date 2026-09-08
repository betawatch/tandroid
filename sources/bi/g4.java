package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class g4 implements ek0 {
    public final /* synthetic */ o5 a;

    public g4(o5 o5Var) {
        this.a = o5Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public final void B(View view, ah.j1 j1Var, boolean z10, boolean z11) {
        o5 o5Var = this.a;
        if (z10) {
            org.telegram.ui.Components.e5.a0(o5Var.C2, 1, o5Var.B1, new f4(this, z10, j1Var, view));
        } else {
            o5Var.n0(new e4(this, view, j1Var, z10, z11));
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public final void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        o5 o5Var = this.a;
        Paint paint = o5Var.n2;
        com.google.firebase.messaging.n nVar = o5Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        nVar.z(f12, f13, o5Var.getMeasuredWidth() + f12, o5Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, (Paint) nVar.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public final void J() {
        ((gb) this.a.Q1).b(false);
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean n() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean t() {
        return this.a.N0();
    }
}
