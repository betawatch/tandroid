package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class co implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qo b;

    public /* synthetic */ co(qo qoVar, int i3) {
        this.a = i3;
        this.b = qoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qo qoVar = this.b;
                org.telegram.ui.ActionBar.s1 s1Var = qoVar.r;
                if (s1Var != null) {
                    s1Var.setOnCancelListener(new rf(qoVar, 2));
                    qoVar.showDialog(qoVar.r);
                    break;
                }
                break;
            case 1:
                qo qoVar2 = this.b;
                qoVar2.getMessagesController().V2(0, qoVar2.F, true);
                break;
            default:
                qo qoVar3 = this.b;
                qoVar3.getMessagesController().V2(0, qoVar3.F, true);
                break;
        }
    }
}
