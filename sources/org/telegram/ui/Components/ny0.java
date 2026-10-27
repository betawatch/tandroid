package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ny0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dz0 b;

    public /* synthetic */ ny0(dz0 dz0Var, int i10) {
        this.a = i10;
        this.b = dz0Var;
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
                dz0.u(this.b);
                break;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.b.L, 1);
                break;
            default:
                dz0.t(this.b);
                break;
        }
    }
}
