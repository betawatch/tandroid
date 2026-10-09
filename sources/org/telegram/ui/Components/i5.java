package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class i5 extends FrameLayout {
    public boolean a;
    public int b;
    public r6 c;
    public r6 d;

    public r6 getSubtitleTextView() {
        return this.d;
    }

    public r6 getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        r6 r6Var = this.d;
        r6 r6Var2 = this.c;
        int A = org.telegram.messenger.bi.A(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2) + (this.a ? AndroidUtilities.statusBarHeight : 0);
        int i14 = this.b;
        if (r6Var.getVisibility() != 8) {
            r6Var2.layout(i14, (AndroidUtilities.dp(1.0f) + A) - r6Var2.getPaddingTop(), r6Var2.getMeasuredWidth() + i14, r6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (r6Var2.getTextHeight() + A)) - r6Var2.getPaddingTop()));
        } else {
            r6Var2.layout(i14, (AndroidUtilities.dp(11.0f) + A) - r6Var2.getPaddingTop(), r6Var2.getMeasuredWidth() + i14, r6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (r6Var2.getTextHeight() + A)) - r6Var2.getPaddingTop()));
        }
        r6Var.layout(i14, AndroidUtilities.dp(20.0f) + A, r6Var.getMeasuredWidth() + i14, AndroidUtilities.dp(24.0f) + r6Var.getTextHeight() + A);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        r6 r6Var = this.c;
        int paddingRight = r6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        r6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(r6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
