package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ pg1(vg1 vg1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = vg1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vg1.Y(this.b, this.c);
                break;
            default:
                vg1 vg1Var = this.b;
                vg1Var.w0();
                vg1Var.S = this.c;
                vg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                vg1 vg1Var2 = new vg1(9, vg1Var.R);
                vg1Var2.E = vg1Var.E;
                vg1Var2.D = vg1Var.D;
                vg1Var.presentFragment(vg1Var2, true);
                break;
        }
    }
}
