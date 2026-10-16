package fd;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public enum q0 extends a2 {
    public q0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        String g10 = aVar.g(a2.E0);
        if (g10.length() > 0) {
            kVar.i.f(g10);
        } else {
            kVar.i.h = true;
        }
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            kVar.i.e((char) 65533);
            return;
        }
        if (d == 65535) {
            kVar.l(this);
            kVar.c = a2.a;
            return;
        }
        if (d != '&') {
            if (d != '\'') {
                kVar.i.e(d);
                return;
            } else {
                kVar.c = a2.d0;
                return;
            }
        }
        int[] c10 = kVar.c('\'', true);
        if (c10 != null) {
            kVar.i.g(c10);
        } else {
            kVar.i.e('&');
        }
    }
}
