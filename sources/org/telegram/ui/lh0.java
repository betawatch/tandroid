package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class lh0 implements Runnable {
    public final /* synthetic */ wh0 a;

    public lh0(wh0 wh0Var) {
        this.a = wh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wh0 wh0Var = this.a;
        if (wh0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < wh0Var.b.getChildCount(); i10++) {
            View childAt = wh0Var.b.getChildAt(i10);
            if (childAt instanceof th0) {
                th0 th0Var = (th0) childAt;
                if (th0Var.I) {
                    th0Var.b(th0Var.n, th0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
