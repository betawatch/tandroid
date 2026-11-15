package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class mu0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final j9 a;
    public final ku0 b;
    public final u5 c;
    public boolean d;
    public lu0 e;
    public boolean f;
    public boolean h;

    public mu0(Context context) {
        super(context);
        ku0 ku0Var = new ku0();
        ku0Var.c = -16777216;
        ku0Var.d = -1;
        this.b = ku0Var;
        u5 u5Var = new u5(new ju0(this, 0), 380L, er.h);
        this.c = u5Var;
        j9 j9Var = new j9(context);
        this.a = j9Var;
        j9Var.setCallback(this);
        this.d = false;
        u5Var.e(false, 0.0f);
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
        int y10 = org.telegram.messenger.i20.y(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2;
        canvas.save();
        canvas.translate(y10, measuredHeight);
        canvas.scale(d, d, 0.0f, org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        j9 j9Var = this.a;
        j9Var.setBounds(0, 0, L, L2);
        ku0 ku0Var = this.b;
        int i7 = ku0Var.c;
        if (j9Var.f != i7) {
            j9Var.f = i7;
            if (j9Var.c != null) {
                j9Var.d.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
                j9Var.invalidateSelf();
            }
        }
        int i10 = ku0Var.d;
        if (j9Var.e != i10) {
            j9Var.e = i10;
            Drawable drawable = j9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                j9Var.invalidateSelf();
            }
        }
        int i11 = ku0Var.c | (-16777216);
        if (j9Var.h != i11) {
            j9Var.h = i11;
            j9Var.b.v(i11, false);
            j9Var.invalidateSelf();
        }
        j9Var.draw(canvas);
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
        j9 j9Var = this.a;
        if (j9Var.r != i7 || j9Var.c == null || j9Var.d == null) {
            j9Var.b.t(i7 >= 0 ? Integer.toString(i7) : "!", true, true);
            j9Var.r = i7;
            if (i7 < 0) {
                b10 = 18;
            } else {
                b10 = c8.i9.b(i7 <= 10 ? i7 - 1 : (i7 / 10) + 8, 0, 17);
            }
            Context context = j9Var.a;
            if (j9Var.n != b10 || j9Var.c == null || j9Var.d == null) {
                int i10 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(j9.s[i10]).mutate();
                j9Var.c = mutate;
                int i11 = j9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i11, mode);
                Drawable mutate2 = context.getResources().getDrawable(j9.s[i10 + 1]).mutate();
                j9Var.d = mutate2;
                mutate2.setColorFilter(j9Var.f, mode);
                j9Var.n = b10;
                Drawable drawable = j9Var.c;
                if (drawable != null) {
                    drawable.setBounds(j9Var.getBounds());
                }
                Drawable drawable2 = j9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(j9Var.getBounds());
                }
            }
            j9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.y0.r(null, 2131754797, sb2, " ");
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(lu0 lu0Var) {
        this.e = lu0Var;
    }

    public void setParentExpanded(float f10) {
        ku0 ku0Var = this.b;
        ku0Var.e = f10;
        ku0Var.a(ku0Var.a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.b.b = e6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            ku0 ku0Var = this.b;
            ku0Var.a(ku0Var.a);
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
