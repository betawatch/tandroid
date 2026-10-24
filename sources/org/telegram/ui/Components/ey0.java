package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ey0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty0 b;

    public /* synthetic */ ey0(ty0 ty0Var, int i10) {
        this.a = i10;
        this.b = ty0Var;
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
                ty0.v(this.b);
                break;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.b.L, 1);
                break;
            default:
                ty0.u(this.b);
                break;
        }
    }
}
