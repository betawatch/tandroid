package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                org.telegram.ui.ActionBar.c2 c2Var = wpVar.r;
                if (c2Var != null) {
                    c2Var.setOnCancelListener(new rg(wpVar, 2));
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
