package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s5 extends Drawable {
    public final RectF a = new RectF();
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Paint e;

    public s5(View view, View view2, int i9, Paint paint) {
        this.b = view;
        this.c = view2;
        this.d = i9;
        this.e = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float f10 = bounds.left;
        float f11 = bounds.top;
        float f12 = bounds.right;
        float f13 = bounds.bottom;
        RectF rectF = this.a;
        rectF.set(f10, f11, f12, f13);
        f6.s(this.b, this.c, null);
        float f14 = this.d;
        Paint paint = this.e;
        if (paint == null) {
            paint = f6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(rectF, f14, f14, paint);
        if (f6.a1()) {
            canvas.drawRoundRect(rectF, f14, f14, f6.S0("paintChatActionBackgroundDarken"));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
