package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc0 b;

    public /* synthetic */ nb0(bc0 bc0Var, int i10) {
        this.a = i10;
        this.b = bc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bc0 bc0Var = this.b;
                ub0 ub0Var = bc0Var.f;
                if (!bc0Var.c0.d.webpageTop) {
                    ub0Var.w0(ub0Var.computeVerticalScrollRange() - (ub0Var.computeVerticalScrollExtent() + ub0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, ji.n.V);
                    break;
                } else {
                    ub0Var.w0(-ub0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, ji.n.V);
                    break;
                }
            default:
                this.b.g(true, false);
                break;
        }
    }
}
