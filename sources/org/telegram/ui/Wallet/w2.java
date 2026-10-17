package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class w2 extends FrameLayout {
    public final /* synthetic */ x2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var, Context context) {
        super(context);
        this.a = x2Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x2 x2Var = this.a;
        Bitmap bitmap = x2Var.E;
        if (bitmap != null && !bitmap.isRecycled()) {
            x2Var.w.set(0.0f, 0.0f, getWidth(), getHeight());
            x2Var.v.setAlpha(Math.round(x2Var.G * 255.0f));
            canvas.drawBitmap(x2Var.E, (Rect) null, x2Var.w, x2Var.v);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        x2 x2Var = this.a;
        if (view != x2Var.h || x2Var.H <= 0.0f) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        boolean drawChild = super.drawChild(canvas, view, j10);
        float dp = AndroidUtilities.dp(28.0f);
        x2Var.K.set(0.0f, 0.0f, getWidth(), x2Var.H);
        canvas.drawRect(x2Var.K, x2Var.J.c(1.0f, 1));
        x2Var.K.set(0.0f, x2Var.H, getWidth(), x2Var.H + dp);
        x2Var.J.b(canvas, x2Var.K, 1, 1.0f);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        x2 x2Var = this.a;
        v5 v5Var = x2Var.h;
        TextView textView = x2Var.s;
        ci.i4 i4Var = x2Var.r;
        getLocationOnScreen(x2Var.Q);
        int i14 = x2Var.F.a;
        int width = getWidth();
        i0.c cVar = x2Var.F;
        int C = i0.a.C(width - cVar.a, cVar.c, 2, i14);
        int height = ((getHeight() - x2Var.F.d) - AndroidUtilities.dp(16.0f)) - (x2Var.c() ? i4Var.getMeasuredHeight() : 0);
        i4Var.layout(C - (i4Var.getMeasuredWidth() / 2), height, ((i4Var.getMeasuredWidth() + 1) / 2) + C, i4Var.getMeasuredHeight() + height);
        int dp = AndroidUtilities.dp(36.0f) + Math.max(x2Var.F.b, AndroidUtilities.statusBarHeight);
        textView.layout(C - (textView.getMeasuredWidth() / 2), dp, ((textView.getMeasuredWidth() + 1) / 2) + C, textView.getMeasuredHeight() + dp);
        int measuredHeight = (x2Var.d ? textView.getMeasuredHeight() + AndroidUtilities.dp(12.0f) : 0) + AndroidUtilities.dp(24.0f) + Math.max(x2Var.F.b, AndroidUtilities.statusBarHeight);
        int max = Math.max(measuredHeight, Math.min(Math.max(measuredHeight, (height - AndroidUtilities.dp(24.0f)) - v5Var.getMeasuredHeight()), Math.round((x2Var.e.centerY() - r13[1]) - AndroidUtilities.dp(12.0f))));
        int measuredWidth = C - (v5Var.getMeasuredWidth() / 2);
        v5Var.layout(measuredWidth, max, v5Var.getMeasuredWidth() + measuredWidth, v5Var.getMeasuredHeight() + max);
        x2Var.n.layout(0, 0, getWidth(), getHeight());
        hh.d.c(x2Var.x, this);
        x2Var.d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        x2 x2Var = this.a;
        v5 v5Var = x2Var.h;
        i0.c cVar = x2Var.F;
        int max = Math.max(1, (size - cVar.a) - cVar.c);
        x2Var.r.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - AndroidUtilities.dp(24.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
        TextView textView = x2Var.s;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - AndroidUtilities.dp(48.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(AndroidUtilities.dp(420.0f), Math.max(1, max - AndroidUtilities.dp(24.0f)));
        int max2 = Math.max(1, (((size2 - Math.max(x2Var.F.b, AndroidUtilities.statusBarHeight)) - x2Var.F.d) - AndroidUtilities.dp(x2Var.c() ? 120.0f : 48.0f)) - (x2Var.d ? textView.getMeasuredHeight() + AndroidUtilities.dp(12.0f) : 0));
        v5Var.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (v5Var.getMeasuredHeight() > max2) {
            int paddingRight = v5Var.getPaddingRight() + v5Var.getPaddingLeft();
            int paddingBottom = v5Var.getPaddingBottom() + v5Var.getPaddingTop();
            v5Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max2 - paddingBottom) * (min - paddingRight)) / Math.max(1, v5Var.getMeasuredHeight() - paddingBottom)) + paddingRight), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        x2Var.n.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }
}
