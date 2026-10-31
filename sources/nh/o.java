package nh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ int c;

    public /* synthetic */ o(p pVar, int i10, int i11) {
        this.a = i11;
        this.b = pVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p pVar = this.b;
                pVar.post(new o(pVar, this.c, 1));
                break;
            default:
                int i10 = this.c;
                p pVar2 = this.b;
                if (i10 == pVar2.h) {
                    pVar2.f = false;
                    pVar2.d = true;
                    pVar2.b();
                    break;
                }
                break;
        }
    }
}
