package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp b;

    public /* synthetic */ hp(sp spVar, int i10) {
        this.a = i10;
        this.b = spVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sp spVar = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = spVar.r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new ng(spVar, 2));
                    spVar.showDialog(spVar.r);
                    break;
                }
                break;
            case 1:
                sp spVar2 = this.b;
                spVar2.getMessagesController().loadFullChat(spVar2.E, 0, true);
                break;
            default:
                sp spVar3 = this.b;
                spVar3.getMessagesController().loadFullChat(spVar3.E, 0, true);
                break;
        }
    }
}
