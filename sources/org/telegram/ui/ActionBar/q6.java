package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q6 extends Drawable {
    public float[] b;
    public Path a = new Path();
    public boolean c = true;

    public q6(float f7, float f10) {
        this.b = new float[]{r4, r4, r4, r4, r4, r4, r4, r4};
        float L = org.telegram.messenger.i0.L(f7);
        float L2 = org.telegram.messenger.i0.L(f10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Path path = this.a;
        if (this.c) {
            this.c = false;
            path.reset();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.b, Path.Direction.CW);
        }
        canvas.drawPath(path, t6.z);
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
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
