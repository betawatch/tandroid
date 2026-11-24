// default package

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
