package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ mc(nc ncVar, boolean z10, int i10) {
        this.a = i10;
        this.b = ncVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                nc ncVar = this.b;
                if (!z10) {
                    ncVar.Y0.setVisibility(8);
                    break;
                } else {
                    ncVar.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                nc ncVar2 = this.b;
                if (!z11) {
                    ncVar2.U0.setVisibility(8);
                    break;
                } else {
                    ncVar2.getClass();
                    break;
                }
        }
    }
}
