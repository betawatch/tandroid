package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.dg0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n3 extends FrameLayout {
    public final /* synthetic */ p3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(p3 p3Var, Context context) {
        super(context);
        this.a = p3Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        p3 p3Var = this.a;
        if (view == p3Var.r && p3Var.J > 0.0f) {
            p3Var.N.set(0.0f, 0.0f, r1.getWidth(), p3Var.r.getHeight());
            p3Var.r.getMatrix().mapRect(p3Var.N);
            p3Var.N.offset(p3Var.r.getLeft(), p3Var.r.getTop());
            p3Var.N.inset(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
            float L = org.telegram.messenger.i0.L(28.0f);
            RectF rectF = p3Var.N;
            if (rectF.top < p3Var.J + L && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(p3Var.N, null);
                boolean drawChild = super.drawChild(canvas, view, j10);
                RectF rectF2 = p3Var.M;
                RectF rectF3 = p3Var.N;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, p3Var.J));
                if (p3Var.M.height() > 0.0f) {
                    canvas.drawRect(p3Var.M, p3Var.L.D(1.0f, 1));
                }
                RectF rectF4 = p3Var.M;
                RectF rectF5 = p3Var.N;
                float f7 = rectF5.left;
                float f10 = p3Var.J;
                rectF4.set(f7, f10, rectF5.right, L + f10);
                p3Var.L.o(canvas, p3Var.M, 1, 1.0f);
                canvas.restoreToCount(saveLayer);
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        p3 p3Var = this.a;
        TextView textView = p3Var.x;
        dg0 dg0Var = p3Var.w;
        l6 l6Var = p3Var.r;
        getLocationOnScreen(p3Var.V);
        int i14 = p3Var.H.a;
        int width = getWidth();
        i0.c cVar = p3Var.H;
        int u10 = i0.a.u(width - cVar.a, cVar.c, 2, i14);
        int height = ((getHeight() - p3Var.H.d) - org.telegram.messenger.i0.L(16.0f)) - (p3Var.c() ? dg0Var.getMeasuredHeight() : 0);
        dg0Var.layout(u10 - (dg0Var.getMeasuredWidth() / 2), height, ((dg0Var.getMeasuredWidth() + 1) / 2) + u10, dg0Var.getMeasuredHeight() + height);
        int L = org.telegram.messenger.i0.L(36.0f) + Math.max(p3Var.H.b, org.telegram.messenger.i0.m);
        textView.layout(u10 - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + u10, textView.getMeasuredHeight() + L);
        p3Var.d();
        int measuredHeight = (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + org.telegram.messenger.i0.L(12.0f) : 0) + org.telegram.messenger.i0.L(24.0f) + Math.max(p3Var.H.b, org.telegram.messenger.i0.m);
        int max = Math.max(measuredHeight, Math.min(Math.max(measuredHeight, (height - org.telegram.messenger.i0.L(24.0f)) - l6Var.getMeasuredHeight()), (getHeight() - l6Var.getMeasuredHeight()) / 2));
        int measuredWidth = u10 - (l6Var.getMeasuredWidth() / 2);
        l6Var.layout(measuredWidth, max, l6Var.getMeasuredWidth() + measuredWidth, l6Var.getMeasuredHeight() + max);
        p3Var.s.layout(0, 0, getWidth(), getHeight());
        p3Var.n.layout(0, 0, getWidth(), getHeight());
        yg.d.c(p3Var.E, this);
        p3Var.e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        p3 p3Var = this.a;
        l6 l6Var = p3Var.r;
        i0.c cVar = p3Var.H;
        int max = Math.max(1, (size - cVar.a) - cVar.c);
        p3Var.w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.i0.L(24.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), TLObject.FLAG_30));
        TextView textView = p3Var.x;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.i0.L(48.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(org.telegram.messenger.i0.L(420.0f), Math.max(1, max - org.telegram.messenger.i0.L(24.0f)));
        int max2 = Math.max(1, (((size2 - Math.max(p3Var.H.b, org.telegram.messenger.i0.m)) - p3Var.H.d) - org.telegram.messenger.i0.L(p3Var.c() ? 120.0f : 48.0f)) - (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + org.telegram.messenger.i0.L(12.0f) : 0));
        l6Var.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (l6Var.getMeasuredHeight() > max2) {
            int paddingRight = l6Var.getPaddingRight() + l6Var.getPaddingLeft();
            int paddingBottom = l6Var.getPaddingBottom() + l6Var.getPaddingTop();
            l6Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max2 - paddingBottom) * (min - paddingRight)) / Math.max(1, l6Var.getMeasuredHeight() - paddingBottom)) + paddingRight), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        p3Var.s.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        p3Var.n.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }
}
