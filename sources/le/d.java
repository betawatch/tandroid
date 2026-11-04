package le;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d {
    public static final long[] e = new long[0];
    public final je.d a;
    public final c1.c b;
    public long c;
    public final long[] d;

    public d(je.d descriptor, c1.c cVar) {
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
        int i3 = (f10 - 1) >>> 6;
        long[] jArr = new long[i3];
        if ((f10 & 63) != 0) {
            jArr[i3 - 1] = (-1) << f10;
        }
        this.d = jArr;
    }
}
