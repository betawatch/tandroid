package oe;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class a implements ke.a {
    public static final a a = new a();
    public static final n b = new n("kotlin.Boolean", me.b.b);

    @Override // ke.a
    public final void a(qe.h hVar, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (hVar.a) {
            hVar.j(String.valueOf(booleanValue));
        } else {
            ((mc.a) ((ca.i) hVar.b).c).c(String.valueOf(booleanValue));
        }
    }

    @Override // ke.a
    public final Object b(h2.c decoder) {
        boolean z9;
        boolean z10;
        kotlin.jvm.internal.j.e(decoder, "decoder");
        a4.k kVar = (a4.k) decoder.d;
        int u10 = kVar.u();
        String str = (String) kVar.f;
        if (u10 == str.length()) {
            a4.k.n(kVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(u10) == '\"') {
            u10++;
            z9 = true;
        } else {
            z9 = false;
        }
        int r10 = kVar.r(u10);
        if (r10 >= str.length() || r10 == -1) {
            a4.k.n(kVar, "EOF", 0, 6);
            throw null;
        }
        int i7 = r10 + 1;
        int charAt = str.charAt(r10) | ' ';
        if (charAt == 102) {
            kVar.f(i7, "alse");
            z10 = false;
        } else {
            if (charAt != 116) {
                a4.k.n(kVar, "Expected valid boolean literal prefix, but had '" + kVar.k() + '\'', 0, 6);
                throw null;
            }
            kVar.f(i7, "rue");
            z10 = true;
        }
        if (z9) {
            if (kVar.b == str.length()) {
                a4.k.n(kVar, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(kVar.b) != '\"') {
                a4.k.n(kVar, "Expected closing quotation mark", 0, 6);
                throw null;
            }
            kVar.b++;
        }
        return Boolean.valueOf(z10);
    }

    @Override // ke.a
    public final me.d d() {
        return b;
    }
}
