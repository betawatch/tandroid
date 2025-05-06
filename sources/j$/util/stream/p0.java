package j$.util.stream;

/* loaded from: classes2.dex */
final class p0 extends q0 implements b2 {
    final /* synthetic */ r0 c;
    final /* synthetic */ j$.util.function.q d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p0(j$.util.function.q qVar, r0 r0Var) {
        super(r0Var);
        this.c = r0Var;
        this.d = qVar;
    }

    @Override // j$.util.stream.q0, j$.util.stream.e2, j$.util.function.m
    public final void accept(double d) {
        boolean z;
        boolean z2;
        if (this.a) {
            return;
        }
        boolean test = this.d.a.test(d);
        r0 r0Var = this.c;
        z = r0Var.a;
        if (test == z) {
            this.a = true;
            z2 = r0Var.b;
            this.b = z2;
        }
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        r((Double) obj);
    }

    @Override // j$.util.function.m
    public final /* synthetic */ j$.util.function.m k(j$.util.function.m mVar) {
        return j$.com.android.tools.r8.a.b(this, mVar);
    }

    @Override // j$.util.stream.b2
    public final /* synthetic */ void r(Double d) {
        u0.e(this, d);
    }
}
