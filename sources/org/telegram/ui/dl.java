package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                jk jkVar = this.b.H.Y;
                if (jkVar != null) {
                    jkVar.T0 = false;
                    org.telegram.ui.Components.eg egVar = jkVar.U0;
                    if (egVar != null) {
                        egVar.u(false);
                        break;
                    }
                }
                break;
            default:
                jk jkVar2 = this.b.H.Y;
                if (jkVar2 != null) {
                    jkVar2.H0();
                    break;
                }
                break;
        }
    }
}
