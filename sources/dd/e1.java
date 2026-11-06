package dd;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public enum e1 extends b2 {
    public e1() {
        super("CommentEndBang", 49);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        e eVar = lVar.n;
        char d = aVar.d();
        a1 a1Var = b2.j0;
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
            lVar.c = b2.k0;
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
