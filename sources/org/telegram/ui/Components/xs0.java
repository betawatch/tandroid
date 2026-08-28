package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class xs0 extends FrameLayout {
    public c2.y A;
    public int B;
    public yp0 C;
    public jg0 D;
    public boolean E;
    public int F;
    public boolean G;
    public float H;
    public long a;
    public boolean b;
    public ObjectAnimator c;
    public f2.n d;
    public f2.f1 e;
    public f2.f1 f;
    public dr0 h;
    public ig.k n;
    public ws0 r;
    public fr0 s;
    public mr0 v;
    public or0 w;
    public br0 x;
    public lr0 y;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yp0 yp0Var = this.C;
        if (yp0Var == null || yp0Var.getVisibility() != 0) {
            return;
        }
        fk0 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
            if (this.B == 9) {
                dp += AndroidUtilities.dp(64.0f);
            }
            int i9 = this.B;
            if (i9 == 8 || eu0.w0(i9)) {
                dp += AndroidUtilities.dp(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.C.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
            this.C.setPivotX(r2.getMeasuredWidth());
            this.C.setPivotY(0.0f);
            this.C.setTranslationX(measuredWidth);
            this.C.setTranslationY(dp);
        }
        if (fastScroll.getProgress() > 0.85f) {
            eu0.q(this, null, false);
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
