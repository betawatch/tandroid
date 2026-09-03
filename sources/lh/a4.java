package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class a4 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.z5 b;
    public final org.telegram.ui.Components.z5 c;
    public float d;
    public float e;

    public a4(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        int i10 = 9;
        b bVar = new b(this, i10);
        mr mrVar = mr.h;
        this.b = new org.telegram.ui.Components.z5(bVar, 420L, mrVar, 0);
        this.c = new org.telegram.ui.Components.z5(new b(this, i10), 420L, mrVar, 0);
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
        float f10 = this.e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f10, height - f10, width + f10, height + f10);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(l1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(e, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
