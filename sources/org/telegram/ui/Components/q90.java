package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q90 extends w61 {
    public final /* synthetic */ ka0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q90(ka0 ka0Var, Context context, ga0 ga0Var) {
        super(context, ga0Var);
        this.W = ka0Var;
    }

    @Override // org.telegram.ui.Components.w61, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.W.f.e;
            if (i7 >= viewArr.length) {
                z10 = false;
                break;
            }
            View view = viewArr[i7];
            if (view != null) {
                ea0 ea0Var = (ea0) view;
                if (ea0Var.a == 0) {
                    z10 = ea0Var.e.i;
                    break;
                }
            }
            i7++;
        }
        if (z10) {
            return false;
        }
        return z(motionEvent);
    }

    @Override // org.telegram.ui.Components.w61
    public final void r() {
        View view = this.e[0];
        if (view instanceof ea0) {
            ((ea0) view).e.V();
        }
    }

    @Override // org.telegram.ui.Components.w61
    public final void t(boolean z10) {
        ka0 ka0Var = this.W;
        ka0Var.e.setSelectedTab(ka0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof ea0) {
            ((ea0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof ea0) {
            ((ea0) view2).e.G();
        }
    }
}
