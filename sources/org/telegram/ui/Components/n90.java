package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class n90 extends v61 {
    public final /* synthetic */ ia0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(ia0 ia0Var, Context context, ea0 ea0Var) {
        super(context, ea0Var);
        this.V = ia0Var;
    }

    @Override // org.telegram.ui.Components.v61, android.view.View
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
                ca0 ca0Var = (ca0) view;
                if (ca0Var.a == 0) {
                    z9 = ca0Var.e.i;
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

    @Override // org.telegram.ui.Components.v61
    public final void u() {
        View view = this.e[0];
        if (view instanceof ca0) {
            ((ca0) view).e.V();
        }
    }

    @Override // org.telegram.ui.Components.v61
    public final void w(boolean z9) {
        ia0 ia0Var = this.V;
        ia0Var.e.setSelectedTab(ia0Var.f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof ca0) {
            ((ca0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof ca0) {
            ((ca0) view2).e.G();
        }
    }
}
