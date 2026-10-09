package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lx0 extends View {
    public final z9 a;
    public final jx0 b;
    public final g6 c;
    public boolean d;
    public kx0 e;
    public boolean f;
    public boolean h;

    public lx0(Context context) {
        super(context);
        jx0 jx0Var = new jx0();
        jx0Var.c = -16777216;
        jx0Var.d = -1;
        this.b = jx0Var;
        g6 g6Var = new g6(new ix0(this, 0), 380L, hs.h);
        this.c = g6Var;
        z9 z9Var = new z9(context);
        this.a = z9Var;
        z9Var.setCallback(this);
        this.d = false;
        g6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10 = this.h && this.f;
        this.d = z10;
        this.c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.b.a(peerColor);
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
        float e7 = this.c.e(this.d);
        int A = org.telegram.messenger.bi.A(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(A, measuredHeight);
        canvas.scale(e7, e7, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        z9 z9Var = this.a;
        z9Var.setBounds(0, 0, dp, dp2);
        jx0 jx0Var = this.b;
        int i10 = jx0Var.c;
        if (z9Var.f != i10) {
            z9Var.f = i10;
            if (z9Var.c != null) {
                z9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                z9Var.invalidateSelf();
            }
        }
        int i11 = jx0Var.d;
        if (z9Var.e != i11) {
            z9Var.e = i11;
            Drawable drawable = z9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                z9Var.invalidateSelf();
            }
        }
        int i12 = jx0Var.c | (-16777216);
        if (z9Var.h != i12) {
            z9Var.h = i12;
            z9Var.b.v(i12, false);
            z9Var.invalidateSelf();
        }
        z9Var.draw(canvas);
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
        z9 z9Var = this.a;
        if (z9Var.r != i10 || z9Var.c == null || z9Var.d == null) {
            z9Var.b.t(i10 >= 0 ? Integer.toString(i10) : "!", true, true);
            z9Var.r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                b10 = w7.o.b(i10 <= 10 ? i10 - 1 : (i10 / 10) + 8, 0, 17);
            }
            Context context = z9Var.a;
            if (z9Var.n != b10 || z9Var.c == null || z9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(z9.s[i11]).mutate();
                z9Var.c = mutate;
                int i12 = z9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(z9.s[i11 + 1]).mutate();
                z9Var.d = mutate2;
                mutate2.setColorFilter(z9Var.f, mode);
                z9Var.n = b10;
                Drawable drawable = z9Var.c;
                if (drawable != null) {
                    drawable.setBounds(z9Var.getBounds());
                }
                Drawable drawable2 = z9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(z9Var.getBounds());
                }
            }
            z9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.c1.l(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(kx0 kx0Var) {
        this.e = kx0Var;
    }

    public void setParentExpanded(float f7) {
        jx0 jx0Var = this.b;
        jx0Var.e = f7;
        jx0Var.a(jx0Var.a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.b.b = e6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }
}
