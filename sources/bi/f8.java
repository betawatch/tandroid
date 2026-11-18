package bi;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f8 implements fs {
    public final int a;
    public final di.o8 b;
    public final v7 c;
    public z7 d;
    public boolean e;

    public f8(int i7, long j3) {
        this.a = i7;
        di.o8 o8Var = new di.o8(i7, 0L, false);
        this.b = o8Var;
        o8Var.p = j3;
        v7 v7Var = new v7(i7, j3, new ai.g0(this, 4));
        v7Var.x = true;
        this.c = v7Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        ks.f(this.a).c(this, ks.I3);
        this.b.a();
        this.c.l(false);
        this.e = true;
    }

    public final void b() {
        if (this.e) {
            ks.f(this.a).n(this, ks.I3);
            this.b.f();
            this.c.i();
            this.e = false;
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        z7 z7Var;
        if (i7 == ks.I3 && objArr[1] == this.b && (z7Var = this.d) != null) {
            z7Var.run();
        }
    }
}
