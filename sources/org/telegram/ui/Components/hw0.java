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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class hw0 extends View {
    public final y9 a;
    public final fw0 b;
    public final e6 c;
    public boolean d;
    public gw0 e;
    public boolean f;
    public boolean h;

    public hw0(Context context) {
        super(context);
        fw0 fw0Var = new fw0();
        fw0Var.c = -16777216;
        fw0Var.d = -1;
        this.b = fw0Var;
        e6 e6Var = new e6(new ew0(this, 0), 380L, pr.h);
        this.c = e6Var;
        y9 y9Var = new y9(context);
        this.a = y9Var;
        y9Var.setCallback(this);
        this.d = false;
        e6Var.d(0.0f, false);
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
        int y3 = org.telegram.messenger.wl.y(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(y3, measuredHeight);
        canvas.scale(e7, e7, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        y9 y9Var = this.a;
        y9Var.setBounds(0, 0, dp, dp2);
        fw0 fw0Var = this.b;
        int i10 = fw0Var.c;
        if (y9Var.f != i10) {
            y9Var.f = i10;
            if (y9Var.c != null) {
                y9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                y9Var.invalidateSelf();
            }
        }
        int i11 = fw0Var.d;
        if (y9Var.e != i11) {
            y9Var.e = i11;
            Drawable drawable = y9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                y9Var.invalidateSelf();
            }
        }
        int i12 = fw0Var.c | (-16777216);
        if (y9Var.h != i12) {
            y9Var.h = i12;
            y9Var.b.s(i12, false);
            y9Var.invalidateSelf();
        }
        y9Var.draw(canvas);
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
        y9 y9Var = this.a;
        if (y9Var.r != i10 || y9Var.c == null || y9Var.d == null) {
            y9Var.b.q(i10 >= 0 ? Integer.toString(i10) : "!", true, true);
            y9Var.r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                b10 = w7.p.b(i10 <= 10 ? i10 - 1 : (i10 / 10) + 8, 0, 17);
            }
            Context context = y9Var.a;
            if (y9Var.n != b10 || y9Var.c == null || y9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(y9.s[i11]).mutate();
                y9Var.c = mutate;
                int i12 = y9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(y9.s[i11 + 1]).mutate();
                y9Var.d = mutate2;
                mutate2.setColorFilter(y9Var.f, mode);
                y9Var.n = b10;
                Drawable drawable = y9Var.c;
                if (drawable != null) {
                    drawable.setBounds(y9Var.getBounds());
                }
                Drawable drawable2 = y9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(y9Var.getBounds());
                }
            }
            y9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.wl.l(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(gw0 gw0Var) {
        this.e = gw0Var;
    }

    public void setParentExpanded(float f7) {
        fw0 fw0Var = this.b;
        fw0Var.e = f7;
        fw0Var.a(fw0Var.a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.b.b = f6Var;
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
