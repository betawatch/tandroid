package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes5.dex */
public class MotionPhotoDrawable extends Drawable {
    private final AnimatedFloat animatedDisabled;
    public final Paint clearPaint;
    private boolean disabled;
    private final Path play;
    public final Paint playPaint;
    public final Paint strokePaint;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public MotionPhotoDrawable() {
        Path path = new Path();
        this.play = path;
        Paint paint = new Paint(1);
        this.strokePaint = paint;
        Paint paint2 = new Paint(1);
        this.playPaint = paint2;
        Paint paint3 = new Paint(1);
        this.clearPaint = paint3;
        this.animatedDisabled = new AnimatedFloat(new Runnable() { // from class: org.telegram.ui.Components.MotionPhotoDrawable$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MotionPhotoDrawable.this.invalidateSelf();
            }
        }, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(2.0f)));
        paint3.setStyle(style);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        path.moveTo(-AndroidUtilities.dpf2(3.75f), -AndroidUtilities.dpf2(5.4166f));
        path.lineTo(AndroidUtilities.dpf2(3.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dpf2(3.75f), AndroidUtilities.dpf2(5.4166f));
        path.close();
    }

    public void setDisabled(boolean z, boolean z2) {
        this.disabled = z;
        if (!z2) {
            this.animatedDisabled.force(z);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        this.clearPaint.setStrokeWidth(AndroidUtilities.dpf2(3.32f));
        float f = this.animatedDisabled.set(this.disabled);
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float dpf2 = AndroidUtilities.dpf2(10.66f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(centerX - dpf2, centerY - dpf2, centerX + dpf2, dpf2 + centerY);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(8.33f), AndroidUtilities.dpf2(8.33f), this.strokePaint);
        if (f > 0.0f) {
            canvas.saveLayerAlpha(rectF, NotificationCenter.invalidateMotionBackground, 31);
        } else {
            canvas.save();
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dpf2(1.0f) + centerX, centerY - AndroidUtilities.dpf2(0.5f));
        canvas.drawPath(this.play, this.playPaint);
        canvas.restore();
        if (f > 0.0f) {
            if (this.disabled) {
                canvas.drawLine(centerX - AndroidUtilities.dpf2(8.33f), centerY - AndroidUtilities.dpf2(8.33f), (centerX - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * f), (centerY - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * f), this.clearPaint);
                canvas.drawLine(centerX - AndroidUtilities.dpf2(8.33f), centerY - AndroidUtilities.dpf2(8.33f), (centerX - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * f), (centerY - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * f), this.strokePaint);
            } else {
                canvas.drawLine(centerX + AndroidUtilities.dpf2(8.33f), centerY + AndroidUtilities.dpf2(8.33f), (AndroidUtilities.dpf2(8.33f) + centerX) - (AndroidUtilities.dpf2(16.66f) * f), (AndroidUtilities.dpf2(8.33f) + centerY) - (AndroidUtilities.dpf2(16.66f) * f), this.clearPaint);
                canvas.drawLine(centerX + AndroidUtilities.dpf2(8.33f), centerY + AndroidUtilities.dpf2(8.33f), (centerX + AndroidUtilities.dpf2(8.33f)) - (AndroidUtilities.dpf2(16.66f) * f), (centerY + AndroidUtilities.dpf2(8.33f)) - (AndroidUtilities.dpf2(16.66f) * f), this.strokePaint);
            }
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.strokePaint.setAlpha(i);
        this.playPaint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.playPaint.setColorFilter(colorFilter);
        this.strokePaint.setColorFilter(colorFilter);
    }
}
