package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class el implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fl b;

    public /* synthetic */ el(fl flVar, int i10) {
        this.a = i10;
        this.b = flVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jk jkVar = this.b.E.V;
                if (jkVar != null) {
                    jkVar.Q0 = false;
                    org.telegram.ui.Components.uf ufVar = jkVar.R0;
                    if (ufVar != null) {
                        ufVar.u(false);
                        break;
                    }
                }
                break;
            default:
                jk jkVar2 = this.b.E.V;
                if (jkVar2 != null) {
                    jkVar2.H0();
                    break;
                }
                break;
        }
    }
}
