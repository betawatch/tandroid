// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class i0 extends wkb {
    public boolean L;
    public float M;
    public float N;
    public ValueAnimator O;

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        TextView valueTextView = getValueTextView();
        if (childAt == null || valueTextView == null) {
            return;
        }
        int measuredHeight = childAt.getMeasuredHeight();
        int measuredHeight2 = valueTextView.getMeasuredHeight();
        int L = hl.L(3.0f);
        float L2 = (hl.L(60.0f) - ((measuredHeight + L) + measuredHeight2)) / 2.0f;
        childAt.setTranslationY(hl.R1((hl.L(50.0f) - measuredHeight) / 2.0f, L2, this.M) - childAt.getTop());
        valueTextView.setTranslationY((((1.0f - this.M) * hl.L(5.0f)) + ((L2 + measuredHeight) + L)) - valueTextView.getTop());
        valueTextView.setAlpha(this.M);
    }

    @Override // wkb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), Math.round(hl.U1(this.M, hl.L(50.0f), hl.L(60.0f))));
    }
}
