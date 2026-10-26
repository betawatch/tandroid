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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class qb0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public final r6 b;
    public final r6 c;

    public qb0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.a = u6Var;
        r6 r6Var = new r6(true, true, true);
        this.b = r6Var;
        ds dsVar = ds.h;
        r6Var.n(0.3f, 430L, dsVar);
        r6Var.x(AndroidUtilities.bold());
        r6Var.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var));
        r6Var.w(AndroidUtilities.dp(18.0f));
        r6Var.q(!LocaleController.isRTL);
        r6Var.setCallback(this);
        r6Var.M = AndroidUtilities.displaySize.x;
        r6 r6Var2 = new r6(true, true, true);
        this.c = r6Var2;
        r6Var2.n(0.3f, 430L, dsVar);
        r6Var2.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, u6Var));
        r6Var2.w(AndroidUtilities.dp(14.0f));
        r6Var2.q(!LocaleController.isRTL);
        r6Var2.setCallback(this);
        r6Var2.M = AndroidUtilities.displaySize.x;
    }

    public final void a(CharSequence charSequence, boolean z10) {
        this.c.t(charSequence, z10 && !LocaleController.isRTL, true);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B8));
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.b.t(charSequence, z10 && !LocaleController.isRTL, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(29.0f);
        int dp2 = AndroidUtilities.dp(18.83f);
        r6 r6Var = this.c;
        float lerp = AndroidUtilities.lerp(dp, dp2, r6Var.i());
        int paddingLeft = getPaddingLeft();
        int i10 = (int) lerp;
        int dp3 = i10 - AndroidUtilities.dp(32.0f);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int dp4 = AndroidUtilities.dp(32.0f) + i10;
        r6 r6Var2 = this.b;
        r6Var2.setBounds(paddingLeft, dp3, measuredWidth, dp4);
        r6Var2.draw(canvas);
        r6Var.setBounds(getPaddingLeft(), r0 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r0);
        r6Var.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            r6 r6Var = this.b;
            org.telegram.ui.ActionBar.u6 u6Var = this.a;
            if (r6Var != null) {
                r6Var.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var));
            }
            r6 r6Var2 = this.c;
            if (r6Var2 != null) {
                r6Var2.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, u6Var));
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
