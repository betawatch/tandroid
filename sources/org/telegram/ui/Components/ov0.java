package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ov0 extends View implements org.telegram.ui.ActionBar.k6 {
    public final h9 a;
    public final mv0 b;
    public final t5 c;
    public boolean d;
    public nv0 e;
    public boolean f;
    public boolean h;

    public ov0(Context context) {
        super(context);
        mv0 mv0Var = new mv0();
        mv0Var.c = -16777216;
        mv0Var.d = -1;
        this.b = mv0Var;
        t5 t5Var = new t5(new lv0(this, 0), 380L, gr.h);
        this.c = t5Var;
        h9 h9Var = new h9(context);
        this.a = h9Var;
        h9Var.setCallback(this);
        this.d = false;
        t5Var.e(false, 0.0f);
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
        int y3 = org.telegram.messenger.a30.y(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.i0.L(24.0f)) / 2;
        canvas.save();
        canvas.translate(y3, measuredHeight);
        canvas.scale(d, d, 0.0f, org.telegram.messenger.i0.L(12.0f));
        int L = org.telegram.messenger.i0.L(24.0f);
        int L2 = org.telegram.messenger.i0.L(24.0f);
        h9 h9Var = this.a;
        h9Var.setBounds(0, 0, L, L2);
        mv0 mv0Var = this.b;
        int i10 = mv0Var.c;
        if (h9Var.f != i10) {
            h9Var.f = i10;
            if (h9Var.c != null) {
                h9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                h9Var.invalidateSelf();
            }
        }
        int i11 = mv0Var.d;
        if (h9Var.e != i11) {
            h9Var.e = i11;
            Drawable drawable = h9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                h9Var.invalidateSelf();
            }
        }
        int i12 = mv0Var.c | (-16777216);
        if (h9Var.h != i12) {
            h9Var.h = i12;
            h9Var.b.v(i12, false);
            h9Var.invalidateSelf();
        }
        h9Var.draw(canvas);
        canvas.restore();
    }

    public void set(TL_stars.Tl_starsRating tl_starsRating) {
        int b10;
        this.f = tl_starsRating != null;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i10 = tl_starsRating.level;
        h9 h9Var = this.a;
        if (h9Var.r != i10 || h9Var.c == null || h9Var.d == null) {
            h9Var.b.t(i10 >= 0 ? Integer.toString(i10) : "!", true, true);
            h9Var.r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                b10 = w7.u.b(i10 <= 10 ? i10 - 1 : (i10 / 10) + 8, 0, 17);
            }
            Context context = h9Var.a;
            if (h9Var.n != b10 || h9Var.c == null || h9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(h9.s[i11]).mutate();
                h9Var.c = mutate;
                int i12 = h9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(h9.s[i11 + 1]).mutate();
                h9Var.d = mutate2;
                mutate2.setColorFilter(h9Var.f, mode);
                h9Var.n = b10;
                Drawable drawable = h9Var.c;
                if (drawable != null) {
                    drawable.setBounds(h9Var.getBounds());
                }
                Drawable drawable2 = h9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(h9Var.getBounds());
                }
            }
            h9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.a30.q(null, 2131754797, sb2, " ");
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(nv0 nv0Var) {
        this.e = nv0Var;
    }

    public void setParentExpanded(float f7) {
        mv0 mv0Var = this.b;
        mv0Var.e = f7;
        mv0Var.a(mv0Var.a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.b.b = p6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            mv0 mv0Var = this.b;
            mv0Var.a(mv0Var.a);
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
