package fd;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public enum x0 extends a2 {
    public x0() {
        super("CommentStart", 44);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        e eVar = kVar.n;
        char d = aVar.d();
        z0 z0Var = a2.j0;
        if (d == 0) {
            kVar.m(this);
            eVar.c.append((char) 65533);
            kVar.c = z0Var;
            return;
        }
        if (d == '-') {
            kVar.c = a2.i0;
            return;
        }
        v vVar = a2.a;
        if (d == '>') {
            kVar.m(this);
            kVar.i();
            kVar.c = vVar;
        } else if (d != 65535) {
            eVar.c.append(d);
            kVar.c = z0Var;
        } else {
            kVar.l(this);
            kVar.i();
            kVar.c = vVar;
        }
    }
}
