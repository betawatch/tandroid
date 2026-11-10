package bg;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
