package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class qb {
    public static db.e1 a;

    public static final void a() {
        try {
            if (a == null) {
                db.e1 e1Var = (db.e1) ((db.i) ((db.r) n9.h.c().b(db.r.class))).o.get();
                kotlin.jvm.internal.j.e(e1Var, "<set-?>");
                a = e1Var;
            }
            db.e1 e1Var2 = a;
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
