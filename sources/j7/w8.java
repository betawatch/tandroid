package j7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class w8 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r8 > 4611686018427387903L) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(int i10, kd.c unit) {
        kotlin.jvm.internal.j.e(unit, "unit");
        if (unit.compareTo(kd.c.d) <= 0) {
            long a2 = x8.a(i10, unit, kd.c.b) << 1;
            int i11 = kd.a.d;
            int i12 = kd.b.a;
            return a2;
        }
        long j10 = i10;
        kd.c cVar = kd.c.b;
        long a10 = x8.a(4611686018426999999L, cVar, unit);
        if ((-a10) <= j10 && j10 <= a10) {
            long a11 = x8.a(j10, unit, cVar) << 1;
            int i13 = kd.a.d;
            int i14 = kd.b.a;
            return a11;
        }
        kd.c targetUnit = kd.c.c;
        kotlin.jvm.internal.j.e(targetUnit, "targetUnit");
        long convert = targetUnit.a.convert(j10, unit.a);
        long j11 = convert >= -4611686018427387903L ? 4611686018427387903L : -4611686018427387903L;
        convert = j11;
        long j12 = (convert << 1) + 1;
        int i15 = kd.a.d;
        int i16 = kd.b.a;
        return j12;
    }
}
