// default package

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class bd9 extends HorizontalScrollView {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bd9(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                if (mode != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 0), i2);
                    int measuredWidth = getMeasuredWidth();
                    if (mode == Integer.MIN_VALUE) {
                        measuredWidth = Math.min(measuredWidth, size);
                    }
                    setMeasuredDimension(measuredWidth, getMeasuredHeight());
                    break;
                } else {
                    super.onMeasure(i, i2);
                    break;
                }
            default:
                int mode2 = View.MeasureSpec.getMode(i);
                int size2 = View.MeasureSpec.getSize(i);
                if (mode2 != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 0), i2);
                    int measuredWidth2 = getMeasuredWidth();
                    if (mode2 == Integer.MIN_VALUE) {
                        measuredWidth2 = Math.min(measuredWidth2, size2);
                    }
                    setMeasuredDimension(measuredWidth2, getMeasuredHeight());
                    break;
                } else {
                    super.onMeasure(i, i2);
                    break;
                }
        }
    }
}
