// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dib extends aib {
    public final Runnable c;

    public dib(long j, boolean z, Runnable runnable) {
        super(j, z);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(ea3.a(runnable));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
