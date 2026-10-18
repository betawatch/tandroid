package ai;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.br;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class f7 extends br {
    public final View c;
    public final Paint d;
    public final Path e;
    public final long f;
    public float h;

    public f7(ei.d dVar, int i10) {
        super(dVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.e = path;
        this.f = System.currentTimeMillis();
        this.h = 1.0f;
        this.c = dVar;
        ((Paint) this.b).setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(i10);
        path.rewind();
        path.moveTo(-AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
        path.lineTo(0.0f, -AndroidUtilities.dpf2(1.08f));
        path.lineTo(AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = (Paint) this.b;
        paint.setAlpha((int) (this.h * 255.0f));
        canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
        float currentTimeMillis = ((System.currentTimeMillis() - this.f) % 400) / 400.0f;
        Paint paint2 = this.d;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * this.h));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        canvas.save();
        canvas.translate(getBounds().centerX(), getBounds().centerY() - (org.telegram.ui.Cells.c1.b(1.166f, 2.0f, AndroidUtilities.dpf2(2.16f) * 3.0f) / 2.0f));
        int i10 = 0;
        while (i10 < 4) {
            float f7 = i10 == 0 ? 1.0f - currentTimeMillis : i10 == 3 ? currentTimeMillis : 1.0f;
            paint2.setAlpha((int) (f7 * 255.0f * this.h));
            canvas.save();
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, f7);
            canvas.scale(lerp, lerp);
            canvas.drawPath(this.e, paint2);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dpf2(3.3260002f) * f7);
            i10++;
        }
        canvas.restore();
        paint2.setAlpha(alpha);
        View view = this.c;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override // org.telegram.ui.Components.br, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.h = i10 / 255.0f;
    }
}
