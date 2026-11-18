package c8;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class c0 {
    public static gb.d1 a;

    public static final void a() {
        try {
            if (a == null) {
                gb.d1 d1Var = (gb.d1) ((gb.i) ((gb.r) o9.g.c().b(gb.r.class))).o.get();
                kotlin.jvm.internal.j.e(d1Var, "<set-?>");
                a = d1Var;
            }
            gb.d1 d1Var2 = a;
            if (d1Var2 == null) {
                kotlin.jvm.internal.j.h("sharedSessionRepository");
                throw null;
            }
            if (d1Var2.i) {
                if (d1Var2 != null) {
                    d1Var2.b();
                } else {
                    kotlin.jvm.internal.j.h("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }
}
