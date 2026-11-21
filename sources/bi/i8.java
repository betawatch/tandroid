package bi;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class i8 implements fs {
    public final int a;
    public final di.p8 b;
    public final y7 c;
    public c8 d;
    public boolean e;

    public i8(int i7, long j3) {
        this.a = i7;
        di.p8 p8Var = new di.p8(i7, 0L, false);
        this.b = p8Var;
        p8Var.p = j3;
        y7 y7Var = new y7(i7, j3, new ai.h0(this, 4));
        y7Var.x = true;
        this.c = y7Var;
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
        c8 c8Var;
        if (i7 == ks.I3 && objArr[1] == this.b && (c8Var = this.d) != null) {
            c8Var.run();
        }
    }
}
