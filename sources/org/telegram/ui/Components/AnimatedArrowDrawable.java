package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class AnimatedArrowDrawable extends Drawable {
    public final Paint a;
    public final Path b = new Path();
    public float c;
    public float d;
    public long e;
    public final boolean f;
    public final float g;
    public final float h;
    public final float i;

    public AnimatedArrowDrawable(int i) {
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.N(1.66f));
        paint.setColor(i);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f = true;
        this.g = 12.66f;
        this.h = 6.16f;
        this.i = 1.66f;
        b();
    }

    public final void a(float f) {
        if (this.d == f) {
            return;
        }
        this.d = f;
        this.e = SystemClock.elapsedRealtime();
        invalidateSelf();
    }

    public final void b() {
        Path path = this.b;
        path.reset();
        float f = (this.c * 2.0f) - 1.0f;
        float f2 = this.g;
        if (f2 > 0.0f) {
            float f3 = this.h;
            if (f3 > 0.0f) {
                float N = gl.N(this.i) / 2.0f;
                float N2 = gl.N(f2) - N;
                float N3 = gl.N(f3) - N;
                float f4 = N3 - N;
                path.moveTo(N, N3 - (this.c * f4));
                path.lineTo((N + N2) / 2.0f, (this.c * f4) + N);
                path.lineTo(N2, N3 - (f4 * this.c));
                return;
            }
        }
        if (this.f) {
            path.moveTo(gl.L(3.0f), gl.L(6.0f) - (gl.L(2.0f) * f));
            path.lineTo(gl.L(8.0f), (gl.L(2.0f) * f) + gl.L(6.0f));
            path.lineTo(gl.L(13.0f), gl.L(6.0f) - (gl.L(2.0f) * f));
            return;
        }
        path.moveTo(gl.L(4.5f), (gl.L(2.0f) * this.c) + (gl.L(12.0f) - (gl.L(4.0f) * f)));
        path.lineTo(gl.L(13.0f), (gl.L(2.0f) * this.c) + (gl.L(4.0f) * f) + gl.L(12.0f));
        path.lineTo(gl.L(21.5f), (gl.L(2.0f) * this.c) + (gl.L(12.0f) - (gl.L(4.0f) * f)));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.b, this.a);
        if (this.d != this.c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.e;
            this.e = elapsedRealtime;
            float f = this.c;
            float f2 = this.d;
            if (f < f2) {
                float f3 = (j / 180.0f) + f;
                this.c = f3;
                if (f3 > f2) {
                    this.c = f2;
                }
            } else {
                float f4 = f - (j / 180.0f);
                this.c = f4;
                if (f4 < f2) {
                    this.c = f2;
                }
            }
            b();
            invalidateSelf();
        }
    }

    public float getAnimationProgress() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        float f = this.h;
        return f > 0.0f ? gl.L(f) : gl.L(26.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.g;
        return f > 0.0f ? gl.L(f) : gl.L(26.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public void setAnimationProgress(float f) {
        this.c = f;
        this.d = f;
        b();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    public AnimatedArrowDrawable(int i, boolean z) {
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setColor(i);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f = z;
        b();
    }
}
