package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class nb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cc0 b;

    public /* synthetic */ nb0(cc0 cc0Var, int i10) {
        this.a = i10;
        this.b = cc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cc0 cc0Var = this.b;
                ub0 ub0Var = cc0Var.f;
                if (!cc0Var.c0.d.webpageTop) {
                    ub0Var.x0(ub0Var.computeVerticalScrollRange() - (ub0Var.computeVerticalScrollExtent() + ub0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, ji.n.V);
                    break;
                } else {
                    ub0Var.x0(-ub0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, ji.n.V);
                    break;
                }
            default:
                this.b.g(true, false);
                break;
        }
    }
}
