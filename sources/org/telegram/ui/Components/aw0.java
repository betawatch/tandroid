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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class aw0 extends View {
    public final u9 a;
    public final yv0 b;
    public final d6 c;
    public boolean d;
    public zv0 e;
    public boolean f;
    public boolean h;

    public aw0(Context context) {
        super(context);
        yv0 yv0Var = new yv0();
        yv0Var.c = -16777216;
        yv0Var.d = -1;
        this.b = yv0Var;
        d6 d6Var = new d6(new xv0(this, 0), 380L, jr.h);
        this.c = d6Var;
        u9 u9Var = new u9(context);
        this.a = u9Var;
        u9Var.setCallback(this);
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
        float e10 = this.c.e(this.d);
        int x4 = org.telegram.ui.b.x(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(x4, measuredHeight);
        canvas.scale(e10, e10, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        u9 u9Var = this.a;
        u9Var.setBounds(0, 0, dp, dp2);
        yv0 yv0Var = this.b;
        int i10 = yv0Var.c;
        if (u9Var.f != i10) {
            u9Var.f = i10;
            if (u9Var.c != null) {
                u9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                u9Var.invalidateSelf();
            }
        }
        int i11 = yv0Var.d;
        if (u9Var.e != i11) {
            u9Var.e = i11;
            Drawable drawable = u9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                u9Var.invalidateSelf();
            }
        }
        int i12 = yv0Var.c | (-16777216);
        if (u9Var.h != i12) {
            u9Var.h = i12;
            u9Var.b.s(i12, false);
            u9Var.invalidateSelf();
        }
        u9Var.draw(canvas);
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
        u9 u9Var = this.a;
        if (u9Var.r != i10 || u9Var.c == null || u9Var.d == null) {
            u9Var.b.q(i10 >= 0 ? Integer.toString(i10) : "!", true, true);
            u9Var.r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                b10 = i7.w.b(i10 <= 10 ? i10 - 1 : (i10 / 10) + 8, 0, 17);
            }
            Context context = u9Var.a;
            if (u9Var.n != b10 || u9Var.c == null || u9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(u9.s[i11]).mutate();
                u9Var.c = mutate;
                int i12 = u9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(u9.s[i11 + 1]).mutate();
                u9Var.d = mutate2;
                mutate2.setColorFilter(u9Var.f, mode);
                u9Var.n = b10;
                Drawable drawable = u9Var.c;
                if (drawable != null) {
                    drawable.setBounds(u9Var.getBounds());
                }
                Drawable drawable2 = u9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(u9Var.getBounds());
                }
            }
            u9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.b.j(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(zv0 zv0Var) {
        this.e = zv0Var;
    }

    public void setParentExpanded(float f9) {
        yv0 yv0Var = this.b;
        yv0Var.e = f9;
        yv0Var.a(yv0Var.a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.b.b = c6Var;
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
