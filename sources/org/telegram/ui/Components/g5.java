package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class g5 extends FrameLayout {
    public boolean a;
    public int b;
    public p6 c;
    public p6 d;

    public p6 getSubtitleTextView() {
        return this.d;
    }

    public p6 getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        p6 p6Var = this.d;
        p6 p6Var2 = this.c;
        int y3 = org.telegram.messenger.ul.y(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2) + (this.a ? AndroidUtilities.statusBarHeight : 0);
        int i14 = this.b;
        if (p6Var.getVisibility() != 8) {
            p6Var2.layout(i14, (AndroidUtilities.dp(1.0f) + y3) - p6Var2.getPaddingTop(), p6Var2.getMeasuredWidth() + i14, p6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (p6Var2.getTextHeight() + y3)) - p6Var2.getPaddingTop()));
        } else {
            p6Var2.layout(i14, (AndroidUtilities.dp(11.0f) + y3) - p6Var2.getPaddingTop(), p6Var2.getMeasuredWidth() + i14, p6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (p6Var2.getTextHeight() + y3)) - p6Var2.getPaddingTop()));
        }
        p6Var.layout(i14, AndroidUtilities.dp(20.0f) + y3, p6Var.getMeasuredWidth() + i14, AndroidUtilities.dp(24.0f) + p6Var.getTextHeight() + y3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        p6 p6Var = this.c;
        int paddingRight = p6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        p6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(p6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
