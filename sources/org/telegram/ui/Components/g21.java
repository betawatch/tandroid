package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g21 extends Drawable {
    public final Drawable a;
    public final Paint b = new Paint(1);
    public final RectF c = new RectF();

    public g21(Context context) {
        this.a = i0.a.f(context, R.drawable.menu_topic_add);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawRoundRect(this.c, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), this.b);
        this.a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(rect);
        int centerX = rect.centerX() - org.telegram.messenger.i0.L(12.0f);
        int centerY = rect.centerY() - org.telegram.messenger.i0.L(12.0f);
        this.a.setBounds(centerX, centerY, org.telegram.messenger.i0.L(24.0f) + centerX, org.telegram.messenger.i0.L(24.0f) + centerY);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.b.setAlpha(i10);
        this.a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
