package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        ofFloat.addUpdateListener(new h60(this, 15));
        this.f.setInterpolator(nr.h);
        this.f.setDuration(250L);
        this.f.addListener(new s60(this, 16));
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
        a(c8.l9.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
    }

    public final void c() {
        p5 p5Var;
        fi.s2 s2Var;
        oh0 oh0Var;
        ValueAnimator valueAnimator;
        int childCount = this.b.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.b.getChildAt(i7);
            if (childAt instanceof kv) {
                kv kvVar = (kv) childAt;
                boolean z10 = childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth();
                boolean z11 = this.d && ((valueAnimator = this.c) == null || !valueAnimator.isRunning());
                if (!kvVar.E && z10 && (oh0Var = kvVar.e) != null && !oh0Var.l0 && !z11) {
                    kvVar.e.T(true, 0.0f);
                    kvVar.e.start();
                }
                if (kvVar.E != z10) {
                    kvVar.E = z10;
                    if (z10) {
                        kvVar.invalidate();
                        ug.b1 b1Var = kvVar.f;
                        if (b1Var != null) {
                            b1Var.invalidate();
                        }
                        ug.b1 b1Var2 = kvVar.f;
                        if (b1Var2 != null && (p5Var = kvVar.x) != null && (s2Var = p5Var.k) != null) {
                            b1Var2.setImageReceiver(s2Var);
                        }
                        q9 q9Var = kvVar.d;
                        if (q9Var != null) {
                            q9Var.invalidate();
                        }
                    } else {
                        kvVar.b();
                    }
                    kvVar.c();
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
