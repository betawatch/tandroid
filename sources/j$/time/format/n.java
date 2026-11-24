package j$.time.format;

import j$.time.ZoneId;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
