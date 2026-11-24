// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.HashSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gd extends Drawable implements tjb {
    public final ry8 a;
    public final GradientDrawable b;
    public final int c;
    public final int d;
    public final wjb e;

    public gd(ry8 ry8Var, int i, int i2, int i3, wjb wjbVar) {
        this.a = ry8Var;
        this.c = i2;
        this.d = i3;
        this.e = wjbVar;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(gl.L(128.0f));
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

    @Override // tjb
    public final void updateColors() {
        int i = this.d;
        if (i >= 0) {
            this.b.setColor(bkb.v0(i, this.e));
            invalidateSelf();
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
