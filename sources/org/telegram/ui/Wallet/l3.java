package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.yg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l3 extends FrameLayout {
    public final /* synthetic */ n3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(n3 n3Var, Context context) {
        super(context);
        this.a = n3Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        n3 n3Var = this.a;
        if (view == n3Var.r && n3Var.K > 0.0f) {
            n3Var.O.set(0.0f, 0.0f, r1.getWidth(), n3Var.r.getHeight());
            n3Var.r.getMatrix().mapRect(n3Var.O);
            n3Var.O.offset(n3Var.r.getLeft(), n3Var.r.getTop());
            n3Var.O.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            float L = org.telegram.messenger.g0.L(28.0f);
            RectF rectF = n3Var.O;
            if (rectF.top < n3Var.K + L && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(n3Var.O, null);
                boolean drawChild = super.drawChild(canvas, view, j10);
                RectF rectF2 = n3Var.N;
                RectF rectF3 = n3Var.O;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, n3Var.K));
                if (n3Var.N.height() > 0.0f) {
                    canvas.drawRect(n3Var.N, n3Var.M.D(1.0f, 1));
                }
                RectF rectF4 = n3Var.N;
                RectF rectF5 = n3Var.O;
                float f10 = rectF5.left;
                float f11 = n3Var.K;
                rectF4.set(f10, f11, rectF5.right, L + f11);
                n3Var.M.w(canvas, n3Var.N, 1, 1.0f);
                canvas.restoreToCount(saveLayer);
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        n3 n3Var = this.a;
        TextView textView = n3Var.x;
        yg0 yg0Var = n3Var.w;
        f6 f6Var = n3Var.r;
        getLocationOnScreen(n3Var.W);
        int i13 = n3Var.I.a;
        int width = getWidth();
        i0.b bVar = n3Var.I;
        int e10 = k2.p1.e(width - bVar.a, bVar.c, 2, i13);
        int height = ((getHeight() - n3Var.I.d) - org.telegram.messenger.g0.L(16.0f)) - (n3Var.c() ? yg0Var.getMeasuredHeight() : 0);
        yg0Var.layout(e10 - (yg0Var.getMeasuredWidth() / 2), height, ((yg0Var.getMeasuredWidth() + 1) / 2) + e10, yg0Var.getMeasuredHeight() + height);
        int L = org.telegram.messenger.g0.L(36.0f) + Math.max(n3Var.I.b, org.telegram.messenger.g0.m);
        textView.layout(e10 - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + e10, textView.getMeasuredHeight() + L);
        n3Var.d();
        int measuredHeight = (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f) : 0) + org.telegram.messenger.g0.L(24.0f) + Math.max(n3Var.I.b, org.telegram.messenger.g0.m);
        int max = Math.max(measuredHeight, Math.min(Math.max(measuredHeight, (height - org.telegram.messenger.g0.L(24.0f)) - f6Var.getMeasuredHeight()), (getHeight() - f6Var.getMeasuredHeight()) / 2));
        int measuredWidth = e10 - (f6Var.getMeasuredWidth() / 2);
        f6Var.layout(measuredWidth, max, f6Var.getMeasuredWidth() + measuredWidth, f6Var.getMeasuredHeight() + max);
        n3Var.s.layout(0, 0, getWidth(), getHeight());
        n3Var.n.layout(0, 0, getWidth(), getHeight());
        jh.d.c(n3Var.F, this);
        n3Var.e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        n3 n3Var = this.a;
        f6 f6Var = n3Var.r;
        i0.b bVar = n3Var.I;
        int max = Math.max(1, (size - bVar.a) - bVar.c);
        n3Var.w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(24.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30));
        TextView textView = n3Var.x;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(48.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(org.telegram.messenger.g0.L(420.0f), Math.max(1, max - org.telegram.messenger.g0.L(24.0f)));
        int max2 = Math.max(1, (((size2 - Math.max(n3Var.I.b, org.telegram.messenger.g0.m)) - n3Var.I.d) - org.telegram.messenger.g0.L(n3Var.c() ? 120.0f : 48.0f)) - (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f) : 0));
        f6Var.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (f6Var.getMeasuredHeight() > max2) {
            int paddingRight = f6Var.getPaddingRight() + f6Var.getPaddingLeft();
            int paddingBottom = f6Var.getPaddingBottom() + f6Var.getPaddingTop();
            f6Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max2 - paddingBottom) * (min - paddingRight)) / Math.max(1, f6Var.getMeasuredHeight() - paddingBottom)) + paddingRight), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        n3Var.s.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        n3Var.n.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }
}
