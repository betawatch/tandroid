package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class xl0 extends HorizontalScrollView {
    public boolean a;
    public LinearLayout b;
    public ValueAnimator c;
    public boolean d;
    public int e;
    public ValueAnimator f;

    public xl0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i9) {
        if (this.e == i9) {
            return;
        }
        this.e = i9;
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (getScrollX() == i9) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i9);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new q60(this, 14));
        this.f.setInterpolator(gr.h);
        this.f.setDuration(250L);
        this.f.addListener(new r60(this, 15));
        this.f.start();
    }

    public final void b(int i9, int i10) {
        int measuredWidth;
        if (getChildCount() <= 0) {
            return;
        }
        int dp = AndroidUtilities.dp(50.0f);
        if (i9 < getScrollX() + dp) {
            measuredWidth = i9 - dp;
        } else {
            if (i10 <= (getMeasuredWidth() - dp) + getScrollX()) {
                return;
            } else {
                measuredWidth = (i10 - getMeasuredWidth()) + dp;
            }
        }
        a(g7.n.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
    }

    public final void c() {
        k5 k5Var;
        ih.z2 z2Var;
        mi0 mi0Var;
        ValueAnimator valueAnimator;
        int childCount = this.b.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = this.b.getChildAt(i9);
            if (childAt instanceof jv) {
                jv jvVar = (jv) childAt;
                boolean z10 = childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth();
                boolean z11 = this.d && ((valueAnimator = this.c) == null || !valueAnimator.isRunning());
                if (!jvVar.y && z10 && (mi0Var = jvVar.e) != null && !mi0Var.h0 && !z11) {
                    jvVar.e.Q(0.0f, true);
                    jvVar.e.start();
                }
                if (jvVar.y != z10) {
                    jvVar.y = z10;
                    if (z10) {
                        jvVar.invalidate();
                        zf.b1 b1Var = jvVar.f;
                        if (b1Var != null) {
                            b1Var.invalidate();
                        }
                        zf.b1 b1Var2 = jvVar.f;
                        if (b1Var2 != null && (k5Var = jvVar.w) != null && (z2Var = k5Var.k) != null) {
                            b1Var2.setImageReceiver(z2Var);
                        }
                        o9 o9Var = jvVar.d;
                        if (o9Var != null) {
                            o9Var.invalidate();
                        }
                    } else {
                        jvVar.b();
                    }
                    jvVar.c();
                }
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        c();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
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
