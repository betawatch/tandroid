package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class g5 extends FrameLayout {
    public boolean a;
    public int b;
    public q6 c;
    public q6 d;

    public q6 getSubtitleTextView() {
        return this.d;
    }

    public q6 getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        q6 q6Var = this.d;
        q6 q6Var2 = this.c;
        int y3 = org.telegram.messenger.wl.y(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2) + (this.a ? AndroidUtilities.statusBarHeight : 0);
        int i14 = this.b;
        if (q6Var.getVisibility() != 8) {
            q6Var2.layout(i14, (AndroidUtilities.dp(1.0f) + y3) - q6Var2.getPaddingTop(), q6Var2.getMeasuredWidth() + i14, q6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (q6Var2.getTextHeight() + y3)) - q6Var2.getPaddingTop()));
        } else {
            q6Var2.layout(i14, (AndroidUtilities.dp(11.0f) + y3) - q6Var2.getPaddingTop(), q6Var2.getMeasuredWidth() + i14, q6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (q6Var2.getTextHeight() + y3)) - q6Var2.getPaddingTop()));
        }
        q6Var.layout(i14, AndroidUtilities.dp(20.0f) + y3, q6Var.getMeasuredWidth() + i14, AndroidUtilities.dp(24.0f) + q6Var.getTextHeight() + y3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        q6 q6Var = this.c;
        int paddingRight = q6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        q6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(q6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
