package org.telegram.ui.Components;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ kd(ld ldVar, boolean z10, int i10) {
        this.a = i10;
        this.b = ldVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                ld ldVar = this.b;
                if (!z10) {
                    ldVar.Z0.setVisibility(8);
                    break;
                } else {
                    ldVar.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                ld ldVar2 = this.b;
                if (!z11) {
                    ldVar2.V0.setVisibility(8);
                    break;
                } else {
                    ldVar2.getClass();
                    break;
                }
        }
    }
}
