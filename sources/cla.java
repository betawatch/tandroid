// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cla extends Drawable implements Drawable.Callback {
    public final gn a;
    public final Paint b;

    public cla() {
        gn gnVar = new gn(false, true, true);
        this.a = gnVar;
        gnVar.setCallback(this);
        gnVar.n(0.3f, 165L, s33.h);
        gnVar.b = 1;
        gnVar.x(gl.o());
        gnVar.w(gl.L(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = gnVar.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(gl.N(0.6f));
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public static String a(float f) {
        float round = Math.round(f * 10.0f) / 10.0f;
        long j = (long) round;
        return round == ((float) j) ? String.valueOf(j) : String.valueOf(round);
    }

    public final void b(boolean z, float f) {
        String concat = a(f).concat("X");
        gn gnVar = this.a;
        if (z && TextUtils.equals(gnVar.i, concat)) {
            return;
        }
        gnVar.a();
        gnVar.t(concat, z, true);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        gn gnVar = this.a;
        Paint paint = this.b;
        if (paint != null) {
            paint.setStrokeWidth(gl.N(1.6f));
            RectF rectF = gl.P;
            rectF.set(((gl.L(24.0f) - gnVar.c()) / 2.0f) - gl.N(3.0f), gl.N(0.2f) + ((gl.L(24.0f) - gnVar.e) / 2.0f), gl.N(3.0f) + ((gnVar.c() + gl.L(24.0f)) / 2.0f), (gl.L(24.0f) + gnVar.e) / 2.0f);
            canvas.drawRoundRect(rectF, gl.N(3.0f), gl.N(3.0f), paint);
        }
        gnVar.a.setStrokeWidth(gl.N(0.3f));
        gnVar.setBounds(0, (int) ((gl.L(24.0f) - gnVar.e) / 2.0f), gl.L(24.0f), (int) ((gl.L(24.0f) + gnVar.e) / 2.0f));
        gnVar.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return gl.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return gl.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.C = i;
        Paint paint = this.b;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
