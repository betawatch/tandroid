package ih;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f3 implements tj0 {
    public final /* synthetic */ i4 a;

    public f3(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final void d(View view, hg.r0 r0Var, boolean z10, boolean z11) {
        i4 i4Var = this.a;
        if (z10) {
            org.telegram.ui.Components.y4.a0(i4Var.y2, 1, i4Var.x1, new e3(this, z10, r0Var, view));
        } else {
            i4Var.n0(new bg.d(this, view, r0Var, z10, z11));
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean n() {
        return true;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean p() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.tj0
    public final void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
        i4 i4Var = this.a;
        Paint paint = i4Var.j2;
        com.google.firebase.messaging.m mVar = i4Var.L1;
        float f13 = -f11;
        float f14 = -f12;
        mVar.w(f13, f14, i4Var.getMeasuredWidth() + f13, i4Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) mVar.a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, (Paint) mVar.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final void t() {
        ((d9) this.a.M1).b(false);
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean u() {
        return false;
    }
}
