package be;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
