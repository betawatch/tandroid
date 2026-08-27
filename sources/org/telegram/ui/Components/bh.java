package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ bh(gi giVar, boolean z10, int i10) {
        this.a = i10;
        this.b = giVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                gi giVar = this.b;
                if (!z10) {
                    giVar.Y0.setVisibility(8);
                    break;
                } else {
                    giVar.getClass();
                    break;
                }
            case 1:
                boolean z11 = this.c;
                gi giVar2 = this.b;
                if (!z11) {
                    giVar2.w.setVisibility(8);
                    break;
                } else {
                    giVar2.getClass();
                    break;
                }
            case 2:
                boolean z12 = this.c;
                gi giVar3 = this.b;
                if (!z12) {
                    giVar3.y.setVisibility(8);
                    break;
                } else {
                    giVar3.getClass();
                    break;
                }
            default:
                boolean z13 = this.c;
                gi giVar4 = this.b;
                if (!z13) {
                    giVar4.getClass();
                    break;
                } else {
                    giVar4.t1.setVisibility(4);
                    break;
                }
        }
    }
}
