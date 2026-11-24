// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hn0 implements cx5 {
    public static final hn0 a = new hn0();
    public static final el8 b = new el8("kotlin.Boolean", dl8.b);

    @Override // cx5
    public final void b(c40 c40Var, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (c40Var.a) {
            c40Var.k(String.valueOf(booleanValue));
        } else {
            ((vk1) ((m41) c40Var.b).c).c(String.valueOf(booleanValue));
        }
    }

    @Override // cx5
    public final Object c(jif jifVar) {
        boolean z;
        boolean z2;
        e0c e0cVar = (e0c) jifVar.d;
        int t = e0cVar.t();
        String str = (String) e0cVar.f;
        if (t == str.length()) {
            e0c.m(e0cVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(t) == '\"') {
            t++;
            z = true;
        } else {
            z = false;
        }
        int r = e0cVar.r(t);
        if (r >= str.length() || r == -1) {
            e0c.m(e0cVar, "EOF", 0, 6);
            throw null;
        }
        int i = r + 1;
        int charAt = str.charAt(r) | ' ';
        if (charAt == 102) {
            e0cVar.f(i, "alse");
            z2 = false;
        } else {
            if (charAt != 116) {
                e0c.m(e0cVar, "Expected valid boolean literal prefix, but had '" + e0cVar.k() + '\'', 0, 6);
                throw null;
            }
            e0cVar.f(i, "rue");
            z2 = true;
        }
        if (z) {
            if (e0cVar.b == str.length()) {
                e0c.m(e0cVar, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(e0cVar.b) != '\"') {
                e0c.m(e0cVar, "Expected closing quotation mark", 0, 6);
                throw null;
            }
            e0cVar.b++;
        }
        return Boolean.valueOf(z2);
    }

    @Override // cx5
    public final y6a d() {
        return b;
    }
}
