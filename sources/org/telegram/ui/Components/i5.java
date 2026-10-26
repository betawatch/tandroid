package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i5 extends FrameLayout {
    public boolean a;
    public int b;
    public s6 c;
    public s6 d;

    public s6 getSubtitleTextView() {
        return this.d;
    }

    public s6 getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        s6 s6Var = this.d;
        s6 s6Var2 = this.c;
        int B = org.telegram.messenger.vh.B(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2) + (this.a ? AndroidUtilities.statusBarHeight : 0);
        int i14 = this.b;
        if (s6Var.getVisibility() != 8) {
            s6Var2.layout(i14, (AndroidUtilities.dp(1.0f) + B) - s6Var2.getPaddingTop(), s6Var2.getMeasuredWidth() + i14, s6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (s6Var2.getTextHeight() + B)) - s6Var2.getPaddingTop()));
        } else {
            s6Var2.layout(i14, (AndroidUtilities.dp(11.0f) + B) - s6Var2.getPaddingTop(), s6Var2.getMeasuredWidth() + i14, s6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (s6Var2.getTextHeight() + B)) - s6Var2.getPaddingTop()));
        }
        s6Var.layout(i14, AndroidUtilities.dp(20.0f) + B, s6Var.getMeasuredWidth() + i14, AndroidUtilities.dp(24.0f) + s6Var.getTextHeight() + B);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        s6 s6Var = this.c;
        int paddingRight = s6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        s6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(s6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
