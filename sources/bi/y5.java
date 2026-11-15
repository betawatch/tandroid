package bi;

import di.m8;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y5 implements is {
    public final int a;
    public final m8 b;
    public final o5 c;
    public s5 d;
    public boolean e;

    public y5(int i7, long j3) {
        this.a = i7;
        m8 m8Var = new m8(i7, 0L, false);
        this.b = m8Var;
        m8Var.p = j3;
        o5 o5Var = new o5(i7, j3, new ai.f0(this, 2));
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
