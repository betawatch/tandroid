package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class qt0 extends FrameLayout {
    public c2.y B;
    public int C;
    public sq0 D;
    public b90 E;
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
    public wr0 h;
    public og.k n;
    public pt0 r;
    public yr0 s;
    public fs0 v;
    public hs0 w;
    public ur0 x;
    public es0 y;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        sq0 sq0Var = this.D;
        if (sq0Var == null || sq0Var.getVisibility() != 0) {
            return;
        }
        bl0 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
            if (this.C == 9) {
                dp += AndroidUtilities.dp(64.0f);
            }
            int i10 = this.C;
            if (i10 == 8 || yu0.w0(i10)) {
                dp += AndroidUtilities.dp(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.D.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
            this.D.setPivotX(r2.getMeasuredWidth());
            this.D.setPivotY(0.0f);
            this.D.setTranslationX(measuredWidth);
            this.D.setTranslationY(dp);
        }
        if (fastScroll.getProgress() > 0.85f) {
            yu0.q(this, null, false);
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
