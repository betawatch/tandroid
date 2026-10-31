package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ wg(bi biVar, boolean z10, int i10) {
        this.a = i10;
        this.b = biVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                bi biVar = this.b;
                if (!z10) {
                    biVar.W2.setVisibility(8);
                    break;
                } else {
                    biVar.getClass();
                    break;
                }
            case 1:
                boolean z11 = this.c;
                bi biVar2 = this.b;
                if (!z11) {
                    biVar2.s1.setVisibility(8);
                    break;
                } else {
                    biVar2.getClass();
                    break;
                }
            case 2:
                boolean z12 = this.c;
                bi biVar3 = this.b;
                if (!z12) {
                    biVar3.u1.setVisibility(8);
                    break;
                } else {
                    biVar3.getClass();
                    break;
                }
            default:
                boolean z13 = this.c;
                bi biVar4 = this.b;
                if (!z13) {
                    biVar4.getClass();
                    break;
                } else {
                    biVar4.r3.setVisibility(4);
                    break;
                }
        }
    }
}
