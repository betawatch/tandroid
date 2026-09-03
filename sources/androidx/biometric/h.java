package androidx.biometric;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ h(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a0 a0Var = this.b.i0;
                if (a0Var.e == null) {
                    a0Var.e = new x();
                }
                a0Var.e.c();
                break;
            default:
                this.b.i0.w = false;
                break;
        }
    }
}
