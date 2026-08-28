package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class qt0 extends ScrollSlidingTextTabStrip {
    public Paint l0;
    public int m0;
    public final Rect n0;
    public final /* synthetic */ eu0 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt0(eu0 eu0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.o0 = eu0Var;
        this.m0 = 0;
        this.n0 = new Rect();
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.m0 != 0) {
            if (this.l0 == null) {
                this.l0 = new Paint();
            }
            this.l0.setColor(this.m0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.n0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.b0);
            if (SharedConfig.chatBlurEnabled()) {
                this.o0.P(canvas, getY(), rect, this.l0);
            } else {
                canvas.drawPaint(this.l0);
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
    public void setBackgroundColor(int i9) {
        this.m0 = i9;
        invalidate();
    }
}
