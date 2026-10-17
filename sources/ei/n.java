package ei;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb b;

    public /* synthetic */ n(lb lbVar, int i10) {
        this.a = i10;
        this.b = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                lb lbVar = this.b;
                lbVar.K0 = false;
                lbVar.L0 = TLObject.FLAG_31;
                lbVar.invalidate();
                lbVar.S0.setVisibility(0);
                lbVar.T0.setVisibility(0);
                break;
            default:
                vb vbVar = this.b.S1;
                jb jbVar = vbVar.X0;
                if (jbVar != null) {
                    jbVar.O = false;
                    jbVar.c();
                    jb jbVar2 = vbVar.X0;
                    jbVar2.m(0L);
                    gc gcVar = jbVar2.F;
                    if (gcVar != null) {
                        gcVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
