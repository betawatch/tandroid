package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class eb0 extends x81 {
    public final /* synthetic */ ec0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb0(ec0 ec0Var, Context context, ac0 ac0Var) {
        super(context, ac0Var);
        this.U = ec0Var;
    }

    @Override // org.telegram.ui.Components.x81, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.U.f.e;
            if (i10 >= viewArr.length) {
                z10 = false;
                break;
            }
            View view = viewArr[i10];
            if (view != null) {
                yb0 yb0Var = (yb0) view;
                if (yb0Var.a == 0) {
                    z10 = yb0Var.e.i;
                    break;
                }
            }
            i10++;
        }
        if (z10) {
            return false;
        }
        return B(motionEvent);
    }

    @Override // org.telegram.ui.Components.x81
    public final void u() {
        View view = this.e[0];
        if (view instanceof yb0) {
            ((yb0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.x81
    public final void w(boolean z10) {
        ec0 ec0Var = this.U;
        ec0Var.e.setSelectedTab(ec0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof yb0) {
            ((yb0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof yb0) {
            ((yb0) view2).e.H();
        }
    }
}
