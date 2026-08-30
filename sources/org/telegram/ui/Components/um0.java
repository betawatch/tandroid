package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class um0 extends HorizontalScrollView {
    public boolean a;
    public LinearLayout b;
    public ValueAnimator c;
    public boolean d;
    public int e;
    public ValueAnimator f;

    public um0(Context context) {
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
        ofFloat.addUpdateListener(new i70(this, 14));
        this.f.setInterpolator(nr.h);
        this.f.setDuration(250L);
        this.f.addListener(new nd0(this, 8));
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
        a(k7.n.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
    }

    public final void c() {
        l5 l5Var;
        nh.y2 y2Var;
        gj0 gj0Var;
        ValueAnimator valueAnimator;
        int childCount = this.b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.b.getChildAt(i10);
            if (childAt instanceof tv) {
                tv tvVar = (tv) childAt;
                boolean z4 = childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth();
                boolean z10 = this.d && ((valueAnimator = this.c) == null || !valueAnimator.isRunning());
                if (!tvVar.y && z4 && (gj0Var = tvVar.e) != null && !gj0Var.i0 && !z10) {
                    tvVar.e.Q(0.0f, true);
                    tvVar.e.start();
                }
                if (tvVar.y != z4) {
                    tvVar.y = z4;
                    if (z4) {
                        tvVar.invalidate();
                        eg.s1 s1Var = tvVar.f;
                        if (s1Var != null) {
                            s1Var.invalidate();
                        }
                        eg.s1 s1Var2 = tvVar.f;
                        if (s1Var2 != null && (l5Var = tvVar.w) != null && (y2Var = l5Var.k) != null) {
                            s1Var2.setImageReceiver(y2Var);
                        }
                        p9 p9Var = tvVar.d;
                        if (p9Var != null) {
                            p9Var.invalidate();
                        }
                    } else {
                        tvVar.b();
                    }
                    tvVar.c();
                }
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
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
