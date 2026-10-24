package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class w2 extends FrameLayout {
    public final /* synthetic */ y2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(y2 y2Var, Context context) {
        super(context);
        this.a = y2Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        y2 y2Var = this.a;
        if (view == y2Var.r && y2Var.J > 0.0f) {
            y2Var.N.set(0.0f, 0.0f, r1.getWidth(), y2Var.r.getHeight());
            y2Var.r.getMatrix().mapRect(y2Var.N);
            y2Var.N.offset(y2Var.r.getLeft(), y2Var.r.getTop());
            y2Var.N.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            float dp = AndroidUtilities.dp(28.0f);
            RectF rectF = y2Var.N;
            if (rectF.top < y2Var.J + dp && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(y2Var.N, null);
                boolean drawChild = super.drawChild(canvas, view, j10);
                RectF rectF2 = y2Var.M;
                RectF rectF3 = y2Var.N;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, y2Var.J));
                if (y2Var.M.height() > 0.0f) {
                    canvas.drawRect(y2Var.M, y2Var.L.c(1.0f, 1));
                }
                RectF rectF4 = y2Var.M;
                RectF rectF5 = y2Var.N;
                float f7 = rectF5.left;
                float f10 = y2Var.J;
                rectF4.set(f7, f10, rectF5.right, dp + f10);
                y2Var.L.b(canvas, y2Var.M, 1, 1.0f);
                canvas.restoreToCount(saveLayer);
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        y2 y2Var = this.a;
        TextView textView = y2Var.w;
        ci.h4 h4Var = y2Var.v;
        x5 x5Var = y2Var.r;
        getLocationOnScreen(y2Var.V);
        int i14 = y2Var.H.a;
        int width = getWidth();
        i0.b bVar = y2Var.H;
        int C = i2.o1.C(width - bVar.a, bVar.c, 2, i14);
        int height = ((getHeight() - y2Var.H.d) - AndroidUtilities.dp(16.0f)) - (y2Var.c() ? h4Var.getMeasuredHeight() : 0);
        h4Var.layout(C - (h4Var.getMeasuredWidth() / 2), height, ((h4Var.getMeasuredWidth() + 1) / 2) + C, h4Var.getMeasuredHeight() + height);
        int dp = AndroidUtilities.dp(36.0f) + Math.max(y2Var.H.b, AndroidUtilities.statusBarHeight);
        textView.layout(C - (textView.getMeasuredWidth() / 2), dp, ((textView.getMeasuredWidth() + 1) / 2) + C, textView.getMeasuredHeight() + dp);
        y2Var.d();
        int measuredHeight = (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + AndroidUtilities.dp(12.0f) : 0) + AndroidUtilities.dp(24.0f) + Math.max(y2Var.H.b, AndroidUtilities.statusBarHeight);
        int max = Math.max(measuredHeight, Math.min(Math.max(measuredHeight, (height - AndroidUtilities.dp(24.0f)) - x5Var.getMeasuredHeight()), (getHeight() - x5Var.getMeasuredHeight()) / 2));
        int measuredWidth = C - (x5Var.getMeasuredWidth() / 2);
        x5Var.layout(measuredWidth, max, x5Var.getMeasuredWidth() + measuredWidth, x5Var.getMeasuredHeight() + max);
        y2Var.s.layout(0, 0, getWidth(), getHeight());
        y2Var.n.layout(0, 0, getWidth(), getHeight());
        hh.d.c(y2Var.E, this);
        y2Var.e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        y2 y2Var = this.a;
        x5 x5Var = y2Var.r;
        i0.b bVar = y2Var.H;
        int max = Math.max(1, (size - bVar.a) - bVar.c);
        y2Var.v.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - AndroidUtilities.dp(24.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
        TextView textView = y2Var.w;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - AndroidUtilities.dp(48.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(AndroidUtilities.dp(420.0f), Math.max(1, max - AndroidUtilities.dp(24.0f)));
        int max2 = Math.max(1, (((size2 - Math.max(y2Var.H.b, AndroidUtilities.statusBarHeight)) - y2Var.H.d) - AndroidUtilities.dp(y2Var.c() ? 120.0f : 48.0f)) - (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + AndroidUtilities.dp(12.0f) : 0));
        x5Var.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (x5Var.getMeasuredHeight() > max2) {
            int paddingRight = x5Var.getPaddingRight() + x5Var.getPaddingLeft();
            int paddingBottom = x5Var.getPaddingBottom() + x5Var.getPaddingTop();
            x5Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max2 - paddingBottom) * (min - paddingRight)) / Math.max(1, x5Var.getMeasuredHeight() - paddingBottom)) + paddingRight), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        y2Var.s.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        y2Var.n.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }
}
