package j$.time.format;

import j$.time.ZoneId;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
