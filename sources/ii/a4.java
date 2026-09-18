package ii;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.w70;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class a4 extends HorizontalScrollView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4(FrameLayout frameLayout, Context context, int i10) {
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
                    int i12 = ((b4) this.b).K;
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
        q9 textSelectionHelper;
        switch (this.a) {
            case 1:
                super.onScrollChanged(i10, i11, i12, i13);
                c3 c3Var = ((o5) this.b).E;
                if (c3Var != null && (textSelectionHelper = c3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                    textSelectionHelper.x();
                }
                invalidate();
                break;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                w70 w70Var = (w70) this.b;
                if (w70Var.d != null) {
                    w70Var.d = null;
                    w70Var.f = null;
                    break;
                }
                break;
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(Context context, w70 w70Var) {
        super(context);
        this.a = 2;
        this.b = w70Var;
    }
}
