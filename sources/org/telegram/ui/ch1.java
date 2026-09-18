package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ ch1(ih1 ih1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = ih1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ih1.Y(this.b, this.c);
                break;
            default:
                ih1 ih1Var = this.b;
                ih1Var.w0();
                ih1Var.V = this.c;
                ih1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                ih1 ih1Var2 = new ih1(9, ih1Var.U);
                ih1Var2.H = ih1Var.H;
                ih1Var2.G = ih1Var.G;
                ih1Var.presentFragment(ih1Var2, true);
                break;
        }
    }
}
