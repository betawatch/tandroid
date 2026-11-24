package j$.time.format;

import j$.time.ZoneId;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public class n implements f {
    public final a a;
    public final String b;

    public n(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    @Override // j$.time.format.f
    public boolean j(r rVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) rVar.b(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.getId());
        return true;
    }

    public final String toString() {
        return this.b;
    }
}
