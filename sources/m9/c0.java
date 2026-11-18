package m9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class c0 extends h implements Runnable {
    public final Runnable n;

    public c0(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // m9.o
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
