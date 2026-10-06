package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ip implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp b;

    public /* synthetic */ ip(tp tpVar, int i10) {
        this.a = i10;
        this.b = tpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tp tpVar = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = tpVar.r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new rg(tpVar, 2));
                    tpVar.showDialog(tpVar.r);
                    break;
                }
                break;
            case 1:
                tp tpVar2 = this.b;
                tpVar2.getMessagesController().loadFullChat(tpVar2.E, 0, true);
                break;
            default:
                tp tpVar3 = this.b;
                tpVar3.getMessagesController().loadFullChat(tpVar3.E, 0, true);
                break;
        }
    }
}
