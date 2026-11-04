package cg;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p {
    public final o a;
    public long b;
    public boolean c;
    public final ai.s d = new ai.s(this, 23);

    public p(o oVar) {
        this.a = oVar;
    }

    public final void a(long j10) {
        if (this.c && this.b == j10) {
            return;
        }
        this.b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.c = true;
        ai.s sVar = this.d;
        org.telegram.messenger.g0.r(sVar);
        org.telegram.messenger.g0.i3(sVar, 1000L);
    }

    public final void b() {
        this.c = false;
        org.telegram.messenger.g0.r(this.d);
    }
}
