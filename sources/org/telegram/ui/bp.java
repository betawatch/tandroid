package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ bp(np npVar, int i10) {
        this.a = i10;
        this.b = npVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                np npVar = this.b;
                org.telegram.ui.ActionBar.e2 e2Var = npVar.r;
                if (e2Var != null) {
                    e2Var.setOnCancelListener(new fg(npVar, 2));
                    npVar.showDialog(npVar.r);
                    break;
                }
                break;
            case 1:
                np npVar2 = this.b;
                npVar2.getMessagesController().loadFullChat(npVar2.E, 0, true);
                break;
            default:
                np npVar3 = this.b;
                npVar3.getMessagesController().loadFullChat(npVar3.E, 0, true);
                break;
        }
    }
}
