package mi;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class v1 extends HorizontalScrollView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(Context context, int i3) {
        super(context);
        this.a = i3;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i3);
                int size = View.MeasureSpec.getSize(i3);
                if (mode != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 0), i10);
                    int measuredWidth = getMeasuredWidth();
                    if (mode == Integer.MIN_VALUE) {
                        measuredWidth = Math.min(measuredWidth, size);
                    }
                    setMeasuredDimension(measuredWidth, getMeasuredHeight());
                    break;
                } else {
                    super.onMeasure(i3, i10);
                    break;
                }
            default:
                int mode2 = View.MeasureSpec.getMode(i3);
                int size2 = View.MeasureSpec.getSize(i3);
                if (mode2 != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 0), i10);
                    int measuredWidth2 = getMeasuredWidth();
                    if (mode2 == Integer.MIN_VALUE) {
                        measuredWidth2 = Math.min(measuredWidth2, size2);
                    }
                    setMeasuredDimension(measuredWidth2, getMeasuredHeight());
                    break;
                } else {
                    super.onMeasure(i3, i10);
                    break;
                }
        }
    }
}
