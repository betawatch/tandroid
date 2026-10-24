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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class qc0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final p6 a;
    public final org.telegram.ui.ActionBar.g6 b;
    public final mc0 c;
    public boolean d;
    public boolean e;
    public final String f;
    public final String h;
    public final int n;

    public qc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = true;
        this.f = str;
        this.h = str2;
        this.b = g6Var;
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), 2, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(this, g02, null, O, g6Var);
        p6 p6Var = new p6(true, true, true);
        this.a = p6Var;
        p6Var.n(0.35f, 300L, bs.h);
        p6Var.w(AndroidUtilities.dp(16.0f));
        p6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, g6Var));
        p6Var.setCallback(this);
        p6Var.q(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            p6Var.b = 5;
        }
        float dp = AndroidUtilities.dp(77.0f);
        TextPaint textPaint = p6Var.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + dp);
        this.n = max;
        p6Var.M = max;
        mc0 mc0Var = new mc0(0);
        yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        mc0Var.c = yj0Var;
        yj0Var.R(this);
        yj0Var.J(true);
        yj0Var.h = true;
        yj0Var.K(0);
        yj0 yj0Var2 = new yj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        mc0Var.d = yj0Var2;
        yj0Var2.R(this);
        yj0Var2.J(true);
        yj0Var2.h = true;
        yj0Var2.K(0);
        mc0Var.e = yj0Var;
        this.c = mc0Var;
        org.telegram.ui.ActionBar.r6.z(this, mc0Var, org.telegram.ui.ActionBar.k6.F8, g6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.d || z10 != this.e) {
            this.e = z10;
            String str = z10 ? this.f : this.h;
            boolean z12 = z11 && !LocaleController.isRTL;
            p6 p6Var = this.a;
            p6Var.t(str, z12, true);
            mc0 mc0Var = this.c;
            yj0 yj0Var = (yj0) mc0Var.d;
            yj0 yj0Var2 = (yj0) mc0Var.c;
            mc0Var.b = z10;
            if (z11) {
                mc0Var.e = z10 ? yj0Var2 : yj0Var;
                yj0Var2.M(0);
                yj0Var.M(0);
                ((yj0) mc0Var.e).start();
            } else {
                if (z10) {
                    yj0Var = yj0Var2;
                }
                mc0Var.e = yj0Var;
                yj0Var.M(yj0Var.e[0] - 1);
            }
            this.d = false;
            setContentDescription(p6Var.i);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        p6 p6Var = this.a;
        mc0 mc0Var = this.c;
        if (z10) {
            mc0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.sl.A(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            p6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            mc0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.sl.A(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            p6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        p6Var.draw(canvas);
        mc0Var.draw(canvas);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            p6 p6Var = this.a;
            if (p6Var != null) {
                p6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.b));
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
