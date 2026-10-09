package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class xb0 extends o91 {
    public final /* synthetic */ vc0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb0(vc0 vc0Var, Context context, rc0 rc0Var) {
        super(context, rc0Var);
        this.T = vc0Var;
    }

    @Override // org.telegram.ui.Components.o91, android.view.View
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
                pc0 pc0Var = (pc0) view;
                if (pc0Var.a == 0) {
                    z10 = pc0Var.e.i;
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

    @Override // org.telegram.ui.Components.o91
    public final void u() {
        View view = this.e[0];
        if (view instanceof pc0) {
            ((pc0) view).e.V();
        }
    }

    @Override // org.telegram.ui.Components.o91
    public final void w(boolean z10) {
        vc0 vc0Var = this.T;
        vc0Var.e.setSelectedTab(vc0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof pc0) {
            ((pc0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof pc0) {
            ((pc0) view2).e.G();
        }
    }
}
