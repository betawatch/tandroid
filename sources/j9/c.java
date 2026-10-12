package j9;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class c {
    public static final c d = new c();
    public final Runnable a;
    public final Executor b;
    public c c;

    public c(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }

    public c() {
        this.a = null;
        this.b = null;
    }
}
