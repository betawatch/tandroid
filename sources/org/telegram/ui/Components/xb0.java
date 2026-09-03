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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xb0 extends View {
    public final j6 a;
    public final tb0 b;
    public boolean c;
    public boolean d;
    public final String e;
    public final String f;
    public final int h;

    public xb0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.c = true;
        this.e = str;
        this.f = str2;
        setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, g6Var), 2, -1));
        j6 j6Var = new j6(true, true, true, false);
        this.a = j6Var;
        j6Var.k(0.35f, 300L, pr.h);
        j6Var.t(AndroidUtilities.dp(16.0f));
        j6Var.r(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, g6Var));
        j6Var.setCallback(this);
        j6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            j6Var.b = 5;
        }
        float dp = AndroidUtilities.dp(77.0f);
        TextPaint textPaint = j6Var.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + dp);
        this.h = max;
        j6Var.G = max;
        tb0 tb0Var = new tb0(0);
        hj0 hj0Var = new hj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        tb0Var.c = hj0Var;
        hj0Var.s0 = this;
        hj0Var.H(true);
        hj0Var.h = true;
        hj0Var.I(0);
        hj0 hj0Var2 = new hj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        tb0Var.d = hj0Var2;
        hj0Var2.s0 = this;
        hj0Var2.H(true);
        hj0Var2.h = true;
        hj0Var2.I(0);
        tb0Var.e = hj0Var;
        this.b = tb0Var;
        tb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.F8, g6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z4, boolean z10) {
        if (this.c || z4 != this.d) {
            this.d = z4;
            String str = z4 ? this.e : this.f;
            boolean z11 = z10 && !LocaleController.isRTL;
            j6 j6Var = this.a;
            j6Var.q(str, z11, true);
            tb0 tb0Var = this.b;
            hj0 hj0Var = (hj0) tb0Var.d;
            hj0 hj0Var2 = (hj0) tb0Var.c;
            tb0Var.b = z4;
            if (z10) {
                tb0Var.e = z4 ? hj0Var2 : hj0Var;
                hj0Var2.K(0);
                hj0Var.K(0);
                ((hj0) tb0Var.e).start();
            } else {
                if (z4) {
                    hj0Var = hj0Var2;
                }
                tb0Var.e = hj0Var;
                hj0Var.K(hj0Var.e[0] - 1);
            }
            this.c = false;
            setContentDescription(j6Var.g);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z4 = LocaleController.isRTL;
        j6 j6Var = this.a;
        tb0 tb0Var = this.b;
        if (z4) {
            tb0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.ui.b.x(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            j6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            tb0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.ui.b.x(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            j6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        j6Var.draw(canvas);
        tb0Var.draw(canvas);
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
