package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ow0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx0 b;

    public /* synthetic */ ow0(cx0 cx0Var, int i9) {
        this.a = i9;
        this.b = cx0Var;
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
                cx0.t(this.b);
                break;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.b.H, 1);
                break;
            default:
                cx0.s(this.b);
                break;
        }
    }
}
