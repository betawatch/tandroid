package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.eh0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class m3 extends FrameLayout {
    public final /* synthetic */ o3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(o3 o3Var, Context context) {
        super(context);
        this.a = o3Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        o3 o3Var = this.a;
        if (view == o3Var.r && o3Var.K > 0.0f) {
            o3Var.O.set(0.0f, 0.0f, r1.getWidth(), o3Var.r.getHeight());
            o3Var.r.getMatrix().mapRect(o3Var.O);
            o3Var.O.offset(o3Var.r.getLeft(), o3Var.r.getTop());
            o3Var.O.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            float L = org.telegram.messenger.g0.L(28.0f);
            RectF rectF = o3Var.O;
            if (rectF.top < o3Var.K + L && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(o3Var.O, null);
                boolean drawChild = super.drawChild(canvas, view, j3);
                RectF rectF2 = o3Var.N;
                RectF rectF3 = o3Var.O;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, o3Var.K));
                if (o3Var.N.height() > 0.0f) {
                    canvas.drawRect(o3Var.N, o3Var.M.w(1.0f, 1));
                }
                RectF rectF4 = o3Var.N;
                RectF rectF5 = o3Var.O;
                float f10 = rectF5.left;
                float f11 = o3Var.K;
                rectF4.set(f10, f11, rectF5.right, L + f11);
                o3Var.M.m(canvas, o3Var.N, 1, 1.0f);
                canvas.restoreToCount(saveLayer);
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        o3 o3Var = this.a;
        TextView textView = o3Var.x;
        eh0 eh0Var = o3Var.w;
        h6 h6Var = o3Var.r;
        getLocationOnScreen(o3Var.W);
        int i13 = o3Var.I.a;
        int width = getWidth();
        i0.c cVar = o3Var.I;
        int e10 = i5.c.e(width - cVar.a, cVar.c, 2, i13);
        int height = ((getHeight() - o3Var.I.d) - org.telegram.messenger.g0.L(16.0f)) - (o3Var.c() ? eh0Var.getMeasuredHeight() : 0);
        eh0Var.layout(e10 - (eh0Var.getMeasuredWidth() / 2), height, ((eh0Var.getMeasuredWidth() + 1) / 2) + e10, eh0Var.getMeasuredHeight() + height);
        int L = org.telegram.messenger.g0.L(36.0f) + Math.max(o3Var.I.b, org.telegram.messenger.g0.m);
        textView.layout(e10 - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + e10, textView.getMeasuredHeight() + L);
        o3Var.d();
        int measuredHeight = (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f) : 0) + org.telegram.messenger.g0.L(24.0f) + Math.max(o3Var.I.b, org.telegram.messenger.g0.m);
        int max = Math.max(measuredHeight, Math.min(Math.max(measuredHeight, (height - org.telegram.messenger.g0.L(24.0f)) - h6Var.getMeasuredHeight()), (getHeight() - h6Var.getMeasuredHeight()) / 2));
        int measuredWidth = e10 - (h6Var.getMeasuredWidth() / 2);
        h6Var.layout(measuredWidth, max, h6Var.getMeasuredWidth() + measuredWidth, h6Var.getMeasuredHeight() + max);
        o3Var.s.layout(0, 0, getWidth(), getHeight());
        o3Var.n.layout(0, 0, getWidth(), getHeight());
        ih.d.c(o3Var.F, this);
        o3Var.e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        o3 o3Var = this.a;
        h6 h6Var = o3Var.r;
        i0.c cVar = o3Var.I;
        int max = Math.max(1, (size - cVar.a) - cVar.c);
        o3Var.w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(24.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30));
        TextView textView = o3Var.x;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(48.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(org.telegram.messenger.g0.L(420.0f), Math.max(1, max - org.telegram.messenger.g0.L(24.0f)));
        int max2 = Math.max(1, (((size2 - Math.max(o3Var.I.b, org.telegram.messenger.g0.m)) - o3Var.I.d) - org.telegram.messenger.g0.L(o3Var.c() ? 120.0f : 48.0f)) - (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f) : 0));
        h6Var.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (h6Var.getMeasuredHeight() > max2) {
            int paddingRight = h6Var.getPaddingRight() + h6Var.getPaddingLeft();
            int paddingBottom = h6Var.getPaddingBottom() + h6Var.getPaddingTop();
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max2 - paddingBottom) * (min - paddingRight)) / Math.max(1, h6Var.getMeasuredHeight() - paddingBottom)) + paddingRight), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        o3Var.s.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        o3Var.n.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }
}
