package oe;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.j.e(decoder, "decoder");
        a4.k kVar = (a4.k) decoder.d;
        int t6 = kVar.t();
        String str = (String) kVar.f;
        if (t6 == str.length()) {
            a4.k.n(kVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(t6) == '\"') {
            t6++;
            z10 = true;
        } else {
            z10 = false;
        }
        int q10 = kVar.q(t6);
        if (q10 >= str.length() || q10 == -1) {
            a4.k.n(kVar, "EOF", 0, 6);
            throw null;
        }
        int i7 = q10 + 1;
        int charAt = str.charAt(q10) | ' ';
        if (charAt == 102) {
            kVar.f(i7, "alse");
            z11 = false;
        } else {
            if (charAt != 116) {
                a4.k.n(kVar, "Expected valid boolean literal prefix, but had '" + kVar.k() + '\'', 0, 6);
                throw null;
            }
            kVar.f(i7, "rue");
            z11 = true;
        }
        if (z10) {
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
        return Boolean.valueOf(z11);
    }

    @Override // ke.a
    public final me.d d() {
        return b;
    }
}
