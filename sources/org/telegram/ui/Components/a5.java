package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a5 extends FrameLayout {
    public boolean a;
    public int b;
    public j6 c;
    public j6 d;

    public j6 getSubtitleTextView() {
        return this.d;
    }

    public j6 getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        j6 j6Var = this.d;
        j6 j6Var2 = this.c;
        int y10 = org.telegram.messenger.ll.y(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2) + (this.a ? AndroidUtilities.statusBarHeight : 0);
        int i13 = this.b;
        if (j6Var.getVisibility() != 8) {
            j6Var2.layout(i13, (AndroidUtilities.dp(1.0f) + y10) - j6Var2.getPaddingTop(), j6Var2.getMeasuredWidth() + i13, j6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (j6Var2.getTextHeight() + y10)) - j6Var2.getPaddingTop()));
        } else {
            j6Var2.layout(i13, (AndroidUtilities.dp(11.0f) + y10) - j6Var2.getPaddingTop(), j6Var2.getMeasuredWidth() + i13, j6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (j6Var2.getTextHeight() + y10)) - j6Var2.getPaddingTop()));
        }
        j6Var.layout(i13, AndroidUtilities.dp(20.0f) + y10, j6Var.getMeasuredWidth() + i13, AndroidUtilities.dp(24.0f) + j6Var.getTextHeight() + y10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        j6 j6Var = this.c;
        int paddingRight = j6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        j6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(j6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i10));
    }
}
