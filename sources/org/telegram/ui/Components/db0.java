package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class db0 extends x81 {
    public final /* synthetic */ dc0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db0(dc0 dc0Var, Context context, zb0 zb0Var) {
        super(context, zb0Var);
        this.U = dc0Var;
    }

    @Override // org.telegram.ui.Components.x81, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.U.f.e;
            if (i10 >= viewArr.length) {
                z10 = false;
                break;
            }
            View view = viewArr[i10];
            if (view != null) {
                xb0 xb0Var = (xb0) view;
                if (xb0Var.a == 0) {
                    z10 = xb0Var.e.i;
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

    @Override // org.telegram.ui.Components.x81
    public final void u() {
        View view = this.e[0];
        if (view instanceof xb0) {
            ((xb0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.x81
    public final void w(boolean z10) {
        dc0 dc0Var = this.U;
        dc0Var.e.setSelectedTab(dc0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof xb0) {
            ((xb0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof xb0) {
            ((xb0) view2).e.H();
        }
    }
}
