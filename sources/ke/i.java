package ke;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class i {
    public static final a6.i b;
    public static final a6.i c;
    public static final a6.i d;
    public static final a6.i e;
    public static final int a = ge.a.j(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");
    public static final int f = ge.a.j(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    static {
        int i10 = 22;
        b = new a6.i("PERMIT", i10);
        c = new a6.i("TAKEN", i10);
        d = new a6.i("BROKEN", i10);
        e = new a6.i("CANCELLED", i10);
    }
}
