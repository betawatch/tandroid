package k2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rf.b b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ r(rf.b bVar, Exception exc, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Exception exc = this.c;
        rf.b bVar = this.b;
        switch (i10) {
            case 0:
                v vVar = (v) bVar.c;
                String str = e2.n0.a;
                j2.e eVar = ((i2.d0) vVar).a.s;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1029, new ig.g(p10, exc, 18));
                break;
            default:
                v vVar2 = (v) bVar.c;
                String str2 = e2.n0.a;
                j2.e eVar2 = ((i2.d0) vVar2).a.s;
                j2.a p11 = eVar2.p();
                eVar2.q(p11, 1014, new j2.d(p11, exc, 10));
                break;
        }
    }
}
