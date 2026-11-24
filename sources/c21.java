// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c21 extends FrameLayout {
    public final lm a;
    public final lm b;
    public final Paint c;
    public final RectF d;
    public final long e;
    public final /* synthetic */ d21 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c21(d21 d21Var, Activity activity) {
        super(activity);
        this.f = d21Var;
        s33 s33Var = s33.h;
        this.a = new lm(320L, this, s33Var);
        this.b = new lm(320L, this, s33Var);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(gl.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.e = System.currentTimeMillis();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        d21 d21Var = this.f;
        float e = this.a.e(false, d21Var.a);
        float d = this.b.d(d21Var.a >= 1.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float N = width - gl.N(13.0f);
        float N2 = height - gl.N(13.0f);
        float N3 = gl.N(13.0f) + width;
        float N4 = gl.N(13.0f) + height;
        RectF rectF = this.d;
        rectF.set(N, N2, N3, N4);
        float currentTimeMillis = ((System.currentTimeMillis() - this.e) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i = 0; i < 4; i++) {
            c84 c84Var = ih2.h;
            c84Var.getInterpolation((currentTimeMillis - (i * 1350)) / 667.0f);
            max += c84Var.getInterpolation((currentTimeMillis - (r8 + 667)) / 667.0f) * 250.0f;
        }
        int p1 = bkb.p1((1.0f - d) * 1.0f, -1);
        Paint paint = this.c;
        paint.setColor(p1);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, e) * (-360.0f), false, paint);
        if (e < 1.0f && d < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
