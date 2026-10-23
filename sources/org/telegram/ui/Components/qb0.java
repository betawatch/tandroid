package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class qb0 extends e91 {
    public final /* synthetic */ oc0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb0(oc0 oc0Var, Context context, kc0 kc0Var) {
        super(context, kc0Var);
        this.T = oc0Var;
    }

    @Override // org.telegram.ui.Components.e91, android.view.View
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
                ic0 ic0Var = (ic0) view;
                if (ic0Var.a == 0) {
                    z10 = ic0Var.e.i;
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

    @Override // org.telegram.ui.Components.e91
    public final void u() {
        View view = this.e[0];
        if (view instanceof ic0) {
            ((ic0) view).e.V();
        }
    }

    @Override // org.telegram.ui.Components.e91
    public final void w(boolean z10) {
        oc0 oc0Var = this.T;
        oc0Var.e.setSelectedTab(oc0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof ic0) {
            ((ic0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof ic0) {
            ((ic0) view2).e.G();
        }
    }
}
