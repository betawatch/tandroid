package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fa0 extends x71 {
    public final /* synthetic */ ab0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa0(ab0 ab0Var, Context context, wa0 wa0Var) {
        super(context, wa0Var);
        this.V = ab0Var;
    }

    @Override // org.telegram.ui.Components.x71, android.view.View
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
                ua0 ua0Var = (ua0) view;
                if (ua0Var.a == 0) {
                    z10 = ua0Var.e.i;
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

    @Override // org.telegram.ui.Components.x71
    public final void u() {
        View view = this.e[0];
        if (view instanceof ua0) {
            ((ua0) view).e.V();
        }
    }

    @Override // org.telegram.ui.Components.x71
    public final void w(boolean z10) {
        ab0 ab0Var = this.V;
        ab0Var.e.setSelectedTab(ab0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof ua0) {
            ((ua0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof ua0) {
            ((ua0) view2).e.G();
        }
    }
}
