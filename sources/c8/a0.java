package c8;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
