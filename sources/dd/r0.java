package dd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public enum r0 extends b2 {
    public r0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.F0);
        if (g10.length() > 0) {
            lVar.i.f(g10);
        } else {
            lVar.i.h = true;
        }
        char d = aVar.d();
        if (d == 0) {
            lVar.m(this);
            lVar.i.e((char) 65533);
            return;
        }
        if (d == 65535) {
            lVar.l(this);
            lVar.c = b2.a;
            return;
        }
        if (d != '&') {
            if (d != '\'') {
                lVar.i.e(d);
                return;
            } else {
                lVar.c = b2.e0;
                return;
            }
        }
        int[] c10 = lVar.c('\'', true);
        if (c10 != null) {
            lVar.i.g(c10);
        } else {
            lVar.i.e('&');
        }
    }
}
