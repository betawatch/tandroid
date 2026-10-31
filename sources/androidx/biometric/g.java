package androidx.biometric;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                y yVar = this.b.l0;
                if (yVar.e == null) {
                    yVar.e = new v();
                }
                yVar.e.b();
                break;
            default:
                this.b.l0.w = false;
                break;
        }
    }
}
