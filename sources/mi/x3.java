package mi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.h9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class x3 extends HorizontalScrollView {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3(FrameLayout frameLayout, Context context, int i3) {
        super(context);
        this.a = i3;
        this.b = frameLayout;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i3);
                if (mode != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 0), i10);
                    int measuredWidth = getMeasuredWidth();
                    int i11 = ((y3) this.b).L;
                    if (mode == Integer.MIN_VALUE) {
                        i11 = Math.min(i11, View.MeasureSpec.getSize(i3));
                    }
                    setMeasuredDimension(Math.min(measuredWidth, i11), getMeasuredHeight());
                    break;
                } else {
                    super.onMeasure(i3, i10);
                    break;
                }
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i3, int i10, int i11, int i12) {
        h9 textSelectionHelper;
        switch (this.a) {
            case 1:
                super.onScrollChanged(i3, i10, i11, i12);
                b3 b3Var = ((n5) this.b).F;
                if (b3Var != null && (textSelectionHelper = b3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                    textSelectionHelper.w();
                }
                invalidate();
                break;
            default:
                super.onScrollChanged(i3, i10, i11, i12);
                break;
        }
    }
}
