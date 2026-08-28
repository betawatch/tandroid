package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d4 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.y5 b;
    public final org.telegram.ui.Components.y5 c;
    public float d;
    public float e;

    public d4(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        int i9 = 13;
        fh.o1 o1Var = new fh.o1(this, i9);
        gr grVar = gr.h;
        this.b = new org.telegram.ui.Components.y5(o1Var, 420L, grVar, 0);
        this.c = new org.telegram.ui.Components.y5(new fh.o1(this, i9), 420L, grVar, 0);
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
        float f10 = this.e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f10, height - f10, width + f10, height + f10);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(l1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e10 > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.f6.l1(e10, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
