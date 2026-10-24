package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class z5 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.f6 b;
    public final org.telegram.ui.Components.f6 c;
    public float d;
    public float e;

    public z5(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        int i10 = 17;
        a3.d dVar = new a3.d(this, i10);
        bs bsVar = bs.h;
        this.b = new org.telegram.ui.Components.f6(dVar, 420L, bsVar, 0);
        this.c = new org.telegram.ui.Components.f6(new a3.d(this, i10), 420L, bsVar, 0);
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
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(o12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.k6.o1(e, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
