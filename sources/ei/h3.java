package ei;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ki0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h3 implements ki0 {
    public final /* synthetic */ j4 a;

    public h3(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // org.telegram.ui.Components.ki0
    public final void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
        j4 j4Var = this.a;
        Paint paint = j4Var.X1;
        l2.e eVar = j4Var.z1;
        float f13 = -f11;
        float f14 = -f12;
        eVar.m(f13, f14, j4Var.getMeasuredWidth() + f13, j4Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) eVar.a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, (Paint) eVar.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.ki0
    public final void J() {
        ((i9) this.a.A1).b(false);
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // org.telegram.ui.Components.ki0
    public final boolean v() {
        return this.a.L0();
    }

    @Override // org.telegram.ui.Components.ki0
    public final void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        j4 j4Var = this.a;
        if (z10) {
            org.telegram.ui.Components.t4.Z(j4Var.m2, 1, j4Var.l1, new g3(this, z10, n0Var, view));
        } else {
            j4Var.l0(new ci.u8(this, view, n0Var, z10, z11));
        }
    }
}
