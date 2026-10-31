package lg;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ o(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p pVar = this.b;
                if (pVar.d.J == pVar) {
                    pVar.d.W = false;
                    pVar.d.a0 = null;
                    pVar.d.i();
                    break;
                }
                break;
            default:
                p pVar2 = this.b;
                if (pVar2.d.J == pVar2 && !pVar2.b) {
                    pVar2.d.W = true;
                    Runnable runnable = pVar2.d.a0;
                    pVar2.d.a0 = null;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }
}
