package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class uu0 extends View implements org.telegram.ui.ActionBar.c6 {
    public final r9 a;
    public final su0 b;
    public final c6 c;
    public boolean d;
    public tu0 e;
    public boolean f;
    public boolean h;

    public uu0(Context context) {
        super(context);
        su0 su0Var = new su0();
        su0Var.c = -16777216;
        su0Var.d = -1;
        this.b = su0Var;
        c6 c6Var = new c6(new ru0(this, 0), 380L, lr.h);
        this.c = c6Var;
        r9 r9Var = new r9(context);
        this.a = r9Var;
        r9Var.setCallback(this);
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
        int z10 = org.telegram.messenger.n10.z(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2;
        canvas.save();
        canvas.translate(z10, measuredHeight);
        canvas.scale(d, d, 0.0f, org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        r9 r9Var = this.a;
        r9Var.setBounds(0, 0, L, L2);
        su0 su0Var = this.b;
        int i7 = su0Var.c;
        if (r9Var.f != i7) {
            r9Var.f = i7;
            if (r9Var.c != null) {
                r9Var.d.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
                r9Var.invalidateSelf();
            }
        }
        int i10 = su0Var.d;
        if (r9Var.e != i10) {
            r9Var.e = i10;
            Drawable drawable = r9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                r9Var.invalidateSelf();
            }
        }
        int i11 = su0Var.c | (-16777216);
        if (r9Var.h != i11) {
            r9Var.h = i11;
            r9Var.b.v(i11, false);
            r9Var.invalidateSelf();
        }
        r9Var.draw(canvas);
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
        r9 r9Var = this.a;
        if (r9Var.r != i7 || r9Var.c == null || r9Var.d == null) {
            r9Var.b.t(i7 >= 0 ? Integer.toString(i7) : "!", true, true);
            r9Var.r = i7;
            if (i7 < 0) {
                b10 = 18;
            } else {
                b10 = c8.l9.b(i7 <= 10 ? i7 - 1 : (i7 / 10) + 8, 0, 17);
            }
            Context context = r9Var.a;
            if (r9Var.n != b10 || r9Var.c == null || r9Var.d == null) {
                int i10 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(r9.s[i10]).mutate();
                r9Var.c = mutate;
                int i11 = r9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i11, mode);
                Drawable mutate2 = context.getResources().getDrawable(r9.s[i10 + 1]).mutate();
                r9Var.d = mutate2;
                mutate2.setColorFilter(r9Var.f, mode);
                r9Var.n = b10;
                Drawable drawable = r9Var.c;
                if (drawable != null) {
                    drawable.setBounds(r9Var.getBounds());
                }
                Drawable drawable2 = r9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(r9Var.getBounds());
                }
            }
            r9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.c0.u(null, 2131754797, sb2, " ");
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(tu0 tu0Var) {
        this.e = tu0Var;
    }

    public void setParentExpanded(float f10) {
        su0 su0Var = this.b;
        su0Var.e = f10;
        su0Var.a(su0Var.a);
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
            su0 su0Var = this.b;
            su0Var.a(su0Var.a);
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
