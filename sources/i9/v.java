package i9;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
