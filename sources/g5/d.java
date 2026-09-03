package g5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i10, long j10, long j11, int i11) {
        this.a = i11;
        this.e = obj;
        this.b = i10;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.e;
        switch (i10) {
            case 0:
                k3.f fVar = ((e) obj).b;
                a9.a aVar = fVar.d;
                k3.a n10 = fVar.n(((s8.v) aVar.b).isEmpty() ? null : (o4.v) s8.l.h((s8.v) aVar.b));
                fVar.q(n10, 1006, new k3.d(n10, this.b, this.c, this.d));
                break;
            default:
                l3.q qVar = (l3.q) ((f7.b) obj).c;
                int i11 = h5.d0.a;
                k3.f fVar2 = ((j3.c0) qVar).a.q;
                k3.a p10 = fVar2.p();
                fVar2.q(p10, 1011, new j3.q0(p10, this.b, this.c, this.d));
                break;
        }
    }
}
