package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc0 b;

    public /* synthetic */ wb0(lc0 lc0Var, int i10) {
        this.a = i10;
        this.b = lc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lc0 lc0Var = this.b;
                ec0 ec0Var = lc0Var.f;
                if (!lc0Var.c0.d.webpageTop) {
                    ec0Var.w0(ec0Var.computeVerticalScrollRange() - (ec0Var.computeVerticalScrollExtent() + ec0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, li.m.V);
                    break;
                } else {
                    ec0Var.w0(-ec0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, li.m.V);
                    break;
                }
            default:
                this.b.h(true, false);
                break;
        }
    }
}
