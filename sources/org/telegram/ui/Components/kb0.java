package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class kb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb0 b;

    public /* synthetic */ kb0(yb0 yb0Var, int i10) {
        this.a = i10;
        this.b = yb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yb0 yb0Var = this.b;
                rb0 rb0Var = yb0Var.f;
                if (!yb0Var.c0.d.webpageTop) {
                    rb0Var.w0(rb0Var.computeVerticalScrollRange() - (rb0Var.computeVerticalScrollExtent() + rb0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, ii.n.V);
                    break;
                } else {
                    rb0Var.w0(-rb0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, ii.n.V);
                    break;
                }
            default:
                this.b.g(true, false);
                break;
        }
    }
}
