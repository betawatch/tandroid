package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class op implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aq b;

    public /* synthetic */ op(aq aqVar, int i10) {
        this.a = i10;
        this.b = aqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                aq aqVar = this.b;
                org.telegram.ui.ActionBar.a2 a2Var = aqVar.r;
                if (a2Var != null) {
                    a2Var.setOnCancelListener(new ug(aqVar, 2));
                    aqVar.showDialog(aqVar.r);
                    break;
                }
                break;
            case 1:
                aq aqVar2 = this.b;
                aqVar2.getMessagesController().loadFullChat(aqVar2.E, 0, true);
                break;
            default:
                aq aqVar3 = this.b;
                aqVar3.getMessagesController().loadFullChat(aqVar3.E, 0, true);
                break;
        }
    }
}
