package oe;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
