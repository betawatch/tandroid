package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ea0 extends n71 {
    public final /* synthetic */ cb0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(cb0 cb0Var, Context context, ya0 ya0Var) {
        super(context, ya0Var);
        this.P = cb0Var;
    }

    @Override // org.telegram.ui.Components.n71, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i9 = 0;
        while (true) {
            View[] viewArr = this.P.f.e;
            if (i9 >= viewArr.length) {
                z10 = false;
                break;
            }
            View view = viewArr[i9];
            if (view != null) {
                wa0 wa0Var = (wa0) view;
                if (wa0Var.a == 0) {
                    z10 = wa0Var.e.i;
                    break;
                }
            }
            i9++;
        }
        if (z10) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // org.telegram.ui.Components.n71
    public final void u() {
        View view = this.e[0];
        if (view instanceof wa0) {
            ((wa0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.n71
    public final void w(boolean z10) {
        cb0 cb0Var = this.P;
        cb0Var.e.setSelectedTab(cb0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof wa0) {
            ((wa0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof wa0) {
            ((wa0) view2).e.H();
        }
    }
}
