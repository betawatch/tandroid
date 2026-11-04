package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ wg(bi biVar, boolean z10, int i3) {
        this.a = i3;
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
                    biVar.X2.setVisibility(8);
                    break;
                } else {
                    biVar.getClass();
                    break;
                }
            case 1:
                boolean z11 = this.c;
                bi biVar2 = this.b;
                if (!z11) {
                    biVar2.t1.setVisibility(8);
                    break;
                } else {
                    biVar2.getClass();
                    break;
                }
            case 2:
                boolean z12 = this.c;
                bi biVar3 = this.b;
                if (!z12) {
                    biVar3.v1.setVisibility(8);
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
                    biVar4.s3.setVisibility(4);
                    break;
                }
        }
    }
}
