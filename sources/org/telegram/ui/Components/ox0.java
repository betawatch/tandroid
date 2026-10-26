package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ox0 extends View implements org.telegram.ui.ActionBar.p6 {
    public final z9 a;
    public final mx0 b;
    public final h6 c;
    public boolean d;
    public nx0 e;
    public boolean f;
    public boolean h;

    public ox0(Context context) {
        super(context);
        mx0 mx0Var = new mx0();
        mx0Var.c = -16777216;
        mx0Var.d = -1;
        this.b = mx0Var;
        h6 h6Var = new h6(new lx0(this, 0), 380L, ds.h);
        this.c = h6Var;
        z9 z9Var = new z9(context);
        this.a = z9Var;
        z9Var.setCallback(this);
        this.d = false;
        h6Var.d(0.0f, false);
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
        int B = org.telegram.messenger.vh.B(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(B, measuredHeight);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        z9 z9Var = this.a;
        z9Var.setBounds(0, 0, dp, dp2);
        mx0 mx0Var = this.b;
        int i10 = mx0Var.c;
        if (z9Var.f != i10) {
            z9Var.f = i10;
            if (z9Var.c != null) {
                z9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                z9Var.invalidateSelf();
            }
        }
        int i11 = mx0Var.d;
        if (z9Var.e != i11) {
            z9Var.e = i11;
            Drawable drawable = z9Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                z9Var.invalidateSelf();
            }
        }
        int i12 = mx0Var.c | (-16777216);
        if (z9Var.h != i12) {
            z9Var.h = i12;
            z9Var.b.v(i12, false);
            z9Var.invalidateSelf();
        }
        z9Var.draw(canvas);
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
        z9 z9Var = this.a;
        if (z9Var.r != i10 || z9Var.c == null || z9Var.d == null) {
            z9Var.b.t(i10 >= 0 ? Integer.toString(i10) : "!", true, true);
            z9Var.r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                b10 = a8.ee.b(i10 <= 10 ? i10 - 1 : (i10 / 10) + 8, 0, 17);
            }
            Context context = z9Var.a;
            if (z9Var.n != b10 || z9Var.c == null || z9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(z9.s[i11]).mutate();
                z9Var.c = mutate;
                int i12 = z9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(z9.s[i11 + 1]).mutate();
                z9Var.d = mutate2;
                mutate2.setColorFilter(z9Var.f, mode);
                z9Var.n = b10;
                Drawable drawable = z9Var.c;
                if (drawable != null) {
                    drawable.setBounds(z9Var.getBounds());
                }
                Drawable drawable2 = z9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(z9Var.getBounds());
                }
            }
            z9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.d3.p(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(nx0 nx0Var) {
        this.e = nx0Var;
    }

    public void setParentExpanded(float f7) {
        mx0 mx0Var = this.b;
        mx0Var.e = f7;
        mx0Var.a(mx0Var.a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.u6 u6Var) {
        this.b.b = u6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            mx0 mx0Var = this.b;
            mx0Var.a(mx0Var.a);
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
