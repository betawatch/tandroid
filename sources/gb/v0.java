package gb;

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class v0 {
    public final j1 a;
    public final k1 b;

    public v0(j1 timeProvider, k1 uuidGenerator) {
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(uuidGenerator, "uuidGenerator");
        this.a = timeProvider;
        this.b = uuidGenerator;
    }

    public final o0 a(o0 o0Var) {
        String str;
        this.b.getClass();
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.j.d(randomUUID, "randomUUID(...)");
        String uuid = randomUUID.toString();
        kotlin.jvm.internal.j.d(uuid, "toString(...)");
        String lowerCase = xd.l.c(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d(lowerCase, "toLowerCase(...)");
        return new o0(o0Var != null ? o0Var.c + 1 : 0, this.a.a().b, lowerCase, (o0Var == null || (str = o0Var.b) == null) ? lowerCase : str);
    }
}
