package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class i2 extends Drawable {
    public final Context a;
    public final Drawable b;
    public Drawable c;
    public int d;
    public int e;
    public Drawable f;
    public boolean g;

    public i2(Context context, int i10) {
        Drawable f7 = i0.a.f(context, i10);
        this.d = org.telegram.ui.ActionBar.t6.d6;
        this.g = true;
        this.a = context;
        this.b = f7;
    }

    public final void a(boolean z10) {
        if (this.g == z10) {
            return;
        }
        this.g = z10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.b;
        drawable.setBounds(org.telegram.ui.Cells.f1.z(2, centerX, drawable), org.telegram.ui.Cells.f1.y(2, centerY, drawable), org.telegram.ui.Cells.f1.w(2, centerX, drawable), org.telegram.ui.Cells.f1.f(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.g) {
            int L = org.telegram.messenger.i0.L(9.0f) + centerX;
            int L2 = org.telegram.messenger.i0.L(9.0f) + centerY;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, this.d, false);
            Drawable drawable2 = this.c;
            Context context = this.a;
            if (drawable2 == null) {
                Drawable f7 = i0.a.f(context, R.drawable.star_premium_cutout);
                this.c = f7;
                this.e = x02;
                f7.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.e) {
                Drawable drawable3 = this.c;
                this.e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f == null) {
                this.f = i0.a.f(context, R.drawable.star_premium);
            }
            this.c.setBounds(L - org.telegram.messenger.i0.L(9.0f), L2 - org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f) + L, org.telegram.messenger.i0.L(9.0f) + L2);
            this.c.draw(canvas);
            this.f.setBounds(L - org.telegram.messenger.i0.L(9.0f), L2 - org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f) + L, org.telegram.messenger.i0.L(9.0f) + L2);
            this.f.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(org.telegram.messenger.i0.L(38.0f), this.b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(org.telegram.messenger.i0.L(38.0f), this.b.getIntrinsicWidth());
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
