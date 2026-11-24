// default package

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ol0 extends b2 {
    public final Thread e;
    public final o54 f;

    public ol0(cy2 cy2Var, Thread thread, o54 o54Var) {
        super(cy2Var, true);
        this.e = thread;
        this.f = o54Var;
    }

    @Override // ov5
    public final void f(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.e;
        if (rr5.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
