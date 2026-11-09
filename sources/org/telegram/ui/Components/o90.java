package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o90 extends w61 {
    public final /* synthetic */ ja0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o90(ja0 ja0Var, Context context, fa0 fa0Var) {
        super(context, fa0Var);
        this.V = ja0Var;
    }

    @Override // org.telegram.ui.Components.w61, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.V.f.e;
            if (i7 >= viewArr.length) {
                z9 = false;
                break;
            }
            View view = viewArr[i7];
            if (view != null) {
                da0 da0Var = (da0) view;
                if (da0Var.a == 0) {
                    z9 = da0Var.e.i;
                    break;
                }
            }
            i7++;
        }
        if (z9) {
            return false;
        }
        return B(motionEvent);
    }

    @Override // org.telegram.ui.Components.w61
    public final void u() {
        View view = this.e[0];
        if (view instanceof da0) {
            ((da0) view).e.V();
        }
    }

    @Override // org.telegram.ui.Components.w61
    public final void w(boolean z9) {
        ja0 ja0Var = this.V;
        ja0Var.e.setSelectedTab(ja0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof da0) {
            ((da0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof da0) {
            ((da0) view2).e.G();
        }
    }
}
