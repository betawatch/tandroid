package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
final class J1 extends O1 implements N1, b2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ j$.util.function.q0 c;
    final /* synthetic */ r d;

    @Override // j$.util.stream.d2, j$.util.function.l
    public final /* synthetic */ void accept(double d) {
        t0.b();
        throw null;
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void accept(long j) {
        t0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        o((Integer) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.G
    public final /* synthetic */ j$.util.function.G l(j$.util.function.G g) {
        return j$.com.android.tools.r8.a.b(this, g);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.b2
    public final /* synthetic */ void o(Integer num) {
        t0.g(this, num);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.N1
    public final void h(N1 n1) {
        Object obj = this.a;
        this.d.b.accept(obj, ((J1) n1).a);
        this.a = obj;
    }

    @Override // j$.util.stream.d2
    public final void n(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.d2
    public final void accept(int i) {
        this.c.accept(this.a, i);
    }

    J1(Supplier supplier, j$.util.function.q0 q0Var, r rVar) {
        this.b = supplier;
        this.c = q0Var;
        this.d = rVar;
    }
}
