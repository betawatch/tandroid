package oe;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class d {
    public static final long[] e = new long[0];
    public final me.d a;
    public final c1.d b;
    public long c;
    public final long[] d;

    public d(me.d descriptor, c1.d dVar) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        this.a = descriptor;
        this.b = dVar;
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
