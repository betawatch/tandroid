package androidx.biometric;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ r d;

    public /* synthetic */ g(r rVar, int i10, CharSequence charSequence, int i11) {
        this.a = i11;
        this.d = rVar;
        this.b = i10;
        this.c = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a0 a0Var = this.d.i0;
                if (a0Var.e == null) {
                    a0Var.e = new x();
                }
                a0Var.e.b(this.b, this.c);
                break;
            default:
                this.d.T(this.b, this.c);
                break;
        }
    }
}
