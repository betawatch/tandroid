package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class al0 extends HorizontalScrollView {
    public boolean a;
    public LinearLayout b;
    public ValueAnimator c;
    public boolean d;
    public int e;
    public ValueAnimator f;

    public al0(Context context) {
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
        ofFloat.addUpdateListener(new f60(this, 13));
        this.f.setInterpolator(er.h);
        this.f.setDuration(250L);
        this.f.addListener(new h60(this, 16));
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
        a(c8.i9.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
    }

    public final void c() {
        g5 g5Var;
        fi.u2 u2Var;
        ch0 ch0Var;
        ValueAnimator valueAnimator;
        int childCount = this.b.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.b.getChildAt(i7);
            if (childAt instanceof cv) {
                cv cvVar = (cv) childAt;
                boolean z10 = childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth();
                boolean z11 = this.d && ((valueAnimator = this.c) == null || !valueAnimator.isRunning());
                if (!cvVar.E && z10 && (ch0Var = cvVar.e) != null && !ch0Var.l0 && !z11) {
                    cvVar.e.T(true, 0.0f);
                    cvVar.e.start();
                }
                if (cvVar.E != z10) {
                    cvVar.E = z10;
                    if (z10) {
                        cvVar.invalidate();
                        ug.a1 a1Var = cvVar.f;
                        if (a1Var != null) {
                            a1Var.invalidate();
                        }
                        ug.a1 a1Var2 = cvVar.f;
                        if (a1Var2 != null && (g5Var = cvVar.x) != null && (u2Var = g5Var.k) != null) {
                            a1Var2.setImageReceiver(u2Var);
                        }
                        i9 i9Var = cvVar.d;
                        if (i9Var != null) {
                            i9Var.invalidate();
                        }
                    } else {
                        cvVar.b();
                    }
                    cvVar.c();
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
