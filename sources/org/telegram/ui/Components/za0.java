package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class za0 extends m81 {
    public final /* synthetic */ yb0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za0(yb0 yb0Var, Context context, ub0 ub0Var) {
        super(context, ub0Var);
        this.Q = yb0Var;
    }

    @Override // org.telegram.ui.Components.m81, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.Q.f.e;
            if (i10 >= viewArr.length) {
                z4 = false;
                break;
            }
            View view = viewArr[i10];
            if (view != null) {
                sb0 sb0Var = (sb0) view;
                if (sb0Var.a == 0) {
                    z4 = sb0Var.e.i;
                    break;
                }
            }
            i10++;
        }
        if (z4) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // org.telegram.ui.Components.m81
    public final void u() {
        View view = this.e[0];
        if (view instanceof sb0) {
            ((sb0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.m81
    public final void w(boolean z4) {
        yb0 yb0Var = this.Q;
        yb0Var.e.setSelectedTab(yb0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof sb0) {
            ((sb0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof sb0) {
            ((sb0) view2).e.H();
        }
    }
}
