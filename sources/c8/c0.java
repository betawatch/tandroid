package c8;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
