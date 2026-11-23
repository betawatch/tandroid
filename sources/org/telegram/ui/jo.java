package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uo b;

    public /* synthetic */ jo(uo uoVar, int i7) {
        this.a = i7;
        this.b = uoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uo uoVar = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = uoVar.r;
                if (t1Var != null) {
                    t1Var.setOnCancelListener(new wf(uoVar, 2));
                    uoVar.showDialog(uoVar.r);
                    break;
                }
                break;
            case 1:
                uo uoVar2 = this.b;
                uoVar2.getMessagesController().b3(0, uoVar2.F, true);
                break;
            default:
                uo uoVar3 = this.b;
                uoVar3.getMessagesController().b3(0, uoVar3.F, true);
                break;
        }
    }
}
