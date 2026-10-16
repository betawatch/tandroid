package ji;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.z70;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class b4 extends HorizontalScrollView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4(FrameLayout frameLayout, Context context, int i10) {
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
                    int i12 = ((c4) this.b).K;
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
        o9 textSelectionHelper;
        switch (this.a) {
            case 1:
                super.onScrollChanged(i10, i11, i12, i13);
                d3 d3Var = ((u5) this.b).E;
                if (d3Var != null && (textSelectionHelper = d3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                    textSelectionHelper.w();
                }
                invalidate();
                break;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                z70 z70Var = (z70) this.b;
                if (z70Var.d != null) {
                    z70Var.d = null;
                    z70Var.f = null;
                    break;
                }
                break;
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(Context context, z70 z70Var) {
        super(context);
        this.a = 2;
        this.b = z70Var;
    }
}
