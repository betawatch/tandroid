package c8;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class a0 {
    public static gb.f1 a;

    public static final void a() {
        try {
            if (a == null) {
                gb.f1 f1Var = (gb.f1) ((gb.i) ((gb.s) o9.g.c().b(gb.s.class))).o.get();
                kotlin.jvm.internal.j.e(f1Var, "<set-?>");
                a = f1Var;
            }
            gb.f1 f1Var2 = a;
            if (f1Var2 == null) {
                kotlin.jvm.internal.j.h("sharedSessionRepository");
                throw null;
            }
            if (f1Var2.i) {
                if (f1Var2 != null) {
                    f1Var2.b();
                } else {
                    kotlin.jvm.internal.j.h("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }
}
