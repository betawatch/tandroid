package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class py0 extends org.telegram.ui.Components.mm0 implements di.o7 {
    public final /* synthetic */ ProfileActivity f3;
    public VelocityTracker g3;
    public final /* synthetic */ ProfileActivity h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.h3 = profileActivity;
        this.f3 = profileActivity;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean F0(View view) {
        return view != this.h3.N;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean H0(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.j);
    }

    @Override // di.o7
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.r2) this.f3).actionBar;
        iArr[0] = kVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        View view = this.h3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.h3;
        vz0 vz0Var = profileActivity.N;
        if (vz0Var != null) {
            if (vz0Var.F()) {
                vz0 vz0Var2 = profileActivity.N;
                if (vz0Var2.E1 && vz0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.N.F()) {
                vz0 vz0Var3 = profileActivity.N;
                if (vz0Var3.E1 && (vz0Var3.getClosestTab() == 8 || org.telegram.ui.Components.aw0.E0(profileActivity.N.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.vs0 vs0Var = profileActivity.N.a0;
            if (vs0Var != null && vs0Var.g()) {
                return false;
            }
            org.telegram.ui.Components.zs0 zs0Var = profileActivity.N.b0;
            if (zs0Var != null && zs0Var.f) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = ProfileActivity.R6;
        this.h3.g5();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int X3;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.h3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.g3;
            if (velocityTracker2 == null) {
                this.g3 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.g3.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.g3;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.g3.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                profileActivity.i2 = this.g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.g3) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.g3.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                profileActivity.i2 = this.g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.g3.recycle();
            this.g3 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            kVar2 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
            int i10 = currentActionBarHeight + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            if (!profileActivity.n2 || profileActivity.I0) {
                i10 = profileActivity.a.getMeasuredWidth();
                X3 = profileActivity.X3();
            } else {
                X3 = profileActivity.c4();
            }
            if (profileActivity.Q1 >= (X3 + i10) - 1.0f) {
                profileActivity.E4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.c.m(0)) != null) {
            if (profileActivity.O1) {
                profileActivity.O1 = false;
                profileActivity.a.O0 = true;
            }
            if (profileActivity.o2) {
                if (!profileActivity.p2) {
                    profileActivity.a.w0(0, m10.getTop() - profileActivity.c4(), org.telegram.ui.Components.ds.h);
                    return onTouchEvent;
                }
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
                profileActivity.a.w0(0, ((m10.getTop() - profileActivity.a.getMeasuredWidth()) - profileActivity.X3()) + currentActionBarHeight2 + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), org.telegram.ui.Components.ds.h);
                return onTouchEvent;
            }
            boolean z10 = profileActivity.X3() > 0;
            if (z10) {
                float f7 = profileActivity.Q1;
                if (f7 > 0.0f && ((f7 < profileActivity.c4() * 0.6f || profileActivity.i2 < -1000.0f) && profileActivity.Q1 > profileActivity.X3() * 0.6f)) {
                    profileActivity.a.w0(0, (int) (profileActivity.Q1 - profileActivity.X3()), org.telegram.ui.Components.ds.h);
                    return onTouchEvent;
                }
            }
            if (z10) {
                float f10 = profileActivity.Q1;
                if (f10 > 0.0f && f10 < profileActivity.X3() * 0.6f) {
                    profileActivity.a.w0(0, (int) (profileActivity.X3() - profileActivity.Q1), org.telegram.ui.Components.ds.h);
                    return onTouchEvent;
                }
            }
            if (!z10) {
                float f11 = profileActivity.Q1;
                if (f11 > 0.0f && profileActivity.i2 < -1000.0f) {
                    profileActivity.a.w0(0, (int) f11, org.telegram.ui.Components.ds.h);
                    return onTouchEvent;
                }
            }
            if (profileActivity.Q1 > 0.0f) {
                profileActivity.a.w0(0, m10.getTop() - profileActivity.c4(), org.telegram.ui.Components.ds.h);
            }
        }
        return onTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void r0(View view, View view2) {
    }
}
