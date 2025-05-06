package j$.util.stream;

/* loaded from: classes2.dex */
final class o0 extends q0 implements d2 {
    final /* synthetic */ r0 c;
    final /* synthetic */ j$.util.function.W d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o0(j$.util.function.W w, r0 r0Var) {
        super(r0Var);
        this.c = r0Var;
        this.d = w;
    }

    @Override // j$.util.stream.q0, j$.util.stream.e2
    public final void accept(long j) {
        boolean z;
        boolean z2;
        if (this.a) {
            return;
        }
        boolean test = this.d.a.test(j);
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
        j((Long) obj);
    }

    @Override // j$.util.function.T
    public final /* synthetic */ j$.util.function.T f(j$.util.function.T t) {
        return j$.com.android.tools.r8.a.d(this, t);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void j(Long l) {
        u0.i(this, l);
    }
}
