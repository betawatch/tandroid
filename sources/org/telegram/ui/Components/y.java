package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class y extends org.telegram.ui.Cells.s8 {
    public boolean L;
    public float M;
    public float N;
    public ValueAnimator O;

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        View childAt = getChildAt(0);
        TextView valueTextView = getValueTextView();
        if (childAt == null || valueTextView == null) {
            return;
        }
        int measuredHeight = childAt.getMeasuredHeight();
        int measuredHeight2 = valueTextView.getMeasuredHeight();
        int L = org.telegram.messenger.g0.L(3.0f);
        float L2 = (org.telegram.messenger.g0.L(60.0f) - ((measuredHeight + L) + measuredHeight2)) / 2.0f;
        childAt.setTranslationY(org.telegram.messenger.g0.T1((org.telegram.messenger.g0.L(50.0f) - measuredHeight) / 2.0f, L2, this.M) - childAt.getTop());
        valueTextView.setTranslationY((((1.0f - this.M) * org.telegram.messenger.g0.L(5.0f)) + ((L2 + measuredHeight) + L)) - valueTextView.getTop());
        valueTextView.setAlpha(this.M);
    }

    @Override // org.telegram.ui.Cells.s8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setMeasuredDimension(getMeasuredWidth(), Math.round(org.telegram.messenger.g0.W1(this.M, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(60.0f))));
    }
}
