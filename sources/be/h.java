package be;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class h extends a {
    public final Thread d;
    public final x0 e;

    public h(kd.h hVar, Thread thread, x0 x0Var) {
        super(hVar, true);
        this.d = thread;
        this.e = x0Var;
    }

    @Override // be.v1
    public final void b(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (kotlin.jvm.internal.i.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
