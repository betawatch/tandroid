package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h2 extends HorizontalScrollView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(FrameLayout frameLayout, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = frameLayout;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 1:
                int mode = View.MeasureSpec.getMode(i9);
                if (mode != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 0), i10);
                    int measuredWidth = getMeasuredWidth();
                    int i11 = ((qh.s3) this.b).G;
                    if (mode == Integer.MIN_VALUE) {
                        i11 = Math.min(i11, View.MeasureSpec.getSize(i9));
                    }
                    setMeasuredDimension(Math.min(measuredWidth, i11), getMeasuredHeight());
                    break;
                } else {
                    super.onMeasure(i9, i10);
                    break;
                }
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i9, int i10, int i11, int i12) {
        org.telegram.ui.Cells.n9 textSelectionHelper;
        switch (this.a) {
            case 0:
                super.onScrollChanged(i9, i10, i11, i12);
                a70 a70Var = (a70) this.b;
                if (a70Var.d != null) {
                    a70Var.d = null;
                    a70Var.f = null;
                    break;
                }
                break;
            case 1:
            default:
                super.onScrollChanged(i9, i10, i11, i12);
                break;
            case 2:
                super.onScrollChanged(i9, i10, i11, i12);
                qh.v2 v2Var = ((qh.f5) this.b).A;
                if (v2Var != null && (textSelectionHelper = v2Var.a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                    textSelectionHelper.x();
                }
                invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(Context context, a70 a70Var) {
        super(context);
        this.a = 0;
        this.b = a70Var;
    }
}
