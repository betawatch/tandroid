package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n11 extends Drawable {
    public final Paint a = new Paint(1);
    public final RectF b = new RectF();
    public final /* synthetic */ int c;
    public final /* synthetic */ t11 d;

    public n11(t11 t11Var, int i10) {
        this.d = t11Var;
        this.c = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.b;
        rectF.set(bounds);
        int i10 = this.c;
        rectF.inset(i10, i10);
        float height = rectF.height() / 2.0f;
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.d.e);
        Paint paint = this.a;
        paint.setColor(w02);
        paint.setShadowLayer(org.telegram.messenger.i0.L(1.5f), 0.0f, org.telegram.messenger.i0.L(0.5f), 436207616);
        canvas.drawRoundRect(rectF, height, height, paint);
        paint.setShadowLayer(org.telegram.messenger.i0.L(0.5f), 0.0f, 0.0f, 520093696);
        canvas.drawRoundRect(rectF, height, height, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
