package org.telegram.ui;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ bh1(hh1 hh1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = hh1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hh1.Y(this.b, this.c);
                break;
            default:
                hh1 hh1Var = this.b;
                hh1Var.w0();
                hh1Var.V = this.c;
                hh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                hh1 hh1Var2 = new hh1(9, hh1Var.U);
                hh1Var2.H = hh1Var.H;
                hh1Var2.G = hh1Var.G;
                hh1Var.presentFragment(hh1Var2, true);
                break;
        }
    }
}
