package dd;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public enum b1 extends b2 {
    public b1() {
        super("CommentEndDash", 47);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        e eVar = lVar.n;
        char d = aVar.d();
        a1 a1Var = b2.j0;
        if (d == 0) {
            lVar.m(this);
            StringBuilder sb2 = eVar.c;
            sb2.append('-');
            sb2.append((char) 65533);
            lVar.c = a1Var;
            return;
        }
        if (d == '-') {
            lVar.c = b2.l0;
            return;
        }
        if (d == 65535) {
            lVar.l(this);
            lVar.i();
            lVar.c = b2.a;
        } else {
            StringBuilder sb3 = eVar.c;
            sb3.append('-');
            sb3.append(d);
            lVar.c = a1Var;
        }
    }
}
