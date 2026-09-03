package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp b;

    public /* synthetic */ fp(rp rpVar, int i10) {
        this.a = i10;
        this.b = rpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rp rpVar = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = rpVar.r;
                if (d2Var != null) {
                    d2Var.setOnCancelListener(new ig(rpVar, 2));
                    rpVar.showDialog(rpVar.r);
                    break;
                }
                break;
            case 1:
                rp rpVar2 = this.b;
                rpVar2.getMessagesController().loadFullChat(rpVar2.B, 0, true);
                break;
            default:
                rp rpVar3 = this.b;
                rpVar3.getMessagesController().loadFullChat(rpVar3.B, 0, true);
                break;
        }
    }
}
