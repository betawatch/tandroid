package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic0 b;

    public /* synthetic */ ub0(ic0 ic0Var, int i10) {
        this.a = i10;
        this.b = ic0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ic0 ic0Var = this.b;
                bc0 bc0Var = ic0Var.f;
                if (!ic0Var.c0.d.webpageTop) {
                    bc0Var.w0(bc0Var.computeVerticalScrollRange() - (bc0Var.computeVerticalScrollExtent() + bc0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, li.m.V);
                    break;
                } else {
                    bc0Var.w0(-bc0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, li.m.V);
                    break;
                }
            default:
                this.b.h(true, false);
                break;
        }
    }
}
