package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ly0 extends org.telegram.ui.Components.mm0 implements ci.o7 {
    public final /* synthetic */ ProfileActivity Y2;
    public VelocityTracker Z2;
    public final /* synthetic */ ProfileActivity a3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.a3 = profileActivity;
        this.Y2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean F0(View view) {
        return view != this.a3.O;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean H0(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.j);
    }

    @Override // ci.o7
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.Y2).actionBar;
        iArr[0] = kVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        View view = this.a3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.a3;
        rz0 rz0Var = profileActivity.O;
        if (rz0Var != null) {
            if (rz0Var.D()) {
                rz0 rz0Var2 = profileActivity.O;
                if (rz0Var2.C1 && rz0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.O.D()) {
                rz0 rz0Var3 = profileActivity.O;
                if (rz0Var3.C1 && (rz0Var3.getClosestTab() == 8 || org.telegram.ui.Components.xv0.z0(profileActivity.O.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.ns0 ns0Var = profileActivity.O.V;
            if (ns0Var != null && ns0Var.g()) {
                return false;
            }
            org.telegram.ui.Components.ss0 ss0Var = profileActivity.O.W;
            if (ss0Var != null && ss0Var.w) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.a3.Y4();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int Q3;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.a3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.Z2;
            if (velocityTracker2 == null) {
                this.Z2 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.Z2.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.Z2;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.Z2.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                profileActivity.j2 = this.Z2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.Z2) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.Z2.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                profileActivity.j2 = this.Z2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.Z2.recycle();
            this.Z2 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            kVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            int i10 = currentActionBarHeight + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            if (!profileActivity.o2 || profileActivity.J0) {
                i10 = profileActivity.a.getMeasuredWidth();
                Q3 = profileActivity.Q3();
            } else {
                Q3 = profileActivity.V3();
            }
            if (profileActivity.R1 >= (Q3 + i10) - 1.0f) {
                profileActivity.y4(true);
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
                    profileActivity.a.v0(0, m10.getTop() - profileActivity.V3(), org.telegram.ui.Components.bs.h);
                    return onTouchEvent;
                }
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                profileActivity.a.v0(0, ((m10.getTop() - profileActivity.a.getMeasuredWidth()) - profileActivity.Q3()) + currentActionBarHeight2 + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), org.telegram.ui.Components.bs.h);
                return onTouchEvent;
            }
            boolean z10 = profileActivity.Q3() > 0;
            if (z10) {
                float f7 = profileActivity.R1;
                if (f7 > 0.0f && ((f7 < profileActivity.V3() * 0.6f || profileActivity.j2 < -1000.0f) && profileActivity.R1 > profileActivity.Q3() * 0.6f)) {
                    profileActivity.a.v0(0, (int) (profileActivity.R1 - profileActivity.Q3()), org.telegram.ui.Components.bs.h);
                    return onTouchEvent;
                }
            }
            if (z10) {
                float f10 = profileActivity.R1;
                if (f10 > 0.0f && f10 < profileActivity.Q3() * 0.6f) {
                    profileActivity.a.v0(0, (int) (profileActivity.Q3() - profileActivity.R1), org.telegram.ui.Components.bs.h);
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
                profileActivity.a.v0(0, m10.getTop() - profileActivity.V3(), org.telegram.ui.Components.bs.h);
            }
        }
        return onTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void q0(View view, View view2) {
    }
}
