package j$.util.stream;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class g8 implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ Runnable b;

    public g8(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
            this.b.run();
        } catch (Throwable th) {
            try {
                this.b.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
