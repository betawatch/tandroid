// default package

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j8a {
    public final tpb a;
    public final wac b;

    public j8a(tpb tpbVar, wac wacVar) {
        tpbVar.getClass();
        wacVar.getClass();
        this.a = tpbVar;
        this.b = wacVar;
    }

    public final c8a a(c8a c8aVar) {
        String str;
        this.b.getClass();
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        String uuid = randomUUID.toString();
        uuid.getClass();
        String lowerCase = pbb.c(uuid, "-", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (c8aVar == null || (str = c8aVar.b) == null) ? lowerCase : str;
        int i = c8aVar != null ? c8aVar.c + 1 : 0;
        this.a.getClass();
        return new c8a(tpb.a().b, lowerCase, str2, i);
    }
}
