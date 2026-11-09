package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y5 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.w5 b;
    public final org.telegram.ui.Components.w5 c;
    public float d;
    public float e;

    public y5(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        a3.f fVar = new a3.f(this, 26);
        xq xqVar = xq.h;
        this.b = new org.telegram.ui.Components.w5(fVar, 420L, xqVar, 0);
        this.c = new org.telegram.ui.Components.w5(new a3.f(this, 26), 420L, xqVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float e10 = this.b.e(false, this.d);
        float d = this.c.d(this.d > 0.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f10 = this.e;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - f10, height - f10, width + f10, height + f10);
        int r12 = org.telegram.ui.ActionBar.l6.r1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(r12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (d > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.l6.r1(d, -1));
            canvas.drawArc(rectF, 135.0f, e10 * 270.0f, false, paint);
        }
    }
}
