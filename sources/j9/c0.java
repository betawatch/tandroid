package j9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c0 extends h implements Runnable {
    public final Runnable n;

    public c0(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // j9.o
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
