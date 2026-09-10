package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class w1 extends Drawable {
    public final int a;
    public final /* synthetic */ GradientDrawable b;
    public final /* synthetic */ d2 c;

    public w1(d2 d2Var, GradientDrawable gradientDrawable) {
        this.c = d2Var;
        this.b = gradientDrawable;
        this.a = AndroidUtilities.dp(52.0f) + d2Var.Y;
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
