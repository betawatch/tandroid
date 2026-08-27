package id;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f2 extends nd.s implements Runnable {
    public final long e;

    public f2(long j10, rc.c cVar) {
        super(cVar, cVar.getContext());
        this.e = j10;
    }

    @Override // id.v1
    public final String C() {
        return super.C() + "(timeMillis=" + this.e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0.j(this.c);
        i(new e2("Timed out waiting for " + this.e + " ms", this));
    }
}
