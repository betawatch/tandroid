package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ nc1(tc1 tc1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = tc1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tc1.c0(this.b, this.c);
                break;
            default:
                tc1 tc1Var = this.b;
                tc1Var.A0();
                tc1Var.V = this.c;
                tc1Var.getMessagesController().h4(0L, "VALIDATE_PASSWORD");
                tc1 tc1Var2 = new tc1(9, tc1Var.U);
                tc1Var2.H = tc1Var.H;
                tc1Var2.G = tc1Var.G;
                tc1Var.presentFragment(tc1Var2, true);
                break;
        }
    }
}
