package j$.util.stream;

/* loaded from: classes2.dex */
public final class a8 implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ Runnable b;

    public a8(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
            this.b.run();
        } catch (Throwable th2) {
            try {
                this.b.run();
            } catch (Throwable th3) {
                try {
                    th2.addSuppressed(th3);
                } catch (Throwable unused) {
                }
            }
            throw th2;
        }
    }
}
