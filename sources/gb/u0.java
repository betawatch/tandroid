package gb;

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class u0 {
    public final h1 a;
    public final i1 b;

    public u0(h1 timeProvider, i1 uuidGenerator) {
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(uuidGenerator, "uuidGenerator");
        this.a = timeProvider;
        this.b = uuidGenerator;
    }

    public final n0 a(n0 n0Var) {
        String str;
        this.b.getClass();
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.j.d(randomUUID, "randomUUID(...)");
        String uuid = randomUUID.toString();
        kotlin.jvm.internal.j.d(uuid, "toString(...)");
        String lowerCase = xd.l.c(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d(lowerCase, "toLowerCase(...)");
        return new n0(this.a.a().b, lowerCase, (n0Var == null || (str = n0Var.b) == null) ? lowerCase : str, n0Var != null ? n0Var.c + 1 : 0);
    }
}
