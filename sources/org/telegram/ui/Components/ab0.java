package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ob0 b;

    public /* synthetic */ ab0(ob0 ob0Var, int i10) {
        this.a = i10;
        this.b = ob0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ob0 ob0Var = this.b;
                hb0 hb0Var = ob0Var.f;
                if (!ob0Var.c0.d.webpageTop) {
                    hb0Var.w0(hb0Var.computeVerticalScrollRange() - (hb0Var.computeVerticalScrollExtent() + hb0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, ji.n.V);
                    break;
                } else {
                    hb0Var.w0(-hb0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, ji.n.V);
                    break;
                }
            default:
                this.b.g(true, false);
                break;
        }
    }
}
