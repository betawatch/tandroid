package i9;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class a0 extends h implements Runnable {
    public final Runnable n;

    public a0(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // i9.o
    public final String k() {
        return "task=[" + this.n + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
