package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pb0 extends v91 {
    public final /* synthetic */ oc0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb0(oc0 oc0Var, Context context, kc0 kc0Var) {
        super(context, kc0Var);
        this.V = oc0Var;
    }

    @Override // org.telegram.ui.Components.v91, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.V.f.e;
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
        return B(motionEvent);
    }

    @Override // org.telegram.ui.Components.v91
    public final void u() {
        View view = this.e[0];
        if (view instanceof ic0) {
            ((ic0) view).e.V();
        }
    }

    @Override // org.telegram.ui.Components.v91
    public final void w(boolean z10) {
        oc0 oc0Var = this.V;
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
