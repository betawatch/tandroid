// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dh7 extends q2 implements Runnable {
    public final Runnable n;

    public dh7(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // u2
    public final String j() {
        return "task=[" + this.n + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
