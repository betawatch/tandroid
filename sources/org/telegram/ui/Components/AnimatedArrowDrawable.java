package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public AnimatedArrowDrawable(int i9, boolean z10) {
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(i9);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f = z10;
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
                float dpf2 = AndroidUtilities.dpf2(this.i) / 2.0f;
                float dpf22 = AndroidUtilities.dpf2(f11) - dpf2;
                float dpf23 = AndroidUtilities.dpf2(f12) - dpf2;
                float f13 = dpf23 - dpf2;
                path.moveTo(dpf2, dpf23 - (this.c * f13));
                path.lineTo((dpf2 + dpf22) / 2.0f, (this.c * f13) + dpf2);
                path.lineTo(dpf22, dpf23 - (f13 * this.c));
                return;
            }
        }
        if (this.f) {
            path.moveTo(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f10));
            path.lineTo(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(2.0f) * f10) + AndroidUtilities.dp(6.0f));
            path.lineTo(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f10));
            return;
        }
        path.moveTo(AndroidUtilities.dp(4.5f), (AndroidUtilities.dp(2.0f) * this.c) + (AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f10)));
        path.lineTo(AndroidUtilities.dp(13.0f), (AndroidUtilities.dp(2.0f) * this.c) + (AndroidUtilities.dp(4.0f) * f10) + AndroidUtilities.dp(12.0f));
        path.lineTo(AndroidUtilities.dp(21.5f), (AndroidUtilities.dp(2.0f) * this.c) + (AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f10)));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.b, this.a);
        if (this.d != this.c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.e;
            this.e = elapsedRealtime;
            float f10 = this.c;
            float f11 = this.d;
            if (f10 < f11) {
                float f12 = (j10 / 180.0f) + f10;
                this.c = f12;
                if (f12 > f11) {
                    this.c = f11;
                }
            } else {
                float f13 = f10 - (j10 / 180.0f);
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
        return f10 > 0.0f ? AndroidUtilities.dp(f10) : AndroidUtilities.dp(26.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f10 = this.g;
        return f10 > 0.0f ? AndroidUtilities.dp(f10) : AndroidUtilities.dp(26.0f);
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

    public AnimatedArrowDrawable(int i9) {
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(i9);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f = true;
        this.g = 12.66f;
        this.h = 6.16f;
        this.i = 1.66f;
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }
}
