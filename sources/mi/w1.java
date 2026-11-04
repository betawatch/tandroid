package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class w1 extends HorizontalScrollView {
    public final k4.j a;
    public final org.telegram.ui.Components.u5 b;
    public final org.telegram.ui.Components.u5 c;
    public final /* synthetic */ c2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(c2 c2Var, Context context) {
        super(context);
        this.d = c2Var;
        this.a = new k4.j(24);
        xq xqVar = xq.h;
        this.b = new org.telegram.ui.Components.u5(this, 300L, xqVar);
        this.c = new org.telegram.ui.Components.u5(this, 300L, xqVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.b.d(canScrollHorizontally(-1));
        float d10 = this.c.d(canScrollHorizontally(1));
        if (d > 0.0f || d10 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), hs.e4, 31);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        if (d > 0.0f || d10 > 0.0f) {
            canvas2.save();
            k4.j jVar = this.a;
            if (d > 0.0f) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(getScrollX(), 0.0f, org.telegram.messenger.g0.L(48.0f) + getScrollX(), getHeight());
                jVar.w(canvas2, rectF, 0, d);
            }
            if (d10 > 0.0f) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set((getWidth() + getScrollX()) - org.telegram.messenger.g0.L(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                jVar.w(canvas2, rectF2, 2, d10);
            }
            canvas2.restore();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == 1073741824) {
            super.onMeasure(i3, i10);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 0), i10);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.d.l0;
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(i11, View.MeasureSpec.getSize(i3));
        }
        setMeasuredDimension(Math.min(measuredWidth, i11), getMeasuredHeight());
    }
}
