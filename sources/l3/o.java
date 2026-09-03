package l3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7.b b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ o(f7.b bVar, Exception exc, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Exception exc = this.c;
        f7.b bVar = this.b;
        switch (i10) {
            case 0:
                q qVar = (q) bVar.c;
                int i11 = h5.d0.a;
                k3.f fVar = ((j3.c0) qVar).a.q;
                k3.a p10 = fVar.p();
                fVar.q(p10, 1029, new k3.e(p10, exc, 6));
                break;
            default:
                q qVar2 = (q) bVar.c;
                int i12 = h5.d0.a;
                k3.f fVar2 = ((j3.c0) qVar2).a.q;
                k3.a p11 = fVar2.p();
                fVar2.q(p11, 1014, new k3.c(p11, exc, 17));
                break;
        }
    }
}
