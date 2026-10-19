package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public abstract class mu0 extends FrameLayout {
    public ll0 E;
    public int F;
    public lr0 G;
    public go0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long a;
    public boolean b;
    public ObjectAnimator c;
    public s4.k d;
    public s4.t0 e;
    public s4.t0 f;
    public ss0 h;
    public bh.l n;
    public lu0 r;
    public us0 s;
    public bt0 v;
    public dt0 w;
    public qs0 x;
    public at0 y;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        lr0 lr0Var = this.G;
        if (lr0Var == null || lr0Var.getVisibility() != 0) {
            return;
        }
        pl0 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
            if (this.F == 9) {
                dp += AndroidUtilities.dp(64.0f);
            }
            int i10 = this.F;
            if (i10 == 8 || tv0.y0(i10)) {
                dp += AndroidUtilities.dp(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
            this.G.setPivotX(r2.getMeasuredWidth());
            this.G.setPivotY(0.0f);
            this.G.setTranslationX(measuredWidth);
            this.G.setTranslationY(dp);
        }
        if (fastScroll.getProgress() > 0.85f) {
            tv0.r(this, null, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }
}
