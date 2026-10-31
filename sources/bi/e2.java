package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class e2 extends HorizontalScrollView {
    public final li.k a;
    public final org.telegram.ui.Components.t5 b;
    public final org.telegram.ui.Components.t5 c;
    public final /* synthetic */ k2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(k2 k2Var, Context context) {
        super(context);
        this.d = k2Var;
        this.a = new li.k(23);
        gr grVar = gr.h;
        this.b = new org.telegram.ui.Components.t5(this, 300L, grVar);
        this.c = new org.telegram.ui.Components.t5(this, 300L, grVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.b.d(canScrollHorizontally(-1));
        float d10 = this.c.d(canScrollHorizontally(1));
        if (d > 0.0f || d10 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), zs.e4, 31);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        if (d > 0.0f || d10 > 0.0f) {
            canvas2.save();
            li.k kVar = this.a;
            if (d > 0.0f) {
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(getScrollX(), 0.0f, org.telegram.messenger.i0.L(48.0f) + getScrollX(), getHeight());
                kVar.o(canvas2, rectF, 0, d);
            }
            if (d10 > 0.0f) {
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set((getWidth() + getScrollX()) - org.telegram.messenger.i0.L(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                kVar.o(canvas2, rectF2, 2, d10);
            }
            canvas2.restore();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == 1073741824) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.d.k0;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(i12, View.MeasureSpec.getSize(i10));
        }
        setMeasuredDimension(Math.min(measuredWidth, i12), getMeasuredHeight());
    }
}
