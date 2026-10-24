package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class rb0 extends l91 {
    public final /* synthetic */ rc0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb0(rc0 rc0Var, Context context, nc0 nc0Var) {
        super(context, nc0Var);
        this.T = rc0Var;
    }

    @Override // org.telegram.ui.Components.l91, android.view.View
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
                lc0 lc0Var = (lc0) view;
                if (lc0Var.a == 0) {
                    z10 = lc0Var.e.i;
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

    @Override // org.telegram.ui.Components.l91
    public final void u() {
        View view = this.e[0];
        if (view instanceof lc0) {
            ((lc0) view).e.V();
        }
    }

    @Override // org.telegram.ui.Components.l91
    public final void w(boolean z10) {
        rc0 rc0Var = this.T;
        rc0Var.e.setSelectedTab(rc0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof lc0) {
            ((lc0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof lc0) {
            ((lc0) view2).e.G();
        }
    }
}
