package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.im0 b;

    public /* synthetic */ pe(org.telegram.ui.Components.im0 im0Var, int i10) {
        this.a = i10;
        this.b = im0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.im0 im0Var = this.b;
                if (!im0Var.J) {
                    im0Var.J = true;
                    im0Var.c(new org.telegram.ui.Components.gm0(im0Var, 0), false);
                    im0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
