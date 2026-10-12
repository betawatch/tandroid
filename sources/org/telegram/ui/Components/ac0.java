package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;

    public /* synthetic */ ac0(pc0 pc0Var, int i10) {
        this.a = i10;
        this.b = pc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pc0 pc0Var = this.b;
                hc0 hc0Var = pc0Var.f;
                if (!pc0Var.c0.d.webpageTop) {
                    hc0Var.w0(hc0Var.computeVerticalScrollRange() - (hc0Var.computeVerticalScrollExtent() + hc0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, ki.n.V);
                    break;
                } else {
                    hc0Var.w0(-hc0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, ki.n.V);
                    break;
                }
            default:
                this.b.g(true, false);
                break;
        }
    }
}
