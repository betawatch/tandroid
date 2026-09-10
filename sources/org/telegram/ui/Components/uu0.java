package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class uu0 extends ScrollSlidingTextTabStrip {
    public Paint p0;
    public int q0;
    public final Rect r0;
    public final /* synthetic */ iv0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu0(iv0 iv0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.s0 = iv0Var;
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
