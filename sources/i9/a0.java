package i9;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
