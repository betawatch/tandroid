package k2;

import m4.m1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements e2.o, e2.j {
    public final /* synthetic */ long a;

    public /* synthetic */ f0(long j10) {
        this.a = j10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((m1) obj).g(this.a);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        y yVar;
        p0 p0Var = (p0) obj;
        t0 t0Var = p0Var.b;
        if (p0Var.equals(t0Var.j) && (yVar = t0Var.n) != null) {
            yVar.a(this.a);
        }
    }
}
