package be;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
