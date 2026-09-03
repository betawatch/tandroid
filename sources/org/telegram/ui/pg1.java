package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ pg1(wg1 wg1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = wg1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wg1.Y(this.b, this.c);
                break;
            default:
                wg1 wg1Var = this.b;
                wg1Var.w0();
                wg1Var.S = this.c;
                wg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                wg1 wg1Var2 = new wg1(9, wg1Var.R);
                wg1Var2.E = wg1Var.E;
                wg1Var2.D = wg1Var.D;
                wg1Var.presentFragment(wg1Var2, true);
                break;
        }
    }
}
