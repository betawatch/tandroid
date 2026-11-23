package c8;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class d0 {
    public static gb.e1 a;

    public static final void a() {
        try {
            if (a == null) {
                gb.e1 e1Var = (gb.e1) ((gb.i) ((gb.r) o9.g.c().b(gb.r.class))).o.get();
                kotlin.jvm.internal.j.e(e1Var, "<set-?>");
                a = e1Var;
            }
            gb.e1 e1Var2 = a;
            if (e1Var2 == null) {
                kotlin.jvm.internal.j.h("sharedSessionRepository");
                throw null;
            }
            if (e1Var2.i) {
                if (e1Var2 != null) {
                    e1Var2.b();
                } else {
                    kotlin.jvm.internal.j.h("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }
}
