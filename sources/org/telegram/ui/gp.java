package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
