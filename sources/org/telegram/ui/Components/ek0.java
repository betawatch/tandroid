package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ek0 extends Drawable {
    public final Paint a = new Paint(1);
    public final /* synthetic */ View b;
    public final /* synthetic */ Path c;
    public final /* synthetic */ RectF d;
    public final /* synthetic */ wk0 e;

    public ek0(wk0 wk0Var, View view, Path path, RectF rectF) {
        this.e = wk0Var;
        this.b = view;
        this.c = path;
        this.d = rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.c);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, this.e.l2);
        Paint paint = this.a;
        paint.setColor(i0.a.k(v02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.a.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
