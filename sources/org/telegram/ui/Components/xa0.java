package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xa0 extends l81 {
    public final /* synthetic */ wb0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(wb0 wb0Var, Context context, sb0 sb0Var) {
        super(context, sb0Var);
        this.Q = wb0Var;
    }

    @Override // org.telegram.ui.Components.l81, android.view.View
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
                qb0 qb0Var = (qb0) view;
                if (qb0Var.a == 0) {
                    z4 = qb0Var.e.i;
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

    @Override // org.telegram.ui.Components.l81
    public final void u() {
        View view = this.e[0];
        if (view instanceof qb0) {
            ((qb0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.l81
    public final void w(boolean z4) {
        wb0 wb0Var = this.Q;
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
