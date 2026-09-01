package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fh0 implements Runnable {
    public final /* synthetic */ qh0 a;

    public fh0(qh0 qh0Var) {
        this.a = qh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qh0 qh0Var = this.a;
        if (qh0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < qh0Var.b.getChildCount(); i10++) {
            View childAt = qh0Var.b.getChildAt(i10);
            if (childAt instanceof nh0) {
                nh0 nh0Var = (nh0) childAt;
                if (nh0Var.F) {
                    nh0Var.b(nh0Var.n, nh0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
