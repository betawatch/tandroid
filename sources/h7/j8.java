package h7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class j8 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r8 > 4611686018427387903L) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(int i10, id.c unit) {
        kotlin.jvm.internal.j.e(unit, "unit");
        if (unit.compareTo(id.c.d) <= 0) {
            long a2 = k8.a(i10, unit, id.c.b) << 1;
            int i11 = id.a.d;
            int i12 = id.b.a;
            return a2;
        }
        long j10 = i10;
        id.c cVar = id.c.b;
        long a10 = k8.a(4611686018426999999L, cVar, unit);
        if ((-a10) <= j10 && j10 <= a10) {
            long a11 = k8.a(j10, unit, cVar) << 1;
            int i13 = id.a.d;
            int i14 = id.b.a;
            return a11;
        }
        id.c targetUnit = id.c.c;
        kotlin.jvm.internal.j.e(targetUnit, "targetUnit");
        long convert = targetUnit.a.convert(j10, unit.a);
        long j11 = convert >= -4611686018427387903L ? 4611686018427387903L : -4611686018427387903L;
        convert = j11;
        long j12 = (convert << 1) + 1;
        int i15 = id.a.d;
        int i16 = id.b.a;
        return j12;
    }
}
