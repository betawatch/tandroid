package k2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i(Object obj, int i10, long j3, long j10, int i11) {
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
                j jVar = (j) ((of.b) obj).c;
                String str = e2.d0.a;
                j2.e eVar = ((i2.b0) jVar).a.s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1011, new i0.b(p5, this.b, this.c, this.d));
                break;
            default:
                j2.e eVar2 = ((y2.b) obj).b;
                com.google.firebase.messaging.n nVar = eVar2.d;
                j2.a n10 = eVar2.n(((e9.i0) nVar.b).isEmpty() ? null : (u2.g0) e9.q.l((e9.i0) nVar.b));
                eVar2.q(n10, 1006, new j2.c(n10, this.b, this.c, this.d));
                break;
        }
    }
}
