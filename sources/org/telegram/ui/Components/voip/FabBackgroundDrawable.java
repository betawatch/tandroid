package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class FabBackgroundDrawable extends Drawable {
    public final Paint a = new Paint(1);
    public final Paint b;
    public Bitmap c;

    public FabBackgroundDrawable() {
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(1275068416);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.c == null) {
            onBoundsChange(getBounds());
        }
        int min = Math.min(getBounds().width(), getBounds().height());
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().centerX() - (this.c.getWidth() / 2), getBounds().centerY() - (this.c.getHeight() / 2), this.b);
        }
        float f10 = min / 2;
        canvas.drawCircle(f10, f10, r0 - AndroidUtilities.dp(4.0f), this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int dp = AndroidUtilities.dp(4.0f);
        rect.set(dp, dp, dp, dp);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int min = Math.min(rect.width(), rect.height());
        if (min <= 0) {
            this.c = null;
            return;
        }
        this.c = Bitmap.createBitmap(min, min, Bitmap.Config.ALPHA_8);
        float f10 = min / 2;
        new Canvas(this.c).drawCircle(f10, f10, r5 - AndroidUtilities.dp(4.0f), new Paint(1));
    }

    public void setColor(int i9) {
        this.a.setColor(i9);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
