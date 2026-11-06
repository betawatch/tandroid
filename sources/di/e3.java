package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.hi0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class e3 implements hi0 {
    public final /* synthetic */ i4 a;

    public e3(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.Components.hi0
    public final boolean E() {
        return this.a.L0();
    }

    @Override // org.telegram.ui.Components.hi0
    public final void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
        i4 i4Var = this.a;
        Paint paint = i4Var.W1;
        a8.b8 b8Var = i4Var.y1;
        float f13 = -f11;
        float f14 = -f12;
        b8Var.k(f13, f14, i4Var.getMeasuredWidth() + f13, i4Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) b8Var.a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, (Paint) b8Var.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.hi0
    public final void M() {
        ((g9) this.a.z1).b(false);
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ boolean U() {
        return false;
    }

    @Override // org.telegram.ui.Components.hi0
    public final void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        i4 i4Var = this.a;
        if (z9) {
            org.telegram.ui.Components.v4.X(i4Var.l2, 1, i4Var.k1, new d3(this, z9, o0Var, view));
        } else {
            i4Var.l0(new aa.d0(this, view, o0Var, z9, z10));
        }
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ boolean v() {
        return true;
    }
}
