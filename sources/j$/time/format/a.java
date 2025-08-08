package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements j$.time.temporal.n {
    @Override // j$.time.temporal.n
    public final Object a(j$.time.temporal.k kVar) {
        ZoneId zoneId = (ZoneId) kVar.g(j$.time.temporal.j.j());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
