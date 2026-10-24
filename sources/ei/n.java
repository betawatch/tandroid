package ei;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
