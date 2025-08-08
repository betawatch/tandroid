package j$.util.stream;

/* loaded from: classes2.dex */
final class n0 extends p0 implements c2 {
    final /* synthetic */ q0 c;
    final /* synthetic */ j$.util.function.b0 d;

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        j((Long) obj);
    }

    @Override // j$.util.function.Y
    public final /* synthetic */ j$.util.function.Y f(j$.util.function.Y y) {
        return j$.com.android.tools.r8.a.c(this, y);
    }

    @Override // j$.util.stream.c2
    public final /* synthetic */ void j(Long l) {
        t0.i(this, l);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n0(j$.util.function.b0 b0Var, q0 q0Var) {
        super(q0Var);
        this.c = q0Var;
        this.d = b0Var;
    }

    @Override // j$.util.stream.p0, j$.util.stream.d2
    public final void accept(long j) {
        boolean z;
        boolean z2;
        if (this.a) {
            return;
        }
        boolean test = this.d.a.test(j);
        q0 q0Var = this.c;
        z = q0Var.a;
        if (test == z) {
            this.a = true;
            z2 = q0Var.b;
            this.b = z2;
        }
    }
}
