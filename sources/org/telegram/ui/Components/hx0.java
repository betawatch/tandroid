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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class hx0 extends View {
    public final aa a;
    public final fx0 b;
    public final g6 c;
    public boolean d;
    public gx0 e;
    public boolean f;
    public boolean h;

    public hx0(Context context) {
        super(context);
        fx0 fx0Var = new fx0();
        fx0Var.c = -16777216;
        fx0Var.d = -1;
        this.b = fx0Var;
        g6 g6Var = new g6(new ex0(this, 0), 380L, es.h);
        this.c = g6Var;
        aa aaVar = new aa(context);
        this.a = aaVar;
        aaVar.setCallback(this);
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
        float e = this.c.e(this.d);
        int A = org.telegram.messenger.sk.A(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(A, measuredHeight);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        aa aaVar = this.a;
        aaVar.setBounds(0, 0, dp, dp2);
        fx0 fx0Var = this.b;
        int i10 = fx0Var.c;
        if (aaVar.f != i10) {
            aaVar.f = i10;
            if (aaVar.c != null) {
                aaVar.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                aaVar.invalidateSelf();
            }
        }
        int i11 = fx0Var.d;
        if (aaVar.e != i11) {
            aaVar.e = i11;
            Drawable drawable = aaVar.c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                aaVar.invalidateSelf();
            }
        }
        int i12 = fx0Var.c | (-16777216);
        if (aaVar.h != i12) {
            aaVar.h = i12;
            aaVar.b.v(i12, false);
            aaVar.invalidateSelf();
        }
        aaVar.draw(canvas);
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
        aa aaVar = this.a;
        if (aaVar.r != i10 || aaVar.c == null || aaVar.d == null) {
            aaVar.b.t(i10 >= 0 ? Integer.toString(i10) : "!", true, true);
            aaVar.r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                b10 = w7.r.b(i10 <= 10 ? i10 - 1 : (i10 / 10) + 8, 0, 17);
            }
            Context context = aaVar.a;
            if (aaVar.n != b10 || aaVar.c == null || aaVar.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(aa.s[i11]).mutate();
                aaVar.c = mutate;
                int i12 = aaVar.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(aa.s[i11 + 1]).mutate();
                aaVar.d = mutate2;
                mutate2.setColorFilter(aaVar.f, mode);
                aaVar.n = b10;
                Drawable drawable = aaVar.c;
                if (drawable != null) {
                    drawable.setBounds(aaVar.getBounds());
                }
                Drawable drawable2 = aaVar.d;
                if (drawable2 != null) {
                    drawable2.setBounds(aaVar.getBounds());
                }
            }
            aaVar.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.c1.l(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(gx0 gx0Var) {
        this.e = gx0Var;
    }

    public void setParentExpanded(float f7) {
        fx0 fx0Var = this.b;
        fx0Var.e = f7;
        fx0Var.a(fx0Var.a);
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
