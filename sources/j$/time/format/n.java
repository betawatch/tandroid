package j$.time.format;

import j$.time.ZoneId;

/* loaded from: classes2.dex */
class n implements f {
    private final j$.time.temporal.t a;
    private final String b;

    n(j$.time.temporal.t tVar, String str) {
        this.a = tVar;
        this.b = str;
    }

    @Override // j$.time.format.f
    public boolean i(r rVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) rVar.f(this.a);
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
