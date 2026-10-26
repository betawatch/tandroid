package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class u5 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.h6 b;
    public final org.telegram.ui.Components.h6 c;
    public float d;
    public float e;

    public u5(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        int i10 = 28;
        a3.d dVar = new a3.d(this, i10);
        ds dsVar = ds.h;
        this.b = new org.telegram.ui.Components.h6(dVar, 420L, dsVar, 0);
        this.c = new org.telegram.ui.Components.h6(new a3.d(this, i10), 420L, dsVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float d = this.b.d(this.d, false);
        float e = this.c.e(this.d > 0.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f7 = this.e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f7, height - f7, width + f7, height + f7);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(o12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.y6.o1(e, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
