package bi;

import org.telegram.messenger.gs;
import org.telegram.messenger.ls;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class h8 implements gs {
    public final int a;
    public final di.p8 b;
    public final x7 c;
    public b8 d;
    public boolean e;

    public h8(int i7, long j3) {
        this.a = i7;
        di.p8 p8Var = new di.p8(i7, 0L, false);
        this.b = p8Var;
        p8Var.p = j3;
        x7 x7Var = new x7(i7, j3, new ai.h0(this, 4));
        x7Var.x = true;
        this.c = x7Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        ls.f(this.a).c(this, ls.I3);
        this.b.a();
        this.c.l(false);
        this.e = true;
    }

    public final void b() {
        if (this.e) {
            ls.f(this.a).n(this, ls.I3);
            this.b.f();
            this.c.i();
            this.e = false;
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        b8 b8Var;
        if (i7 == ls.I3 && objArr[1] == this.b && (b8Var = this.d) != null) {
            b8Var.run();
        }
    }
}
