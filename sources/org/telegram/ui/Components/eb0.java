package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb0 b;

    public /* synthetic */ eb0(sb0 sb0Var, int i10) {
        this.a = i10;
        this.b = sb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sb0 sb0Var = this.b;
                kb0 kb0Var = sb0Var.f;
                if (!sb0Var.W.d.webpageTop) {
                    kb0Var.w0(kb0Var.computeVerticalScrollRange() - (kb0Var.computeVerticalScrollExtent() + kb0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, xh.n.V);
                    break;
                } else {
                    kb0Var.w0(-kb0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, xh.n.V);
                    break;
                }
            default:
                this.b.g(true, false);
                break;
        }
    }
}
