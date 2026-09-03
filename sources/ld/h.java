package ld;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class h extends a {
    public final Thread d;
    public final w0 e;

    public h(uc.h hVar, Thread thread, w0 w0Var) {
        super(hVar, true);
        this.d = thread;
        this.e = w0Var;
    }

    @Override // ld.u1
    public final void f(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (kotlin.jvm.internal.j.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
