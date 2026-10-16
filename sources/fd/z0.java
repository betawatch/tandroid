package fd;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public enum z0 extends a2 {
    public z0() {
        super("Comment", 46);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        e eVar = kVar.n;
        char i10 = aVar.i();
        if (i10 == 0) {
            kVar.m(this);
            aVar.a();
            eVar.c.append((char) 65533);
        } else if (i10 == '-') {
            kVar.a(a2.k0);
        } else {
            if (i10 != 65535) {
                eVar.c.append(aVar.g('-', 0));
                return;
            }
            kVar.l(this);
            kVar.i();
            kVar.c = a2.a;
        }
    }
}
