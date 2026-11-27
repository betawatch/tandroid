// default package

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h9c extends FrameLayout {
    public int a;
    public boolean b;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.a;
        View view = getParent() instanceof View ? (View) getParent() : null;
        if (this.b && view != null) {
            i3 = view.getPaddingBottom() + view.getPaddingTop() + i3;
        }
        if (view != null && view.getMeasuredHeight() > 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight() - i3, TLObject.FLAG_30));
            return;
        }
        if (View.MeasureSpec.getMode(i2) != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - i3, TLObject.FLAG_30));
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        measureChildren(makeMeasureSpec, i2);
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            i4 = Math.max(i4, getChildAt(i5).getMeasuredHeight());
        }
        if (size > 0) {
            i4 = Math.min(i4, size - i3);
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30));
    }

    public void setMinusHeight(int i) {
        this.a = i;
    }

    public void setMinusPadding(boolean z) {
        this.b = z;
    }
}
