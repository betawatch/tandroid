// default package

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class om8 extends o39 implements n2b {
    public final /* synthetic */ ProfileActivity f3;
    public VelocityTracker g3;
    public final /* synthetic */ ProfileActivity h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om8(ProfileActivity profileActivity, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.h3 = profileActivity;
        this.f3 = profileActivity;
    }

    @Override // o39
    public final boolean G0(View view) {
        return view != this.h3.O;
    }

    @Override // o39
    public final boolean I0(View view, float f, float f2) {
        return !(view instanceof s1);
    }

    @Override // n2b
    public final void b(int[] iArr) {
        a aVar;
        aVar = ((d) this.f3).actionBar;
        iArr[0] = aVar.getMeasuredHeight();
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

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.h3;
        vn8 vn8Var = profileActivity.O;
        if (vn8Var != null) {
            if (vn8Var.p()) {
                vn8 vn8Var2 = profileActivity.O;
                if (vn8Var2.F1 && vn8Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.O.p()) {
                vn8 vn8Var3 = profileActivity.O;
                if (vn8Var3.F1 && (vn8Var3.getClosestTab() == 8 || nfa.t0(profileActivity.O.getClosestTab()))) {
                    return false;
                }
            }
            lca lcaVar = profileActivity.O.b0;
            if (lcaVar != null && lcaVar.g()) {
                return false;
            }
            oca ocaVar = profileActivity.O.c0;
            if (ocaVar != null && ocaVar.f) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = ProfileActivity.Z6;
        this.h3.I3();
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m;
        a aVar;
        int W1;
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
                this.g3.computeCurrentVelocity(1000);
                profileActivity.j2 = this.g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.g3) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.g3.computeCurrentVelocity(1000);
                profileActivity.j2 = this.g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.g3.recycle();
            this.g3 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = a.getCurrentActionBarHeight();
            aVar = ((d) profileActivity).actionBar;
            int i = currentActionBarHeight + (aVar.getOccupyStatusBar() ? gl.m : 0);
            if (!profileActivity.o2 || profileActivity.J0) {
                i = profileActivity.a.getMeasuredWidth();
                W1 = profileActivity.W1();
            } else {
                W1 = profileActivity.c2();
            }
            if (profileActivity.Q1 >= (W1 + i) - 1.0f) {
                profileActivity.Z2(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m = profileActivity.c.m(0)) != null) {
            if (profileActivity.O1) {
                profileActivity.O1 = false;
                profileActivity.a.P0 = true;
            }
            profileActivity.z3(m, profileActivity.j2);
        }
        return onTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void s0(View view, View view2) {
    }
}
