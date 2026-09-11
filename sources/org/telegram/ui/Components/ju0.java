package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class ju0 extends ScrollSlidingTextTabStrip {
    public Paint p0;
    public int q0;
    public final Rect r0;
    public final /* synthetic */ xu0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju0(xu0 xu0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.s0 = xu0Var;
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
