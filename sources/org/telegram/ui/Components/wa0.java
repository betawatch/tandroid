package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class wa0 extends i81 {
    public final /* synthetic */ wb0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa0(wb0 wb0Var, Context context, sb0 sb0Var) {
        super(context, sb0Var);
        this.T = wb0Var;
    }

    @Override // org.telegram.ui.Components.i81, android.view.View
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
                qb0 qb0Var = (qb0) view;
                if (qb0Var.a == 0) {
                    z10 = qb0Var.e.i;
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

    @Override // org.telegram.ui.Components.i81
    public final void u() {
        View view = this.e[0];
        if (view instanceof qb0) {
            ((qb0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.i81
    public final void w(boolean z10) {
        wb0 wb0Var = this.T;
        wb0Var.e.setSelectedTab(wb0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof qb0) {
            ((qb0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof qb0) {
            ((qb0) view2).e.H();
        }
    }
}
