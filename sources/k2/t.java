package k2;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t(Object obj, int i10, long j10, long j11, int i11) {
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
                v vVar = (v) ((qf.b) obj).c;
                String str = e2.m0.a;
                j2.e eVar = ((i2.b0) vVar).a.s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1011, new j2.d(p5, this.b, this.c, this.d));
                break;
            default:
                j2.e eVar2 = ((y2.b) obj).b;
                com.google.firebase.messaging.l lVar = eVar2.d;
                j2.a n10 = eVar2.n(((e9.n0) lVar.b).isEmpty() ? null : (u2.h0) e9.s.m((e9.n0) lVar.b));
                eVar2.q(n10, 1006, new j2.c(n10, this.b, this.c, this.d));
                break;
        }
    }
}
