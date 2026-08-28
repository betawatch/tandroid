package f7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class r7 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r8 > 4611686018427387903L) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(int i9, gd.c unit) {
        kotlin.jvm.internal.i.e(unit, "unit");
        if (unit.compareTo(gd.c.d) <= 0) {
            long a2 = s7.a(i9, unit, gd.c.b) << 1;
            int i10 = gd.a.d;
            int i11 = gd.b.a;
            return a2;
        }
        long j10 = i9;
        gd.c cVar = gd.c.b;
        long a3 = s7.a(4611686018426999999L, cVar, unit);
        if ((-a3) <= j10 && j10 <= a3) {
            long a10 = s7.a(j10, unit, cVar) << 1;
            int i12 = gd.a.d;
            int i13 = gd.b.a;
            return a10;
        }
        gd.c targetUnit = gd.c.c;
        kotlin.jvm.internal.i.e(targetUnit, "targetUnit");
        long convert = targetUnit.a.convert(j10, unit.a);
        long j11 = convert >= -4611686018427387903L ? 4611686018427387903L : -4611686018427387903L;
        convert = j11;
        long j12 = (convert << 1) + 1;
        int i14 = gd.a.d;
        int i15 = gd.b.a;
        return j12;
    }
}
