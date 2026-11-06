package li;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.i9;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class x3 extends HorizontalScrollView {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3(FrameLayout frameLayout, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i7);
                if (mode != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0), i10);
                    int measuredWidth = getMeasuredWidth();
                    int i11 = ((y3) this.b).K;
                    if (mode == Integer.MIN_VALUE) {
                        i11 = Math.min(i11, View.MeasureSpec.getSize(i7));
                    }
                    setMeasuredDimension(Math.min(measuredWidth, i11), getMeasuredHeight());
                    break;
                } else {
                    super.onMeasure(i7, i10);
                    break;
                }
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i7, int i10, int i11, int i12) {
        i9 textSelectionHelper;
        switch (this.a) {
            case 1:
                super.onScrollChanged(i7, i10, i11, i12);
                a3 a3Var = ((m5) this.b).E;
                if (a3Var != null && (textSelectionHelper = a3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                    textSelectionHelper.w();
                }
                invalidate();
                break;
            default:
                super.onScrollChanged(i7, i10, i11, i12);
                break;
        }
    }
}
