package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gh0 implements Runnable {
    public final /* synthetic */ rh0 a;

    public gh0(rh0 rh0Var) {
        this.a = rh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rh0 rh0Var = this.a;
        if (rh0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < rh0Var.b.getChildCount(); i10++) {
            View childAt = rh0Var.b.getChildAt(i10);
            if (childAt instanceof oh0) {
                oh0 oh0Var = (oh0) childAt;
                if (oh0Var.F) {
                    oh0Var.b(oh0Var.n, oh0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
