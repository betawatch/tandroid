package bi;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e8 implements fs {
    public final int a;
    public final di.o8 b;
    public final u7 c;
    public y7 d;
    public boolean e;

    public e8(int i7, long j3) {
        this.a = i7;
        di.o8 o8Var = new di.o8(i7, 0L, false);
        this.b = o8Var;
        o8Var.p = j3;
        u7 u7Var = new u7(i7, j3, new ai.g0(this, 4));
        u7Var.x = true;
        this.c = u7Var;
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
        y7 y7Var;
        if (i7 == ks.I3 && objArr[1] == this.b && (y7Var = this.d) != null) {
            y7Var.run();
        }
    }
}
