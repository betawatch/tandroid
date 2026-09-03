package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hl b;

    public /* synthetic */ gl(hl hlVar, int i10) {
        this.a = i10;
        this.b = hlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lk lkVar = this.b.E.V;
                if (lkVar != null) {
                    lkVar.Q0 = false;
                    org.telegram.ui.Components.uf ufVar = lkVar.R0;
                    if (ufVar != null) {
                        ufVar.u(false);
                        break;
                    }
                }
                break;
            default:
                lk lkVar2 = this.b.E.V;
                if (lkVar2 != null) {
                    lkVar2.H0();
                    break;
                }
                break;
        }
    }
}
