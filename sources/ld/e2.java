package ld;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e2 extends qd.s implements Runnable {
    public final long e;

    public e2(long j10, uc.c cVar) {
        super(cVar, cVar.getContext());
        this.e = j10;
    }

    @Override // ld.u1
    public final String C() {
        return super.C() + "(timeMillis=" + this.e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0.j(this.c);
        i(new d2("Timed out waiting for " + this.e + " ms", this));
    }
}
