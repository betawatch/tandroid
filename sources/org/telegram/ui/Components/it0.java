package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class it0 extends FrameLayout {
    public c2.z A;
    public int B;
    public kq0 C;
    public ii0 D;
    public boolean E;
    public int F;
    public boolean G;
    public float H;
    public long a;
    public boolean b;
    public ObjectAnimator c;
    public f2.l d;
    public f2.c1 e;
    public f2.c1 f;
    public or0 h;
    public lg.k n;
    public ht0 r;
    public qr0 s;
    public xr0 v;
    public zr0 w;
    public mr0 x;
    public wr0 y;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        kq0 kq0Var = this.C;
        if (kq0Var == null || kq0Var.getVisibility() != 0) {
            return;
        }
        sk0 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
            if (this.B == 9) {
                dp += AndroidUtilities.dp(64.0f);
            }
            int i10 = this.B;
            if (i10 == 8 || qu0.w0(i10)) {
                dp += AndroidUtilities.dp(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.C.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
            this.C.setPivotX(r2.getMeasuredWidth());
            this.C.setPivotY(0.0f);
            this.C.setTranslationX(measuredWidth);
            this.C.setTranslationY(dp);
        }
        if (fastScroll.getProgress() > 0.85f) {
            qu0.q(this, null, false);
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
