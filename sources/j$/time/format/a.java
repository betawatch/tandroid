package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements j$.time.temporal.r {
    @Override // j$.time.temporal.r
    public final Object a(j$.time.temporal.m mVar) {
        ZoneId zoneId = (ZoneId) mVar.w(j$.time.temporal.l.k());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
