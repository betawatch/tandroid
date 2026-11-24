// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ef9 extends HorizontalScrollView {
    public final in3 a;
    public final ln b;
    public final ln c;
    public final /* synthetic */ jf9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef9(jf9 jf9Var, Context context) {
        super(context);
        this.d = jf9Var;
        this.a = new in3((byte) 7);
        d53 d53Var = d53.h;
        this.b = new ln(300L, this, d53Var);
        this.c = new ln(300L, this, d53Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.b.d(canScrollHorizontally(-1));
        float d2 = this.c.d(canScrollHorizontally(1));
        if (d > 0.0f || d2 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), nm7.d4, 31);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        if (d > 0.0f || d2 > 0.0f) {
            canvas2.save();
            in3 in3Var = this.a;
            if (d > 0.0f) {
                RectF rectF = gm.P;
                rectF.set(getScrollX(), 0.0f, gm.L(48.0f) + getScrollX(), getHeight());
                in3Var.r(canvas2, rectF, 0, d);
            }
            if (d2 > 0.0f) {
                RectF rectF2 = gm.P;
                rectF2.set((getWidth() + getScrollX()) - gm.L(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                in3Var.r(canvas2, rectF2, 2, d2);
            }
            canvas2.restore();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == 1073741824) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i2);
        int measuredWidth = getMeasuredWidth();
        int i3 = this.d.l0;
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(i3, View.MeasureSpec.getSize(i));
        }
        setMeasuredDimension(Math.min(measuredWidth, i3), getMeasuredHeight());
    }
}
