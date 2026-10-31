package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h9 extends Drawable implements Drawable.Callback {
    public static int[] s;
    public final Context a;
    public final e6 b;
    public Drawable c;
    public Drawable d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;

    public h9(Context context) {
        this.a = context;
        e6 e6Var = new e6(false, false, false);
        this.b = e6Var;
        e6Var.x(org.telegram.messenger.i0.o1("fonts/rcondensedbold.ttf"));
        e6Var.n(0.2f, 160L, gr.h);
        e6Var.w(org.telegram.messenger.i0.L(10.0f));
        e6Var.b = 17;
        e6Var.setCallback(this);
        e6Var.T = true;
        if (s != null) {
            return;
        }
        s = new int[]{R.drawable.profile_level1_inner, R.drawable.profile_level1_outer, R.drawable.profile_level2_inner, R.drawable.profile_level2_outer, R.drawable.profile_level3_inner, R.drawable.profile_level3_outer, R.drawable.profile_level4_inner, R.drawable.profile_level4_outer, R.drawable.profile_level5_inner, R.drawable.profile_level5_outer, R.drawable.profile_level6_inner, R.drawable.profile_level6_outer, R.drawable.profile_level7_inner, R.drawable.profile_level7_outer, R.drawable.profile_level8_inner, R.drawable.profile_level8_outer, R.drawable.profile_level9_inner, R.drawable.profile_level9_outer, R.drawable.profile_level10_inner, R.drawable.profile_level10_outer, R.drawable.profile_level20_inner, R.drawable.profile_level20_outer, R.drawable.profile_level30_inner, R.drawable.profile_level30_outer, R.drawable.profile_level40_inner, R.drawable.profile_level40_outer, R.drawable.profile_level50_inner, R.drawable.profile_level50_outer, R.drawable.profile_level60_inner, R.drawable.profile_level60_outer, R.drawable.profile_level70_inner, R.drawable.profile_level70_outer, R.drawable.profile_level80_inner, R.drawable.profile_level80_outer, R.drawable.profile_level90_inner, R.drawable.profile_level90_outer, R.drawable.profile_level_minus_inner, R.drawable.profile_level_minus_outer};
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable == null || this.c == null) {
            return;
        }
        drawable.draw(canvas);
        this.c.draw(canvas);
        canvas.save();
        canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(getBounds());
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setBounds(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        int o10 = i0.b.o(this.e, i10);
        if (this.e != o10) {
            this.e = o10;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(o10, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int o11 = i0.b.o(this.f, i10);
        if (this.f != o11) {
            this.f = o11;
            if (this.c != null) {
                this.d.setColorFilter(o11, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int o12 = i0.b.o(this.h, i10);
        if (this.h != o12) {
            this.h = o12;
            this.b.v(o12, false);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
