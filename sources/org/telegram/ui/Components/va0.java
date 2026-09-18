package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class va0 extends j81 {
    public final /* synthetic */ vb0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va0(vb0 vb0Var, Context context, rb0 rb0Var) {
        super(context, rb0Var);
        this.U = vb0Var;
    }

    @Override // org.telegram.ui.Components.j81, android.view.View
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
                pb0 pb0Var = (pb0) view;
                if (pb0Var.a == 0) {
                    z10 = pb0Var.e.i;
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

    @Override // org.telegram.ui.Components.j81
    public final void u() {
        View view = this.e[0];
        if (view instanceof pb0) {
            ((pb0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.j81
    public final void w(boolean z10) {
        vb0 vb0Var = this.U;
        vb0Var.e.setSelectedTab(vb0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof pb0) {
            ((pb0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof pb0) {
            ((pb0) view2).e.H();
        }
    }
}
