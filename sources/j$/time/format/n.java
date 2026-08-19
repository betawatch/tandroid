package j$.time.format;

import j$.time.ZoneId;

/* loaded from: classes2.dex */
public class n implements f {
    public final a a;
    public final String b;

    public n(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    @Override // j$.time.format.f
    public boolean l(r rVar, StringBuilder sb) {
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
