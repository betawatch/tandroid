package be;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
