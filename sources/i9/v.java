package i9;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class v extends AbstractOwnableSynchronizer implements Runnable {
    public final d0 a;

    public v(d0 d0Var) {
        this.a = d0Var;
    }

    public static void a(v vVar, Thread thread) {
        vVar.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
