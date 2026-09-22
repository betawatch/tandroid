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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class iw0 extends View {
    public final v9 a;
    public final gw0 b;
    public final c6 c;
    public boolean d;
    public hw0 e;
    public boolean f;
    public boolean h;

    public iw0(Context context) {
        super(context);
        gw0 gw0Var = new gw0();
        gw0Var.c = -16777216;
        gw0Var.d = -1;
        this.b = gw0Var;
        c6 c6Var = new c6(new fw0(this, 0), 380L, qr.h);
        this.c = c6Var;
        v9 v9Var = new v9(context);
        this.a = v9Var;
        v9Var.setCallback(this);
        this.d = false;
        c6Var.d(0.0f, false);
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
        float e = this.c.e(this.d);
        int y3 = org.telegram.messenger.vl.y(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(y3, measuredHeight);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        v9 v9Var = this.a;
        v9Var.setBounds(0, 0, dp, dp2);
        gw0 gw0Var = this.b;
        int i10 = gw0Var.c;
        if (v9Var.f != i10) {
            v9Var.f = i10;
            if (v9Var.c != null) {
                v9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                v9Var.invalidateSelf();
            }
        }
        int i11 = gw0Var.d;
        if (v9Var.e != i11) {
            v9Var.e = i11;
            Drawable drawable = v9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                v9Var.invalidateSelf();
            }
        }
        int i12 = gw0Var.c | (-16777216);
        if (v9Var.h != i12) {
            v9Var.h = i12;
            v9Var.b.s(i12, false);
            v9Var.invalidateSelf();
        }
        v9Var.draw(canvas);
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
        v9 v9Var = this.a;
        if (v9Var.r != i10 || v9Var.c == null || v9Var.d == null) {
            v9Var.b.q(i10 >= 0 ? Integer.toString(i10) : "!", true, true);
            v9Var.r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                b10 = w7.p.b(i10 <= 10 ? i10 - 1 : (i10 / 10) + 8, 0, 17);
            }
            Context context = v9Var.a;
            if (v9Var.n != b10 || v9Var.c == null || v9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(v9.s[i11]).mutate();
                v9Var.c = mutate;
                int i12 = v9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(v9.s[i11 + 1]).mutate();
                v9Var.d = mutate2;
                mutate2.setColorFilter(v9Var.f, mode);
                v9Var.n = b10;
                Drawable drawable = v9Var.c;
                if (drawable != null) {
                    drawable.setBounds(v9Var.getBounds());
                }
                Drawable drawable2 = v9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(v9Var.getBounds());
                }
            }
            v9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.vl.m(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(hw0 hw0Var) {
        this.e = hw0Var;
    }

    public void setParentExpanded(float f7) {
        gw0 gw0Var = this.b;
        gw0Var.e = f7;
        gw0Var.a(gw0Var.a);
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
