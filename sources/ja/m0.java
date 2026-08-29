package ja;

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m0 {
    public final t0 a;
    public final bd.a b;
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
        kotlin.jvm.internal.j.d(uuid, "uuidGenerator().toString()");
        String lowerCase = hd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final d0 b() {
        d0 d0Var = this.e;
        if (d0Var != null) {
            return d0Var;
        }
        kotlin.jvm.internal.j.h("currentSession");
        throw null;
    }
}
