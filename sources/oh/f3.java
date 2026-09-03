package oh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.pk0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class f3 implements pk0 {
    public final /* synthetic */ f4 a;

    public f3(f4 f4Var) {
        this.a = f4Var;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public final boolean h() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.pk0
    public final void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
        f4 f4Var = this.a;
        Paint paint = f4Var.k2;
        a9.a aVar = f4Var.M1;
        float f13 = -f11;
        float f14 = -f12;
        aVar.x(f13, f14, f4Var.getMeasuredWidth() + f13, f4Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) aVar.a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, (Paint) aVar.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public final void m() {
        ((z8) this.a.N1).b(false);
    }

    @Override // org.telegram.ui.Components.pk0
    public final void o(View view, ng.q0 q0Var, boolean z4, boolean z10) {
        f4 f4Var = this.a;
        if (z4) {
            org.telegram.ui.Components.z4.a0(f4Var.z2, 1, f4Var.y1, new e3(this, z4, q0Var, view));
        } else {
            f4Var.n0(new dg.t0(this, view, q0Var, z4, z10));
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean t() {
        return false;
    }
}
