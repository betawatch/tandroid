package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;

    public /* synthetic */ lp(wp wpVar, int i10) {
        this.a = i10;
        this.b = wpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wp wpVar = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = wpVar.r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new pg(wpVar, 2));
                    wpVar.showDialog(wpVar.r);
                    break;
                }
                break;
            case 1:
                wp wpVar2 = this.b;
                wpVar2.getMessagesController().loadFullChat(wpVar2.E, 0, true);
                break;
            default:
                wp wpVar3 = this.b;
                wpVar3.getMessagesController().loadFullChat(wpVar3.E, 0, true);
                break;
        }
    }
}
