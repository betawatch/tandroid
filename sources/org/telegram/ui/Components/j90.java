package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j90 extends n61 {
    public final /* synthetic */ da0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(da0 da0Var, Context context, z90 z90Var) {
        super(context, z90Var);
        this.W = da0Var;
    }

    @Override // org.telegram.ui.Components.n61, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i3 = 0;
        while (true) {
            View[] viewArr = this.W.f.e;
            if (i3 >= viewArr.length) {
                z10 = false;
                break;
            }
            View view = viewArr[i3];
            if (view != null) {
                x90 x90Var = (x90) view;
                if (x90Var.a == 0) {
                    z10 = x90Var.e.i;
                    break;
                }
            }
            i3++;
        }
        if (z10) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // org.telegram.ui.Components.n61
    public final void s() {
        View view = this.e[0];
        if (view instanceof x90) {
            ((x90) view).e.V();
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final void u(boolean z10) {
        da0 da0Var = this.W;
        da0Var.e.setSelectedTab(da0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof x90) {
            ((x90) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof x90) {
            ((x90) view2).e.G();
        }
    }
}
