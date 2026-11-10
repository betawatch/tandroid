package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class mu0 extends View implements org.telegram.ui.ActionBar.c6 {
    public final l9 a;
    public final ku0 b;
    public final v5 c;
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
        v5 v5Var = new v5(new ju0(this, 0), 380L, wq.h);
        this.c = v5Var;
        l9 l9Var = new l9(context);
        this.a = l9Var;
        l9Var.setCallback(this);
        this.d = false;
        v5Var.e(false, 0.0f);
        a();
    }

    public final void a() {
        boolean z9 = this.h && this.f;
        this.d = z9;
        this.c.d(z9);
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
        int y10 = org.telegram.messenger.camera.q.y(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2;
        canvas.save();
        canvas.translate(y10, measuredHeight);
        canvas.scale(d, d, 0.0f, org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        l9 l9Var = this.a;
        l9Var.setBounds(0, 0, L, L2);
        ku0 ku0Var = this.b;
        int i7 = ku0Var.c;
        if (l9Var.f != i7) {
            l9Var.f = i7;
            if (l9Var.c != null) {
                l9Var.d.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
                l9Var.invalidateSelf();
            }
        }
        int i10 = ku0Var.d;
        if (l9Var.e != i10) {
            l9Var.e = i10;
            Drawable drawable = l9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                l9Var.invalidateSelf();
            }
        }
        int i11 = ku0Var.c | (-16777216);
        if (l9Var.h != i11) {
            l9Var.h = i11;
            l9Var.b.v(i11, false);
            l9Var.invalidateSelf();
        }
        l9Var.draw(canvas);
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
        l9 l9Var = this.a;
        if (l9Var.r != i7 || l9Var.c == null || l9Var.d == null) {
            l9Var.b.t(i7 >= 0 ? Integer.toString(i7) : "!", true, true);
            l9Var.r = i7;
            if (i7 < 0) {
                b10 = 18;
            } else {
                b10 = c8.j9.b(i7 <= 10 ? i7 - 1 : (i7 / 10) + 8, 0, 17);
            }
            Context context = l9Var.a;
            if (l9Var.n != b10 || l9Var.c == null || l9Var.d == null) {
                int i10 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(l9.s[i10]).mutate();
                l9Var.c = mutate;
                int i11 = l9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i11, mode);
                Drawable mutate2 = context.getResources().getDrawable(l9.s[i10 + 1]).mutate();
                l9Var.d = mutate2;
                mutate2.setColorFilter(l9Var.f, mode);
                l9Var.n = b10;
                Drawable drawable = l9Var.c;
                if (drawable != null) {
                    drawable.setBounds(l9Var.getBounds());
                }
                Drawable drawable2 = l9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(l9Var.getBounds());
                }
            }
            l9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.camera.q.q(null, 2131754797, sb2, " ");
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

    public void setResourcesProvider(org.telegram.ui.ActionBar.h6 h6Var) {
        this.b.b = h6Var;
    }

    public void setVisibility(boolean z9) {
        this.h = z9;
        a();
    }

    @Override // org.telegram.ui.ActionBar.c6
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

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
