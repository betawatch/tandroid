package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;

/* loaded from: classes5.dex */
public class BlurredBackgroundWithFadeDrawable extends Drawable {
    private int colorStaticLast;
    private final Paint colorStaticPaint;
    private final BlurredBackgroundDrawable drawable;
    private final Paint maskFadeGradientPaint;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public BlurredBackgroundWithFadeDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        Paint paint = new Paint(1);
        this.maskFadeGradientPaint = paint;
        this.colorStaticPaint = new Paint(1);
        this.drawable = blurredBackgroundDrawable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(createGradient(-16777216));
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty()) {
            return;
        }
        BlurredBackgroundSource unwrappedSource = this.drawable.getUnwrappedSource();
        if (unwrappedSource instanceof BlurredBackgroundSourceColor) {
            int color = ((BlurredBackgroundSourceColor) unwrappedSource).getColor();
            if (this.colorStaticLast != color) {
                this.colorStaticLast = color;
                this.colorStaticPaint.setShader(createGradient(color));
            }
            canvas.save();
            canvas.translate(r0.left, r0.top);
            canvas.drawRect(0.0f, 0.0f, r0.width(), r0.height(), this.colorStaticPaint);
            canvas.restore();
            return;
        }
        int saveLayer = canvas.saveLayer(r0.left, r0.top, r0.right, r0.bottom, null);
        this.drawable.draw(canvas);
        canvas.translate(r0.left, r0.top);
        canvas.drawRect(0.0f, 0.0f, r0.width(), r0.height(), this.maskFadeGradientPaint);
        canvas.restoreToCount(saveLayer);
    }

    private static LinearGradient createGradient(int i) {
        int alpha = Color.alpha(i);
        return new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(84.0f), new int[]{ColorUtils.setAlphaComponent(i, 0), ColorUtils.setAlphaComponent(i, (alpha * 96) / NotificationCenter.didReplacedPhotoInMemCache), ColorUtils.setAlphaComponent(i, (alpha * NotificationCenter.liveStoryMessageUpdate) / NotificationCenter.didReplacedPhotoInMemCache), ColorUtils.setAlphaComponent(i, (alpha * NotificationCenter.starGiftSoldOut) / NotificationCenter.didReplacedPhotoInMemCache)}, (float[]) null, Shader.TileMode.CLAMP);
    }
}
