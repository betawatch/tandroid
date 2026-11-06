package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class lu0 extends View implements org.telegram.ui.ActionBar.a6 {
    public final m9 a;
    public final ju0 b;
    public final w5 c;
    public boolean d;
    public ku0 e;
    public boolean f;
    public boolean h;

    public lu0(Context context) {
        super(context);
        ju0 ju0Var = new ju0();
        ju0Var.c = -16777216;
        ju0Var.d = -1;
        this.b = ju0Var;
        w5 w5Var = new w5(new iu0(this, 0), 380L, xq.h);
        this.c = w5Var;
        m9 m9Var = new m9(context);
        this.a = m9Var;
        m9Var.setCallback(this);
        this.d = false;
        w5Var.e(false, 0.0f);
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
        m9 m9Var = this.a;
        m9Var.setBounds(0, 0, L, L2);
        ju0 ju0Var = this.b;
        int i7 = ju0Var.c;
        if (m9Var.f != i7) {
            m9Var.f = i7;
            if (m9Var.c != null) {
                m9Var.d.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
                m9Var.invalidateSelf();
            }
        }
        int i10 = ju0Var.d;
        if (m9Var.e != i10) {
            m9Var.e = i10;
            Drawable drawable = m9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                m9Var.invalidateSelf();
            }
        }
        int i11 = ju0Var.c | (-16777216);
        if (m9Var.h != i11) {
            m9Var.h = i11;
            m9Var.b.v(i11, false);
            m9Var.invalidateSelf();
        }
        m9Var.draw(canvas);
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
        m9 m9Var = this.a;
        if (m9Var.r != i7 || m9Var.c == null || m9Var.d == null) {
            m9Var.b.t(i7 >= 0 ? Integer.toString(i7) : "!", true, true);
            m9Var.r = i7;
            if (i7 < 0) {
                b10 = 18;
            } else {
                b10 = c8.j9.b(i7 <= 10 ? i7 - 1 : (i7 / 10) + 8, 0, 17);
            }
            Context context = m9Var.a;
            if (m9Var.n != b10 || m9Var.c == null || m9Var.d == null) {
                int i10 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(m9.s[i10]).mutate();
                m9Var.c = mutate;
                int i11 = m9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i11, mode);
                Drawable mutate2 = context.getResources().getDrawable(m9.s[i10 + 1]).mutate();
                m9Var.d = mutate2;
                mutate2.setColorFilter(m9Var.f, mode);
                m9Var.n = b10;
                Drawable drawable = m9Var.c;
                if (drawable != null) {
                    drawable.setBounds(m9Var.getBounds());
                }
                Drawable drawable2 = m9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(m9Var.getBounds());
                }
            }
            m9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.camera.q.q(null, 2131754797, sb2, " ");
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(ku0 ku0Var) {
        this.e = ku0Var;
    }

    public void setParentExpanded(float f10) {
        ju0 ju0Var = this.b;
        ju0Var.e = f10;
        ju0Var.a(ju0Var.a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.b.b = f6Var;
    }

    public void setVisibility(boolean z9) {
        this.h = z9;
        a();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            ju0 ju0Var = this.b;
            ju0Var.a(ju0Var.a);
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
