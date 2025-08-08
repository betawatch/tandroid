package j$.util.stream;

/* loaded from: classes2.dex */
final class o0 extends p0 implements a2 {
    final /* synthetic */ q0 c;
    final /* synthetic */ j$.util.function.p d;

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        r((Double) obj);
    }

    @Override // j$.util.function.l
    public final /* synthetic */ j$.util.function.l k(j$.util.function.l lVar) {
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    @Override // j$.util.stream.a2
    public final /* synthetic */ void r(Double d) {
        t0.e(this, d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o0(j$.util.function.p pVar, q0 q0Var) {
        super(q0Var);
        this.c = q0Var;
        this.d = pVar;
    }

    @Override // j$.util.stream.p0, j$.util.stream.d2, j$.util.function.l
    public final void accept(double d) {
        boolean z;
        boolean z2;
        if (this.a) {
            return;
        }
        boolean test = this.d.a.test(d);
        q0 q0Var = this.c;
        z = q0Var.a;
        if (test == z) {
            this.a = true;
            z2 = q0Var.b;
            this.b = z2;
        }
    }
}
