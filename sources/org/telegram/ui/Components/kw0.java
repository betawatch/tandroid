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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class kw0 extends View {
    public final q9 a;
    public final iw0 b;
    public final z5 c;
    public boolean d;
    public jw0 e;
    public boolean f;
    public boolean h;

    public kw0(Context context) {
        super(context);
        iw0 iw0Var = new iw0();
        iw0Var.c = -16777216;
        iw0Var.d = -1;
        this.b = iw0Var;
        z5 z5Var = new z5(new hw0(this, 0), 380L, pr.h);
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
        float e6 = this.c.e(this.d);
        int x10 = org.telegram.ui.b.x(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(x10, measuredHeight);
        canvas.scale(e6, e6, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        q9 q9Var = this.a;
        q9Var.setBounds(0, 0, dp, dp2);
        iw0 iw0Var = this.b;
        int i10 = iw0Var.c;
        if (q9Var.f != i10) {
            q9Var.f = i10;
            if (q9Var.c != null) {
                q9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                q9Var.invalidateSelf();
            }
        }
        int i11 = iw0Var.d;
        if (q9Var.e != i11) {
            q9Var.e = i11;
            Drawable drawable = q9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                q9Var.invalidateSelf();
            }
        }
        int i12 = iw0Var.c | (-16777216);
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
                b10 = k7.o.b(i10 <= 10 ? i10 - 1 : (i10 / 10) + 8, 0, 17);
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

    public void setDelegate(jw0 jw0Var) {
        this.e = jw0Var;
    }

    public void setParentExpanded(float f10) {
        iw0 iw0Var = this.b;
        iw0Var.e = f10;
        iw0Var.a(iw0Var.a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.b.b = g6Var;
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
