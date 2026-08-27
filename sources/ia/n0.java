package ia;

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n0 {
    public final u0 a;
    public final ad.a b;
    public final String c;
    public int d;
    public e0 e;

    public n0() {
        m0 m0Var = m0.a;
        this.a = u0.a;
        this.b = m0Var;
        this.c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.b.invoke()).toString();
        kotlin.jvm.internal.j.d(uuid, "uuidGenerator().toString()");
        String lowerCase = gd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final e0 b() {
        e0 e0Var = this.e;
        if (e0Var != null) {
            return e0Var;
        }
        kotlin.jvm.internal.j.h("currentSession");
        throw null;
    }
}
