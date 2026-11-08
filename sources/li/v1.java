package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class v1 extends HorizontalScrollView {
    public final h6.m a;
    public final org.telegram.ui.Components.w5 b;
    public final org.telegram.ui.Components.w5 c;
    public final /* synthetic */ b2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(b2 b2Var, Context context) {
        super(context);
        this.d = b2Var;
        this.a = new h6.m(28);
        xq xqVar = xq.h;
        this.b = new org.telegram.ui.Components.w5(this, 300L, xqVar);
        this.c = new org.telegram.ui.Components.w5(this, 300L, xqVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.b.d(canScrollHorizontally(-1));
        float d2 = this.c.d(canScrollHorizontally(1));
        if (d > 0.0f || d2 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), qs.e4, 31);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        if (d > 0.0f || d2 > 0.0f) {
            canvas2.save();
            h6.m mVar = this.a;
            if (d > 0.0f) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(getScrollX(), 0.0f, org.telegram.messenger.g0.L(48.0f) + getScrollX(), getHeight());
                mVar.m(canvas2, rectF, 0, d);
            }
            if (d2 > 0.0f) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set((getWidth() + getScrollX()) - org.telegram.messenger.g0.L(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                mVar.m(canvas2, rectF2, 2, d2);
            }
            canvas2.restore();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == 1073741824) {
            super.onMeasure(i7, i10);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0), i10);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.d.k0;
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(i11, View.MeasureSpec.getSize(i7));
        }
        setMeasuredDimension(Math.min(measuredWidth, i11), getMeasuredHeight());
    }
}
