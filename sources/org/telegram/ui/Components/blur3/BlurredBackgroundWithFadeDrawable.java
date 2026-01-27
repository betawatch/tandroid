package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
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
    private int fadeHeight;
    private final Paint maskFadeGradientPaint;
    private final Matrix matrix;
    private boolean opacity;
    private Shader shader;

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
        this.matrix = new Matrix();
        this.colorStaticPaint = new Paint(1);
        this.drawable = blurredBackgroundDrawable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        setFadeHeight(AndroidUtilities.dp(40.0f), false);
    }

    public void setFadeHeight(int i, boolean z) {
        this.fadeHeight = i;
        this.opacity = z;
        Paint paint = this.maskFadeGradientPaint;
        LinearGradient createGradient = createGradient(-16777216, z);
        this.shader = createGradient;
        paint.setShader(createGradient);
        this.colorStaticPaint.setShader(null);
        this.matrix.reset();
        this.matrix.setScale(1.0f, i);
        if (i < 0) {
            this.matrix.postTranslate(0.0f, -i);
        }
        this.shader.setLocalMatrix(this.matrix);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        BlurredBackgroundSource unwrappedSource = this.drawable.getUnwrappedSource();
        if (unwrappedSource instanceof BlurredBackgroundSourceColor) {
            int color = ((BlurredBackgroundSourceColor) unwrappedSource).getColor();
            if (this.colorStaticLast != color || this.colorStaticPaint.getShader() == null) {
                LinearGradient createGradient = createGradient(color, this.opacity);
                this.colorStaticLast = color;
                this.colorStaticPaint.setShader(createGradient);
                createGradient.setLocalMatrix(this.matrix);
            }
            canvas.save();
            canvas.translate(bounds.left, bounds.top);
            canvas.drawRect(0.0f, 0.0f, bounds.width(), bounds.height(), this.colorStaticPaint);
            canvas.restore();
            return;
        }
        this.colorStaticPaint.setShader(null);
        int saveLayer = canvas.saveLayer(bounds.left, bounds.top, bounds.right, bounds.bottom, null);
        int height = this.fadeHeight < 0 ? bounds.height() + this.fadeHeight : 0;
        this.drawable.draw(canvas);
        canvas.translate(bounds.left, bounds.top + height);
        canvas.drawRect(0.0f, -height, bounds.width(), bounds.height() - height, this.maskFadeGradientPaint);
        canvas.restoreToCount(saveLayer);
    }

    private static LinearGradient createGradient(int i, boolean z) {
        int alpha = Color.alpha(i);
        if (z) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{ColorUtils.setAlphaComponent(i, 0), ColorUtils.setAlphaComponent(i, (alpha * 96) / NotificationCenter.cameraInitied), ColorUtils.setAlphaComponent(i, (alpha * NotificationCenter.liveStoryMessageUpdate) / NotificationCenter.cameraInitied), ColorUtils.setAlphaComponent(i, (alpha * NotificationCenter.starGiftSoldOut) / NotificationCenter.cameraInitied)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{ColorUtils.setAlphaComponent(i, 0), ColorUtils.setAlphaComponent(i, (alpha * 96) / NotificationCenter.cameraInitied), ColorUtils.setAlphaComponent(i, (alpha * NotificationCenter.liveStoryMessageUpdate) / NotificationCenter.cameraInitied), ColorUtils.setAlphaComponent(i, (alpha * NotificationCenter.starGiftSoldOut) / NotificationCenter.cameraInitied), ColorUtils.setAlphaComponent(i, (alpha * NotificationCenter.cameraInitied) / NotificationCenter.cameraInitied)}, (float[]) null, Shader.TileMode.CLAMP);
    }
}
