package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ jg1(qg1 qg1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = qg1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qg1.Y(this.b, this.c);
                break;
            default:
                qg1 qg1Var = this.b;
                qg1Var.w0();
                qg1Var.S = this.c;
                qg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                qg1 qg1Var2 = new qg1(9, qg1Var.R);
                qg1Var2.E = qg1Var.E;
                qg1Var2.D = qg1Var.D;
                qg1Var.presentFragment(qg1Var2, true);
                break;
        }
    }
}
