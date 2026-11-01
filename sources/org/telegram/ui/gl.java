package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                mk mkVar = this.b.H.Z;
                if (mkVar != null) {
                    mkVar.T0 = false;
                    org.telegram.ui.Components.gf gfVar = mkVar.U0;
                    if (gfVar != null) {
                        gfVar.u(false);
                        break;
                    }
                }
                break;
            default:
                mk mkVar2 = this.b.H.Z;
                if (mkVar2 != null) {
                    mkVar2.F0();
                    break;
                }
                break;
        }
    }
}
