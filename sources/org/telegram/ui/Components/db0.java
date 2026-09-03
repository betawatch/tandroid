package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rb0 b;

    public /* synthetic */ db0(rb0 rb0Var, int i10) {
        this.a = i10;
        this.b = rb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rb0 rb0Var = this.b;
                jb0 jb0Var = rb0Var.f;
                if (!rb0Var.W.d.webpageTop) {
                    jb0Var.w0(jb0Var.computeVerticalScrollRange() - (jb0Var.computeVerticalScrollExtent() + jb0Var.computeVerticalScrollOffset()), MediaDataController.MAX_LINKS_COUNT, wh.n.V);
                    break;
                } else {
                    jb0Var.w0(-jb0Var.computeVerticalScrollOffset(), MediaDataController.MAX_LINKS_COUNT, wh.n.V);
                    break;
                }
            default:
                this.b.g(true, false);
                break;
        }
    }
}
