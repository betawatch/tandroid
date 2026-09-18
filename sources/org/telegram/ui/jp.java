package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ up b;

    public /* synthetic */ jp(up upVar, int i10) {
        this.a = i10;
        this.b = upVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                up upVar = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = upVar.r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new og(upVar, 2));
                    upVar.showDialog(upVar.r);
                    break;
                }
                break;
            case 1:
                up upVar2 = this.b;
                upVar2.getMessagesController().loadFullChat(upVar2.E, 0, true);
                break;
            default:
                up upVar3 = this.b;
                upVar3.getMessagesController().loadFullChat(upVar3.E, 0, true);
                break;
        }
    }
}
