package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x41 extends NestedScrollView {
    public boolean W;
    public final /* synthetic */ y41 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x41(y41 y41Var, Context context) {
        super(context);
        this.a0 = y41Var;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        y41.I0(this.a0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r9 < (org.telegram.messenger.g0.L(90.0f) + (r0 / 2))) goto L6;
     */
    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        y41 y41Var = this.a0;
        measureChildWithMargins(y41Var.p1, i7, 0, i10, 0);
        int measuredHeight = y41Var.p1.getMeasuredHeight();
        int i11 = (size / 5) * 2;
        if (measuredHeight - (size - i11) >= org.telegram.messenger.g0.L(90.0f)) {
        }
        i11 = size - measuredHeight;
        if (i11 < 0) {
            i11 = 0;
        }
        if (getPaddingTop() != i11) {
            this.W = true;
            setPadding(0, i11, 0, 0);
            this.W = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        y41.I0(this.a0);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.W) {
            return;
        }
        super.requestLayout();
    }
}
