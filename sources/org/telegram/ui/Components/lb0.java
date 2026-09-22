package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class lb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ac0 b;

    public /* synthetic */ lb0(ac0 ac0Var, int i10) {
        this.a = i10;
        this.b = ac0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ac0 ac0Var = this.b;
                sb0 sb0Var = ac0Var.f;
                if (!ac0Var.c0.d.webpageTop) {
                    sb0Var.x0(sb0Var.computeVerticalScrollRange() - (sb0Var.computeVerticalScrollExtent() + sb0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, ji.n.V);
                    break;
                } else {
                    sb0Var.x0(-sb0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, ji.n.V);
                    break;
                }
            default:
                this.b.g(true, false);
                break;
        }
    }
}
