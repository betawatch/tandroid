package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class rt0 extends FrameLayout {
    public c2.y B;
    public int C;
    public tq0 D;
    public a90 E;
    public boolean F;
    public int G;
    public boolean H;
    public float I;
    public long a;
    public boolean b;
    public ObjectAnimator c;
    public f2.l d;
    public f2.c1 e;
    public f2.c1 f;
    public xr0 h;
    public og.k n;
    public qt0 r;
    public zr0 s;
    public gs0 v;
    public is0 w;
    public vr0 x;
    public fs0 y;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        tq0 tq0Var = this.D;
        if (tq0Var == null || tq0Var.getVisibility() != 0) {
            return;
        }
        cl0 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
            if (this.C == 9) {
                dp += AndroidUtilities.dp(64.0f);
            }
            int i10 = this.C;
            if (i10 == 8 || zu0.w0(i10)) {
                dp += AndroidUtilities.dp(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.D.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
            this.D.setPivotX(r2.getMeasuredWidth());
            this.D.setPivotY(0.0f);
            this.D.setTranslationX(measuredWidth);
            this.D.setTranslationY(dp);
        }
        if (fastScroll.getProgress() > 0.85f) {
            zu0.q(this, null, false);
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
