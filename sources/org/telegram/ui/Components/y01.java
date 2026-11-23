package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class y01 extends Drawable {
    public final Paint a = new Paint(1);
    public final RectF b = new RectF();
    public final /* synthetic */ int c;
    public final /* synthetic */ g11 d;

    public y01(g11 g11Var, int i7) {
        this.d = g11Var;
        this.c = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.b;
        rectF.set(bounds);
        int i7 = this.c;
        rectF.inset(i7, i7);
        float height = rectF.height() / 2.0f;
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.O5, this.d.e);
        Paint paint = this.a;
        paint.setColor(w02);
        canvas.drawRoundRect(rectF, height, height, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
