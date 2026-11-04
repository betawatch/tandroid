package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ne0 implements Runnable {
    public final /* synthetic */ xe0 a;

    public ne0(xe0 xe0Var) {
        this.a = xe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xe0 xe0Var = this.a;
        if (xe0Var.b == null) {
            return;
        }
        for (int i3 = 0; i3 < xe0Var.b.getChildCount(); i3++) {
            View childAt = xe0Var.b.getChildAt(i3);
            if (childAt instanceof ue0) {
                ue0 ue0Var = (ue0) childAt;
                if (ue0Var.J) {
                    ue0Var.b(ue0Var.n, ue0Var.r);
                }
            }
        }
        org.telegram.messenger.g0.i3(this, 500L);
    }
}
