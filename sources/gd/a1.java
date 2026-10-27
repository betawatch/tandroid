package gd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public enum a1 extends a2 {
    public a1() {
        super("CommentEndDash", 47);
    }

    @Override // gd.a2
    public final void d(k kVar, a aVar) {
        e eVar = kVar.n;
        char d = aVar.d();
        z0 z0Var = a2.j0;
        if (d == 0) {
            kVar.m(this);
            StringBuilder sb2 = eVar.c;
            sb2.append('-');
            sb2.append((char) 65533);
            kVar.c = z0Var;
            return;
        }
        if (d == '-') {
            kVar.c = a2.l0;
            return;
        }
        if (d == 65535) {
            kVar.l(this);
            kVar.i();
            kVar.c = a2.a;
        } else {
            StringBuilder sb3 = eVar.c;
            sb3.append('-');
            sb3.append(d);
            kVar.c = z0Var;
        }
    }
}
