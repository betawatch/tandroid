package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.mt0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public class v3 extends View implements c6 {
    public final mt0 a;
    public final Paint b;
    public float c;
    public r1.g d;
    public final h6 e;

    public v3(Context context, h6 h6Var) {
        super(context);
        mt0 mt0Var = new mt0(new g2.c(27), new g2.c(28));
        mt0Var.c = 100.0f;
        this.a = mt0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = h6Var;
        paint.setColor(m6.w0(m6.Ci, h6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.c > 0.0f) {
            float height = getHeight();
            Paint paint = this.b;
            float strokeWidth = height - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, strokeWidth, getWidth() * this.c, strokeWidth, paint);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r1.g gVar = new r1.g(this, this.a);
        r1.h hVar = new r1.h();
        hVar.b(400.0f);
        hVar.a(1.0f);
        gVar.m = hVar;
        this.d = gVar;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.d();
        this.d = null;
    }

    public void setLoadProgress(float f10) {
        this.c = f10;
        invalidate();
    }

    public void setLoadProgressAnimated(float f10) {
        r1.g gVar = this.d;
        if (gVar == null) {
            setLoadProgress(f10);
            return;
        }
        gVar.m.i = f10 * 100.0f;
        gVar.h();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.b.setColor(m6.w0(m6.Ci, this.e));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
