package org.telegram.ui;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xp b;

    public /* synthetic */ mp(xp xpVar, int i10) {
        this.a = i10;
        this.b = xpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xp xpVar = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = xpVar.r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new pg(xpVar, 2));
                    xpVar.showDialog(xpVar.r);
                    break;
                }
                break;
            case 1:
                xp xpVar2 = this.b;
                xpVar2.getMessagesController().loadFullChat(xpVar2.E, 0, true);
                break;
            default:
                xp xpVar3 = this.b;
                xpVar3.getMessagesController().loadFullChat(xpVar3.E, 0, true);
                break;
        }
    }
}
