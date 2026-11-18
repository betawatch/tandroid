package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class t1 extends HorizontalScrollView {
    public final h6.m a;
    public final org.telegram.ui.Components.c6 b;
    public final org.telegram.ui.Components.c6 c;
    public final /* synthetic */ z1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(z1 z1Var, Context context) {
        super(context);
        this.d = z1Var;
        this.a = new h6.m(29);
        lr lrVar = lr.h;
        this.b = new org.telegram.ui.Components.c6(this, 300L, lrVar);
        this.c = new org.telegram.ui.Components.c6(this, 300L, lrVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.b.d(canScrollHorizontally(-1));
        float d2 = this.c.d(canScrollHorizontally(1));
        if (d > 0.0f || d2 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), ks.e4, 31);
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
                mVar.n(canvas2, rectF, 0, d);
            }
            if (d2 > 0.0f) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set((getWidth() + getScrollX()) - org.telegram.messenger.g0.L(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                mVar.n(canvas2, rectF2, 2, d2);
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
        int i11 = this.d.l0;
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(i11, View.MeasureSpec.getSize(i7));
        }
        setMeasuredDimension(Math.min(measuredWidth, i11), getMeasuredHeight());
    }
}
