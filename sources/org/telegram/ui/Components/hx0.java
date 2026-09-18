package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wx0 b;

    public /* synthetic */ hx0(wx0 wx0Var, int i10) {
        this.a = i10;
        this.b = wx0Var;
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
                wx0.t(this.b);
                break;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.b.L, 1);
                break;
            default:
                wx0.s(this.b);
                break;
        }
    }
}
