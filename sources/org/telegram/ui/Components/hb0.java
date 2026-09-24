package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class hb0 extends w81 {
    public final /* synthetic */ fc0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb0(fc0 fc0Var, Context context, bc0 bc0Var) {
        super(context, bc0Var);
        this.T = fc0Var;
    }

    @Override // org.telegram.ui.Components.w81, android.view.View
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
                zb0 zb0Var = (zb0) view;
                if (zb0Var.a == 0) {
                    z10 = zb0Var.e.i;
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

    @Override // org.telegram.ui.Components.w81
    public final void u() {
        View view = this.e[0];
        if (view instanceof zb0) {
            ((zb0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.w81
    public final void w(boolean z10) {
        fc0 fc0Var = this.T;
        fc0Var.e.setSelectedTab(fc0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof zb0) {
            ((zb0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof zb0) {
            ((zb0) view2).e.H();
        }
    }
}
