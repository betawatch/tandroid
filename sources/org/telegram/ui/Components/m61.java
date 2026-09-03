package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m61 extends NestedScrollView {
    public boolean T;
    public final /* synthetic */ n61 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m61(n61 n61Var, Context context) {
        super(context);
        this.U = n61Var;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        n61.m(this.U);
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
        n61 n61Var = this.U;
        measureChildWithMargins(n61Var.f, i10, 0, i11, 0);
        int measuredHeight = n61Var.f.getMeasuredHeight();
        int i12 = (size / 5) * 2;
        if (measuredHeight - (size - i12) >= AndroidUtilities.dp(90.0f)) {
        }
        i12 = size - measuredHeight;
        if (i12 < 0) {
            i12 = 0;
        }
        if (getPaddingTop() != i12) {
            this.T = true;
            setPadding(0, i12, 0, 0);
            this.T = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        n61.m(this.U);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.T) {
            return;
        }
        super.requestLayout();
    }
}
