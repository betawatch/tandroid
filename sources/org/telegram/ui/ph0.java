package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ph0 implements Runnable {
    public final /* synthetic */ ai0 a;

    public ph0(ai0 ai0Var) {
        this.a = ai0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ai0 ai0Var = this.a;
        if (ai0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < ai0Var.b.getChildCount(); i10++) {
            View childAt = ai0Var.b.getChildAt(i10);
            if (childAt instanceof xh0) {
                xh0 xh0Var = (xh0) childAt;
                if (xh0Var.I) {
                    xh0Var.b(xh0Var.n, xh0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
