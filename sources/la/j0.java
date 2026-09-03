package la;

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j0 {
    public final q0 a;
    public final dd.a b;
    public final String c;
    public int d;
    public a0 e;

    public j0() {
        i0 i0Var = i0.a;
        this.a = q0.a;
        this.b = i0Var;
        this.c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.b.invoke()).toString();
        kotlin.jvm.internal.j.d(uuid, "uuidGenerator().toString()");
        String lowerCase = jd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final a0 b() {
        a0 a0Var = this.e;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.j.h("currentSession");
        throw null;
    }
}
