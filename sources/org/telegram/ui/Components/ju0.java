package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public abstract class ju0 extends FrameLayout {
    public bl0 E;
    public int F;
    public hr0 G;
    public vo0 H;
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
    public ps0 h;
    public ah.n n;
    public iu0 r;
    public rs0 s;
    public ys0 v;
    public at0 w;
    public ns0 x;
    public xs0 y;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        hr0 hr0Var = this.G;
        if (hr0Var == null || hr0Var.getVisibility() != 0) {
            return;
        }
        fl0 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
            if (this.F == 9) {
                dp += AndroidUtilities.dp(64.0f);
            }
            int i10 = this.F;
            if (i10 == 8 || qv0.w0(i10)) {
                dp += AndroidUtilities.dp(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
            this.G.setPivotX(r2.getMeasuredWidth());
            this.G.setPivotY(0.0f);
            this.G.setTranslationX(measuredWidth);
            this.G.setTranslationY(dp);
        }
        if (fastScroll.getProgress() > 0.85f) {
            qv0.q(this, null, false);
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
