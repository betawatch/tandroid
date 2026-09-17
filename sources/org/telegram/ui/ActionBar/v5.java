package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class v5 extends Drawable {
    public final RectF a = new RectF();
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Paint e;

    public v5(View view, View view2, int i10, Paint paint) {
        this.b = view;
        this.c = view2;
        this.d = i10;
        this.e = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float f7 = bounds.left;
        float f10 = bounds.top;
        float f11 = bounds.right;
        float f12 = bounds.bottom;
        RectF rectF = this.a;
        rectF.set(f7, f10, f11, f12);
        j6.s(this.b, this.c, null);
        float f13 = this.d;
        Paint paint = this.e;
        if (paint == null) {
            paint = j6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(rectF, f13, f13, paint);
        if (j6.a1()) {
            canvas.drawRoundRect(rectF, f13, f13, j6.S0("paintChatActionBackgroundDarken"));
        }
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
