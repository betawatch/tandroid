package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class xu0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final r9 a;
    public final vu0 b;
    public final d6 c;
    public boolean d;
    public wu0 e;
    public boolean f;
    public boolean h;

    public xu0(Context context) {
        super(context);
        vu0 vu0Var = new vu0();
        vu0Var.c = -16777216;
        vu0Var.d = -1;
        this.b = vu0Var;
        d6 d6Var = new d6(new uu0(this, 0), 380L, nr.h);
        this.c = d6Var;
        r9 r9Var = new r9(context);
        this.a = r9Var;
        r9Var.setCallback(this);
        this.d = false;
        d6Var.e(false, 0.0f);
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
        vu0 vu0Var = this.b;
        int i7 = vu0Var.c;
        if (r9Var.f != i7) {
            r9Var.f = i7;
            if (r9Var.c != null) {
                r9Var.d.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
                r9Var.invalidateSelf();
            }
        }
        int i10 = vu0Var.d;
        if (r9Var.e != i10) {
            r9Var.e = i10;
            Drawable drawable = r9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                r9Var.invalidateSelf();
            }
        }
        int i11 = vu0Var.c | (-16777216);
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
        org.telegram.ui.Cells.c0.u(null, 2131754796, sb2, " ");
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(wu0 wu0Var) {
        this.e = wu0Var;
    }

    public void setParentExpanded(float f10) {
        vu0 vu0Var = this.b;
        vu0Var.e = f10;
        vu0Var.a(vu0Var.a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.h6 h6Var) {
        this.b.b = h6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            vu0 vu0Var = this.b;
            vu0Var.a(vu0Var.a);
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
