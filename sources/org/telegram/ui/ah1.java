package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ ah1(gh1 gh1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = gh1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gh1.Y(this.b, this.c);
                break;
            default:
                gh1 gh1Var = this.b;
                gh1Var.w0();
                gh1Var.V = this.c;
                gh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                gh1 gh1Var2 = new gh1(9, gh1Var.U);
                gh1Var2.H = gh1Var.H;
                gh1Var2.G = gh1Var.G;
                gh1Var.presentFragment(gh1Var2, true);
                break;
        }
    }
}
