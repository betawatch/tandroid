package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v1 extends Drawable {
    public final int a;
    public final /* synthetic */ GradientDrawable b;
    public final /* synthetic */ c2 c;

    public v1(c2 c2Var, GradientDrawable gradientDrawable) {
        this.c = c2Var;
        this.b = gradientDrawable;
        this.a = AndroidUtilities.dp(52.0f) + c2Var.U;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int width = this.c.g0.getWidth();
        int i9 = this.a;
        int i10 = (int) ((width - i9) / 2.0f);
        int height = (int) ((r0.g0.getHeight() - i9) / 2.0f);
        int width2 = (int) ((r0.g0.getWidth() + i9) / 2.0f);
        int height2 = (int) ((r0.g0.getHeight() + i9) / 2.0f);
        GradientDrawable gradientDrawable = this.b;
        gradientDrawable.setBounds(i10, height, width2, height2);
        gradientDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.b.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
