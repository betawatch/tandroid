package dd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public enum e1 extends b2 {
    public e1() {
        super("CommentEndBang", 49);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        e eVar = lVar.n;
        char d = aVar.d();
        a1 a1Var = b2.k0;
        if (d == 0) {
            lVar.m(this);
            StringBuilder sb2 = eVar.c;
            sb2.append("--!");
            sb2.append((char) 65533);
            lVar.c = a1Var;
            return;
        }
        if (d == '-') {
            eVar.c.append("--!");
            lVar.c = b2.l0;
            return;
        }
        w wVar = b2.a;
        if (d == '>') {
            lVar.i();
            lVar.c = wVar;
        } else if (d == 65535) {
            lVar.l(this);
            lVar.i();
            lVar.c = wVar;
        } else {
            StringBuilder sb3 = eVar.c;
            sb3.append("--!");
            sb3.append(d);
            lVar.c = a1Var;
        }
    }
}
