package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class yl0 extends HorizontalScrollView {
    public boolean a;
    public LinearLayout b;
    public ValueAnimator c;
    public boolean d;
    public int e;
    public ValueAnimator f;

    public yl0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i10) {
        if (this.e == i10) {
            return;
        }
        this.e = i10;
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (getScrollX() == i10) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new r60(this, 14));
        this.f.setInterpolator(gr.h);
        this.f.setDuration(250L);
        this.f.addListener(new t60(this, 16));
        this.f.start();
    }

    public final void b(int i10, int i11) {
        int measuredWidth;
        if (getChildCount() <= 0) {
            return;
        }
        int L = org.telegram.messenger.i0.L(50.0f);
        if (i10 < getScrollX() + L) {
            measuredWidth = i10 - L;
        } else {
            if (i11 <= (getMeasuredWidth() - L) + getScrollX()) {
                return;
            } else {
                measuredWidth = (i11 - getMeasuredWidth()) + L;
            }
        }
        a(w7.u.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
    }

    public final void c() {
        f5 f5Var;
        ag.c2 c2Var;
        bi0 bi0Var;
        ValueAnimator valueAnimator;
        int childCount = this.b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.b.getChildAt(i10);
            if (childAt instanceof iv) {
                iv ivVar = (iv) childAt;
                boolean z10 = childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth();
                boolean z11 = this.d && ((valueAnimator = this.c) == null || !valueAnimator.isRunning());
                if (!ivVar.D && z10 && (bi0Var = ivVar.e) != null && !bi0Var.k0 && !z11) {
                    ivVar.e.T(true, 0.0f);
                    ivVar.e.start();
                }
                if (ivVar.D != z10) {
                    ivVar.D = z10;
                    if (z10) {
                        ivVar.invalidate();
                        kg.l1 l1Var = ivVar.f;
                        if (l1Var != null) {
                            l1Var.invalidate();
                        }
                        kg.l1 l1Var2 = ivVar.f;
                        if (l1Var2 != null && (f5Var = ivVar.x) != null && (c2Var = f5Var.k) != null) {
                            l1Var2.setImageReceiver(c2Var);
                        }
                        g9 g9Var = ivVar.d;
                        if (g9Var != null) {
                            g9Var.invalidate();
                        }
                    } else {
                        ivVar.b();
                    }
                    ivVar.c();
                }
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.a) {
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
