package db;

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u0 {
    public final i1 a;
    public final j1 b;

    public u0(i1 timeProvider, j1 uuidGenerator) {
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
        String lowerCase = ud.l.c(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d(lowerCase, "toLowerCase(...)");
        return new n0(n0Var != null ? n0Var.c + 1 : 0, this.a.a().b, lowerCase, (n0Var == null || (str = n0Var.b) == null) ? lowerCase : str);
    }
}
