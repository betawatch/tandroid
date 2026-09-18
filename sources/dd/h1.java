package dd;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public enum h1 extends b2 {
    public h1() {
        super("DoctypeName", 52);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        f fVar = lVar.m;
        if (aVar.o()) {
            fVar.c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d == 0) {
            lVar.m(this);
            fVar.c.append((char) 65533);
            return;
        }
        if (d != ' ') {
            w wVar = b2.a;
            if (d == '>') {
                lVar.j();
                lVar.c = wVar;
                return;
            }
            if (d == 65535) {
                lVar.l(this);
                fVar.getClass();
                lVar.j();
                lVar.c = wVar;
                return;
            }
            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                fVar.c.append(d);
                return;
            }
        }
        lVar.c = b2.q0;
    }
}
