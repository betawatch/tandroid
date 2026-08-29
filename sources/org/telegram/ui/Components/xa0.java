package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb0 b;

    public /* synthetic */ xa0(lb0 lb0Var, int i10) {
        this.a = i10;
        this.b = lb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lb0 lb0Var = this.b;
                eb0 eb0Var = lb0Var.f;
                if (!lb0Var.V.d.webpageTop) {
                    eb0Var.w0(eb0Var.computeVerticalScrollRange() - (eb0Var.computeVerticalScrollExtent() + eb0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, uh.m.V);
                    break;
                } else {
                    eb0Var.w0(-eb0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, uh.m.V);
                    break;
                }
            default:
                this.b.g(true, false);
                break;
        }
    }
}
