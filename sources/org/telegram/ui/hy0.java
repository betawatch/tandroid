package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class hy0 extends org.telegram.ui.Components.im0 implements ci.p7 {
    public final /* synthetic */ ProfileActivity V2;
    public VelocityTracker W2;
    public final /* synthetic */ ProfileActivity X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.X2 = profileActivity;
        this.V2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean F0(View view) {
        return view != this.X2.O;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean H0(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.j);
    }

    @Override // ci.p7
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.V2).actionBar;
        iArr[0] = kVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        View view = this.X2.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.X2;
        nz0 nz0Var = profileActivity.O;
        if (nz0Var != null) {
            if (nz0Var.C()) {
                nz0 nz0Var2 = profileActivity.O;
                if (nz0Var2.C1 && nz0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.O.C()) {
                nz0 nz0Var3 = profileActivity.O;
                if (nz0Var3.C1 && (nz0Var3.getClosestTab() == 8 || org.telegram.ui.Components.tv0.y0(profileActivity.O.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.js0 js0Var = profileActivity.O.V;
            if (js0Var != null && js0Var.g()) {
                return false;
            }
            org.telegram.ui.Components.os0 os0Var = profileActivity.O.W;
            if (os0Var != null && os0Var.w) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.X2.U4();
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int O3;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.X2;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.W2;
            if (velocityTracker2 == null) {
                this.W2 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.W2.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.W2;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.W2.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                profileActivity.j2 = this.W2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.W2) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.W2.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                profileActivity.j2 = this.W2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.W2.recycle();
            this.W2 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            kVar2 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
            int i10 = currentActionBarHeight + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            if (!profileActivity.o2 || profileActivity.J0) {
                i10 = profileActivity.a.getMeasuredWidth();
                O3 = profileActivity.O3();
            } else {
                O3 = profileActivity.T3();
            }
            if (profileActivity.R1 >= (O3 + i10) - 1.0f) {
                profileActivity.w4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.c.m(0)) != null) {
            if (profileActivity.P1) {
                profileActivity.P1 = false;
                profileActivity.a.O0 = true;
            }
            if (profileActivity.p2) {
                if (!profileActivity.q2) {
                    profileActivity.a.v0(0, m10.getTop() - profileActivity.T3(), org.telegram.ui.Components.bs.h);
                    return onTouchEvent;
                }
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                profileActivity.a.v0(0, ((m10.getTop() - profileActivity.a.getMeasuredWidth()) - profileActivity.O3()) + currentActionBarHeight2 + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), org.telegram.ui.Components.bs.h);
                return onTouchEvent;
            }
            boolean z10 = profileActivity.O3() > 0;
            if (z10) {
                float f7 = profileActivity.R1;
                if (f7 > 0.0f && ((f7 < profileActivity.T3() * 0.6f || profileActivity.j2 < -1000.0f) && profileActivity.R1 > profileActivity.O3() * 0.6f)) {
                    profileActivity.a.v0(0, (int) (profileActivity.R1 - profileActivity.O3()), org.telegram.ui.Components.bs.h);
                    return onTouchEvent;
                }
            }
            if (z10) {
                float f10 = profileActivity.R1;
                if (f10 > 0.0f && f10 < profileActivity.O3() * 0.6f) {
                    profileActivity.a.v0(0, (int) (profileActivity.O3() - profileActivity.R1), org.telegram.ui.Components.bs.h);
                    return onTouchEvent;
                }
            }
            if (!z10) {
                float f11 = profileActivity.R1;
                if (f11 > 0.0f && profileActivity.j2 < -1000.0f) {
                    profileActivity.a.v0(0, (int) f11, org.telegram.ui.Components.bs.h);
                    return onTouchEvent;
                }
            }
            if (profileActivity.R1 > 0.0f) {
                profileActivity.a.v0(0, m10.getTop() - profileActivity.T3(), org.telegram.ui.Components.bs.h);
            }
        }
        return onTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void q0(View view, View view2) {
    }
}
