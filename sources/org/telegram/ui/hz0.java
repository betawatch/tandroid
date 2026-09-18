package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hz0 extends org.telegram.ui.Components.ml0 implements ai.s9 {
    public final /* synthetic */ ProfileActivity X2;
    public VelocityTracker Y2;
    public final /* synthetic */ ProfileActivity Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.Z2 = profileActivity;
        this.X2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.ml0
    public final boolean G0(View view) {
        return view != this.Z2.O;
    }

    @Override // org.telegram.ui.Components.ml0
    public final boolean I0(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.j);
    }

    @Override // ai.s9
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.X2).actionBar;
        iArr[0] = kVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        View view = this.Z2.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.Z2;
        n01 n01Var = profileActivity.O;
        if (n01Var != null) {
            if (n01Var.C()) {
                n01 n01Var2 = profileActivity.O;
                if (n01Var2.C1 && n01Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.O.C()) {
                n01 n01Var3 = profileActivity.O;
                if (n01Var3.C1 && (n01Var3.getClosestTab() == 8 || org.telegram.ui.Components.zu0.w0(profileActivity.O.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.or0 or0Var = profileActivity.O.V;
            if (or0Var != null && or0Var.g()) {
                return false;
            }
            org.telegram.ui.Components.ur0 ur0Var = profileActivity.O.W;
            if (ur0Var != null && ur0Var.w) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.Z2.U4();
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int O3;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.Z2;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.Y2;
            if (velocityTracker2 == null) {
                this.Y2 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.Y2.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.Y2;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.Y2.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                profileActivity.i2 = this.Y2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.Y2) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.Y2.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                profileActivity.i2 = this.Y2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.Y2.recycle();
            this.Y2 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            kVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            int i10 = currentActionBarHeight + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            if (!profileActivity.n2 || profileActivity.I0) {
                i10 = profileActivity.a.getMeasuredWidth();
                O3 = profileActivity.O3();
            } else {
                O3 = profileActivity.T3();
            }
            if (profileActivity.Q1 >= (O3 + i10) - 1.0f) {
                profileActivity.w4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.c.m(0)) != null) {
            if (profileActivity.O1) {
                profileActivity.O1 = false;
                profileActivity.a.N0 = true;
            }
            if (profileActivity.o2) {
                if (!profileActivity.p2) {
                    profileActivity.a.w0(0, m10.getTop() - profileActivity.T3(), org.telegram.ui.Components.qr.h);
                    return onTouchEvent;
                }
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                profileActivity.a.w0(0, ((m10.getTop() - profileActivity.a.getMeasuredWidth()) - profileActivity.O3()) + currentActionBarHeight2 + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), org.telegram.ui.Components.qr.h);
                return onTouchEvent;
            }
            boolean z10 = profileActivity.O3() > 0;
            if (z10) {
                float f7 = profileActivity.Q1;
                if (f7 > 0.0f && ((f7 < profileActivity.T3() * 0.6f || profileActivity.i2 < -1000.0f) && profileActivity.Q1 > profileActivity.O3() * 0.6f)) {
                    profileActivity.a.w0(0, (int) (profileActivity.Q1 - profileActivity.O3()), org.telegram.ui.Components.qr.h);
                    return onTouchEvent;
                }
            }
            if (z10) {
                float f10 = profileActivity.Q1;
                if (f10 > 0.0f && f10 < profileActivity.O3() * 0.6f) {
                    profileActivity.a.w0(0, (int) (profileActivity.O3() - profileActivity.Q1), org.telegram.ui.Components.qr.h);
                    return onTouchEvent;
                }
            }
            if (!z10) {
                float f11 = profileActivity.Q1;
                if (f11 > 0.0f && profileActivity.i2 < -1000.0f) {
                    profileActivity.a.w0(0, (int) f11, org.telegram.ui.Components.qr.h);
                    return onTouchEvent;
                }
            }
            if (profileActivity.Q1 > 0.0f) {
                profileActivity.a.w0(0, m10.getTop() - profileActivity.T3(), org.telegram.ui.Components.qr.h);
            }
        }
        return onTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void r0(View view, View view2) {
    }
}
