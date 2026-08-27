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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sv0 extends View {
    public final o9 a;
    public final qv0 b;
    public final y5 c;
    public boolean d;
    public rv0 e;
    public boolean f;
    public boolean h;

    public sv0(Context context) {
        super(context);
        qv0 qv0Var = new qv0();
        qv0Var.c = -16777216;
        qv0Var.d = -1;
        this.b = qv0Var;
        y5 y5Var = new y5(new pv0(this, 0), 380L, er.h);
        this.c = y5Var;
        o9 o9Var = new o9(context);
        this.a = o9Var;
        o9Var.setCallback(this);
        this.d = false;
        y5Var.d(0.0f, false);
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
        float e9 = this.c.e(this.d);
        int x8 = org.telegram.messenger.rl.x(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(x8, measuredHeight);
        canvas.scale(e9, e9, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        o9 o9Var = this.a;
        o9Var.setBounds(0, 0, dp, dp2);
        qv0 qv0Var = this.b;
        int i10 = qv0Var.c;
        if (o9Var.f != i10) {
            o9Var.f = i10;
            if (o9Var.c != null) {
                o9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                o9Var.invalidateSelf();
            }
        }
        int i11 = qv0Var.d;
        if (o9Var.e != i11) {
            o9Var.e = i11;
            Drawable drawable = o9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                o9Var.invalidateSelf();
            }
        }
        int i12 = qv0Var.c | (-16777216);
        if (o9Var.h != i12) {
            o9Var.h = i12;
            o9Var.b.s(i12, false);
            o9Var.invalidateSelf();
        }
        o9Var.draw(canvas);
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
        o9 o9Var = this.a;
        if (o9Var.r != i10 || o9Var.c == null || o9Var.d == null) {
            o9Var.b.q(i10 >= 0 ? Integer.toString(i10) : "!", true, true);
            o9Var.r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                b10 = h7.n.b(i10 <= 10 ? i10 - 1 : (i10 / 10) + 8, 0, 17);
            }
            Context context = o9Var.a;
            if (o9Var.n != b10 || o9Var.c == null || o9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(o9.s[i11]).mutate();
                o9Var.c = mutate;
                int i12 = o9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(o9.s[i11 + 1]).mutate();
                o9Var.d = mutate2;
                mutate2.setColorFilter(o9Var.f, mode);
                o9Var.n = b10;
                Drawable drawable = o9Var.c;
                if (drawable != null) {
                    drawable.setBounds(o9Var.getBounds());
                }
                Drawable drawable2 = o9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(o9Var.getBounds());
                }
            }
            o9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.rl.j(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(rv0 rv0Var) {
        this.e = rv0Var;
    }

    public void setParentExpanded(float f10) {
        qv0 qv0Var = this.b;
        qv0Var.e = f10;
        qv0Var.a(qv0Var.a);
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
