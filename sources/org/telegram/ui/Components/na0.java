package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class na0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ab0 b;

    public /* synthetic */ na0(ab0 ab0Var, int i10) {
        this.a = i10;
        this.b = ab0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ab0 ab0Var = this.b;
                ta0 ta0Var = ab0Var.f;
                if (!ab0Var.V.d.webpageTop) {
                    ta0Var.w0(ta0Var.computeVerticalScrollRange() - (ta0Var.computeVerticalScrollExtent() + ta0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, sh.m.V);
                    break;
                } else {
                    ta0Var.w0(-ta0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, sh.m.V);
                    break;
                }
            default:
                this.b.g(true, false);
                break;
        }
    }
}
