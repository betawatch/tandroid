package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ so b;

    public /* synthetic */ ho(so soVar, int i7) {
        this.a = i7;
        this.b = soVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                so soVar = this.b;
                org.telegram.ui.ActionBar.u1 u1Var = soVar.r;
                if (u1Var != null) {
                    u1Var.setOnCancelListener(new vf(soVar, 2));
                    soVar.showDialog(soVar.r);
                    break;
                }
                break;
            case 1:
                so soVar2 = this.b;
                soVar2.getMessagesController().V2(0, soVar2.E, true);
                break;
            default:
                so soVar3 = this.b;
                soVar3.getMessagesController().V2(0, soVar3.E, true);
                break;
        }
    }
}
