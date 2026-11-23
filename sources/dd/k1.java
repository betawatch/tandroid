package dd;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public enum k1 extends b2 {
    public k1() {
        super("BeforeDoctypePublicIdentifier", 55);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        f fVar = lVar.m;
        char d = aVar.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            return;
        }
        if (d == '\"') {
            lVar.c = b2.u0;
            return;
        }
        if (d == '\'') {
            lVar.c = b2.v0;
            return;
        }
        w wVar = b2.a;
        if (d == '>') {
            lVar.m(this);
            fVar.getClass();
            lVar.j();
            lVar.c = wVar;
            return;
        }
        if (d != 65535) {
            lVar.m(this);
            fVar.getClass();
            lVar.c = b2.D0;
        } else {
            lVar.l(this);
            fVar.getClass();
            lVar.j();
            lVar.c = wVar;
        }
    }
}
