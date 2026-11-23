package dd;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
            lVar.c = b2.s0;
        } else if (aVar.l("SYSTEM")) {
            fVar.getClass();
            lVar.c = b2.y0;
        } else {
            lVar.m(this);
            fVar.getClass();
            lVar.a(b2.D0);
        }
    }
}
