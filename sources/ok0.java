// default package

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ok0 extends b2 {
    public final Thread e;
    public final d44 f;

    public ok0(sw2 sw2Var, Thread thread, d44 d44Var) {
        super(sw2Var, true);
        this.e = thread;
        this.f = d44Var;
    }

    @Override // pt5
    public final void f(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.e;
        if (rp5.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
