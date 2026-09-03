package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class q9 extends Drawable implements Drawable.Callback {
    public static int[] s;
    public final Context a;
    public final j6 b;
    public Drawable c;
    public Drawable d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;

    public q9(Context context) {
        this.a = context;
        j6 j6Var = new j6(false, false, false, false);
        this.b = j6Var;
        j6Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        j6Var.k(0.2f, 160L, pr.h);
        j6Var.t(AndroidUtilities.dp(10.0f));
        j6Var.b = 17;
        j6Var.setCallback(this);
        j6Var.N = true;
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
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
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
        int k10 = i0.a.k(this.e, i10);
        if (this.e != k10) {
            this.e = k10;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(k10, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int k11 = i0.a.k(this.f, i10);
        if (this.f != k11) {
            this.f = k11;
            if (this.c != null) {
                this.d.setColorFilter(k11, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int k12 = i0.a.k(this.h, i10);
        if (this.h != k12) {
            this.h = k12;
            this.b.s(k12, false);
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
