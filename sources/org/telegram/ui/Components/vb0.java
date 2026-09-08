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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class vb0 extends View {
    public final p6 a;
    public final rb0 b;
    public boolean c;
    public boolean d;
    public final String e;
    public final String f;
    public final int h;

    public vb0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.c = true;
        this.e = str;
        this.f = str2;
        setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 2, -1));
        p6 p6Var = new p6(true, true, true, false);
        this.a = p6Var;
        p6Var.k(0.35f, 300L, pr.h);
        p6Var.t(AndroidUtilities.dp(16.0f));
        p6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        p6Var.setCallback(this);
        p6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            p6Var.b = 5;
        }
        float dp = AndroidUtilities.dp(77.0f);
        TextPaint textPaint = p6Var.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + dp);
        this.h = max;
        p6Var.G = max;
        rb0 rb0Var = new rb0(0);
        xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        rb0Var.c = xi0Var;
        xi0Var.v0 = this;
        xi0Var.H(true);
        xi0Var.h = true;
        xi0Var.I(0);
        xi0 xi0Var2 = new xi0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        rb0Var.d = xi0Var2;
        xi0Var2.v0 = this;
        xi0Var2.H(true);
        xi0Var2.h = true;
        xi0Var2.I(0);
        rb0Var.e = xi0Var;
        this.b = rb0Var;
        rb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        if (this.c || z10 != this.d) {
            this.d = z10;
            String str = z10 ? this.e : this.f;
            boolean z12 = z11 && !LocaleController.isRTL;
            p6 p6Var = this.a;
            p6Var.q(str, z12, true);
            rb0 rb0Var = this.b;
            xi0 xi0Var = (xi0) rb0Var.d;
            xi0 xi0Var2 = (xi0) rb0Var.c;
            rb0Var.b = z10;
            if (z11) {
                rb0Var.e = z10 ? xi0Var2 : xi0Var;
                xi0Var2.K(0);
                xi0Var.K(0);
                ((xi0) rb0Var.e).start();
            } else {
                if (z10) {
                    xi0Var = xi0Var2;
                }
                rb0Var.e = xi0Var;
                xi0Var.K(xi0Var.e[0] - 1);
            }
            this.c = false;
            setContentDescription(p6Var.g);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        p6 p6Var = this.a;
        rb0 rb0Var = this.b;
        if (z10) {
            rb0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.wl.y(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            p6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            rb0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.wl.y(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            p6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        p6Var.draw(canvas);
        rb0Var.draw(canvas);
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
