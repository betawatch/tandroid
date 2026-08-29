package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gc0 extends Drawable {
    public final Drawable a;
    public final Paint b;
    public final Paint c;
    public final d6 d;
    public boolean e;

    public gc0(Context context) {
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.d = new d6(new xb0(this, 2), 200L, jr.g, 0);
        this.a = context.getResources().getDrawable(R.drawable.filled_sound_on).mutate();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.566f));
        paint.setColor(-1);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint2.setStyle(style);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(4.5f));
        paint2.setColor(-65536);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.a;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        float e10 = this.d.e(this.e);
        if (e10 > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(0.783f);
            float centerX = (bounds.centerX() - AndroidUtilities.dp(9.0f)) + dpf2;
            float centerY = (bounds.centerY() - AndroidUtilities.dp(9.0f)) + dpf2;
            float dp = (AndroidUtilities.dp(9.0f) + bounds.centerX()) - dpf2;
            float dp2 = (AndroidUtilities.dp(9.0f) + bounds.centerY()) - dpf2;
            if (this.e) {
                centerX = AndroidUtilities.lerp(dp, centerX, e10);
                centerY = AndroidUtilities.lerp(dp2, centerY, e10);
            } else {
                dp = AndroidUtilities.lerp(centerX, dp, e10);
                dp2 = AndroidUtilities.lerp(centerY, dp2, e10);
            }
            float f9 = dp2;
            float f10 = centerX;
            float f11 = centerY;
            float f12 = dp;
            canvas.drawLine(f10, f11, f12, f9, this.c);
            int min = (int) (Math.min(1.0f, e10 * 10.0f) * 255.0f);
            Paint paint = this.b;
            paint.setAlpha(min);
            canvas.drawLine(f10, f11, f12, f9, paint);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
