package be;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
