package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n51 extends NestedScrollView {
    public boolean S;
    public final /* synthetic */ o51 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n51(o51 o51Var, Context context) {
        super(context);
        this.T = o51Var;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        o51.m(this.T);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r9 < (org.telegram.messenger.AndroidUtilities.dp(90.0f) + (r0 / 2))) goto L6;
     */
    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        o51 o51Var = this.T;
        measureChildWithMargins(o51Var.f, i9, 0, i10, 0);
        int measuredHeight = o51Var.f.getMeasuredHeight();
        int i11 = (size / 5) * 2;
        if (measuredHeight - (size - i11) >= AndroidUtilities.dp(90.0f)) {
        }
        i11 = size - measuredHeight;
        if (i11 < 0) {
            i11 = 0;
        }
        if (getPaddingTop() != i11) {
            this.S = true;
            setPadding(0, i11, 0, 0);
            this.S = false;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        o51.m(this.T);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.S) {
            return;
        }
        super.requestLayout();
    }
}
