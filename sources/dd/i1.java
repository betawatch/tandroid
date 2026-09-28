package dd;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public enum i1 extends b2 {
    public i1() {
        super("AfterDoctypeName", 53);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        f fVar = lVar.m;
        boolean j3 = aVar.j();
        w wVar = b2.a;
        if (j3) {
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
            lVar.c = b2.r0;
        } else if (aVar.l("SYSTEM")) {
            fVar.getClass();
            lVar.c = b2.x0;
        } else {
            lVar.m(this);
            fVar.getClass();
            lVar.a(b2.C0);
        }
    }
}
