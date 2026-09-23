package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class fx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ux0 b;

    public /* synthetic */ fx0(ux0 ux0Var, int i10) {
        this.a = i10;
        this.b = ux0Var;
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
                ux0.t(this.b);
                break;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.b.L, 1);
                break;
            default:
                ux0.s(this.b);
                break;
        }
    }
}
