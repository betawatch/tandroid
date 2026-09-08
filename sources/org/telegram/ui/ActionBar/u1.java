package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class u1 extends Drawable {
    public final int a;
    public final /* synthetic */ GradientDrawable b;
    public final /* synthetic */ b2 c;

    public u1(b2 b2Var, GradientDrawable gradientDrawable) {
        this.c = b2Var;
        this.b = gradientDrawable;
        this.a = AndroidUtilities.dp(52.0f) + b2Var.Y;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int width = this.c.k0.getWidth();
        int i10 = this.a;
        int i11 = (int) ((width - i10) / 2.0f);
        int height = (int) ((r0.k0.getHeight() - i10) / 2.0f);
        int width2 = (int) ((r0.k0.getWidth() + i10) / 2.0f);
        int height2 = (int) ((r0.k0.getHeight() + i10) / 2.0f);
        GradientDrawable gradientDrawable = this.b;
        gradientDrawable.setBounds(i11, height, width2, height2);
        gradientDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
