package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ih0 implements Runnable {
    public final /* synthetic */ th0 a;

    public ih0(th0 th0Var) {
        this.a = th0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        th0 th0Var = this.a;
        if (th0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < th0Var.b.getChildCount(); i10++) {
            View childAt = th0Var.b.getChildAt(i10);
            if (childAt instanceof qh0) {
                qh0 qh0Var = (qh0) childAt;
                if (qh0Var.I) {
                    qh0Var.b(qh0Var.n, qh0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
