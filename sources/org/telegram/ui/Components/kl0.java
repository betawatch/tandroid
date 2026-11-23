package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class kl0 extends HorizontalScrollView {
    public boolean a;
    public LinearLayout b;
    public ValueAnimator c;
    public boolean d;
    public int e;
    public ValueAnimator f;

    public kl0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i7) {
        if (this.e == i7) {
            return;
        }
        this.e = i7;
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (getScrollX() == i7) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i7);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new e60(this, 15));
        this.f.setInterpolator(kr.h);
        this.f.setDuration(250L);
        this.f.addListener(new p60(this, 16));
        this.f.start();
    }

    public final void b(int i7, int i10) {
        int measuredWidth;
        if (getChildCount() <= 0) {
            return;
        }
        int L = org.telegram.messenger.g0.L(50.0f);
        if (i7 < getScrollX() + L) {
            measuredWidth = i7 - L;
        } else {
            if (i10 <= (getMeasuredWidth() - L) + getScrollX()) {
                return;
            } else {
                measuredWidth = (i10 - getMeasuredWidth()) + L;
            }
        }
        a(c8.m9.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
    }

    public final void c() {
        o5 o5Var;
        fi.s2 s2Var;
        nh0 nh0Var;
        ValueAnimator valueAnimator;
        int childCount = this.b.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.b.getChildAt(i7);
            if (childAt instanceof hv) {
                hv hvVar = (hv) childAt;
                boolean z10 = childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth();
                boolean z11 = this.d && ((valueAnimator = this.c) == null || !valueAnimator.isRunning());
                if (!hvVar.E && z10 && (nh0Var = hvVar.e) != null && !nh0Var.l0 && !z11) {
                    hvVar.e.T(true, 0.0f);
                    hvVar.e.start();
                }
                if (hvVar.E != z10) {
                    hvVar.E = z10;
                    if (z10) {
                        hvVar.invalidate();
                        ug.b1 b1Var = hvVar.f;
                        if (b1Var != null) {
                            b1Var.invalidate();
                        }
                        ug.b1 b1Var2 = hvVar.f;
                        if (b1Var2 != null && (o5Var = hvVar.x) != null && (s2Var = o5Var.k) != null) {
                            b1Var2.setImageReceiver(s2Var);
                        }
                        p9 p9Var = hvVar.d;
                        if (p9Var != null) {
                            p9Var.invalidate();
                        }
                    } else {
                        hvVar.b();
                    }
                    hvVar.c();
                }
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        c();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
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
