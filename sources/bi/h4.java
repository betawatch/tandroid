package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.k9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class h4 extends HorizontalScrollView {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                    int measuredWidth = getMeasuredWidth();
                    int i12 = ((i4) this.b).K;
                    if (mode == Integer.MIN_VALUE) {
                        i12 = Math.min(i12, View.MeasureSpec.getSize(i10));
                    }
                    setMeasuredDimension(Math.min(measuredWidth, i12), getMeasuredHeight());
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        k9 textSelectionHelper;
        switch (this.a) {
            case 1:
                super.onScrollChanged(i10, i11, i12, i13);
                k3 k3Var = ((z5) this.b).E;
                if (k3Var != null && (textSelectionHelper = k3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                    textSelectionHelper.w();
                }
                invalidate();
                break;
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                break;
        }
    }
}
