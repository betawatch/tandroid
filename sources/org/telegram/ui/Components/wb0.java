package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
