package nc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public enum r0 extends b2 {
    public r0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // nc.b2
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.A0);
        if (g10.length() > 0) {
            lVar.i.g(g10);
        } else {
            lVar.i.h = true;
        }
        char d = aVar.d();
        if (d == 0) {
            lVar.m(this);
            lVar.i.f((char) 65533);
            return;
        }
        if (d == 65535) {
            lVar.l(this);
            lVar.c = b2.a;
            return;
        }
        if (d != '&') {
            if (d != '\'') {
                lVar.i.f(d);
                return;
            } else {
                lVar.c = b2.Z;
                return;
            }
        }
        int[] c3 = lVar.c('\'', true);
        if (c3 != null) {
            lVar.i.h(c3);
        } else {
            lVar.i.f('&');
        }
    }
}
