package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class km0 extends HorizontalScrollView {
    public boolean a;
    public LinearLayout b;
    public ValueAnimator c;
    public boolean d;
    public int e;
    public ValueAnimator f;

    public km0(Context context) {
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
        ofFloat.addUpdateListener(new d70(this, 14));
        this.f.setInterpolator(jr.h);
        this.f.setDuration(250L);
        this.f.addListener(new zz(this, 17));
        this.f.start();
    }

    public final void b(int i10, int i11) {
        int measuredWidth;
        if (getChildCount() <= 0) {
            return;
        }
        int dp = AndroidUtilities.dp(50.0f);
        if (i10 < getScrollX() + dp) {
            measuredWidth = i10 - dp;
        } else {
            if (i11 <= (getMeasuredWidth() - dp) + getScrollX()) {
                return;
            } else {
                measuredWidth = (i11 - getMeasuredWidth()) + dp;
            }
        }
        a(i7.w.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
    }

    public final void c() {
        p5 p5Var;
        lh.x2 x2Var;
        xi0 xi0Var;
        ValueAnimator valueAnimator;
        int childCount = this.b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.b.getChildAt(i10);
            if (childAt instanceof pv) {
                pv pvVar = (pv) childAt;
                boolean z10 = childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth();
                boolean z11 = this.d && ((valueAnimator = this.c) == null || !valueAnimator.isRunning());
                if (!pvVar.y && z10 && (xi0Var = pvVar.e) != null && !xi0Var.h0 && !z11) {
                    pvVar.e.Q(0.0f, true);
                    pvVar.e.start();
                }
                if (pvVar.y != z10) {
                    pvVar.y = z10;
                    if (z10) {
                        pvVar.invalidate();
                        cg.t1 t1Var = pvVar.f;
                        if (t1Var != null) {
                            t1Var.invalidate();
                        }
                        cg.t1 t1Var2 = pvVar.f;
                        if (t1Var2 != null && (p5Var = pvVar.w) != null && (x2Var = p5Var.k) != null) {
                            t1Var2.setImageReceiver(x2Var);
                        }
                        t9 t9Var = pvVar.d;
                        if (t9Var != null) {
                            t9Var.invalidate();
                        }
                    } else {
                        pvVar.b();
                    }
                    pvVar.c();
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
