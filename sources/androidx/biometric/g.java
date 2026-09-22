package androidx.biometric;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
