package oi;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class s1 extends HorizontalScrollView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i7);
                int size = View.MeasureSpec.getSize(i7);
                if (mode != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 0), i10);
                    int measuredWidth = getMeasuredWidth();
                    if (mode == Integer.MIN_VALUE) {
                        measuredWidth = Math.min(measuredWidth, size);
                    }
                    setMeasuredDimension(measuredWidth, getMeasuredHeight());
                    break;
                } else {
                    super.onMeasure(i7, i10);
                    break;
                }
            default:
                int mode2 = View.MeasureSpec.getMode(i7);
                int size2 = View.MeasureSpec.getSize(i7);
                if (mode2 != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 0), i10);
                    int measuredWidth2 = getMeasuredWidth();
                    if (mode2 == Integer.MIN_VALUE) {
                        measuredWidth2 = Math.min(measuredWidth2, size2);
                    }
                    setMeasuredDimension(measuredWidth2, getMeasuredHeight());
                    break;
                } else {
                    super.onMeasure(i7, i10);
                    break;
                }
        }
    }
}
