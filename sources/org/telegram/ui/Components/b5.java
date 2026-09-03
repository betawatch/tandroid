package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class b5 extends FrameLayout {
    public boolean a;
    public int b;
    public k6 c;
    public k6 d;

    public k6 getSubtitleTextView() {
        return this.d;
    }

    public k6 getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        k6 k6Var = this.d;
        k6 k6Var2 = this.c;
        int x10 = org.telegram.ui.b.x(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2) + (this.a ? AndroidUtilities.statusBarHeight : 0);
        int i14 = this.b;
        if (k6Var.getVisibility() != 8) {
            k6Var2.layout(i14, (AndroidUtilities.dp(1.0f) + x10) - k6Var2.getPaddingTop(), k6Var2.getMeasuredWidth() + i14, k6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (k6Var2.getTextHeight() + x10)) - k6Var2.getPaddingTop()));
        } else {
            k6Var2.layout(i14, (AndroidUtilities.dp(11.0f) + x10) - k6Var2.getPaddingTop(), k6Var2.getMeasuredWidth() + i14, k6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (k6Var2.getTextHeight() + x10)) - k6Var2.getPaddingTop()));
        }
        k6Var.layout(i14, AndroidUtilities.dp(20.0f) + x10, k6Var.getMeasuredWidth() + i14, AndroidUtilities.dp(24.0f) + k6Var.getTextHeight() + x10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        k6 k6Var = this.c;
        int paddingRight = k6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        k6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(k6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
