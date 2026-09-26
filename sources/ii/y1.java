package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;
import org.telegram.ui.g20;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class y1 extends HorizontalScrollView {
    public final g20 a;
    public final org.telegram.ui.Components.e6 b;
    public final org.telegram.ui.Components.e6 c;
    public final /* synthetic */ e2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(e2 e2Var, Context context) {
        super(context);
        this.d = e2Var;
        this.a = new g20();
        rr rrVar = rr.h;
        this.b = new org.telegram.ui.Components.e6(this, 300L, rrVar);
        this.c = new org.telegram.ui.Components.e6(this, 300L, rrVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.b.e(canScrollHorizontally(-1));
        float e7 = this.c.e(canScrollHorizontally(1));
        if (e > 0.0f || e7 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        if (e > 0.0f || e7 > 0.0f) {
            canvas2.save();
            g20 g20Var = this.a;
            if (e > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(48.0f) + getScrollX(), getHeight());
                g20Var.b(canvas2, rectF, 0, e);
            }
            if (e7 > 0.0f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set((getWidth() + getScrollX()) - AndroidUtilities.dp(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                g20Var.b(canvas2, rectF2, 2, e7);
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
