package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ja1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ ja1(ra1 ra1Var, byte[] bArr, int i3) {
        this.a = i3;
        this.b = ra1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ra1.d0(this.b, this.c);
                break;
            default:
                ra1 ra1Var = this.b;
                ra1Var.B0();
                ra1Var.W = this.c;
                ra1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                ra1 ra1Var2 = new ra1(9, ra1Var.V);
                ra1Var2.I = ra1Var.I;
                ra1Var2.H = ra1Var.H;
                ra1Var.presentFragment(ra1Var2, true);
                break;
        }
    }
}
