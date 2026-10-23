package k2;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qf.b b;
    public final /* synthetic */ i2.f c;

    public /* synthetic */ r(qf.b bVar, i2.f fVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qf.b bVar = this.b;
                i2.f fVar = this.c;
                synchronized (fVar) {
                }
                u uVar = (u) bVar.c;
                String str = e2.m0.a;
                j2.f fVar2 = ((i2.c0) uVar).a.s;
                j2.a n10 = fVar2.n((u2.g0) fVar2.d.e);
                fVar2.q(n10, 1013, new j2.c(n10, fVar, 26));
                break;
            default:
                qf.b bVar2 = this.b;
                i2.f fVar3 = this.c;
                u uVar2 = (u) bVar2.c;
                String str2 = e2.m0.a;
                j2.f fVar4 = ((i2.c0) uVar2).a.s;
                j2.a p5 = fVar4.p();
                fVar4.q(p5, 1007, new j2.c(p5, fVar3, 21));
                break;
        }
    }
}
