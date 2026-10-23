package k2;

import m4.m1;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements e2.o, e2.j {
    public final /* synthetic */ long a;

    public /* synthetic */ e0(long j10) {
        this.a = j10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((m1) obj).g(this.a);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        x xVar;
        p0 p0Var = (p0) obj;
        t0 t0Var = p0Var.b;
        if (p0Var.equals(t0Var.j) && (xVar = t0Var.n) != null) {
            xVar.a(this.a);
        }
    }
}
