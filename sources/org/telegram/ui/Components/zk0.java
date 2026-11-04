package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class zk0 extends HorizontalScrollView {
    public boolean a;
    public LinearLayout b;
    public ValueAnimator c;
    public boolean d;
    public int e;
    public ValueAnimator f;

    public zk0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i3) {
        if (this.e == i3) {
            return;
        }
        this.e = i3;
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (getScrollX() == i3) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i3);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new y50(this, 14));
        this.f.setInterpolator(xq.h);
        this.f.setDuration(250L);
        this.f.addListener(new a60(this, 16));
        this.f.start();
    }

    public final void b(int i3, int i10) {
        int measuredWidth;
        if (getChildCount() <= 0) {
            return;
        }
        int L = org.telegram.messenger.g0.L(50.0f);
        if (i3 < getScrollX() + L) {
            measuredWidth = i3 - L;
        } else {
            if (i10 <= (getMeasuredWidth() - L) + getScrollX()) {
                return;
            } else {
                measuredWidth = (i10 - getMeasuredWidth()) + L;
            }
        }
        a(b8.be.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
    }

    public final void c() {
        g5 g5Var;
        ei.c3 c3Var;
        ch0 ch0Var;
        ValueAnimator valueAnimator;
        int childCount = this.b.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.b.getChildAt(i3);
            if (childAt instanceof vu) {
                vu vuVar = (vu) childAt;
                boolean z10 = childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth();
                boolean z11 = this.d && ((valueAnimator = this.c) == null || !valueAnimator.isRunning());
                if (!vuVar.E && z10 && (ch0Var = vuVar.e) != null && !ch0Var.l0 && !z11) {
                    vuVar.e.T(true, 0.0f);
                    vuVar.e.start();
                }
                if (vuVar.E != z10) {
                    vuVar.E = z10;
                    if (z10) {
                        vuVar.invalidate();
                        vg.y0 y0Var = vuVar.f;
                        if (y0Var != null) {
                            y0Var.invalidate();
                        }
                        vg.y0 y0Var2 = vuVar.f;
                        if (y0Var2 != null && (g5Var = vuVar.x) != null && (c3Var = g5Var.k) != null) {
                            y0Var2.setImageReceiver(c3Var);
                        }
                        k9 k9Var = vuVar.d;
                        if (k9Var != null) {
                            k9Var.invalidate();
                        }
                    } else {
                        vuVar.b();
                    }
                    vuVar.c();
                }
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        c();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
        if ((Math.abs(i10 - i12) < 2 || i10 >= getMeasuredHeight() || i10 == 0) && !this.a) {
            requestDisallowInterceptTouchEvent(false);
        }
        c();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 1) {
            motionEvent.getAction();
        }
        return super.onTouchEvent(motionEvent);
    }
}
