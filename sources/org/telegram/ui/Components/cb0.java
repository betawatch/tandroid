package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qb0 b;

    public /* synthetic */ cb0(qb0 qb0Var, int i10) {
        this.a = i10;
        this.b = qb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qb0 qb0Var = this.b;
                ib0 ib0Var = qb0Var.f;
                if (!qb0Var.W.d.webpageTop) {
                    ib0Var.w0(ib0Var.computeVerticalScrollRange() - (ib0Var.computeVerticalScrollExtent() + ib0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, wh.n.V);
                    break;
                } else {
                    ib0Var.w0(-ib0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, wh.n.V);
                    break;
                }
            default:
                this.b.g(true, false);
                break;
        }
    }
}
