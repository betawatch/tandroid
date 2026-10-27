package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                    jkVar2.E0();
                    break;
                }
                break;
        }
    }
}
