package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb0 b;

    public /* synthetic */ lb0(zb0 zb0Var, int i10) {
        this.a = i10;
        this.b = zb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zb0 zb0Var = this.b;
                sb0 sb0Var = zb0Var.f;
                if (!zb0Var.c0.d.webpageTop) {
                    sb0Var.w0(sb0Var.computeVerticalScrollRange() - (sb0Var.computeVerticalScrollExtent() + sb0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, ji.n.V);
                    break;
                } else {
                    sb0Var.w0(-sb0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, ji.n.V);
                    break;
                }
            default:
                this.b.g(true, false);
                break;
        }
    }
}
