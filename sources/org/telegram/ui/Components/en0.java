package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public abstract class en0 extends HorizontalScrollView {
    public boolean a;
    public LinearLayout b;
    public ValueAnimator c;
    public boolean d;
    public int e;
    public ValueAnimator f;

    public en0(Context context) {
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
        ofFloat.addUpdateListener(new v70(this, 14));
        this.f.setInterpolator(tr.h);
        this.f.setDuration(250L);
        this.f.addListener(new hd0(this, 10));
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
        a(w7.q.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
    }

    public final void c() {
        q5 q5Var;
        ai.l4 l4Var;
        kj0 kj0Var;
        ValueAnimator valueAnimator;
        int childCount = this.b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.b.getChildAt(i10);
            if (childAt instanceof cw) {
                cw cwVar = (cw) childAt;
                boolean z10 = childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth();
                boolean z11 = this.d && ((valueAnimator = this.c) == null || !valueAnimator.isRunning());
                if (!cwVar.y && z10 && (kj0Var = cwVar.e) != null && !kj0Var.k0 && !z11) {
                    cwVar.e.T(0.0f, true);
                    cwVar.e.start();
                }
                if (cwVar.y != z10) {
                    cwVar.y = z10;
                    if (z10) {
                        cwVar.invalidate();
                        rg.c1 c1Var = cwVar.f;
                        if (c1Var != null) {
                            c1Var.invalidate();
                        }
                        rg.c1 c1Var2 = cwVar.f;
                        if (c1Var2 != null && (q5Var = cwVar.w) != null && (l4Var = q5Var.k) != null) {
                            c1Var2.setImageReceiver(l4Var);
                        }
                        w9 w9Var = cwVar.d;
                        if (w9Var != null) {
                            w9Var.invalidate();
                        }
                    } else {
                        cwVar.b();
                    }
                    cwVar.c();
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
