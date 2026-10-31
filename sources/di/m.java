package di;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ m(s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c cVar = this.b.w;
                if (cVar != null) {
                    cVar.close();
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
