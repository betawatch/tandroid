package be;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class f2 extends ge.s implements Runnable {
    public final long e;

    public f2(long j10, kd.c cVar) {
        super(cVar, cVar.getContext());
        this.e = j10;
    }

    @Override // be.v1
    public final String C() {
        return super.C() + "(timeMillis=" + this.e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0.j(this.c);
        i(new e2("Timed out waiting for " + this.e + " ms", this));
    }
}
