package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy0 b;

    public /* synthetic */ qx0(fy0 fy0Var, int i10) {
        this.a = i10;
        this.b = fy0Var;
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
                fy0.t(this.b);
                break;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.b.L, 1);
                break;
            default:
                fy0.s(this.b);
                break;
        }
    }
}
