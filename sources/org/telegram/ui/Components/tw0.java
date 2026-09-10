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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tw0 extends View {
    public final x9 a;
    public final rw0 b;
    public final d6 c;
    public boolean d;
    public sw0 e;
    public boolean f;
    public boolean h;

    public tw0(Context context) {
        super(context);
        rw0 rw0Var = new rw0();
        rw0Var.c = -16777216;
        rw0Var.d = -1;
        this.b = rw0Var;
        d6 d6Var = new d6(new qw0(this, 0), 380L, wr.h);
        this.c = d6Var;
        x9 x9Var = new x9(context);
        this.a = x9Var;
        x9Var.setCallback(this);
        this.d = false;
        d6Var.d(0.0f, false);
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
        int y3 = org.telegram.messenger.em.y(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(y3, measuredHeight);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        x9 x9Var = this.a;
        x9Var.setBounds(0, 0, dp, dp2);
        rw0 rw0Var = this.b;
        int i10 = rw0Var.c;
        if (x9Var.f != i10) {
            x9Var.f = i10;
            if (x9Var.c != null) {
                x9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                x9Var.invalidateSelf();
            }
        }
        int i11 = rw0Var.d;
        if (x9Var.e != i11) {
            x9Var.e = i11;
            Drawable drawable = x9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                x9Var.invalidateSelf();
            }
        }
        int i12 = rw0Var.c | (-16777216);
        if (x9Var.h != i12) {
            x9Var.h = i12;
            x9Var.b.s(i12, false);
            x9Var.invalidateSelf();
        }
        x9Var.draw(canvas);
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
        x9 x9Var = this.a;
        if (x9Var.r != i10 || x9Var.c == null || x9Var.d == null) {
            x9Var.b.q(i10 >= 0 ? Integer.toString(i10) : "!", true, true);
            x9Var.r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                b10 = w7.q.b(i10 <= 10 ? i10 - 1 : (i10 / 10) + 8, 0, 17);
            }
            Context context = x9Var.a;
            if (x9Var.n != b10 || x9Var.c == null || x9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(x9.s[i11]).mutate();
                x9Var.c = mutate;
                int i12 = x9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(x9.s[i11 + 1]).mutate();
                x9Var.d = mutate2;
                mutate2.setColorFilter(x9Var.f, mode);
                x9Var.n = b10;
                Drawable drawable = x9Var.c;
                if (drawable != null) {
                    drawable.setBounds(x9Var.getBounds());
                }
                Drawable drawable2 = x9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(x9Var.getBounds());
                }
            }
            x9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.em.l(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(sw0 sw0Var) {
        this.e = sw0Var;
    }

    public void setParentExpanded(float f7) {
        rw0 rw0Var = this.b;
        rw0Var.e = f7;
        rw0Var.a(rw0Var.a);
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
