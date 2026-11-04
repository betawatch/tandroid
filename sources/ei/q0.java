package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import ci.lc;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q0 extends LinearLayout {
    public lc a;
    public final Path b;
    public final Paint c;
    public long d;
    public final org.telegram.ui.Components.u5 e;
    public final /* synthetic */ t0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(t0 t0Var, Context context) {
        super(context);
        this.f = t0Var;
        this.b = new Path();
        this.c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.u5(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.b;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        t0 t0Var = this.f;
        v0 v0Var = t0Var.f;
        if (v0Var != null) {
            int b10 = u.b(v0Var.a, v0Var.b(), 3);
            v0 v0Var2 = t0Var.f;
            int b11 = u.b(v0Var2.a, v0Var2.b(), 5);
            canvas.drawColor(b10);
            long j10 = this.d;
            v0 v0Var3 = t0Var.f;
            long j11 = v0Var3.b;
            org.telegram.ui.Components.u5 u5Var = this.e;
            if (j10 != j11) {
                u5Var.e(true, v0Var3.a());
            }
            float e10 = u5Var.e(false, t0Var.f.a());
            this.d = t0Var.f.b;
            Paint paint = this.c;
            paint.setColor(b11);
            paint.setAlpha(hs.L1);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * e10, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.a == null) {
            this.a = new lc(1, hs.Z3);
        }
        this.a.f(0, 0, getWidth(), getHeight());
        lc lcVar = this.a;
        lcVar.h = 30.0f;
        lcVar.d();
        this.a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
