// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class aff extends wdf implements Runnable {
    public final Runnable n;

    public aff(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // wdf
    public final String a() {
        return kt6.o("task=[", this.n.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e) {
            if (wdf.f.f(this, null, new pdf(e))) {
                wdf.g(this);
            }
            throw e;
        }
    }
}
