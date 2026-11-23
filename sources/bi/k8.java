package bi;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k8 implements fs {
    public final int a;
    public final di.p8 b;
    public final a8 c;
    public e8 d;
    public boolean e;

    public k8(int i7, long j3) {
        this.a = i7;
        di.p8 p8Var = new di.p8(i7, 0L, false);
        this.b = p8Var;
        p8Var.p = j3;
        a8 a8Var = new a8(i7, j3, new ai.d0(this, 4));
        a8Var.x = true;
        this.c = a8Var;
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
        e8 e8Var;
        if (i7 == ks.I3 && objArr[1] == this.b && (e8Var = this.d) != null) {
            e8Var.run();
        }
    }
}
