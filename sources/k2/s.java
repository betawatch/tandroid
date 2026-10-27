package k2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rf.b b;
    public final /* synthetic */ i2.e c;

    public /* synthetic */ s(rf.b bVar, i2.e eVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rf.b bVar = this.b;
                i2.e eVar = this.c;
                synchronized (eVar) {
                }
                v vVar = (v) bVar.c;
                String str = e2.n0.a;
                j2.e eVar2 = ((i2.d0) vVar).a.s;
                j2.a n10 = eVar2.n((u2.g0) eVar2.d.e);
                eVar2.q(n10, 1013, new ig.g(n10, eVar, 28));
                break;
            default:
                rf.b bVar2 = this.b;
                i2.e eVar3 = this.c;
                v vVar2 = (v) bVar2.c;
                String str2 = e2.n0.a;
                j2.e eVar4 = ((i2.d0) vVar2).a.s;
                j2.a p10 = eVar4.p();
                eVar4.q(p10, 1007, new ig.g(p10, eVar3, 23));
                break;
        }
    }
}
