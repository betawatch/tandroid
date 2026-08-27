package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class zs0 extends FrameLayout {
    public c2.x A;
    public int B;
    public zp0 C;
    public lg0 D;
    public boolean E;
    public int F;
    public boolean G;
    public float H;
    public long a;
    public boolean b;
    public ObjectAnimator c;
    public f2.l d;
    public f2.d1 e;
    public f2.d1 f;
    public er0 h;
    public jg.k n;
    public ys0 r;
    public gr0 s;
    public nr0 v;
    public pr0 w;
    public cr0 x;
    public mr0 y;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        zp0 zp0Var = this.C;
        if (zp0Var == null || zp0Var.getVisibility() != 0) {
            return;
        }
        ik0 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
            if (this.B == 9) {
                dp += AndroidUtilities.dp(64.0f);
            }
            int i10 = this.B;
            if (i10 == 8 || hu0.w0(i10)) {
                dp += AndroidUtilities.dp(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.C.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
            this.C.setPivotX(r2.getMeasuredWidth());
            this.C.setPivotY(0.0f);
            this.C.setTranslationX(measuredWidth);
            this.C.setTranslationY(dp);
        }
        if (fastScroll.getProgress() > 0.85f) {
            hu0.q(this, null, false);
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
