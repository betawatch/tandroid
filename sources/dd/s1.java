package dd;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
            lVar.c = b2.C0;
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
