package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e5 extends FrameLayout {
    public boolean a;
    public int b;
    public o6 c;
    public o6 d;

    public o6 getSubtitleTextView() {
        return this.d;
    }

    public o6 getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        o6 o6Var = this.d;
        o6 o6Var2 = this.c;
        int x4 = org.telegram.ui.b.x(42.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2) + (this.a ? AndroidUtilities.statusBarHeight : 0);
        int i14 = this.b;
        if (o6Var.getVisibility() != 8) {
            o6Var2.layout(i14, (AndroidUtilities.dp(1.0f) + x4) - o6Var2.getPaddingTop(), o6Var2.getMeasuredWidth() + i14, o6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (o6Var2.getTextHeight() + x4)) - o6Var2.getPaddingTop()));
        } else {
            o6Var2.layout(i14, (AndroidUtilities.dp(11.0f) + x4) - o6Var2.getPaddingTop(), o6Var2.getMeasuredWidth() + i14, o6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (o6Var2.getTextHeight() + x4)) - o6Var2.getPaddingTop()));
        }
        o6Var.layout(i14, AndroidUtilities.dp(20.0f) + x4, o6Var.getMeasuredWidth() + i14, AndroidUtilities.dp(24.0f) + o6Var.getTextHeight() + x4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        o6 o6Var = this.c;
        int paddingRight = o6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        o6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(o6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
