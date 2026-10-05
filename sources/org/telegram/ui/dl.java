package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ el b;

    public /* synthetic */ dl(el elVar, int i10) {
        this.a = i10;
        this.b = elVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jk jkVar = this.b.H.W;
                if (jkVar != null) {
                    jkVar.T0 = false;
                    org.telegram.ui.Components.fg fgVar = jkVar.U0;
                    if (fgVar != null) {
                        fgVar.u(false);
                        break;
                    }
                }
                break;
            default:
                jk jkVar2 = this.b.H.W;
                if (jkVar2 != null) {
                    jkVar2.H0();
                    break;
                }
                break;
        }
    }
}
