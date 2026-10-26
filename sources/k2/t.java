package k2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                v vVar = (v) ((rf.b) obj).c;
                String str = e2.n0.a;
                j2.e eVar = ((i2.d0) vVar).a.s;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1011, new j2.d(p10, this.b, this.c, this.d));
                break;
            default:
                j2.e eVar2 = ((y2.b) obj).b;
                aa.m0 m0Var = eVar2.d;
                j2.a n10 = eVar2.n(((f9.i0) m0Var.b).isEmpty() ? null : (u2.g0) f9.o.m((f9.i0) m0Var.b));
                eVar2.q(n10, 1006, new j2.c(n10, this.b, this.c, this.d));
                break;
        }
    }
}
