package fd;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public enum b1 extends a2 {
    public b1() {
        super("CommentEnd", 48);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        e eVar = kVar.n;
        char d = aVar.d();
        z0 z0Var = a2.j0;
        if (d == 0) {
            kVar.m(this);
            StringBuilder sb2 = eVar.c;
            sb2.append("--");
            sb2.append((char) 65533);
            kVar.c = z0Var;
            return;
        }
        if (d == '!') {
            kVar.m(this);
            kVar.c = a2.m0;
            return;
        }
        if (d == '-') {
            kVar.m(this);
            eVar.c.append('-');
            return;
        }
        v vVar = a2.a;
        if (d == '>') {
            kVar.i();
            kVar.c = vVar;
        } else if (d == 65535) {
            kVar.l(this);
            kVar.i();
            kVar.c = vVar;
        } else {
            kVar.m(this);
            StringBuilder sb3 = eVar.c;
            sb3.append("--");
            sb3.append(d);
            kVar.c = z0Var;
        }
    }
}
