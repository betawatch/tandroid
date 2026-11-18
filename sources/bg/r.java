package bg;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class r {
    public final q a;
    public long b;
    public boolean c;
    public final a3.f d = new a3.f(this, 17);

    public r(q qVar) {
        this.a = qVar;
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
        org.telegram.messenger.g0.h3(fVar, 1000L);
    }

    public final void b() {
        this.c = false;
        org.telegram.messenger.g0.r(this.d);
    }
}
