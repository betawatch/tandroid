package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vx0 b;

    public /* synthetic */ gx0(vx0 vx0Var, int i10) {
        this.a = i10;
        this.b = vx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.l();
                break;
            case 1:
                this.b.d.l();
                break;
            case 2:
                vx0.t(this.b);
                break;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.b.L, 1);
                break;
            default:
                vx0.s(this.b);
                break;
        }
    }
}
