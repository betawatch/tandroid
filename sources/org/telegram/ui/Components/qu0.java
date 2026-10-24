package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class qu0 extends FrameLayout {
    public pl0 E;
    public int F;
    public pr0 G;
    public ko0 H;
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
    public ws0 h;
    public bh.l n;
    public pu0 r;
    public ys0 s;
    public ft0 v;
    public ht0 w;
    public us0 x;
    public et0 y;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        pr0 pr0Var = this.G;
        if (pr0Var == null || pr0Var.getVisibility() != 0) {
            return;
        }
        tl0 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
            if (this.F == 9) {
                dp += AndroidUtilities.dp(64.0f);
            }
            int i10 = this.F;
            if (i10 == 8 || xv0.z0(i10)) {
                dp += AndroidUtilities.dp(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
            this.G.setPivotX(r2.getMeasuredWidth());
            this.G.setPivotY(0.0f);
            this.G.setTranslationX(measuredWidth);
            this.G.setTranslationY(dp);
        }
        if (fastScroll.getProgress() > 0.85f) {
            xv0.r(this, null, false);
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
