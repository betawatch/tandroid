package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i6 extends Drawable {
    public float[] b;
    public Path a = new Path();
    public boolean c = true;

    public i6(float f10, float f11) {
        this.b = new float[]{r4, r4, r4, r4, r4, r4, r4, r4};
        float L = org.telegram.messenger.g0.L(f10);
        float L2 = org.telegram.messenger.g0.L(f11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Path path = this.a;
        if (this.c) {
            this.c = false;
            path.reset();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.b, Path.Direction.CW);
        }
        canvas.drawPath(path, m6.z);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.c = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
