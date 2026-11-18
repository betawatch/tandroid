package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.hh0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class u3 extends FrameLayout {
    public final /* synthetic */ w3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(w3 w3Var, Context context) {
        super(context);
        this.a = w3Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        w3 w3Var = this.a;
        if (view == w3Var.r && w3Var.K > 0.0f) {
            w3Var.O.set(0.0f, 0.0f, r1.getWidth(), w3Var.r.getHeight());
            w3Var.r.getMatrix().mapRect(w3Var.O);
            w3Var.O.offset(w3Var.r.getLeft(), w3Var.r.getTop());
            w3Var.O.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            float L = org.telegram.messenger.g0.L(28.0f);
            RectF rectF = w3Var.O;
            if (rectF.top < w3Var.K + L && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(w3Var.O, null);
                boolean drawChild = super.drawChild(canvas, view, j3);
                RectF rectF2 = w3Var.N;
                RectF rectF3 = w3Var.O;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, w3Var.K));
                if (w3Var.N.height() > 0.0f) {
                    canvas.drawRect(w3Var.N, w3Var.M.B(1.0f, 1));
                }
                RectF rectF4 = w3Var.N;
                RectF rectF5 = w3Var.O;
                float f10 = rectF5.left;
                float f11 = w3Var.K;
                rectF4.set(f10, f11, rectF5.right, L + f11);
                w3Var.M.n(canvas, w3Var.N, 1, 1.0f);
                canvas.restoreToCount(saveLayer);
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        w3 w3Var = this.a;
        TextView textView = w3Var.x;
        hh0 hh0Var = w3Var.w;
        x6 x6Var = w3Var.r;
        getLocationOnScreen(w3Var.W);
        int i13 = w3Var.I.a;
        int width = getWidth();
        i0.b bVar = w3Var.I;
        int e10 = i5.c.e(width - bVar.a, bVar.c, 2, i13);
        int height = ((getHeight() - w3Var.I.d) - org.telegram.messenger.g0.L(16.0f)) - (w3Var.c() ? hh0Var.getMeasuredHeight() : 0);
        hh0Var.layout(e10 - (hh0Var.getMeasuredWidth() / 2), height, ((hh0Var.getMeasuredWidth() + 1) / 2) + e10, hh0Var.getMeasuredHeight() + height);
        int L = org.telegram.messenger.g0.L(36.0f) + Math.max(w3Var.I.b, org.telegram.messenger.g0.m);
        textView.layout(e10 - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + e10, textView.getMeasuredHeight() + L);
        w3Var.d();
        int measuredHeight = (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f) : 0) + org.telegram.messenger.g0.L(24.0f) + Math.max(w3Var.I.b, org.telegram.messenger.g0.m);
        int max = Math.max(measuredHeight, Math.min(Math.max(measuredHeight, (height - org.telegram.messenger.g0.L(24.0f)) - x6Var.getMeasuredHeight()), (getHeight() - x6Var.getMeasuredHeight()) / 2));
        int measuredWidth = e10 - (x6Var.getMeasuredWidth() / 2);
        x6Var.layout(measuredWidth, max, x6Var.getMeasuredWidth() + measuredWidth, x6Var.getMeasuredHeight() + max);
        w3Var.s.layout(0, 0, getWidth(), getHeight());
        w3Var.n.layout(0, 0, getWidth(), getHeight());
        ih.d.c(w3Var.F, this);
        w3Var.e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        w3 w3Var = this.a;
        x6 x6Var = w3Var.r;
        i0.b bVar = w3Var.I;
        int max = Math.max(1, (size - bVar.a) - bVar.c);
        w3Var.w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(24.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30));
        TextView textView = w3Var.x;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(48.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(org.telegram.messenger.g0.L(420.0f), Math.max(1, max - org.telegram.messenger.g0.L(24.0f)));
        int max2 = Math.max(1, (((size2 - Math.max(w3Var.I.b, org.telegram.messenger.g0.m)) - w3Var.I.d) - org.telegram.messenger.g0.L(w3Var.c() ? 120.0f : 48.0f)) - (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f) : 0));
        x6Var.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (x6Var.getMeasuredHeight() > max2) {
            int paddingRight = x6Var.getPaddingRight() + x6Var.getPaddingLeft();
            int paddingBottom = x6Var.getPaddingBottom() + x6Var.getPaddingTop();
            x6Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max2 - paddingBottom) * (min - paddingRight)) / Math.max(1, x6Var.getMeasuredHeight() - paddingBottom)) + paddingRight), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        w3Var.s.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        w3Var.n.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }
}
