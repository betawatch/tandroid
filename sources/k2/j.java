package k2;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j(Object obj, int i10, long j3, long j10, int i11) {
        this.a = i11;
        this.e = obj;
        this.b = i10;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.e;
        switch (i10) {
            case 0:
                k kVar = (k) ((n4.y) obj).c;
                String str = e2.d0.a;
                j2.f fVar = ((i2.c0) kVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1011, new j2.c(p5, this.b, this.c, this.d));
                break;
            default:
                j2.f fVar2 = ((y2.b) obj).b;
                com.google.firebase.messaging.n nVar = fVar2.d;
                j2.a n10 = fVar2.n(((e9.i0) nVar.b).isEmpty() ? null : (u2.f0) e9.q.l((e9.i0) nVar.b));
                fVar2.q(n10, 1006, new j2.d(n10, this.b, this.c, this.d));
                break;
        }
    }
}
