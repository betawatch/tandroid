package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class by0 extends org.telegram.ui.Components.jl0 implements lh.z6 {
    public final /* synthetic */ ProfileActivity T2;
    public VelocityTracker U2;
    public final /* synthetic */ ProfileActivity V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.V2 = profileActivity;
        this.T2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean F0(View view) {
        return view != this.V2.K;
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean H0(View view, float f9, float f10) {
        return !(view instanceof org.telegram.ui.Cells.j);
    }

    @Override // lh.z6
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.o2) this.T2).actionBar;
        iArr[0] = lVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        View view = this.V2.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.V2;
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null) {
            if (hz0Var.C()) {
                hz0 hz0Var2 = profileActivity.K;
                if (hz0Var2.y1 && hz0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.K.C()) {
                hz0 hz0Var3 = profileActivity.K;
                if (hz0Var3.y1 && (hz0Var3.getClosestTab() == 8 || org.telegram.ui.Components.qu0.w0(profileActivity.K.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.gr0 gr0Var = profileActivity.K.R;
            if (gr0Var != null && gr0Var.g()) {
                return false;
            }
            org.telegram.ui.Components.kr0 kr0Var = profileActivity.K.S;
            if (kr0Var != null && kr0Var.w) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V2.U4();
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int O3;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.V2;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.U2;
            if (velocityTracker2 == null) {
                this.U2 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.U2.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.U2;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.U2.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                profileActivity.e2 = this.U2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.U2) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.U2.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                profileActivity.e2 = this.U2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.U2.recycle();
            this.U2 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            lVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            int i10 = currentActionBarHeight + (lVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            if (!profileActivity.j2 || profileActivity.E0) {
                i10 = profileActivity.a.getMeasuredWidth();
                O3 = profileActivity.O3();
            } else {
                O3 = profileActivity.T3();
            }
            if (profileActivity.M1 >= (O3 + i10) - 1.0f) {
                profileActivity.w4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.c.m(0)) != null) {
            if (profileActivity.K1) {
                profileActivity.K1 = false;
                profileActivity.a.J0 = true;
            }
            if (profileActivity.k2) {
                if (!profileActivity.l2) {
                    profileActivity.a.v0(0, m10.getTop() - profileActivity.T3(), org.telegram.ui.Components.jr.h);
                    return onTouchEvent;
                }
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                profileActivity.a.v0(0, ((m10.getTop() - profileActivity.a.getMeasuredWidth()) - profileActivity.O3()) + currentActionBarHeight2 + (lVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), org.telegram.ui.Components.jr.h);
                return onTouchEvent;
            }
            boolean z10 = profileActivity.O3() > 0;
            if (z10) {
                float f9 = profileActivity.M1;
                if (f9 > 0.0f && ((f9 < profileActivity.T3() * 0.6f || profileActivity.e2 < -1000.0f) && profileActivity.M1 > profileActivity.O3() * 0.6f)) {
                    profileActivity.a.v0(0, (int) (profileActivity.M1 - profileActivity.O3()), org.telegram.ui.Components.jr.h);
                    return onTouchEvent;
                }
            }
            if (z10) {
                float f10 = profileActivity.M1;
                if (f10 > 0.0f && f10 < profileActivity.O3() * 0.6f) {
                    profileActivity.a.v0(0, (int) (profileActivity.O3() - profileActivity.M1), org.telegram.ui.Components.jr.h);
                    return onTouchEvent;
                }
            }
            if (!z10) {
                float f11 = profileActivity.M1;
                if (f11 > 0.0f && profileActivity.e2 < -1000.0f) {
                    profileActivity.a.v0(0, (int) f11, org.telegram.ui.Components.jr.h);
                    return onTouchEvent;
                }
            }
            if (profileActivity.M1 > 0.0f) {
                profileActivity.a.v0(0, m10.getTop() - profileActivity.T3(), org.telegram.ui.Components.jr.h);
            }
        }
        return onTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void q0(View view, View view2) {
    }
}
