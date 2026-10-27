package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp b;

    public /* synthetic */ dp(pp ppVar, int i10) {
        this.a = i10;
        this.b = ppVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pp ppVar = this.b;
                org.telegram.ui.ActionBar.e2 e2Var = ppVar.r;
                if (e2Var != null) {
                    e2Var.setOnCancelListener(new kg(ppVar, 2));
                    ppVar.showDialog(ppVar.r);
                    break;
                }
                break;
            case 1:
                pp ppVar2 = this.b;
                ppVar2.getMessagesController().loadFullChat(ppVar2.E, 0, true);
                break;
            default:
                pp ppVar3 = this.b;
                ppVar3.getMessagesController().loadFullChat(ppVar3.E, 0, true);
                break;
        }
    }
}
