package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i2 extends HorizontalScrollView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                    int measuredWidth = getMeasuredWidth();
                    int i12 = ((vh.w3) this.b).H;
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
        org.telegram.ui.Cells.l9 textSelectionHelper;
        switch (this.a) {
            case 0:
                super.onScrollChanged(i10, i11, i12, i13);
                p70 p70Var = (p70) this.b;
                if (p70Var.d != null) {
                    p70Var.d = null;
                    p70Var.f = null;
                    break;
                }
                break;
            case 1:
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                break;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                vh.z2 z2Var = ((vh.j5) this.b).B;
                if (z2Var != null && (textSelectionHelper = z2Var.a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                    textSelectionHelper.x();
                }
                invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Context context, p70 p70Var) {
        super(context);
        this.a = 0;
        this.b = p70Var;
    }
}
