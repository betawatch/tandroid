// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.HashSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class hd extends Drawable implements snb {
    public final e29 a;
    public final GradientDrawable b;
    public final int c;
    public final int d;
    public final vnb e;

    public hd(e29 e29Var, int i, int i2, int i3, vnb vnbVar) {
        this.a = e29Var;
        this.c = i2;
        this.d = i3;
        this.e = vnbVar;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(hl.L(128.0f));
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

    @Override // snb
    public final void updateColors() {
        int i = this.d;
        if (i >= 0) {
            this.b.setColor(aob.v0(i, this.e));
            invalidateSelf();
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
