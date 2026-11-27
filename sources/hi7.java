// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class hi7 extends Drawable {
    public gi7 a;
    public final Paint b;
    public int c;
    public int d;
    public final long e;
    public int f;

    public hi7() {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = jn7.d4;
        this.d = jn7.d4;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(hl.L(1.0f));
        this.e = System.currentTimeMillis();
    }

    public final void a(int i) {
        if (i != this.f) {
            int alpha = Color.alpha(i);
            this.d = alpha;
            this.b.setColor(vm2.o(i, (int) ((alpha / 255.0f) * this.c)));
        }
        this.f = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int min = Math.min(bounds.width(), bounds.height());
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float L = (min >> 1) - hl.L(0.5f);
        Paint paint = this.b;
        canvas.drawCircle(centerX, centerY, L, paint);
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        long j = this.e;
        canvas.rotate((((currentTimeMillis - j) % 1500.0f) * 360.0f) / 1500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), bounds.centerX(), bounds.centerY() - hl.L(3.0f), paint);
        canvas.restore();
        canvas.save();
        canvas.rotate((((currentTimeMillis - j) % 4500.0f) * 360.0f) / 4500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), hl.L(2.3f) + bounds.centerX(), bounds.centerY(), paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        gi7 gi7Var = this.a;
        if (gi7Var != null) {
            return gi7Var;
        }
        gi7 gi7Var2 = new gi7();
        this.a = gi7Var2;
        return gi7Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return hl.L(12.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return hl.L(12.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.c != i) {
            this.c = i;
            this.b.setAlpha((int) ((this.d / 255.0f) * i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
