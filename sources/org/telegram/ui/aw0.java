package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class aw0 extends org.telegram.ui.Components.uk0 implements th.l5 {
    public final /* synthetic */ ProfileActivity e3;
    public VelocityTracker f3;
    public final /* synthetic */ ProfileActivity g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.g3 = profileActivity;
        this.e3 = profileActivity;
    }

    @Override // org.telegram.ui.Components.uk0
    public final boolean F0(View view) {
        return view != this.g3.N;
    }

    @Override // org.telegram.ui.Components.uk0
    public final boolean H0(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.i);
    }

    @Override // th.l5
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.k2) this.e3).actionBar;
        iArr[0] = lVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        View view = this.g3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.g3;
        hx0 hx0Var = profileActivity.N;
        if (hx0Var != null) {
            if (hx0Var.G()) {
                hx0 hx0Var2 = profileActivity.N;
                if (hx0Var2.E1 && hx0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.N.G()) {
                hx0 hx0Var3 = profileActivity.N;
                if (hx0Var3.E1 && (hx0Var3.getClosestTab() == 8 || org.telegram.ui.Components.au0.G0(profileActivity.N.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.wq0 wq0Var = profileActivity.N.a0;
            if (wq0Var != null && wq0Var.g()) {
                return false;
            }
            org.telegram.ui.Components.ar0 ar0Var = profileActivity.N.b0;
            if (ar0Var != null && ar0Var.f) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        RectF rectF = ProfileActivity.S6;
        this.g3.p5();
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.l lVar;
        int e42;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.g3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.f3;
            if (velocityTracker2 == null) {
                this.f3 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f3.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.f3;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f3.computeCurrentVelocity(1000);
                profileActivity.h2 = this.f3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.f3) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.f3.computeCurrentVelocity(1000);
                profileActivity.h2 = this.f3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.f3.recycle();
            this.f3 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
            int i10 = currentActionBarHeight + (lVar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0);
            if (!profileActivity.m2 || profileActivity.I0) {
                i10 = profileActivity.a.getMeasuredWidth();
                e42 = profileActivity.e4();
            } else {
                e42 = profileActivity.j4();
            }
            if (profileActivity.P1 >= (e42 + i10) - 1.0f) {
                profileActivity.K4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.c.m(0)) != null) {
            if (profileActivity.N1) {
                profileActivity.N1 = false;
                profileActivity.a.O0 = true;
            }
            ProfileActivity.R0(profileActivity, m10, profileActivity.h2);
        }
        return onTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void r0(View view, View view2) {
    }
}
