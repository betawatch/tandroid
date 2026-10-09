package ae;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class u0 extends v0 {
    public final g2 c;

    public u0(long j3, g2 g2Var) {
        super(j3);
        this.c = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // ae.v0
    public final String toString() {
        return super.toString() + this.c;
    }
}
