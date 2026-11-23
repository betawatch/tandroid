package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.gh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class v3 extends FrameLayout {
    public final /* synthetic */ x3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(x3 x3Var, Context context) {
        super(context);
        this.a = x3Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        x3 x3Var = this.a;
        if (view == x3Var.r && x3Var.K > 0.0f) {
            x3Var.O.set(0.0f, 0.0f, r1.getWidth(), x3Var.r.getHeight());
            x3Var.r.getMatrix().mapRect(x3Var.O);
            x3Var.O.offset(x3Var.r.getLeft(), x3Var.r.getTop());
            x3Var.O.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            float L = org.telegram.messenger.g0.L(28.0f);
            RectF rectF = x3Var.O;
            if (rectF.top < x3Var.K + L && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(x3Var.O, null);
                boolean drawChild = super.drawChild(canvas, view, j3);
                RectF rectF2 = x3Var.N;
                RectF rectF3 = x3Var.O;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, x3Var.K));
                if (x3Var.N.height() > 0.0f) {
                    canvas.drawRect(x3Var.N, x3Var.M.D(1.0f, 1));
                }
                RectF rectF4 = x3Var.N;
                RectF rectF5 = x3Var.O;
                float f10 = rectF5.left;
                float f11 = x3Var.K;
                rectF4.set(f10, f11, rectF5.right, L + f11);
                x3Var.M.u(canvas, x3Var.N, 1, 1.0f);
                canvas.restoreToCount(saveLayer);
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        x3 x3Var = this.a;
        TextView textView = x3Var.x;
        gh0 gh0Var = x3Var.w;
        y6 y6Var = x3Var.r;
        getLocationOnScreen(x3Var.W);
        int i13 = x3Var.I.a;
        int width = getWidth();
        i0.b bVar = x3Var.I;
        int e10 = i5.c.e(width - bVar.a, bVar.c, 2, i13);
        int height = ((getHeight() - x3Var.I.d) - org.telegram.messenger.g0.L(16.0f)) - (x3Var.c() ? gh0Var.getMeasuredHeight() : 0);
        gh0Var.layout(e10 - (gh0Var.getMeasuredWidth() / 2), height, ((gh0Var.getMeasuredWidth() + 1) / 2) + e10, gh0Var.getMeasuredHeight() + height);
        int L = org.telegram.messenger.g0.L(36.0f) + Math.max(x3Var.I.b, org.telegram.messenger.g0.m);
        textView.layout(e10 - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + e10, textView.getMeasuredHeight() + L);
        x3Var.d();
        int measuredHeight = (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f) : 0) + org.telegram.messenger.g0.L(24.0f) + Math.max(x3Var.I.b, org.telegram.messenger.g0.m);
        int max = Math.max(measuredHeight, Math.min(Math.max(measuredHeight, (height - org.telegram.messenger.g0.L(24.0f)) - y6Var.getMeasuredHeight()), (getHeight() - y6Var.getMeasuredHeight()) / 2));
        int measuredWidth = e10 - (y6Var.getMeasuredWidth() / 2);
        y6Var.layout(measuredWidth, max, y6Var.getMeasuredWidth() + measuredWidth, y6Var.getMeasuredHeight() + max);
        x3Var.s.layout(0, 0, getWidth(), getHeight());
        x3Var.n.layout(0, 0, getWidth(), getHeight());
        ih.d.c(x3Var.F, this);
        x3Var.e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        x3 x3Var = this.a;
        y6 y6Var = x3Var.r;
        i0.b bVar = x3Var.I;
        int max = Math.max(1, (size - bVar.a) - bVar.c);
        x3Var.w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(24.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30));
        TextView textView = x3Var.x;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(48.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(org.telegram.messenger.g0.L(420.0f), Math.max(1, max - org.telegram.messenger.g0.L(24.0f)));
        int max2 = Math.max(1, (((size2 - Math.max(x3Var.I.b, org.telegram.messenger.g0.m)) - x3Var.I.d) - org.telegram.messenger.g0.L(x3Var.c() ? 120.0f : 48.0f)) - (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f) : 0));
        y6Var.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (y6Var.getMeasuredHeight() > max2) {
            int paddingRight = y6Var.getPaddingRight() + y6Var.getPaddingLeft();
            int paddingBottom = y6Var.getPaddingBottom() + y6Var.getPaddingTop();
            y6Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max2 - paddingBottom) * (min - paddingRight)) / Math.max(1, y6Var.getMeasuredHeight() - paddingBottom)) + paddingRight), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        x3Var.s.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        x3Var.n.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }
}
