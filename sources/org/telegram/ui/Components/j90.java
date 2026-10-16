package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l90 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ j90(l90 l90Var, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = l90Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j90(this.b, this.c, this.d, 1));
                break;
            default:
                l90 l90Var = this.b;
                l90Var.setJoinRequest(this.c);
                l90Var.setJoinToSend(this.d);
                break;
        }
    }
}
