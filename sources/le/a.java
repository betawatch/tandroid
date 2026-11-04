package le;

import e0.e0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements he.a {
    public static final a a = new a();
    public static final n b = new n("kotlin.Boolean", je.b.b);

    @Override // he.a
    public final Object a(g2.d decoder) {
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.j.e(decoder, "decoder");
        e0 e0Var = (e0) decoder.d;
        int u10 = e0Var.u();
        String str = (String) e0Var.f;
        if (u10 == str.length()) {
            e0.n(e0Var, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(u10) == '\"') {
            u10++;
            z10 = true;
        } else {
            z10 = false;
        }
        int r5 = e0Var.r(u10);
        if (r5 >= str.length() || r5 == -1) {
            e0.n(e0Var, "EOF", 0, 6);
            throw null;
        }
        int i3 = r5 + 1;
        int charAt = str.charAt(r5) | ' ';
        if (charAt == 102) {
            e0Var.f(i3, "alse");
            z11 = false;
        } else {
            if (charAt != 116) {
                e0.n(e0Var, "Expected valid boolean literal prefix, but had '" + e0Var.k() + '\'', 0, 6);
                throw null;
            }
            e0Var.f(i3, "rue");
            z11 = true;
        }
        if (z10) {
            if (e0Var.b == str.length()) {
                e0.n(e0Var, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(e0Var.b) != '\"') {
                e0.n(e0Var, "Expected closing quotation mark", 0, 6);
                throw null;
            }
            e0Var.b++;
        }
        return Boolean.valueOf(z11);
    }

    @Override // he.a
    public final void c(ne.h hVar, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (hVar.a) {
            hVar.j(String.valueOf(booleanValue));
        } else {
            ((jc.a) ((ba.i) hVar.b).c).c(String.valueOf(booleanValue));
        }
    }

    @Override // he.a
    public final je.d d() {
        return b;
    }
}
