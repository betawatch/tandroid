package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wu0 extends View implements org.telegram.ui.ActionBar.c6 {
    public final q9 a;
    public final uu0 b;
    public final c6 c;
    public boolean d;
    public vu0 e;
    public boolean f;
    public boolean h;

    public wu0(Context context) {
        super(context);
        uu0 uu0Var = new uu0();
        uu0Var.c = -16777216;
        uu0Var.d = -1;
        this.b = uu0Var;
        c6 c6Var = new c6(new tu0(this, 0), 380L, kr.h);
        this.c = c6Var;
        q9 q9Var = new q9(context);
        this.a = q9Var;
        q9Var.setCallback(this);
        this.d = false;
        c6Var.e(false, 0.0f);
        a();
    }

    public final void a() {
        boolean z10 = this.h && this.f;
        this.d = z10;
        this.c.d(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.c.c;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.getClass();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.getClass();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float d = this.c.d(this.d);
        int z10 = org.telegram.messenger.m10.z(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2;
        canvas.save();
        canvas.translate(z10, measuredHeight);
        canvas.scale(d, d, 0.0f, org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        q9 q9Var = this.a;
        q9Var.setBounds(0, 0, L, L2);
        uu0 uu0Var = this.b;
        int i7 = uu0Var.c;
        if (q9Var.f != i7) {
            q9Var.f = i7;
            if (q9Var.c != null) {
                q9Var.d.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
                q9Var.invalidateSelf();
            }
        }
        int i10 = uu0Var.d;
        if (q9Var.e != i10) {
            q9Var.e = i10;
            Drawable drawable = q9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                q9Var.invalidateSelf();
            }
        }
        int i11 = uu0Var.c | (-16777216);
        if (q9Var.h != i11) {
            q9Var.h = i11;
            q9Var.b.v(i11, false);
            q9Var.invalidateSelf();
        }
        q9Var.draw(canvas);
        canvas.restore();
    }

    public void set(TL_stars.Tl_starsRating tl_starsRating) {
        int b10;
        this.f = tl_starsRating != null;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i7 = tl_starsRating.level;
        q9 q9Var = this.a;
        if (q9Var.r != i7 || q9Var.c == null || q9Var.d == null) {
            q9Var.b.t(i7 >= 0 ? Integer.toString(i7) : "!", true, true);
            q9Var.r = i7;
            if (i7 < 0) {
                b10 = 18;
            } else {
                b10 = c8.m9.b(i7 <= 10 ? i7 - 1 : (i7 / 10) + 8, 0, 17);
            }
            Context context = q9Var.a;
            if (q9Var.n != b10 || q9Var.c == null || q9Var.d == null) {
                int i10 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(q9.s[i10]).mutate();
                q9Var.c = mutate;
                int i11 = q9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i11, mode);
                Drawable mutate2 = context.getResources().getDrawable(q9.s[i10 + 1]).mutate();
                q9Var.d = mutate2;
                mutate2.setColorFilter(q9Var.f, mode);
                q9Var.n = b10;
                Drawable drawable = q9Var.c;
                if (drawable != null) {
                    drawable.setBounds(q9Var.getBounds());
                }
                Drawable drawable2 = q9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(q9Var.getBounds());
                }
            }
            q9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.c0.u(null, 2131754796, sb2, " ");
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(vu0 vu0Var) {
        this.e = vu0Var;
    }

    public void setParentExpanded(float f10) {
        uu0 uu0Var = this.b;
        uu0Var.e = f10;
        uu0Var.a(uu0Var.a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.i6 i6Var) {
        this.b.b = i6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            uu0 uu0Var = this.b;
            uu0Var.a(uu0Var.a);
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
