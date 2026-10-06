package androidx.biometric;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ g(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x xVar = this.b.l0;
                if (xVar.e == null) {
                    xVar.e = new u();
                }
                xVar.e.b();
                break;
            default:
                this.b.l0.w = false;
                break;
        }
    }
}
