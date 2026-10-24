package k2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qf.b b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ r(qf.b bVar, Exception exc, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Exception exc = this.c;
        qf.b bVar = this.b;
        switch (i10) {
            case 0:
                v vVar = (v) bVar.c;
                String str = e2.m0.a;
                j2.e eVar = ((i2.b0) vVar).a.s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1029, new ih.l(p5, exc, 20));
                break;
            default:
                v vVar2 = (v) bVar.c;
                String str2 = e2.m0.a;
                j2.e eVar2 = ((i2.b0) vVar2).a.s;
                j2.a p9 = eVar2.p();
                eVar2.q(p9, 1014, new j2.d(p9, exc, 12));
                break;
        }
    }
}
