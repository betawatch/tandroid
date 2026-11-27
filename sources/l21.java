// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class l21 extends FrameLayout {
    public final mm a;
    public final mm b;
    public final Paint c;
    public final RectF d;
    public final long e;
    public final /* synthetic */ m21 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(m21 m21Var, Activity activity) {
        super(activity);
        this.f = m21Var;
        k43 k43Var = k43.h;
        this.a = new mm(320L, this, k43Var);
        this.b = new mm(320L, this, k43Var);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(hl.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.e = System.currentTimeMillis();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        m21 m21Var = this.f;
        float e = this.a.e(false, m21Var.a);
        float d = this.b.d(m21Var.a >= 1.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float N = width - hl.N(13.0f);
        float N2 = height - hl.N(13.0f);
        float N3 = hl.N(13.0f) + width;
        float N4 = hl.N(13.0f) + height;
        RectF rectF = this.d;
        rectF.set(N, N2, N3, N4);
        float currentTimeMillis = ((System.currentTimeMillis() - this.e) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i = 0; i < 4; i++) {
            x84 x84Var = di2.h;
            x84Var.getInterpolation((currentTimeMillis - (i * 1350)) / 667.0f);
            max += x84Var.getInterpolation((currentTimeMillis - (r8 + 667)) / 667.0f) * 250.0f;
        }
        int p1 = aob.p1((1.0f - d) * 1.0f, -1);
        Paint paint = this.c;
        paint.setColor(p1);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, e) * (-360.0f), false, paint);
        if (e < 1.0f && d < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
