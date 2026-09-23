package androidx.biometric;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
