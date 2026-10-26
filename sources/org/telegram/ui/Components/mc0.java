package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mc0 extends View implements org.telegram.ui.ActionBar.p6 {
    public final r6 a;
    public final org.telegram.ui.ActionBar.u6 b;
    public final ic0 c;
    public boolean d;
    public boolean e;
    public final String f;
    public final String h;
    public final int n;

    public mc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = true;
        this.f = str;
        this.h = str2;
        this.b = u6Var;
        int i12 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), 2, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(this, g02, null, N, u6Var);
        r6 r6Var = new r6(true, true, true);
        this.a = r6Var;
        r6Var.n(0.35f, 300L, ds.h);
        r6Var.w(AndroidUtilities.dp(16.0f));
        r6Var.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var));
        r6Var.setCallback(this);
        r6Var.q(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            r6Var.b = 5;
        }
        float dp = AndroidUtilities.dp(77.0f);
        TextPaint textPaint = r6Var.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + dp);
        this.n = max;
        r6Var.M = max;
        ic0 ic0Var = new ic0(0);
        xj0 xj0Var = new xj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        ic0Var.c = xj0Var;
        xj0Var.R(this);
        xj0Var.J(true);
        xj0Var.h = true;
        xj0Var.K(0);
        xj0 xj0Var2 = new xj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        ic0Var.d = xj0Var2;
        xj0Var2.R(this);
        xj0Var2.J(true);
        xj0Var2.h = true;
        xj0Var2.K(0);
        ic0Var.e = xj0Var;
        this.c = ic0Var;
        org.telegram.ui.ActionBar.f7.y(this, ic0Var, org.telegram.ui.ActionBar.y6.F8, u6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.d || z10 != this.e) {
            this.e = z10;
            String str = z10 ? this.f : this.h;
            boolean z12 = z11 && !LocaleController.isRTL;
            r6 r6Var = this.a;
            r6Var.t(str, z12, true);
            ic0 ic0Var = this.c;
            xj0 xj0Var = (xj0) ic0Var.d;
            xj0 xj0Var2 = (xj0) ic0Var.c;
            ic0Var.b = z10;
            if (z11) {
                ic0Var.e = z10 ? xj0Var2 : xj0Var;
                xj0Var2.M(0);
                xj0Var.M(0);
                ((xj0) ic0Var.e).start();
            } else {
                if (z10) {
                    xj0Var = xj0Var2;
                }
                ic0Var.e = xj0Var;
                xj0Var.M(xj0Var.e[0] - 1);
            }
            this.d = false;
            setContentDescription(r6Var.i);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.E8));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        r6 r6Var = this.a;
        ic0 ic0Var = this.c;
        if (z10) {
            ic0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.vh.B(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            r6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            ic0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.vh.B(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            r6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        r6Var.draw(canvas);
        ic0Var.draw(canvas);
    }

    public boolean getState() {
        return this.e;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.n;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(mode == 1073741824 ? Math.max(View.MeasureSpec.getSize(i10), i12) : Math.min(View.MeasureSpec.getSize(i10), i12), mode), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getVisibility() != 0 || getAlpha() < 0.5f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            r6 r6Var = this.a;
            if (r6Var != null) {
                r6Var.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, this.b));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
