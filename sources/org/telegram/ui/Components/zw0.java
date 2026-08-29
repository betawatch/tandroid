package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nx0 b;

    public /* synthetic */ zw0(nx0 nx0Var, int i10) {
        this.a = i10;
        this.b = nx0Var;
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
                nx0.t(this.b);
                break;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.b.H, 1);
                break;
            default:
                nx0.s(this.b);
                break;
        }
    }
}
