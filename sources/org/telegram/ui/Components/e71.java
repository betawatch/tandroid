package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class e71 extends NestedScrollView {
    public boolean W;
    public final /* synthetic */ f71 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e71(f71 f71Var, Context context) {
        super(context);
        this.a0 = f71Var;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        f71.n(this.a0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r9 < (org.telegram.messenger.AndroidUtilities.dp(90.0f) + (r0 / 2))) goto L6;
     */
    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        f71 f71Var = this.a0;
        measureChildWithMargins(f71Var.f, i10, 0, i11, 0);
        int measuredHeight = f71Var.f.getMeasuredHeight();
        int i12 = (size / 5) * 2;
        if (measuredHeight - (size - i12) >= AndroidUtilities.dp(90.0f)) {
        }
        i12 = size - measuredHeight;
        if (i12 < 0) {
            i12 = 0;
        }
        if (getPaddingTop() != i12) {
            this.W = true;
            setPadding(0, i12, 0, 0);
            this.W = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        f71.n(this.a0);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.W) {
            return;
        }
        super.requestLayout();
    }
}
