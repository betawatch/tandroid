package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ ih1(oh1 oh1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = oh1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oh1.Y(this.b, this.c);
                break;
            default:
                oh1 oh1Var = this.b;
                oh1Var.w0();
                oh1Var.V = this.c;
                oh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                oh1 oh1Var2 = new oh1(9, oh1Var.U);
                oh1Var2.H = oh1Var.H;
                oh1Var2.G = oh1Var.G;
                oh1Var.presentFragment(oh1Var2, true);
                break;
        }
    }
}
