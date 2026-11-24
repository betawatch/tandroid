// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hm0 implements cv5 {
    public static final hm0 a = new hm0();
    public static final bj8 b = new bj8("kotlin.Boolean", aj8.b);

    @Override // cv5
    public final void b(c30 c30Var, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (c30Var.a) {
            c30Var.k(String.valueOf(booleanValue));
        } else {
            ((nj1) ((e31) c30Var.b).c).c(String.valueOf(booleanValue));
        }
    }

    @Override // cv5
    public final Object c(igf igfVar) {
        boolean z;
        boolean z2;
        cyb cybVar = (cyb) igfVar.d;
        int t = cybVar.t();
        String str = (String) cybVar.f;
        if (t == str.length()) {
            cyb.m(cybVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(t) == '\"') {
            t++;
            z = true;
        } else {
            z = false;
        }
        int r = cybVar.r(t);
        if (r >= str.length() || r == -1) {
            cyb.m(cybVar, "EOF", 0, 6);
            throw null;
        }
        int i = r + 1;
        int charAt = str.charAt(r) | ' ';
        if (charAt == 102) {
            cybVar.f(i, "alse");
            z2 = false;
        } else {
            if (charAt != 116) {
                cyb.m(cybVar, "Expected valid boolean literal prefix, but had '" + cybVar.k() + '\'', 0, 6);
                throw null;
            }
            cybVar.f(i, "rue");
            z2 = true;
        }
        if (z) {
            if (cybVar.b == str.length()) {
                cyb.m(cybVar, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(cybVar.b) != '\"') {
                cyb.m(cybVar, "Expected closing quotation mark", 0, 6);
                throw null;
            }
            cybVar.b++;
        }
        return Boolean.valueOf(z2);
    }

    @Override // cv5
    public final w4a d() {
        return b;
    }
}
