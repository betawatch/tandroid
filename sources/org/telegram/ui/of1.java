package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class of1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vf1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ of1(vf1 vf1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = vf1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vf1.Y(this.b, this.c);
                break;
            default:
                vf1 vf1Var = this.b;
                vf1Var.w0();
                vf1Var.V = this.c;
                vf1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                vf1 vf1Var2 = new vf1(9, vf1Var.U);
                vf1Var2.H = vf1Var.H;
                vf1Var2.G = vf1Var.G;
                vf1Var.presentFragment(vf1Var2, true);
                break;
        }
    }
}
