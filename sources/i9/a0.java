package i9;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
