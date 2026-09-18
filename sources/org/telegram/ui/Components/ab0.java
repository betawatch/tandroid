package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                    hb0Var.x0(hb0Var.computeVerticalScrollRange() - (hb0Var.computeVerticalScrollExtent() + hb0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, ji.n.V);
                    break;
                } else {
                    hb0Var.x0(-hb0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, ji.n.V);
                    break;
                }
            default:
                this.b.g(true, false);
                break;
        }
    }
}
