package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class jv0 extends ScrollSlidingTextTabStrip {
    public Paint p0;
    public int q0;
    public final Rect r0;
    public final /* synthetic */ xv0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv0(xv0 xv0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.s0 = xv0Var;
        this.q0 = 0;
        this.r0 = new Rect();
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.q0 != 0) {
            if (this.p0 == null) {
                this.p0 = new Paint();
            }
            this.p0.setColor(this.q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.s0.P(canvas, getY(), rect, this.p0);
            } else {
                canvas.drawPaint(this.p0);
            }
            canvas.translate(-getScrollX(), 0.0f);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.q0 = i10;
        invalidate();
    }
}
