package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class hx0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final x9 a;
    public final fx0 b;
    public final f6 c;
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
        f6 f6Var = new f6(new ex0(this, 0), 380L, bs.h);
        this.c = f6Var;
        x9 x9Var = new x9(context);
        this.a = x9Var;
        x9Var.setCallback(this);
        this.d = false;
        f6Var.d(0.0f, false);
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
        int A = org.telegram.messenger.sl.A(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(A, measuredHeight);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        x9 x9Var = this.a;
        x9Var.setBounds(0, 0, dp, dp2);
        fx0 fx0Var = this.b;
        int i10 = fx0Var.c;
        if (x9Var.f != i10) {
            x9Var.f = i10;
            if (x9Var.c != null) {
                x9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                x9Var.invalidateSelf();
            }
        }
        int i11 = fx0Var.d;
        if (x9Var.e != i11) {
            x9Var.e = i11;
            Drawable drawable = x9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                x9Var.invalidateSelf();
            }
        }
        int i12 = fx0Var.c | (-16777216);
        if (x9Var.h != i12) {
            x9Var.h = i12;
            x9Var.b.v(i12, false);
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
            x9Var.b.t(i10 >= 0 ? Integer.toString(i10) : "!", true, true);
            x9Var.r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                b10 = w7.r.b(i10 <= 10 ? i10 - 1 : (i10 / 10) + 8, 0, 17);
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
        org.telegram.ui.Cells.b1.o(R.string.AccDescrProfileRatingLevel, " ", sb2);
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

    public void setResourcesProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.b.b = g6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            fx0 fx0Var = this.b;
            fx0Var.a(fx0Var.a);
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
