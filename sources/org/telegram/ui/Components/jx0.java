package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx0 b;

    public /* synthetic */ jx0(yx0 yx0Var, int i10) {
        this.a = i10;
        this.b = yx0Var;
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
                yx0.t(this.b);
                break;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.b.I, 1);
                break;
            default:
                yx0.s(this.b);
                break;
        }
    }
}
