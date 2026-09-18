package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class v1 extends Drawable {
    public final int a;
    public final /* synthetic */ GradientDrawable b;
    public final /* synthetic */ c2 c;

    public v1(c2 c2Var, GradientDrawable gradientDrawable) {
        this.c = c2Var;
        this.b = gradientDrawable;
        this.a = AndroidUtilities.dp(52.0f) + c2Var.Y;
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
