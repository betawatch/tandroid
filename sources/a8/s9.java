package a8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class s9 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r8 > 4611686018427387903L) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(int i10, be.c unit) {
        kotlin.jvm.internal.i.e(unit, "unit");
        if (unit.compareTo(be.c.d) <= 0) {
            long a2 = t9.a(i10, unit, be.c.b) << 1;
            int i11 = be.a.d;
            int i12 = be.b.a;
            return a2;
        }
        long j10 = i10;
        be.c cVar = be.c.b;
        long a10 = t9.a(4611686018426999999L, cVar, unit);
        if ((-a10) <= j10 && j10 <= a10) {
            long a11 = t9.a(j10, unit, cVar) << 1;
            int i13 = be.a.d;
            int i14 = be.b.a;
            return a11;
        }
        be.c targetUnit = be.c.c;
        kotlin.jvm.internal.i.e(targetUnit, "targetUnit");
        long convert = targetUnit.a.convert(j10, unit.a);
        long j11 = convert >= -4611686018427387903L ? 4611686018427387903L : -4611686018427387903L;
        convert = j11;
        long j12 = (convert << 1) + 1;
        int i15 = be.a.d;
        int i16 = be.b.a;
        return j12;
    }
}
