package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc0 b;

    public /* synthetic */ tb0(hc0 hc0Var, int i10) {
        this.a = i10;
        this.b = hc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hc0 hc0Var = this.b;
                ac0 ac0Var = hc0Var.f;
                if (!hc0Var.c0.d.webpageTop) {
                    ac0Var.x0(ac0Var.computeVerticalScrollRange() - (ac0Var.computeVerticalScrollExtent() + ac0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, mi.m.V);
                    break;
                } else {
                    ac0Var.x0(-ac0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, mi.m.V);
                    break;
                }
            default:
                this.b.h(true, false);
                break;
        }
    }
}
