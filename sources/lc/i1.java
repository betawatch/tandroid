package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum i1 extends b2 {
    public i1() {
        super("AfterDoctypeName", 53);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        f fVar = lVar.m;
        boolean j10 = aVar.j();
        w wVar = b2.a;
        if (j10) {
            lVar.l(this);
            fVar.getClass();
            lVar.j();
            lVar.c = wVar;
            return;
        }
        if (aVar.n('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
            return;
        }
        if (aVar.m('>')) {
            lVar.j();
            lVar.a(wVar);
            return;
        }
        if (aVar.l("PUBLIC")) {
            fVar.getClass();
            lVar.c = b2.n0;
        } else if (aVar.l("SYSTEM")) {
            fVar.getClass();
            lVar.c = b2.t0;
        } else {
            lVar.m(this);
            fVar.getClass();
            lVar.a(b2.y0);
        }
    }
}
