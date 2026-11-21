package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class m51 extends NestedScrollView {
    public boolean a0;
    public final /* synthetic */ n51 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m51(n51 n51Var, Context context) {
        super(context);
        this.b0 = n51Var;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        n51.J0(this.b0);
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
        n51 n51Var = this.b0;
        measureChildWithMargins(n51Var.q1, i7, 0, i10, 0);
        int measuredHeight = n51Var.q1.getMeasuredHeight();
        int i11 = (size / 5) * 2;
        if (measuredHeight - (size - i11) >= org.telegram.messenger.g0.L(90.0f)) {
        }
        i11 = size - measuredHeight;
        if (i11 < 0) {
            i11 = 0;
        }
        if (getPaddingTop() != i11) {
            this.a0 = true;
            setPadding(0, i11, 0, 0);
            this.a0 = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        n51.J0(this.b0);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a0) {
            return;
        }
        super.requestLayout();
    }
}
