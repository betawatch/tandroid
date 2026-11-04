package ai;

import ci.v8;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g6 implements cs {
    public final int a;
    public final v8 b;
    public final w5 c;
    public a6 d;
    public boolean e;

    public g6(int i3, long j10) {
        this.a = i3;
        v8 v8Var = new v8(i3, 0L, false);
        this.b = v8Var;
        v8Var.p = j10;
        w5 w5Var = new w5(i3, j10, new v2(this, 2));
        w5Var.s = true;
        this.c = w5Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        hs.f(this.a).c(this, hs.G3);
        this.b.a();
        this.c.g(false);
        this.e = true;
    }

    public final void b() {
        if (this.e) {
            hs.f(this.a).n(this, hs.G3);
            this.b.f();
            this.c.f();
            this.e = false;
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        a6 a6Var;
        if (i3 == hs.G3 && objArr[1] == this.b && (a6Var = this.d) != null) {
            a6Var.run();
        }
    }
}
