package oe;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class d {
    public static final long[] e = new long[0];
    public final me.d a;
    public final c1.c b;
    public long c;
    public final long[] d;

    public d(me.d descriptor, c1.c cVar) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        this.a = descriptor;
        this.b = cVar;
        int f10 = descriptor.f();
        if (f10 <= 64) {
            this.c = f10 != 64 ? (-1) << f10 : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i7 = (f10 - 1) >>> 6;
        long[] jArr = new long[i7];
        if ((f10 & 63) != 0) {
            jArr[i7 - 1] = (-1) << f10;
        }
        this.d = jArr;
    }
}
