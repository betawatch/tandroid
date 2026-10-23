package k2;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s(Object obj, int i10, long j10, long j11, int i11) {
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
                u uVar = (u) ((qf.b) obj).c;
                String str = e2.m0.a;
                j2.f fVar = ((i2.c0) uVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1011, new j2.e(p5, this.b, this.c, this.d));
                break;
            default:
                j2.f fVar2 = ((y2.b) obj).b;
                com.google.firebase.messaging.l lVar = fVar2.d;
                j2.a n10 = fVar2.n(((e9.n0) lVar.b).isEmpty() ? null : (u2.g0) e9.s.m((e9.n0) lVar.b));
                fVar2.q(n10, 1006, new j2.d(n10, this.b, this.c, this.d));
                break;
        }
    }
}
