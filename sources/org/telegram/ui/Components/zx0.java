package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy0 b;

    public /* synthetic */ zx0(oy0 oy0Var, int i10) {
        this.a = i10;
        this.b = oy0Var;
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
                oy0.v(this.b);
                break;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.b.L, 1);
                break;
            default:
                oy0.t(this.b);
                break;
        }
    }
}
