package be;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
