package c2;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.emoji2.text.p b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.a = i11;
        this.b = pVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a0 a0Var = ((e) ((androidx.biometric.e) this.b.f).d).d;
                if (a0Var != null) {
                    a0Var.j(this.c);
                    break;
                }
                break;
            default:
                a0 a0Var2 = ((e) ((androidx.biometric.e) this.b.f).d).d;
                if (a0Var2 != null) {
                    a0Var2.k(this.c);
                    break;
                }
                break;
        }
    }
}
