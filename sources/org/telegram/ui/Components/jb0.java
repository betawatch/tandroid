package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class jb0 extends y81 {
    public final /* synthetic */ hc0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb0(hc0 hc0Var, Context context, dc0 dc0Var) {
        super(context, dc0Var);
        this.T = hc0Var;
    }

    @Override // org.telegram.ui.Components.y81, android.view.View
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
                bc0 bc0Var = (bc0) view;
                if (bc0Var.a == 0) {
                    z10 = bc0Var.e.i;
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

    @Override // org.telegram.ui.Components.y81
    public final void u() {
        View view = this.e[0];
        if (view instanceof bc0) {
            ((bc0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.y81
    public final void w(boolean z10) {
        hc0 hc0Var = this.T;
        hc0Var.e.setSelectedTab(hc0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof bc0) {
            ((bc0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof bc0) {
            ((bc0) view2).e.H();
        }
    }
}
