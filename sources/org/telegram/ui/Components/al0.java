package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class al0 extends Drawable {
    public final Paint a = new Paint(1);
    public final /* synthetic */ View b;
    public final /* synthetic */ Path c;
    public final /* synthetic */ RectF d;
    public final /* synthetic */ sl0 e;

    public al0(sl0 sl0Var, View view, Path path, RectF rectF) {
        this.e = sl0Var;
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
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, this.e.m2);
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
    public final void setAlpha(int i10) {
        this.a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
