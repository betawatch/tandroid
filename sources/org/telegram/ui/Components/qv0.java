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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qv0 extends View {
    public final p9 a;
    public final ov0 b;
    public final y5 c;
    public boolean d;
    public pv0 e;
    public boolean f;
    public boolean h;

    public qv0(Context context) {
        super(context);
        ov0 ov0Var = new ov0();
        ov0Var.c = -16777216;
        ov0Var.d = -1;
        this.b = ov0Var;
        y5 y5Var = new y5(new nv0(this, 0), 380L, gr.h);
        this.c = y5Var;
        p9 p9Var = new p9(context);
        this.a = p9Var;
        p9Var.setCallback(this);
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
        float e10 = this.c.e(this.d);
        int y10 = org.telegram.messenger.ll.y(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(y10, measuredHeight);
        canvas.scale(e10, e10, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        p9 p9Var = this.a;
        p9Var.setBounds(0, 0, dp, dp2);
        ov0 ov0Var = this.b;
        int i9 = ov0Var.c;
        if (p9Var.f != i9) {
            p9Var.f = i9;
            if (p9Var.c != null) {
                p9Var.d.setColorFilter(i9, PorterDuff.Mode.MULTIPLY);
                p9Var.invalidateSelf();
            }
        }
        int i10 = ov0Var.d;
        if (p9Var.e != i10) {
            p9Var.e = i10;
            Drawable drawable = p9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                p9Var.invalidateSelf();
            }
        }
        int i11 = ov0Var.c | (-16777216);
        if (p9Var.h != i11) {
            p9Var.h = i11;
            p9Var.b.s(i11, false);
            p9Var.invalidateSelf();
        }
        p9Var.draw(canvas);
        canvas.restore();
    }

    public void set(TL_stars.Tl_starsRating tl_starsRating) {
        int b10;
        this.f = tl_starsRating != null;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i9 = tl_starsRating.level;
        p9 p9Var = this.a;
        if (p9Var.r != i9 || p9Var.c == null || p9Var.d == null) {
            p9Var.b.q(i9 >= 0 ? Integer.toString(i9) : "!", true, true);
            p9Var.r = i9;
            if (i9 < 0) {
                b10 = 18;
            } else {
                b10 = g7.n.b(i9 <= 10 ? i9 - 1 : (i9 / 10) + 8, 0, 17);
            }
            Context context = p9Var.a;
            if (p9Var.n != b10 || p9Var.c == null || p9Var.d == null) {
                int i10 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(p9.s[i10]).mutate();
                p9Var.c = mutate;
                int i11 = p9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i11, mode);
                Drawable mutate2 = context.getResources().getDrawable(p9.s[i10 + 1]).mutate();
                p9Var.d = mutate2;
                mutate2.setColorFilter(p9Var.f, mode);
                p9Var.n = b10;
                Drawable drawable = p9Var.c;
                if (drawable != null) {
                    drawable.setBounds(p9Var.getBounds());
                }
                Drawable drawable2 = p9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(p9Var.getBounds());
                }
            }
            p9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.j2.k(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(pv0 pv0Var) {
        this.e = pv0Var;
    }

    public void setParentExpanded(float f10) {
        ov0 ov0Var = this.b;
        ov0Var.e = f10;
        ov0Var.a(ov0Var.a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.b6 b6Var) {
        this.b.b = b6Var;
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
