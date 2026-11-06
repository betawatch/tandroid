package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
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

    public AnimatedArrowDrawable(int i7, boolean z9) {
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(i7);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f = z9;
        b();
    }

    public final void a(float f10) {
        if (this.d == f10) {
            return;
        }
        this.d = f10;
        this.e = SystemClock.elapsedRealtime();
        invalidateSelf();
    }

    public final void b() {
        Path path = this.b;
        path.reset();
        float f10 = (this.c * 2.0f) - 1.0f;
        float f11 = this.g;
        if (f11 > 0.0f) {
            float f12 = this.h;
            if (f12 > 0.0f) {
                float N = org.telegram.messenger.g0.N(this.i) / 2.0f;
                float N2 = org.telegram.messenger.g0.N(f11) - N;
                float N3 = org.telegram.messenger.g0.N(f12) - N;
                float f13 = N3 - N;
                path.moveTo(N, N3 - (this.c * f13));
                path.lineTo((N + N2) / 2.0f, (this.c * f13) + N);
                path.lineTo(N2, N3 - (f13 * this.c));
                return;
            }
        }
        if (this.f) {
            path.moveTo(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f) - (org.telegram.messenger.g0.L(2.0f) * f10));
            path.lineTo(org.telegram.messenger.g0.L(8.0f), (org.telegram.messenger.g0.L(2.0f) * f10) + org.telegram.messenger.g0.L(6.0f));
            path.lineTo(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(6.0f) - (org.telegram.messenger.g0.L(2.0f) * f10));
            return;
        }
        path.moveTo(org.telegram.messenger.g0.L(4.5f), (org.telegram.messenger.g0.L(2.0f) * this.c) + (org.telegram.messenger.g0.L(12.0f) - (org.telegram.messenger.g0.L(4.0f) * f10)));
        path.lineTo(org.telegram.messenger.g0.L(13.0f), (org.telegram.messenger.g0.L(2.0f) * this.c) + (org.telegram.messenger.g0.L(4.0f) * f10) + org.telegram.messenger.g0.L(12.0f));
        path.lineTo(org.telegram.messenger.g0.L(21.5f), (org.telegram.messenger.g0.L(2.0f) * this.c) + (org.telegram.messenger.g0.L(12.0f) - (org.telegram.messenger.g0.L(4.0f) * f10)));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.b, this.a);
        if (this.d != this.c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.e;
            this.e = elapsedRealtime;
            float f10 = this.c;
            float f11 = this.d;
            if (f10 < f11) {
                float f12 = (j3 / 180.0f) + f10;
                this.c = f12;
                if (f12 > f11) {
                    this.c = f11;
                }
            } else {
                float f13 = f10 - (j3 / 180.0f);
                this.c = f13;
                if (f13 < f11) {
                    this.c = f11;
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
        float f10 = this.h;
        return f10 > 0.0f ? org.telegram.messenger.g0.L(f10) : org.telegram.messenger.g0.L(26.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f10 = this.g;
        return f10 > 0.0f ? org.telegram.messenger.g0.L(f10) : org.telegram.messenger.g0.L(26.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public void setAnimationProgress(float f10) {
        this.c = f10;
        this.d = f10;
        b();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public AnimatedArrowDrawable(int i7) {
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setColor(i7);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f = true;
        this.g = 12.66f;
        this.h = 6.16f;
        this.i = 1.66f;
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }
}
