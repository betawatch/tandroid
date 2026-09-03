package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp b;

    public /* synthetic */ gp(sp spVar, int i10) {
        this.a = i10;
        this.b = spVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sp spVar = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = spVar.r;
                if (d2Var != null) {
                    d2Var.setOnCancelListener(new kg(spVar, 2));
                    spVar.showDialog(spVar.r);
                    break;
                }
                break;
            case 1:
                sp spVar2 = this.b;
                spVar2.getMessagesController().loadFullChat(spVar2.B, 0, true);
                break;
            default:
                sp spVar3 = this.b;
                spVar3.getMessagesController().loadFullChat(spVar3.B, 0, true);
                break;
        }
    }
}
