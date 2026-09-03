package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class z5 extends Drawable {
    public static Paint c;
    public Paint a;
    public float b;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int dp;
        Rect bounds = getBounds();
        float f10 = this.b;
        if (Math.abs(f10 - (-1.0f)) < 0.01f) {
            dp = Math.max(bounds.width(), bounds.height()) / 2;
        } else if (Math.abs(f10 - (-2.0f)) < 0.01f) {
            dp = (int) Math.ceil(Math.sqrt(((bounds.top - bounds.centerY()) * (bounds.top - bounds.centerY())) + ((bounds.left - bounds.centerX()) * (bounds.left - bounds.centerX()))));
        } else {
            dp = AndroidUtilities.dp(f10);
        }
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), dp, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
