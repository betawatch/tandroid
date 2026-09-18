package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class e5 extends FrameLayout {
    public boolean a;
    public int b;
    public n6 c;
    public n6 d;

    public n6 getSubtitleTextView() {
        return this.d;
    }

    public n6 getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        n6 n6Var = this.d;
        n6 n6Var2 = this.c;
        int y3 = org.telegram.messenger.wl.y(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2) + (this.a ? AndroidUtilities.statusBarHeight : 0);
        int i14 = this.b;
        if (n6Var.getVisibility() != 8) {
            n6Var2.layout(i14, (AndroidUtilities.dp(1.0f) + y3) - n6Var2.getPaddingTop(), n6Var2.getMeasuredWidth() + i14, n6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (n6Var2.getTextHeight() + y3)) - n6Var2.getPaddingTop()));
        } else {
            n6Var2.layout(i14, (AndroidUtilities.dp(11.0f) + y3) - n6Var2.getPaddingTop(), n6Var2.getMeasuredWidth() + i14, n6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (n6Var2.getTextHeight() + y3)) - n6Var2.getPaddingTop()));
        }
        n6Var.layout(i14, AndroidUtilities.dp(20.0f) + y3, n6Var.getMeasuredWidth() + i14, AndroidUtilities.dp(24.0f) + n6Var.getTextHeight() + y3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        n6 n6Var = this.c;
        int paddingRight = n6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        n6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(n6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
