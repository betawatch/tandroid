// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ge extends Drawable implements vlb {
    public final s09 a;
    public final GradientDrawable b;
    public final int c;
    public final int d;
    public final ylb e;

    public ge(s09 s09Var, int i, int i2, int i3, ylb ylbVar) {
        this.a = s09Var;
        this.c = i2;
        this.d = i3;
        this.e = ylbVar;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(gm.L(128.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int width = this.a.getWidth();
        int i = this.c;
        GradientDrawable gradientDrawable = this.b;
        gradientDrawable.setBounds((int) ((width - i) / 2.0f), (int) ((r0.getHeight() - i) / 2.0f), (int) ((r0.getWidth() + i) / 2.0f), (int) ((r0.getHeight() + i) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    @Override // vlb
    public final void updateColors() {
        int i = this.d;
        if (i >= 0) {
            this.b.setColor(cmb.v0(i, this.e));
            invalidateSelf();
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
