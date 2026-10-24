package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bk0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class b2 extends Drawable implements b6 {
    public final View a;
    public final GradientDrawable b;
    public final int c;
    public final int d;
    public final g6 e;

    public b2(bk0 bk0Var, int i10, int i11, int i12, g6 g6Var) {
        this.a = bk0Var;
        this.c = i11;
        this.d = i12;
        this.e = g6Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int width = this.a.getWidth();
        int i10 = this.c;
        int i11 = (int) ((width - i10) / 2.0f);
        int height = (int) ((r0.getHeight() - i10) / 2.0f);
        int width2 = (int) ((r0.getWidth() + i10) / 2.0f);
        int height2 = (int) ((r0.getHeight() + i10) / 2.0f);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i10 = this.d;
        if (i10 >= 0) {
            this.b.setColor(k6.w0(i10, this.e));
            invalidateSelf();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
