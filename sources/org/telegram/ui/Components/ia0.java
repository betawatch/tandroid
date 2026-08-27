package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ia0 extends p71 {
    public final /* synthetic */ gb0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia0(gb0 gb0Var, Context context, cb0 cb0Var) {
        super(context, cb0Var);
        this.P = gb0Var;
    }

    @Override // org.telegram.ui.Components.p71, android.view.View
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
                ab0 ab0Var = (ab0) view;
                if (ab0Var.a == 0) {
                    z10 = ab0Var.e.i;
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

    @Override // org.telegram.ui.Components.p71
    public final void u() {
        View view = this.e[0];
        if (view instanceof ab0) {
            ((ab0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.p71
    public final void w(boolean z10) {
        gb0 gb0Var = this.P;
        gb0Var.e.setSelectedTab(gb0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof ab0) {
            ((ab0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof ab0) {
            ((ab0) view2).e.H();
        }
    }
}
