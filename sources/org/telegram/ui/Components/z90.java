package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z90 extends k71 {
    public final /* synthetic */ ta0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z90(ta0 ta0Var, Context context, pa0 pa0Var) {
        super(context, pa0Var);
        this.W = ta0Var;
    }

    @Override // org.telegram.ui.Components.k71, android.view.View
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
                na0 na0Var = (na0) view;
                if (na0Var.a == 0) {
                    z10 = na0Var.e.i;
                    break;
                }
            }
            i7++;
        }
        if (z10) {
            return false;
        }
        return y(motionEvent);
    }

    @Override // org.telegram.ui.Components.k71
    public final void r() {
        View view = this.e[0];
        if (view instanceof na0) {
            ((na0) view).e.V();
        }
    }

    @Override // org.telegram.ui.Components.k71
    public final void t(boolean z10) {
        ta0 ta0Var = this.W;
        ta0Var.e.setSelectedTab(ta0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof na0) {
            ((na0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof na0) {
            ((na0) view2).e.G();
        }
    }
}
