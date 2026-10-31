package bb;

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m0 {
    public final t0 a;
    public final ld.a b;
    public final String c;
    public int d;
    public d0 e;

    public m0() {
        l0 l0Var = l0.a;
        this.a = t0.a;
        this.b = l0Var;
        this.c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = rd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final d0 b() {
        d0 d0Var = this.e;
        if (d0Var != null) {
            return d0Var;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
