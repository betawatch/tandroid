package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class v1 extends HorizontalScrollView {
    public final i61 a;
    public final org.telegram.ui.Components.c6 b;
    public final org.telegram.ui.Components.c6 c;
    public final /* synthetic */ b2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(b2 b2Var, Context context) {
        super(context);
        this.d = b2Var;
        this.a = new i61(1);
        kr krVar = kr.h;
        this.b = new org.telegram.ui.Components.c6(this, 300L, krVar);
        this.c = new org.telegram.ui.Components.c6(this, 300L, krVar);
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
            i61 i61Var = this.a;
            if (d > 0.0f) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(getScrollX(), 0.0f, org.telegram.messenger.g0.L(48.0f) + getScrollX(), getHeight());
                i61Var.u(canvas2, rectF, 0, d);
            }
            if (d2 > 0.0f) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set((getWidth() + getScrollX()) - org.telegram.messenger.g0.L(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                i61Var.u(canvas2, rectF2, 2, d2);
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
