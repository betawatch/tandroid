package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class b4 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.d6 b;
    public final org.telegram.ui.Components.d6 c;
    public float d;
    public float e;

    public b4(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        int i10 = 8;
        o oVar = new o(this, i10);
        jr jrVar = jr.h;
        this.b = new org.telegram.ui.Components.d6(oVar, 420L, jrVar, 0);
        this.c = new org.telegram.ui.Components.d6(new o(this, i10), 420L, jrVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float d = this.b.d(this.d, false);
        float e10 = this.c.e(this.d > 0.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f9 = this.e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f9, height - f9, width + f9, height + f9);
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(l1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e10 > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(e10, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
