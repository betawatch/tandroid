package c8;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class zd {
    public static final long a(long j3) {
        long j10 = (j3 << 1) + 1;
        int i7 = yd.a.d;
        int i10 = yd.b.a;
        return j10;
    }

    public static final long b(long j3) {
        long j10 = j3 << 1;
        int i7 = yd.a.d;
        int i10 = yd.b.a;
        return j10;
    }

    public static final long c(int i7, yd.c unit) {
        kotlin.jvm.internal.j.e(unit, "unit");
        return unit.compareTo(yd.c.d) <= 0 ? b(ee.a(i7, unit, yd.c.b)) : d(i7, unit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r5 > 4611686018427387903L) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long d(long j3, yd.c unit) {
        kotlin.jvm.internal.j.e(unit, "unit");
        yd.c cVar = yd.c.b;
        long a10 = ee.a(4611686018426999999L, cVar, unit);
        if ((-a10) <= j3 && j3 <= a10) {
            return b(ee.a(j3, unit, cVar));
        }
        yd.c targetUnit = yd.c.c;
        kotlin.jvm.internal.j.e(targetUnit, "targetUnit");
        long convert = targetUnit.a.convert(j3, unit.a);
        long j10 = convert >= -4611686018427387903L ? 4611686018427387903L : -4611686018427387903L;
        convert = j10;
        return a(convert);
    }
}
