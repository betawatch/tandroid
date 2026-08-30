package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;

    public /* synthetic */ ep(qp qpVar, int i10) {
        this.a = i10;
        this.b = qpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qp qpVar = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = qpVar.r;
                if (d2Var != null) {
                    d2Var.setOnCancelListener(new ig(qpVar, 2));
                    qpVar.showDialog(qpVar.r);
                    break;
                }
                break;
            case 1:
                qp qpVar2 = this.b;
                qpVar2.getMessagesController().loadFullChat(qpVar2.B, 0, true);
                break;
            default:
                qp qpVar3 = this.b;
                qpVar3.getMessagesController().loadFullChat(qpVar3.B, 0, true);
                break;
        }
    }
}
