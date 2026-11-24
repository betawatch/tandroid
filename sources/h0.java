// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h0 extends ahb {
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
        int L = gl.L(3.0f);
        float L2 = (gl.L(60.0f) - ((measuredHeight + L) + measuredHeight2)) / 2.0f;
        childAt.setTranslationY(gl.R1((gl.L(50.0f) - measuredHeight) / 2.0f, L2, this.M) - childAt.getTop());
        valueTextView.setTranslationY((((1.0f - this.M) * gl.L(5.0f)) + ((L2 + measuredHeight) + L)) - valueTextView.getTop());
        valueTextView.setAlpha(this.M);
    }

    @Override // ahb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), Math.round(gl.U1(this.M, gl.L(50.0f), gl.L(60.0f))));
    }
}
