package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                org.telegram.ui.ActionBar.u1 u1Var = uoVar.r;
                if (u1Var != null) {
                    u1Var.setOnCancelListener(new vf(uoVar, 2));
                    uoVar.showDialog(uoVar.r);
                    break;
                }
                break;
            case 1:
                uo uoVar2 = this.b;
                uoVar2.getMessagesController().V2(0, uoVar2.E, true);
                break;
            default:
                uo uoVar3 = this.b;
                uoVar3.getMessagesController().V2(0, uoVar3.E, true);
                break;
        }
    }
}
