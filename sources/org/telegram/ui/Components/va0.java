package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class va0 extends i81 {
    public final /* synthetic */ vb0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va0(vb0 vb0Var, Context context, rb0 rb0Var) {
        super(context, rb0Var);
        this.T = vb0Var;
    }

    @Override // org.telegram.ui.Components.i81, android.view.View
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
                pb0 pb0Var = (pb0) view;
                if (pb0Var.a == 0) {
                    z10 = pb0Var.e.i;
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

    @Override // org.telegram.ui.Components.i81
    public final void u() {
        View view = this.e[0];
        if (view instanceof pb0) {
            ((pb0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.i81
    public final void w(boolean z10) {
        vb0 vb0Var = this.T;
        vb0Var.e.setSelectedTab(vb0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof pb0) {
            ((pb0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof pb0) {
            ((pb0) view2).e.H();
        }
    }
}
