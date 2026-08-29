package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sa0 extends z71 {
    public final /* synthetic */ rb0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa0(rb0 rb0Var, Context context, nb0 nb0Var) {
        super(context, nb0Var);
        this.P = rb0Var;
    }

    @Override // org.telegram.ui.Components.z71, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.P.f.e;
            if (i10 >= viewArr.length) {
                z10 = false;
                break;
            }
            View view = viewArr[i10];
            if (view != null) {
                lb0 lb0Var = (lb0) view;
                if (lb0Var.a == 0) {
                    z10 = lb0Var.e.i;
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

    @Override // org.telegram.ui.Components.z71
    public final void u() {
        View view = this.e[0];
        if (view instanceof lb0) {
            ((lb0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.z71
    public final void w(boolean z10) {
        rb0 rb0Var = this.P;
        rb0Var.e.setSelectedTab(rb0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof lb0) {
            ((lb0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof lb0) {
            ((lb0) view2).e.H();
        }
    }
}
