package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ca0 extends j71 {
    public final /* synthetic */ wa0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca0(wa0 wa0Var, Context context, sa0 sa0Var) {
        super(context, sa0Var);
        this.W = wa0Var;
    }

    @Override // org.telegram.ui.Components.j71, android.view.View
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
                qa0 qa0Var = (qa0) view;
                if (qa0Var.a == 0) {
                    z10 = qa0Var.e.i;
                    break;
                }
            }
            i7++;
        }
        if (z10) {
            return false;
        }
        return x(motionEvent);
    }

    @Override // org.telegram.ui.Components.j71
    public final void q() {
        View view = this.e[0];
        if (view instanceof qa0) {
            ((qa0) view).e.V();
        }
    }

    @Override // org.telegram.ui.Components.j71
    public final void s(boolean z10) {
        wa0 wa0Var = this.W;
        wa0Var.e.setSelectedTab(wa0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof qa0) {
            ((qa0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof qa0) {
            ((qa0) view2).e.G();
        }
    }
}
