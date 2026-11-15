package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class p90 extends w61 {
    public final /* synthetic */ ja0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p90(ja0 ja0Var, Context context, fa0 fa0Var) {
        super(context, fa0Var);
        this.W = ja0Var;
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
                da0 da0Var = (da0) view;
                if (da0Var.a == 0) {
                    z10 = da0Var.e.i;
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
        if (view instanceof da0) {
            ((da0) view).e.V();
        }
    }

    @Override // org.telegram.ui.Components.w61
    public final void t(boolean z10) {
        ja0 ja0Var = this.W;
        ja0Var.e.setSelectedTab(ja0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof da0) {
            ((da0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof da0) {
            ((da0) view2).e.G();
        }
    }
}
