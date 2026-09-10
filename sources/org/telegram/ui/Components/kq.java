package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class kq extends Drawable {
    public final Drawable a;
    public Path b;
    public final RectF c;
    public final RectF d;
    public boolean e;
    public final float[] f;

    public kq(Drawable drawable) {
        hi.s0 s0Var = new hi.s0(this, 2);
        this.c = new RectF();
        this.d = new RectF();
        this.e = false;
        this.f = new float[8];
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.a.setCallback(s0Var);
        }
    }

    public final void a() {
        if (this.e) {
            Path path = this.b;
            if (path == null) {
                this.b = new Path();
            } else {
                path.rewind();
            }
            Rect bounds = getBounds();
            RectF rectF = this.c;
            rectF.set(bounds);
            float f7 = rectF.left;
            RectF rectF2 = this.d;
            rectF.left = f7 + rectF2.left;
            rectF.top += rectF2.top;
            rectF.right -= rectF2.right;
            rectF.bottom -= rectF2.bottom;
            this.b.addRoundRect(rectF, this.f, Path.Direction.CW);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.b);
            this.a.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
