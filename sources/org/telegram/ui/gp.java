package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp b;

    public /* synthetic */ gp(rp rpVar, int i10) {
        this.a = i10;
        this.b = rpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rp rpVar = this.b;
                org.telegram.ui.ActionBar.a2 a2Var = rpVar.r;
                if (a2Var != null) {
                    a2Var.setOnCancelListener(new lg(rpVar, 2));
                    rpVar.showDialog(rpVar.r);
                    break;
                }
                break;
            case 1:
                rp rpVar2 = this.b;
                rpVar2.getMessagesController().loadFullChat(rpVar2.E, 0, true);
                break;
            default:
                rp rpVar3 = this.b;
                rpVar3.getMessagesController().loadFullChat(rpVar3.E, 0, true);
                break;
        }
    }
}
