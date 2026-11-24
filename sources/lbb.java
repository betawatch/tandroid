// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lbb extends Drawable {
    public boolean a;
    public final lm b;
    public final Drawable c;
    public final Drawable d;
    public int e = kk7.d4;

    public lbb(gb2 gb2Var) {
        this.b = new lm(420L, gb2Var, s33.h);
        this.c = gb2Var.getContext().getResources().getDrawable(R.drawable.summary_arrow);
        this.d = gb2Var.getContext().getResources().getDrawable(R.drawable.summary_stars);
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
            float f = -abs2;
            float f2 = width * 0.32f;
            canvas.scale(f, f, getBounds().left + f2, getBounds().bottom - f2);
            float f3 = 1.0f - abs2;
            canvas.translate((-width) * f3 * 0.4f, f3 * width * 0.4f);
        }
        Rect bounds2 = getBounds();
        Drawable drawable2 = this.c;
        drawable2.setBounds(bounds2);
        drawable2.setAlpha(this.e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.save();
        if (d > 0.5f) {
            float f4 = -(Math.abs(d - 0.5f) + 0.5f);
            float f5 = 0.32f * width;
            canvas.scale(f4, f4, getBounds().right - f5, getBounds().top + f5);
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
    public final void setAlpha(int i) {
        this.e = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }
}
