package dd;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public enum s1 extends b2 {
    public s1() {
        super("DoctypeSystemIdentifier_doubleQuoted", 62);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        f fVar = lVar.m;
        char d = aVar.d();
        if (d == 0) {
            lVar.m(this);
            fVar.e.append((char) 65533);
            return;
        }
        if (d == '\"') {
            lVar.c = b2.B0;
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
            fVar.e.append(d);
            return;
        }
        lVar.l(this);
        fVar.getClass();
        lVar.j();
        lVar.c = wVar;
    }
}
