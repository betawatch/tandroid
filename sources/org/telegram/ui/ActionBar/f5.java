package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f5 extends Drawable {
    public final /* synthetic */ int a;
    public Paint b;

    public f5(int i9) {
        this.a = i9;
        switch (i9) {
            case 1:
                this.b = new Paint(1);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY() - AndroidUtilities.dp(1.0f), (getBounds().width() - AndroidUtilities.dp(8.0f)) / 2.0f, this.b);
                break;
            default:
                Paint paint = this.b;
                paint.setColor(f6.w0(null, f6.hl, false));
                canvas.drawRoundRect(getBounds().left, getBounds().exactCenterY() - AndroidUtilities.dp(14.0f), getBounds().right, AndroidUtilities.dp(14.0f) + getBounds().exactCenterY(), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(i9);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i9 = this.a;
    }

    private final void a(int i9) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
