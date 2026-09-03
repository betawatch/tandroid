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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jw0 extends View {
    public final q9 a;
    public final hw0 b;
    public final z5 c;
    public boolean d;
    public iw0 e;
    public boolean f;
    public boolean h;

    public jw0(Context context) {
        super(context);
        hw0 hw0Var = new hw0();
        hw0Var.c = -16777216;
        hw0Var.d = -1;
        this.b = hw0Var;
        z5 z5Var = new z5(new gw0(this, 0), 380L, mr.h);
        this.c = z5Var;
        q9 q9Var = new q9(context);
        this.a = q9Var;
        q9Var.setCallback(this);
        this.d = false;
        z5Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z4 = this.h && this.f;
        this.d = z4;
        this.c.e(z4);
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
        int x10 = org.telegram.ui.b.x(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(x10, measuredHeight);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        q9 q9Var = this.a;
        q9Var.setBounds(0, 0, dp, dp2);
        hw0 hw0Var = this.b;
        int i10 = hw0Var.c;
        if (q9Var.f != i10) {
            q9Var.f = i10;
            if (q9Var.c != null) {
                q9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                q9Var.invalidateSelf();
            }
        }
        int i11 = hw0Var.d;
        if (q9Var.e != i11) {
            q9Var.e = i11;
            Drawable drawable = q9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                q9Var.invalidateSelf();
            }
        }
        int i12 = hw0Var.c | (-16777216);
        if (q9Var.h != i12) {
            q9Var.h = i12;
            q9Var.b.s(i12, false);
            q9Var.invalidateSelf();
        }
        q9Var.draw(canvas);
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
        q9 q9Var = this.a;
        if (q9Var.r != i10 || q9Var.c == null || q9Var.d == null) {
            q9Var.b.q(i10 >= 0 ? Integer.toString(i10) : "!", true, true);
            q9Var.r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                b10 = k7.n.b(i10 <= 10 ? i10 - 1 : (i10 / 10) + 8, 0, 17);
            }
            Context context = q9Var.a;
            if (q9Var.n != b10 || q9Var.c == null || q9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(q9.s[i11]).mutate();
                q9Var.c = mutate;
                int i12 = q9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(q9.s[i11 + 1]).mutate();
                q9Var.d = mutate2;
                mutate2.setColorFilter(q9Var.f, mode);
                q9Var.n = b10;
                Drawable drawable = q9Var.c;
                if (drawable != null) {
                    drawable.setBounds(q9Var.getBounds());
                }
                Drawable drawable2 = q9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(q9Var.getBounds());
                }
            }
            q9Var.invalidateSelf();
        }
        StringBuilder sb = new StringBuilder();
        org.telegram.ui.b.i(R.string.AccDescrProfileRatingLevel, " ", sb);
        sb.append(tl_starsRating.level);
        setContentDescription(sb.toString());
        invalidate();
    }

    public void setDelegate(iw0 iw0Var) {
        this.e = iw0Var;
    }

    public void setParentExpanded(float f10) {
        hw0 hw0Var = this.b;
        hw0Var.e = f10;
        hw0Var.a(hw0Var.a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.b.b = f6Var;
    }

    public void setVisibility(boolean z4) {
        this.h = z4;
        a();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }
}
