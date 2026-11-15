package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t4 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.u5 b;
    public final org.telegram.ui.Components.u5 c;
    public float d;
    public float e;

    public t4(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        ch.w wVar = new ch.w(this, 17);
        er erVar = er.h;
        this.b = new org.telegram.ui.Components.u5(wVar, 420L, erVar, 0);
        this.c = new org.telegram.ui.Components.u5(new ch.w(this, 17), 420L, erVar, 0);
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
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(r12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (d > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.j6.r1(d, -1));
            canvas.drawArc(rectF, 135.0f, e10 * 270.0f, false, paint);
        }
    }
}
