// default package

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class h6a {
    public final snb a;
    public final v8c b;

    public h6a(snb snbVar, v8c v8cVar) {
        snbVar.getClass();
        v8cVar.getClass();
        this.a = snbVar;
        this.b = v8cVar;
    }

    public final a6a a(a6a a6aVar) {
        String str;
        this.b.getClass();
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        String uuid = randomUUID.toString();
        uuid.getClass();
        String lowerCase = n9b.c(uuid, "-", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (a6aVar == null || (str = a6aVar.b) == null) ? lowerCase : str;
        int i = a6aVar != null ? a6aVar.c + 1 : 0;
        this.a.getClass();
        return new a6a(snb.a().b, lowerCase, str2, i);
    }
}
