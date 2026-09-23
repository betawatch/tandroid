package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                jk jkVar = this.b.H.Y;
                if (jkVar != null) {
                    jkVar.T0 = false;
                    org.telegram.ui.Components.dg dgVar = jkVar.U0;
                    if (dgVar != null) {
                        dgVar.u(false);
                        break;
                    }
                }
                break;
            default:
                jk jkVar2 = this.b.H.Y;
                if (jkVar2 != null) {
                    jkVar2.I0();
                    break;
                }
                break;
        }
    }
}
