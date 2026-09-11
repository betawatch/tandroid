package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
