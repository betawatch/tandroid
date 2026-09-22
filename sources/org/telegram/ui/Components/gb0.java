package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gb0 extends z81 {
    public final /* synthetic */ gc0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(gc0 gc0Var, Context context, cc0 cc0Var) {
        super(context, cc0Var);
        this.U = gc0Var;
    }

    @Override // org.telegram.ui.Components.z81, android.view.View
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
                ac0 ac0Var = (ac0) view;
                if (ac0Var.a == 0) {
                    z10 = ac0Var.e.i;
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

    @Override // org.telegram.ui.Components.z81
    public final void u() {
        View view = this.e[0];
        if (view instanceof ac0) {
            ((ac0) view).e.W();
        }
    }

    @Override // org.telegram.ui.Components.z81
    public final void w(boolean z10) {
        gc0 gc0Var = this.U;
        gc0Var.e.setSelectedTab(gc0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof ac0) {
            ((ac0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof ac0) {
            ((ac0) view2).e.H();
        }
    }
}
