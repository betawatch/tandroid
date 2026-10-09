package ae;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class h extends a {
    public final Thread d;
    public final y0 e;

    public h(jd.h hVar, Thread thread, y0 y0Var) {
        super(hVar, true);
        this.d = thread;
        this.e = y0Var;
    }

    @Override // ae.w1
    public final void f(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (kotlin.jvm.internal.i.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
