package bi;

import di.l8;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y5 implements is {
    public final int a;
    public final l8 b;
    public final o5 c;
    public s5 d;
    public boolean e;

    public y5(int i7, long j3) {
        this.a = i7;
        l8 l8Var = new l8(i7, 0L, false);
        this.b = l8Var;
        l8Var.p = j3;
        o5 o5Var = new o5(i7, j3, new ai.g0(this, 2));
        o5Var.s = true;
        this.c = o5Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        ns.f(this.a).c(this, ns.G3);
        this.b.a();
        this.c.g(false);
        this.e = true;
    }

    public final void b() {
        if (this.e) {
            ns.f(this.a).n(this, ns.G3);
            this.b.f();
            this.c.f();
            this.e = false;
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        s5 s5Var;
        if (i7 == ns.G3 && objArr[1] == this.b && (s5Var = this.d) != null) {
            s5Var.run();
        }
    }
}
