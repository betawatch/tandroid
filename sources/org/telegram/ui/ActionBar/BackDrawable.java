package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes4.dex */
public class BackDrawable extends Drawable {
    private boolean alwaysClose;
    private int arrowRotation;
    private int currentAnimationTime;
    private float currentRotation;
    private float finalRotation;
    private long lastFrameTime;
    private boolean reverseAngle;
    private Paint paint = new Paint(1);
    private Paint prevPaint = new Paint(1);
    private DecelerateInterpolator interpolator = new DecelerateInterpolator();
    private int color = -1;
    private int rotatedColor = -9079435;
    private float animationTime = 300.0f;
    private boolean rotated = true;

    public BackDrawable(boolean z) {
        this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.prevPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.prevPaint.setColor(-65536);
        this.alwaysClose = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        if (this.currentRotation != this.finalRotation) {
            if (this.lastFrameTime != 0) {
                int currentTimeMillis = (int) (this.currentAnimationTime + (System.currentTimeMillis() - this.lastFrameTime));
                this.currentAnimationTime = currentTimeMillis;
                float f2 = currentTimeMillis;
                float f3 = this.animationTime;
                this.currentRotation = f2 >= f3 ? this.finalRotation : this.currentRotation < this.finalRotation ? this.interpolator.getInterpolation(f2 / f3) * this.finalRotation : 1.0f - this.interpolator.getInterpolation(f2 / f3);
            }
            this.lastFrameTime = System.currentTimeMillis();
            invalidateSelf();
        }
        this.paint.setColor(ColorUtils.blendARGB(this.color, this.rotatedColor, this.currentRotation));
        canvas.save();
        canvas.translate(getIntrinsicWidth() / 2, getIntrinsicHeight() / 2);
        int i = this.arrowRotation;
        if (i != 0) {
            canvas.rotate(i);
        }
        float f4 = this.currentRotation;
        if (this.alwaysClose) {
            canvas.rotate((f4 * (this.reverseAngle ? -180 : NotificationCenter.updateBotMenuButton)) + 135.0f);
            f = 1.0f;
        } else {
            canvas.rotate((this.reverseAngle ? -225 : NotificationCenter.fileUploadFailed) * f4);
            f = f4;
        }
        float f5 = 1.0f - f;
        canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.lerp(-6.75f, -8.0f, f)), 0.0f, AndroidUtilities.dp(8.0f) - ((this.paint.getStrokeWidth() / 2.0f) * f5), 0.0f, this.paint);
        float dp = AndroidUtilities.dp(-0.25f);
        float dp2 = AndroidUtilities.dp(AndroidUtilities.lerp(7.0f, 8.0f, f)) - ((this.paint.getStrokeWidth() / 4.0f) * f5);
        float dp3 = AndroidUtilities.dp(AndroidUtilities.lerp(-7.25f, 0.0f, f));
        canvas.drawLine(dp3, -dp, 0.0f, -dp2, this.paint);
        canvas.drawLine(dp3, dp, 0.0f, dp2, this.paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public float getRotation() {
        return this.finalRotation;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    public void setAnimationTime(float f) {
        this.animationTime = f;
    }

    public void setArrowRotation(int i) {
        this.arrowRotation = i;
        invalidateSelf();
    }

    public void setColor(int i) {
        this.color = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public void setRotatedColor(int i) {
        this.rotatedColor = i;
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setRotation(float f, boolean z) {
        boolean z2;
        this.lastFrameTime = 0L;
        float f2 = this.currentRotation;
        if (f2 != 1.0f) {
            z2 = f2 != 0.0f;
            this.lastFrameTime = 0L;
            if (z) {
                this.currentRotation = f;
            } else {
                this.currentAnimationTime = f2 < f ? (int) (f2 * this.animationTime) : (int) ((1.0f - f2) * this.animationTime);
                this.lastFrameTime = System.currentTimeMillis();
            }
            this.finalRotation = f;
            invalidateSelf();
        }
        this.reverseAngle = z2;
        this.lastFrameTime = 0L;
        if (z) {
        }
        this.finalRotation = f;
        invalidateSelf();
    }
}
