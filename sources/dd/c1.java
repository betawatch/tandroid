package dd;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public enum c1 extends b2 {
    public c1() {
        super("CommentEnd", 48);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        e eVar = lVar.n;
        char d = aVar.d();
        a1 a1Var = b2.j0;
        if (d == 0) {
            lVar.m(this);
            StringBuilder sb2 = eVar.c;
            sb2.append("--");
            sb2.append((char) 65533);
            lVar.c = a1Var;
            return;
        }
        if (d == '!') {
            lVar.m(this);
            lVar.c = b2.m0;
            return;
        }
        if (d == '-') {
            lVar.m(this);
            eVar.c.append('-');
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
            lVar.m(this);
            StringBuilder sb3 = eVar.c;
            sb3.append("--");
            sb3.append(d);
            lVar.c = a1Var;
        }
    }
}
