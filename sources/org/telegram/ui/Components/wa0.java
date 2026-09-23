package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class wa0 extends h81 {
    public final /* synthetic */ ub0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa0(ub0 ub0Var, Context context, qb0 qb0Var) {
        super(context, qb0Var);
        this.T = ub0Var;
    }

    @Override // org.telegram.ui.Components.h81, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.T.f.e;
            if (i10 >= viewArr.length) {
                z10 = false;
                break;
            }
            View view = viewArr[i10];
            if (view != null) {
                ob0 ob0Var = (ob0) view;
                if (ob0Var.a == 0) {
                    z10 = ob0Var.e.i;
                    break;
                }
            }
            i10++;
        }
        if (z10) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // org.telegram.ui.Components.h81
    public final void u() {
        View view = this.e[0];
        if (view instanceof ob0) {
            ((ob0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.h81
    public final void w(boolean z10) {
        ub0 ub0Var = this.T;
        ub0Var.e.setSelectedTab(ub0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof ob0) {
            ((ob0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof ob0) {
            ((ob0) view2).e.H();
        }
    }
}
