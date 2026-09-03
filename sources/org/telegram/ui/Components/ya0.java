package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ya0 extends l81 {
    public final /* synthetic */ xb0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya0(xb0 xb0Var, Context context, tb0 tb0Var) {
        super(context, tb0Var);
        this.Q = xb0Var;
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
                rb0 rb0Var = (rb0) view;
                if (rb0Var.a == 0) {
                    z4 = rb0Var.e.i;
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
        if (view instanceof rb0) {
            ((rb0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.l81
    public final void w(boolean z4) {
        xb0 xb0Var = this.Q;
        xb0Var.e.setSelectedTab(xb0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof rb0) {
            ((rb0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof rb0) {
            ((rb0) view2).e.H();
        }
    }
}
