package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bq extends Drawable {
    public final Drawable a;
    public Path b;
    public final RectF c;
    public final RectF d;
    public boolean e;
    public final float[] f;

    public bq(Drawable drawable) {
        i.f fVar = new i.f(this, 6);
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
            this.a.setCallback(fVar);
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
            float f10 = rectF.left;
            RectF rectF2 = this.d;
            rectF.left = f10 + rectF2.left;
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
