package j$.util.stream;

/* loaded from: classes2.dex */
final class n0 extends q0 implements c2 {
    final /* synthetic */ r0 c;
    final /* synthetic */ j$.util.function.G d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n0(j$.util.function.G g, r0 r0Var) {
        super(r0Var);
        this.c = r0Var;
        this.d = g;
    }

    @Override // j$.util.stream.q0, j$.util.stream.e2
    public final void accept(int i) {
        boolean z;
        boolean z2;
        if (this.a) {
            return;
        }
        boolean test = this.d.a.test(i);
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
        o((Integer) obj);
    }

    @Override // j$.util.function.E
    public final /* synthetic */ j$.util.function.E l(j$.util.function.E e) {
        return j$.com.android.tools.r8.a.c(this, e);
    }

    @Override // j$.util.stream.c2
    public final /* synthetic */ void o(Integer num) {
        u0.g(this, num);
    }
}
