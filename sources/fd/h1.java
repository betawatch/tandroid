package fd;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public enum h1 extends a2 {
    public h1() {
        super("AfterDoctypeName", 53);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        f fVar = kVar.m;
        boolean j10 = aVar.j();
        v vVar = a2.a;
        if (j10) {
            kVar.l(this);
            fVar.getClass();
            kVar.j();
            kVar.c = vVar;
            return;
        }
        if (aVar.n('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
            return;
        }
        if (aVar.m('>')) {
            kVar.j();
            kVar.a(vVar);
            return;
        }
        if (aVar.l("PUBLIC")) {
            fVar.getClass();
            kVar.c = a2.r0;
        } else if (aVar.l("SYSTEM")) {
            fVar.getClass();
            kVar.c = a2.x0;
        } else {
            kVar.m(this);
            fVar.getClass();
            kVar.a(a2.C0);
        }
    }
}
