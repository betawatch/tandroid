package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class f7 extends a5.h {
    public final View c;
    public final Paint d;
    public final Path e;
    public final long f;
    public float h;

    public f7(fi.d dVar, int i7) {
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
        paint.setColor(i7);
        path.rewind();
        path.moveTo(-org.telegram.messenger.g0.N(2.91f), org.telegram.messenger.g0.N(1.08f));
        path.lineTo(0.0f, -org.telegram.messenger.g0.N(1.08f));
        path.lineTo(org.telegram.messenger.g0.N(2.91f), org.telegram.messenger.g0.N(1.08f));
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
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(1.33f));
        canvas.save();
        canvas.translate(getBounds().centerX(), getBounds().centerY() - (org.telegram.ui.Cells.f1.d(1.166f, 2.0f, org.telegram.messenger.g0.N(2.16f) * 3.0f) / 2.0f));
        int i7 = 0;
        while (i7 < 4) {
            float f10 = i7 == 0 ? 1.0f - currentTimeMillis : i7 == 3 ? currentTimeMillis : 1.0f;
            paint2.setAlpha((int) (f10 * 255.0f * this.h));
            canvas.save();
            float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, f10);
            canvas.scale(T1, T1);
            canvas.drawPath(this.e, paint2);
            canvas.restore();
            canvas.translate(0.0f, org.telegram.messenger.g0.N(3.3260002f) * f10);
            i7++;
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
        return org.telegram.messenger.g0.L(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(18.0f);
    }

    @Override // a5.h, android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.h = i7 / 255.0f;
    }
}
