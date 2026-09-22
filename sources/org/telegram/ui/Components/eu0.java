package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public abstract class eu0 extends FrameLayout {
    public bl0 E;
    public int F;
    public dr0 G;
    public yn0 H;
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
    public ks0 h;
    public ah.o n;
    public du0 r;
    public ms0 s;
    public ts0 v;
    public vs0 w;
    public is0 x;
    public ss0 y;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dr0 dr0Var = this.G;
        if (dr0Var == null || dr0Var.getVisibility() != 0) {
            return;
        }
        fl0 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
            if (this.F == 9) {
                dp += AndroidUtilities.dp(64.0f);
            }
            int i10 = this.F;
            if (i10 == 8 || lv0.w0(i10)) {
                dp += AndroidUtilities.dp(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
            this.G.setPivotX(r2.getMeasuredWidth());
            this.G.setPivotY(0.0f);
            this.G.setTranslationX(measuredWidth);
            this.G.setTranslationY(dp);
        }
        if (fastScroll.getProgress() > 0.85f) {
            lv0.q(this, null, false);
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
