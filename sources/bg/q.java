package bg;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class q {
    public final p a;
    public long b;
    public boolean c;
    public final a3.f d = new a3.f(this, 13);

    public q(p pVar) {
        this.a = pVar;
    }

    public final void a(long j3) {
        if (this.c && this.b == j3) {
            return;
        }
        this.b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.c = true;
        a3.f fVar = this.d;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.i3(fVar, 1000L);
    }

    public final void b() {
        this.c = false;
        org.telegram.messenger.g0.r(this.d);
    }
}
