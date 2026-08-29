package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qb0 extends View {
    public final n6 a;
    public final mb0 b;
    public boolean c;
    public boolean d;
    public final String e;
    public final String f;
    public final int h;

    public qb0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.c = true;
        this.e = str;
        this.f = str2;
        setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 2, -1));
        n6 n6Var = new n6(true, true, true, false);
        this.a = n6Var;
        n6Var.k(0.35f, 300L, jr.h);
        n6Var.t(AndroidUtilities.dp(16.0f));
        n6Var.r(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var));
        n6Var.setCallback(this);
        n6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            n6Var.b = 5;
        }
        float dp = AndroidUtilities.dp(77.0f);
        TextPaint textPaint = n6Var.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + dp);
        this.h = max;
        n6Var.G = max;
        mb0 mb0Var = new mb0(0);
        xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(24.0f), j7.l1.k(i10, ""), AndroidUtilities.dp(24.0f));
        mb0Var.c = xi0Var;
        xi0Var.r0 = this;
        xi0Var.H(true);
        xi0Var.h = true;
        xi0Var.I(0);
        xi0 xi0Var2 = new xi0(i11, AndroidUtilities.dp(24.0f), j7.l1.k(i11, ""), AndroidUtilities.dp(24.0f));
        mb0Var.d = xi0Var2;
        xi0Var2.r0 = this;
        xi0Var2.H(true);
        xi0Var2.h = true;
        xi0Var2.I(0);
        mb0Var.e = xi0Var;
        this.b = mb0Var;
        mb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        if (this.c || z10 != this.d) {
            this.d = z10;
            String str = z10 ? this.e : this.f;
            boolean z12 = z11 && !LocaleController.isRTL;
            n6 n6Var = this.a;
            n6Var.q(str, z12, true);
            mb0 mb0Var = this.b;
            xi0 xi0Var = (xi0) mb0Var.d;
            xi0 xi0Var2 = (xi0) mb0Var.c;
            mb0Var.b = z10;
            if (z11) {
                mb0Var.e = z10 ? xi0Var2 : xi0Var;
                xi0Var2.K(0);
                xi0Var.K(0);
                ((xi0) mb0Var.e).start();
            } else {
                if (z10) {
                    xi0Var = xi0Var2;
                }
                mb0Var.e = xi0Var;
                xi0Var.K(xi0Var.e[0] - 1);
            }
            this.c = false;
            setContentDescription(n6Var.g);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        n6 n6Var = this.a;
        mb0 mb0Var = this.b;
        if (z10) {
            mb0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.ui.b.x(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            n6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            mb0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.ui.b.x(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            n6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        n6Var.draw(canvas);
        mb0Var.draw(canvas);
    }

    public boolean getState() {
        return this.d;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.h;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(mode == 1073741824 ? Math.max(View.MeasureSpec.getSize(i10), i12) : Math.min(View.MeasureSpec.getSize(i10), i12), mode), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getVisibility() != 0 || getAlpha() < 0.5f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
