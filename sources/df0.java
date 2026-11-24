// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class df0 extends Drawable implements Drawable.Callback {
    public static int[] s;
    public final Context a;
    public final ho b;
    public Drawable c;
    public Drawable d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;

    public df0(Context context) {
        this.a = context;
        ho hoVar = new ho(false, false, false);
        this.b = hoVar;
        hoVar.x(gm.n1("fonts/rcondensedbold.ttf"));
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(10.0f));
        hoVar.b = 17;
        hoVar.setCallback(this);
        hoVar.U = true;
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
        return gm.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return gm.L(24.0f);
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
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        int p = on2.p(this.e, i);
        if (this.e != p) {
            this.e = p;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(p, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int p2 = on2.p(this.f, i);
        if (this.f != p2) {
            this.f = p2;
            if (this.c != null) {
                this.d.setColorFilter(p2, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int p3 = on2.p(this.h, i);
        if (this.h != p3) {
            this.h = p3;
            this.b.v(p3, false);
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
