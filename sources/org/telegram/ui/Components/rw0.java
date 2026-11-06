package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class rw0 extends Drawable {
    public boolean a;
    public final w5 b;
    public final Drawable c;
    public final Drawable d;
    public int e = org.telegram.messenger.qs.e4;

    public rw0(org.telegram.ui.Cells.q1 q1Var) {
        this.b = new w5(q1Var, 420L, xq.h);
        this.c = q1Var.getContext().getResources().getDrawable(R.drawable.summary_arrow);
        this.d = q1Var.getContext().getResources().getDrawable(R.drawable.summary_stars);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.d;
        drawable.setBounds(bounds);
        drawable.setAlpha(this.e);
        drawable.draw(canvas);
        float d = this.b.d(this.a);
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float width = getBounds().width();
        canvas.save();
        if (d < 0.5f) {
            float abs = Math.abs(d - 0.5f) + 0.5f;
            canvas.scale(abs, abs, centerX, centerY);
        }
        canvas.save();
        if (d > 0.5f) {
            float abs2 = Math.abs(d - 0.5f) + 0.5f;
            float f10 = -abs2;
            float f11 = width * 0.32f;
            canvas.scale(f10, f10, getBounds().left + f11, getBounds().bottom - f11);
            float f12 = 1.0f - abs2;
            canvas.translate((-width) * f12 * 0.4f, f12 * width * 0.4f);
        }
        Rect bounds2 = getBounds();
        Drawable drawable2 = this.c;
        drawable2.setBounds(bounds2);
        drawable2.setAlpha(this.e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.save();
        if (d > 0.5f) {
            float f13 = -(Math.abs(d - 0.5f) + 0.5f);
            float f14 = 0.32f * width;
            canvas.scale(f13, f13, getBounds().right - f14, getBounds().top + f14);
        }
        canvas.rotate(180.0f, centerX, centerY);
        if (d > 0.5f) {
            float abs3 = 1.0f - (Math.abs(d - 0.5f) + 0.5f);
            canvas.translate((-width) * abs3 * 0.4f, width * abs3 * 0.4f);
        }
        drawable2.setBounds(getBounds());
        drawable2.setAlpha(this.e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.e = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }
}
