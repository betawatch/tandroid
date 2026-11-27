// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class di2 extends Drawable {
    public static final x84 h = new x84();
    public float a;
    public final float b;
    public long c;
    public final float[] d;
    public final Paint e;
    public float f;
    public final RectF g;

    public di2(float f, float f2, int i) {
        this.a = hl.L(18.0f);
        this.b = hl.L(2.25f);
        this.c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.g = new RectF();
        this.a = f;
        this.b = f2;
        b(i);
    }

    public static void a(float f, float[] fArr) {
        float f2 = (1520.0f * f) / 5400.0f;
        fArr[0] = Math.max(0.0f, f2 - 20.0f);
        fArr[1] = f2;
        for (int i = 0; i < 4; i++) {
            x84 x84Var = h;
            fArr[1] = (x84Var.getInterpolation((f - (i * 1350)) / 667.0f) * 250.0f) + fArr[1];
            fArr[0] = (x84Var.getInterpolation((f - (r4 + 667)) / 667.0f) * 250.0f) + fArr[0];
        }
    }

    public final void b(int i) {
        this.e.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.c < 0) {
            this.c = SystemClock.elapsedRealtime();
        }
        float elapsedRealtime = (SystemClock.elapsedRealtime() - this.c) % 5400;
        float[] fArr = this.d;
        a(elapsedRealtime, fArr);
        float f = this.f;
        float f2 = fArr[0];
        canvas.drawArc(this.g, f + f2, fArr[1] - f2, false, this.e);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) (this.a + this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (this.a + this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        float f = i;
        float f2 = i3 - i;
        float f3 = this.b;
        float f4 = this.a;
        float f5 = i2;
        float f6 = i4 - i2;
        this.g.set(bp1.z(f2 - (f3 / 2.0f), f4, 2.0f, f), (((f6 - (f3 / 2.0f)) - f4) / 2.0f) + f5, ((((f3 / 2.0f) + f2) + f4) / 2.0f) + f, ((((f3 / 2.0f) + f6) + f4) / 2.0f) + f5);
        super.setBounds(i, i2, i3, i4);
        this.e.setStrokeWidth(f3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public di2(int i) {
        this.a = hl.L(18.0f);
        this.b = hl.L(2.25f);
        this.c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.g = new RectF();
        b(i);
    }
}
