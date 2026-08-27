package hh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b4 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.y5 b;
    public final org.telegram.ui.Components.y5 c;
    public float d;
    public float e;

    public b4(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        int i10 = 24;
        f2.r rVar = new f2.r(this, i10);
        er erVar = er.h;
        this.b = new org.telegram.ui.Components.y5(rVar, 420L, erVar, 0);
        this.c = new org.telegram.ui.Components.y5(new f2.r(this, i10), 420L, erVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float d = this.b.d(this.d, false);
        float e9 = this.c.e(this.d > 0.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f10 = this.e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f10, height - f10, width + f10, height + f10);
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(l1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e9 > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(e9, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
