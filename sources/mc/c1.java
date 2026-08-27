package mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public enum c1 extends b2 {
    public c1() {
        super("CommentEnd", 48);
    }

    @Override // mc.b2
    public final void d(l lVar, a aVar) {
        e eVar = lVar.n;
        char d = aVar.d();
        a1 a1Var = b2.f0;
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
            lVar.c = b2.i0;
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
