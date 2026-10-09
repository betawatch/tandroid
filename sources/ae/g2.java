package ae;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class g2 extends fe.s implements Runnable {
    public final long e;

    public g2(long j3, jd.c cVar) {
        super(cVar, cVar.getContext());
        this.e = j3;
    }

    @Override // ae.w1
    public final String C() {
        return super.C() + "(timeMillis=" + this.e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        g0.j(this.c);
        i(new f2("Timed out waiting for " + this.e + " ms", this));
    }
}
