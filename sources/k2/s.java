package k2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                w wVar = (w) ((hf.b) obj).c;
                String str = e2.l0.a;
                j2.g gVar = ((i2.c0) wVar).a.s;
                j2.a U = gVar.U();
                gVar.V(U, 1011, new j2.e(U, this.b, this.c, this.d));
                break;
            default:
                j2.g gVar2 = ((y2.b) obj).b;
                j2.f fVar = gVar2.d;
                j2.a S = gVar2.S(((e9.n0) fVar.b).isEmpty() ? null : (u2.g0) e9.s.m((e9.n0) fVar.b));
                gVar2.V(S, 1006, new j2.d(S, this.b, this.c, this.d));
                break;
        }
    }
}
