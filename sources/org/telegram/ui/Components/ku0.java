package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class ku0 extends ScrollSlidingTextTabStrip {
    public Paint m0;
    public int n0;
    public final Rect o0;
    public final /* synthetic */ yu0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.p0 = yu0Var;
        this.n0 = 0;
        this.o0 = new Rect();
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.n0 != 0) {
            if (this.m0 == null) {
                this.m0 = new Paint();
            }
            this.m0.setColor(this.n0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.o0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.c0);
            if (SharedConfig.chatBlurEnabled()) {
                this.p0.P(canvas, getY(), rect, this.m0);
            } else {
                canvas.drawPaint(this.m0);
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
        this.n0 = i10;
        invalidate();
    }
}
