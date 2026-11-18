package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class aa0 extends g71 {
    public final /* synthetic */ ua0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(ua0 ua0Var, Context context, qa0 qa0Var) {
        super(context, qa0Var);
        this.W = ua0Var;
    }

    @Override // org.telegram.ui.Components.g71, android.view.View
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
                oa0 oa0Var = (oa0) view;
                if (oa0Var.a == 0) {
                    z10 = oa0Var.e.i;
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

    @Override // org.telegram.ui.Components.g71
    public final void q() {
        View view = this.e[0];
        if (view instanceof oa0) {
            ((oa0) view).e.V();
        }
    }

    @Override // org.telegram.ui.Components.g71
    public final void s(boolean z10) {
        ua0 ua0Var = this.W;
        ua0Var.e.setSelectedTab(ua0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof oa0) {
            ((oa0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof oa0) {
            ((oa0) view2).e.G();
        }
    }
}
