package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ob0 extends u91 {
    public final /* synthetic */ nc0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob0(nc0 nc0Var, Context context, jc0 jc0Var) {
        super(context, jc0Var);
        this.V = nc0Var;
    }

    @Override // org.telegram.ui.Components.u91, android.view.View
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
                hc0 hc0Var = (hc0) view;
                if (hc0Var.a == 0) {
                    z10 = hc0Var.e.i;
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

    @Override // org.telegram.ui.Components.u91
    public final void u() {
        View view = this.e[0];
        if (view instanceof hc0) {
            ((hc0) view).e.V();
        }
    }

    @Override // org.telegram.ui.Components.u91
    public final void w(boolean z10) {
        nc0 nc0Var = this.V;
        nc0Var.e.setSelectedTab(nc0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof hc0) {
            ((hc0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof hc0) {
            ((hc0) view2).e.G();
        }
    }
}
