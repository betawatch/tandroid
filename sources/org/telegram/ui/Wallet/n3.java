package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.sq0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class n3 extends FrameLayout {
    public final /* synthetic */ p3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(p3 p3Var, Context context) {
        super(context);
        this.a = p3Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        p3 p3Var = this.a;
        if (view == p3Var.r && p3Var.J > 0.0f) {
            p3Var.N.set(0.0f, 0.0f, r1.getWidth(), p3Var.r.getHeight());
            p3Var.r.getMatrix().mapRect(p3Var.N);
            p3Var.N.offset(p3Var.r.getLeft(), p3Var.r.getTop());
            p3Var.N.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            float L = org.telegram.messenger.g0.L(28.0f);
            RectF rectF = p3Var.N;
            if (rectF.top < p3Var.J + L && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(p3Var.N, null);
                boolean drawChild = super.drawChild(canvas, view, j3);
                RectF rectF2 = p3Var.M;
                RectF rectF3 = p3Var.N;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, p3Var.J));
                if (p3Var.M.height() > 0.0f) {
                    canvas.drawRect(p3Var.M, p3Var.L.u(1.0f, 1));
                }
                RectF rectF4 = p3Var.M;
                RectF rectF5 = p3Var.N;
                float f10 = rectF5.left;
                float f11 = p3Var.J;
                rectF4.set(f10, f11, rectF5.right, L + f11);
                p3Var.L.m(canvas, p3Var.M, 1, 1.0f);
                canvas.restoreToCount(saveLayer);
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        p3 p3Var = this.a;
        TextView textView = p3Var.x;
        sq0 sq0Var = p3Var.w;
        h6 h6Var = p3Var.r;
        getLocationOnScreen(p3Var.V);
        int i13 = p3Var.H.a;
        int width = getWidth();
        i0.b bVar = p3Var.H;
        int D = jg.g.D(width - bVar.a, bVar.c, 2, i13);
        int height = ((getHeight() - p3Var.H.d) - org.telegram.messenger.g0.L(16.0f)) - (p3Var.c() ? sq0Var.getMeasuredHeight() : 0);
        sq0Var.layout(D - (sq0Var.getMeasuredWidth() / 2), height, ((sq0Var.getMeasuredWidth() + 1) / 2) + D, sq0Var.getMeasuredHeight() + height);
        int L = org.telegram.messenger.g0.L(36.0f) + Math.max(p3Var.H.b, org.telegram.messenger.g0.m);
        textView.layout(D - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + D, textView.getMeasuredHeight() + L);
        p3Var.d();
        int measuredHeight = (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f) : 0) + org.telegram.messenger.g0.L(24.0f) + Math.max(p3Var.H.b, org.telegram.messenger.g0.m);
        int max = Math.max(measuredHeight, Math.min(Math.max(measuredHeight, (height - org.telegram.messenger.g0.L(24.0f)) - h6Var.getMeasuredHeight()), (getHeight() - h6Var.getMeasuredHeight()) / 2));
        int measuredWidth = D - (h6Var.getMeasuredWidth() / 2);
        h6Var.layout(measuredWidth, max, h6Var.getMeasuredWidth() + measuredWidth, h6Var.getMeasuredHeight() + max);
        p3Var.s.layout(0, 0, getWidth(), getHeight());
        p3Var.n.layout(0, 0, getWidth(), getHeight());
        ih.d.c(p3Var.E, this);
        p3Var.e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        p3 p3Var = this.a;
        h6 h6Var = p3Var.r;
        i0.b bVar = p3Var.H;
        int max = Math.max(1, (size - bVar.a) - bVar.c);
        p3Var.w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(24.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30));
        TextView textView = p3Var.x;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(48.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(org.telegram.messenger.g0.L(420.0f), Math.max(1, max - org.telegram.messenger.g0.L(24.0f)));
        int max2 = Math.max(1, (((size2 - Math.max(p3Var.H.b, org.telegram.messenger.g0.m)) - p3Var.H.d) - org.telegram.messenger.g0.L(p3Var.c() ? 120.0f : 48.0f)) - (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f) : 0));
        h6Var.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (h6Var.getMeasuredHeight() > max2) {
            int paddingRight = h6Var.getPaddingRight() + h6Var.getPaddingLeft();
            int paddingBottom = h6Var.getPaddingBottom() + h6Var.getPaddingTop();
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max2 - paddingBottom) * (min - paddingRight)) / Math.max(1, h6Var.getMeasuredHeight() - paddingBottom)) + paddingRight), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        p3Var.s.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        p3Var.n.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }
}
