package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ku0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final l9 a;
    public final iu0 b;
    public final u5 c;
    public boolean d;
    public ju0 e;
    public boolean f;
    public boolean h;

    public ku0(Context context) {
        super(context);
        iu0 iu0Var = new iu0();
        iu0Var.c = -16777216;
        iu0Var.d = -1;
        this.b = iu0Var;
        u5 u5Var = new u5(new hu0(this, 0), 380L, xq.h);
        this.c = u5Var;
        l9 l9Var = new l9(context);
        this.a = l9Var;
        l9Var.setCallback(this);
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
        int y9 = org.telegram.messenger.camera.q.y(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2;
        canvas.save();
        canvas.translate(y9, measuredHeight);
        canvas.scale(d, d, 0.0f, org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        l9 l9Var = this.a;
        l9Var.setBounds(0, 0, L, L2);
        iu0 iu0Var = this.b;
        int i3 = iu0Var.c;
        if (l9Var.f != i3) {
            l9Var.f = i3;
            if (l9Var.c != null) {
                l9Var.d.setColorFilter(i3, PorterDuff.Mode.MULTIPLY);
                l9Var.invalidateSelf();
            }
        }
        int i10 = iu0Var.d;
        if (l9Var.e != i10) {
            l9Var.e = i10;
            Drawable drawable = l9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                l9Var.invalidateSelf();
            }
        }
        int i11 = iu0Var.c | (-16777216);
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
        int i3 = tl_starsRating.level;
        l9 l9Var = this.a;
        if (l9Var.r != i3 || l9Var.c == null || l9Var.d == null) {
            l9Var.b.t(i3 >= 0 ? Integer.toString(i3) : "!", true, true);
            l9Var.r = i3;
            if (i3 < 0) {
                b10 = 18;
            } else {
                b10 = b8.be.b(i3 <= 10 ? i3 - 1 : (i3 / 10) + 8, 0, 17);
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

    public void setDelegate(ju0 ju0Var) {
        this.e = ju0Var;
    }

    public void setParentExpanded(float f10) {
        iu0 iu0Var = this.b;
        iu0Var.e = f10;
        iu0Var.a(iu0Var.a);
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
            iu0 iu0Var = this.b;
            iu0Var.a(iu0Var.a);
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
