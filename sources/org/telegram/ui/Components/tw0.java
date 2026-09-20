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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class tw0 extends View {
    public final w9 a;
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
        d6 d6Var = new d6(new qw0(this, 0), 380L, qr.h);
        this.c = d6Var;
        w9 w9Var = new w9(context);
        this.a = w9Var;
        w9Var.setCallback(this);
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
        int z10 = org.telegram.messenger.rk.z(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(z10, measuredHeight);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        w9 w9Var = this.a;
        w9Var.setBounds(0, 0, dp, dp2);
        rw0 rw0Var = this.b;
        int i10 = rw0Var.c;
        if (w9Var.f != i10) {
            w9Var.f = i10;
            if (w9Var.c != null) {
                w9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                w9Var.invalidateSelf();
            }
        }
        int i11 = rw0Var.d;
        if (w9Var.e != i11) {
            w9Var.e = i11;
            Drawable drawable = w9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                w9Var.invalidateSelf();
            }
        }
        int i12 = rw0Var.c | (-16777216);
        if (w9Var.h != i12) {
            w9Var.h = i12;
            w9Var.b.s(i12, false);
            w9Var.invalidateSelf();
        }
        w9Var.draw(canvas);
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
        w9 w9Var = this.a;
        if (w9Var.r != i10 || w9Var.c == null || w9Var.d == null) {
            w9Var.b.q(i10 >= 0 ? Integer.toString(i10) : "!", true, true);
            w9Var.r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                b10 = w7.q.b(i10 <= 10 ? i10 - 1 : (i10 / 10) + 8, 0, 17);
            }
            Context context = w9Var.a;
            if (w9Var.n != b10 || w9Var.c == null || w9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(w9.s[i11]).mutate();
                w9Var.c = mutate;
                int i12 = w9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(w9.s[i11 + 1]).mutate();
                w9Var.d = mutate2;
                mutate2.setColorFilter(w9Var.f, mode);
                w9Var.n = b10;
                Drawable drawable = w9Var.c;
                if (drawable != null) {
                    drawable.setBounds(w9Var.getBounds());
                }
                Drawable drawable2 = w9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(w9Var.getBounds());
                }
            }
            w9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.c1.o(R.string.AccDescrProfileRatingLevel, " ", sb2);
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
