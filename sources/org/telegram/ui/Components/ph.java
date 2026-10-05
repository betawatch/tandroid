package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ph(xi xiVar, boolean z10, int i10) {
        this.a = i10;
        this.b = xiVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                xi xiVar = this.b;
                if (!z10) {
                    xiVar.c1.setVisibility(8);
                    break;
                } else {
                    xiVar.getClass();
                    break;
                }
            case 1:
                boolean z11 = this.c;
                xi xiVar2 = this.b;
                if (!z11) {
                    xiVar2.w.setVisibility(8);
                    break;
                } else {
                    xiVar2.getClass();
                    break;
                }
            case 2:
                boolean z12 = this.c;
                xi xiVar3 = this.b;
                if (!z12) {
                    xiVar3.y.setVisibility(8);
                    break;
                } else {
                    xiVar3.getClass();
                    break;
                }
            default:
                boolean z13 = this.c;
                xi xiVar4 = this.b;
                if (!z13) {
                    xiVar4.getClass();
                    break;
                } else {
                    xiVar4.x1.setVisibility(4);
                    break;
                }
        }
    }
}
