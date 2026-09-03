package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ix0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx0 b;

    public /* synthetic */ ix0(xx0 xx0Var, int i10) {
        this.a = i10;
        this.b = xx0Var;
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
                xx0.t(this.b);
                break;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.b.I, 1);
                break;
            default:
                xx0.s(this.b);
                break;
        }
    }
}
