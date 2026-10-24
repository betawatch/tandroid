package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class tb0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final p6 b;
    public final p6 c;

    public tb0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = g6Var;
        p6 p6Var = new p6(true, true, true);
        this.b = p6Var;
        bs bsVar = bs.h;
        p6Var.n(0.3f, 430L, bsVar);
        p6Var.x(AndroidUtilities.bold());
        p6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var));
        p6Var.w(AndroidUtilities.dp(18.0f));
        p6Var.q(!LocaleController.isRTL);
        p6Var.setCallback(this);
        p6Var.M = AndroidUtilities.displaySize.x;
        p6 p6Var2 = new p6(true, true, true);
        this.c = p6Var2;
        p6Var2.n(0.3f, 430L, bsVar);
        p6Var2.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, g6Var));
        p6Var2.w(AndroidUtilities.dp(14.0f));
        p6Var2.q(!LocaleController.isRTL);
        p6Var2.setCallback(this);
        p6Var2.M = AndroidUtilities.displaySize.x;
    }

    public final void a(CharSequence charSequence, boolean z10) {
        this.c.t(charSequence, z10 && !LocaleController.isRTL, true);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.b.t(charSequence, z10 && !LocaleController.isRTL, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(29.0f);
        int dp2 = AndroidUtilities.dp(18.83f);
        p6 p6Var = this.c;
        float lerp = AndroidUtilities.lerp(dp, dp2, p6Var.i());
        int paddingLeft = getPaddingLeft();
        int i10 = (int) lerp;
        int dp3 = i10 - AndroidUtilities.dp(32.0f);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int dp4 = AndroidUtilities.dp(32.0f) + i10;
        p6 p6Var2 = this.b;
        p6Var2.setBounds(paddingLeft, dp3, measuredWidth, dp4);
        p6Var2.draw(canvas);
        p6Var.setBounds(getPaddingLeft(), r0 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r0);
        p6Var.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            p6 p6Var = this.b;
            org.telegram.ui.ActionBar.g6 g6Var = this.a;
            if (p6Var != null) {
                p6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var));
            }
            p6 p6Var2 = this.c;
            if (p6Var2 != null) {
                p6Var2.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, g6Var));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.c == drawable || super.verifyDrawable(drawable);
    }
}
