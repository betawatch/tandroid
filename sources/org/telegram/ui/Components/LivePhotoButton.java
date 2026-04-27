package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* loaded from: classes5.dex */
public class LivePhotoButton extends View {
    private final AnimatedFloat animatedValue;
    private final Paint cutPaint;
    private final Drawable icon;
    private boolean value;
    private final Paint whitePaint;

    public LivePhotoButton(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.whitePaint = paint;
        Paint paint2 = new Paint(1);
        this.cutPaint = paint2;
        this.animatedValue = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        ScaleStateListAnimator.apply(this);
        this.icon = context.getResources().getDrawable(R.drawable.media_live_on).mutate();
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setColor(-65536);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(style);
        paint.setColor(-1);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f = this.animatedValue.set(!this.value);
        this.icon.setBounds((getWidth() - this.icon.getIntrinsicWidth()) / 2, (getHeight() - this.icon.getIntrinsicHeight()) / 2, (getWidth() + this.icon.getIntrinsicWidth()) / 2, (getHeight() + this.icon.getIntrinsicHeight()) / 2);
        Rect bounds = this.icon.getBounds();
        float width = bounds.left + (bounds.width() * 0.325f);
        float height = bounds.top + (bounds.height() * 0.152f);
        float height2 = bounds.bottom - (bounds.height() * 0.152f);
        float width2 = bounds.right - (bounds.width() * 0.101f);
        if (f > 0.0f) {
            this.cutPaint.setStrokeWidth(AndroidUtilities.dp(4.0f));
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, NotificationCenter.didReceiveCall, 31);
            this.icon.draw(canvas);
            if (this.value) {
                canvas.drawLine(width2 - AndroidUtilities.dp(4.0f), height2 - AndroidUtilities.dp(4.0f), AndroidUtilities.lerp(width2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + width, f), AndroidUtilities.lerp(height2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + height, f), this.cutPaint);
            } else {
                canvas.drawLine(width + AndroidUtilities.dp(4.0f), height + AndroidUtilities.dp(4.0f), AndroidUtilities.lerp(AndroidUtilities.dp(4.0f) + width, width2 - AndroidUtilities.dp(4.0f), f), AndroidUtilities.lerp(AndroidUtilities.dp(4.0f) + height, height2 - AndroidUtilities.dp(4.0f), f), this.cutPaint);
            }
            canvas.restore();
        } else {
            this.icon.draw(canvas);
        }
        if (f > 0.0f) {
            this.whitePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            if (this.value) {
                canvas.drawLine(width2, height2, AndroidUtilities.lerp(width2, width, f), AndroidUtilities.lerp(height2, height, f), this.whitePaint);
            } else {
                canvas.drawLine(width, height, AndroidUtilities.lerp(width, width2, f), AndroidUtilities.lerp(height, height2, f), this.whitePaint);
            }
        }
    }

    public void setValue(boolean z, boolean z2) {
        if (this.value == z) {
            return;
        }
        this.value = z;
        if (!z2) {
            this.animatedValue.force(z);
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), TLObject.FLAG_30));
    }
}
