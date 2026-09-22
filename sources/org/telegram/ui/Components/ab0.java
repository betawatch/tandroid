package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb0 b;

    public /* synthetic */ ab0(pb0 pb0Var, int i10) {
        this.a = i10;
        this.b = pb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pb0 pb0Var = this.b;
                hb0 hb0Var = pb0Var.f;
                if (!pb0Var.c0.d.webpageTop) {
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
