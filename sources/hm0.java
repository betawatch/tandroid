// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hm0 implements hx5 {
    public static final hm0 a = new hm0();
    public static final om8 b = new om8("kotlin.Boolean", nm8.b);

    @Override // hx5
    public final void b(d30 d30Var, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (d30Var.a) {
            d30Var.k(String.valueOf(booleanValue));
        } else {
            ((wj1) ((n31) d30Var.b).c).c(String.valueOf(booleanValue));
        }
    }

    @Override // hx5
    public final Object c(ykf ykfVar) {
        boolean z;
        boolean z2;
        d2c d2cVar = (d2c) ykfVar.d;
        int t = d2cVar.t();
        String str = (String) d2cVar.f;
        if (t == str.length()) {
            d2c.m(d2cVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(t) == '\"') {
            t++;
            z = true;
        } else {
            z = false;
        }
        int r = d2cVar.r(t);
        if (r >= str.length() || r == -1) {
            d2c.m(d2cVar, "EOF", 0, 6);
            throw null;
        }
        int i = r + 1;
        int charAt = str.charAt(r) | ' ';
        if (charAt == 102) {
            d2cVar.f(i, "alse");
            z2 = false;
        } else {
            if (charAt != 116) {
                d2c.m(d2cVar, "Expected valid boolean literal prefix, but had '" + d2cVar.k() + '\'', 0, 6);
                throw null;
            }
            d2cVar.f(i, "rue");
            z2 = true;
        }
        if (z) {
            if (d2cVar.b == str.length()) {
                d2c.m(d2cVar, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(d2cVar.b) != '\"') {
                d2c.m(d2cVar, "Expected closing quotation mark", 0, 6);
                throw null;
            }
            d2cVar.b++;
        }
        return Boolean.valueOf(z2);
    }

    @Override // hx5
    public final o8a d() {
        return b;
    }
}
