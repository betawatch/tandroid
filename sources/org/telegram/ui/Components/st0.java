package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class st0 extends FrameLayout {
    public pk0 E;
    public int F;
    public pq0 G;
    public br0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long a;
    public boolean b;
    public ObjectAnimator c;
    public s4.j d;
    public s4.u0 e;
    public s4.u0 f;
    public yr0 h;
    public ah.o n;
    public rt0 r;
    public as0 s;
    public hs0 v;
    public js0 w;
    public wr0 x;
    public gs0 y;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        pq0 pq0Var = this.G;
        if (pq0Var == null || pq0Var.getVisibility() != 0) {
            return;
        }
        tk0 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
            if (this.F == 9) {
                dp += AndroidUtilities.dp(64.0f);
            }
            int i10 = this.F;
            if (i10 == 8 || zu0.w0(i10)) {
                dp += AndroidUtilities.dp(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
            this.G.setPivotX(r2.getMeasuredWidth());
            this.G.setPivotY(0.0f);
            this.G.setTranslationX(measuredWidth);
            this.G.setTranslationY(dp);
        }
        if (fastScroll.getProgress() > 0.85f) {
            zu0.q(this, null, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
