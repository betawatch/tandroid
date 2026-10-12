package de;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class d {
    public static final h a = new h(-1, null, null, 0);
    public static final int b = ge.a.j(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = ge.a.j(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final a6.i d;
    public static final a6.i e;
    public static final a6.i f;
    public static final a6.i g;
    public static final a6.i h;
    public static final a6.i i;
    public static final a6.i j;
    public static final a6.i k;
    public static final a6.i l;
    public static final a6.i m;
    public static final a6.i n;
    public static final a6.i o;
    public static final a6.i p;
    public static final a6.i q;
    public static final a6.i r;

    static {
        int i10 = 22;
        d = new a6.i("BUFFERED", i10);
        e = new a6.i("SHOULD_BUFFER", i10);
        f = new a6.i("S_RESUMING_BY_RCV", i10);
        g = new a6.i("RESUMING_BY_EB", i10);
        h = new a6.i("POISONED", i10);
        i = new a6.i("DONE_RCV", i10);
        j = new a6.i("INTERRUPTED_SEND", i10);
        k = new a6.i("INTERRUPTED_RCV", i10);
        l = new a6.i("CHANNEL_CLOSED", i10);
        m = new a6.i("SUSPEND", i10);
        n = new a6.i("SUSPEND_NO_WAITER", i10);
        o = new a6.i("FAILED", i10);
        p = new a6.i("CLOSE_HANDLER_CLOSED", i10);
        q = new a6.i("CLOSE_HANDLER_INVOKED", i10);
        r = new a6.i("NO_CLOSE_CAUSE", i10);
    }
}
