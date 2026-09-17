package org.telegram.ui;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ il b;

    public /* synthetic */ hl(il ilVar, int i10) {
        this.a = i10;
        this.b = ilVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mk mkVar = this.b.H.Y;
                if (mkVar != null) {
                    mkVar.T0 = false;
                    org.telegram.ui.Components.eg egVar = mkVar.U0;
                    if (egVar != null) {
                        egVar.u(false);
                        break;
                    }
                }
                break;
            default:
                mk mkVar2 = this.b.H.Y;
                if (mkVar2 != null) {
                    mkVar2.H0();
                    break;
                }
                break;
        }
    }
}
