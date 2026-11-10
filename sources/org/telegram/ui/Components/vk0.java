package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class vk0 extends HorizontalScrollView {
    public boolean a;
    public LinearLayout b;
    public ValueAnimator c;
    public boolean d;
    public int e;
    public ValueAnimator f;

    public vk0(Context context) {
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
        ofFloat.addUpdateListener(new c60(this, 13));
        this.f.setInterpolator(wq.h);
        this.f.setDuration(250L);
        this.f.addListener(new e60(this, 16));
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
        a(c8.j9.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
    }

    public final void c() {
        h5 h5Var;
        di.z2 z2Var;
        zg0 zg0Var;
        ValueAnimator valueAnimator;
        int childCount = this.b.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.b.getChildAt(i7);
            if (childAt instanceof wu) {
                wu wuVar = (wu) childAt;
                boolean z9 = childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth();
                boolean z10 = this.d && ((valueAnimator = this.c) == null || !valueAnimator.isRunning());
                if (!wuVar.D && z9 && (zg0Var = wuVar.e) != null && !zg0Var.k0 && !z10) {
                    wuVar.e.T(true, 0.0f);
                    wuVar.e.start();
                }
                if (wuVar.D != z9) {
                    wuVar.D = z9;
                    if (z9) {
                        wuVar.invalidate();
                        ug.z0 z0Var = wuVar.f;
                        if (z0Var != null) {
                            z0Var.invalidate();
                        }
                        ug.z0 z0Var2 = wuVar.f;
                        if (z0Var2 != null && (h5Var = wuVar.x) != null && (z2Var = h5Var.k) != null) {
                            z0Var2.setImageReceiver(z2Var);
                        }
                        k9 k9Var = wuVar.d;
                        if (k9Var != null) {
                            k9Var.invalidate();
                        }
                    } else {
                        wuVar.b();
                    }
                    wuVar.c();
                }
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
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
