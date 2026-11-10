package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t1 extends Drawable implements c6 {
    public final View a;
    public final GradientDrawable b;
    public final int c;
    public final int d;
    public final h6 e;

    public t1(ch0 ch0Var, int i7, int i10, int i11, h6 h6Var) {
        this.a = ch0Var;
        this.c = i10;
        this.d = i11;
        this.e = h6Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        gradientDrawable.setColor(i7);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(128.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int width = this.a.getWidth();
        int i7 = this.c;
        int i10 = (int) ((width - i7) / 2.0f);
        int height = (int) ((r0.getHeight() - i7) / 2.0f);
        int width2 = (int) ((r0.getWidth() + i7) / 2.0f);
        int height2 = (int) ((r0.getHeight() + i7) / 2.0f);
        GradientDrawable gradientDrawable = this.b;
        gradientDrawable.setBounds(i10, height, width2, height2);
        gradientDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.b.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = this.d;
        if (i7 >= 0) {
            this.b.setColor(m6.w0(i7, this.e));
            invalidateSelf();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
