package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ja0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wa0 b;

    public /* synthetic */ ja0(wa0 wa0Var, int i9) {
        this.a = i9;
        this.b = wa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wa0 wa0Var = this.b;
                pa0 pa0Var = wa0Var.f;
                if (!wa0Var.V.d.webpageTop) {
                    pa0Var.w0(pa0Var.computeVerticalScrollRange() - (pa0Var.computeVerticalScrollExtent() + pa0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, rh.m.V);
                    break;
                } else {
                    pa0Var.w0(-pa0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, rh.m.V);
                    break;
                }
            default:
                this.b.g(true, false);
                break;
        }
    }
}
