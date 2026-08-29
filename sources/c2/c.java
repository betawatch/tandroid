package c2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.emoji2.text.o b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.a = i11;
        this.b = oVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b0 b0Var = ((e) ((androidx.biometric.e) this.b.f).d).d;
                if (b0Var != null) {
                    b0Var.j(this.c);
                    break;
                }
                break;
            default:
                b0 b0Var2 = ((e) ((androidx.biometric.e) this.b.f).d).d;
                if (b0Var2 != null) {
                    b0Var2.k(this.c);
                    break;
                }
                break;
        }
    }
}
