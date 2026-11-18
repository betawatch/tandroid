package c8;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
