package g7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class t7 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r8 > 4611686018427387903L) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(int i10, hd.c unit) {
        kotlin.jvm.internal.j.e(unit, "unit");
        if (unit.compareTo(hd.c.d) <= 0) {
            long a2 = u7.a(i10, unit, hd.c.b) << 1;
            int i11 = hd.a.d;
            int i12 = hd.b.a;
            return a2;
        }
        long j10 = i10;
        hd.c cVar = hd.c.b;
        long a3 = u7.a(4611686018426999999L, cVar, unit);
        if ((-a3) <= j10 && j10 <= a3) {
            long a10 = u7.a(j10, unit, cVar) << 1;
            int i13 = hd.a.d;
            int i14 = hd.b.a;
            return a10;
        }
        hd.c targetUnit = hd.c.c;
        kotlin.jvm.internal.j.e(targetUnit, "targetUnit");
        long convert = targetUnit.a.convert(j10, unit.a);
        long j11 = convert >= -4611686018427387903L ? 4611686018427387903L : -4611686018427387903L;
        convert = j11;
        long j12 = (convert << 1) + 1;
        int i15 = hd.a.d;
        int i16 = hd.b.a;
        return j12;
    }
}
