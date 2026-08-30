package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ og1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ hg1(og1 og1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = og1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                og1.Y(this.b, this.c);
                break;
            default:
                og1 og1Var = this.b;
                og1Var.w0();
                og1Var.S = this.c;
                og1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                og1 og1Var2 = new og1(9, og1Var.R);
                og1Var2.E = og1Var.E;
                og1Var2.D = og1Var.D;
                og1Var.presentFragment(og1Var2, true);
                break;
        }
    }
}
