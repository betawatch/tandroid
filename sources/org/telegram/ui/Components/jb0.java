package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class jb0 extends h91 {
    public final /* synthetic */ ic0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb0(ic0 ic0Var, Context context, ec0 ec0Var) {
        super(context, ec0Var);
        this.V = ic0Var;
    }

    @Override // org.telegram.ui.Components.h91, android.view.View
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
                cc0 cc0Var = (cc0) view;
                if (cc0Var.a == 0) {
                    z10 = cc0Var.e.i;
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

    @Override // org.telegram.ui.Components.h91
    public final void u() {
        View view = this.e[0];
        if (view instanceof cc0) {
            ((cc0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.h91
    public final void w(boolean z10) {
        ic0 ic0Var = this.V;
        ic0Var.e.setSelectedTab(ic0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof cc0) {
            ((cc0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof cc0) {
            ((cc0) view2).e.H();
        }
    }
}
