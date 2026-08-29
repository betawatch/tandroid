package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        int i10 = this.a;
        int i11 = (int) ((width - i10) / 2.0f);
        int height = (int) ((r0.g0.getHeight() - i10) / 2.0f);
        int width2 = (int) ((r0.g0.getWidth() + i10) / 2.0f);
        int height2 = (int) ((r0.g0.getHeight() + i10) / 2.0f);
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
