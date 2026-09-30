package dd;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public enum a1 extends b2 {
    public a1() {
        super("Comment", 46);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        e eVar = lVar.n;
        char i10 = aVar.i();
        if (i10 == 0) {
            lVar.m(this);
            aVar.a();
            eVar.c.append((char) 65533);
        } else if (i10 == '-') {
            lVar.a(b2.k0);
        } else {
            if (i10 != 65535) {
                eVar.c.append(aVar.g('-', 0));
                return;
            }
            lVar.l(this);
            lVar.i();
            lVar.c = b2.a;
        }
    }
}
