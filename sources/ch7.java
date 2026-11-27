// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ch7 extends q2 implements Runnable {
    public final Runnable n;

    public ch7(Runnable runnable) {
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
