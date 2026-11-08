package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import bi.ud;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class o0 extends LinearLayout {
    public ud a;
    public final Path b;
    public final Paint c;
    public long d;
    public final org.telegram.ui.Components.w5 e;
    public final /* synthetic */ r0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, Context context) {
        super(context);
        this.f = r0Var;
        this.b = new Path();
        this.c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.w5(this, 0L, 1000L, new LinearInterpolator());
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
        r0 r0Var = this.f;
        t0 t0Var = r0Var.f;
        if (t0Var != null) {
            int b10 = t.b(t0Var.a, t0Var.b(), 3);
            t0 t0Var2 = r0Var.f;
            int b11 = t.b(t0Var2.a, t0Var2.b(), 5);
            canvas.drawColor(b10);
            long j3 = this.d;
            t0 t0Var3 = r0Var.f;
            long j10 = t0Var3.b;
            org.telegram.ui.Components.w5 w5Var = this.e;
            if (j3 != j10) {
                w5Var.e(true, t0Var3.a());
            }
            float e10 = w5Var.e(false, r0Var.f.a());
            this.d = r0Var.f.b;
            Paint paint = this.c;
            paint.setColor(b11);
            paint.setAlpha(qs.L1);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * e10, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.a == null) {
            this.a = new ud(1, qs.Z3);
        }
        this.a.f(0, 0, getWidth(), getHeight());
        ud udVar = this.a;
        udVar.h = 30.0f;
        udVar.d();
        this.a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
