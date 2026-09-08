package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qb0 b;

    public /* synthetic */ bb0(qb0 qb0Var, int i10) {
        this.a = i10;
        this.b = qb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qb0 qb0Var = this.b;
                ib0 ib0Var = qb0Var.f;
                if (!qb0Var.c0.d.webpageTop) {
                    ib0Var.w0(ib0Var.computeVerticalScrollRange() - (ib0Var.computeVerticalScrollExtent() + ib0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, ki.o.V);
                    break;
                } else {
                    ib0Var.w0(-ib0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, ki.o.V);
                    break;
                }
            default:
                this.b.g(true, false);
                break;
        }
    }
}
