package org.telegram.ui.Components;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qh(vi viVar, boolean z10, int i10) {
        this.a = i10;
        this.b = viVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                vi viVar = this.b;
                if (!z10) {
                    viVar.c1.setVisibility(8);
                    break;
                } else {
                    viVar.getClass();
                    break;
                }
            case 1:
                boolean z11 = this.c;
                vi viVar2 = this.b;
                if (!z11) {
                    viVar2.w.setVisibility(8);
                    break;
                } else {
                    viVar2.getClass();
                    break;
                }
            case 2:
                boolean z12 = this.c;
                vi viVar3 = this.b;
                if (!z12) {
                    viVar3.y.setVisibility(8);
                    break;
                } else {
                    viVar3.getClass();
                    break;
                }
            default:
                boolean z13 = this.c;
                vi viVar4 = this.b;
                if (!z13) {
                    viVar4.getClass();
                    break;
                } else {
                    viVar4.x1.setVisibility(4);
                    break;
                }
        }
    }
}
