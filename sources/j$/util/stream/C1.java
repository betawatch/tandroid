package j$.util.stream;

import j$.util.Optional;
import j$.util.function.BinaryOperator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class C1 implements N1 {
    private boolean a;
    private Object b;
    final /* synthetic */ BinaryOperator c;

    @Override // j$.util.stream.d2, j$.util.function.l
    public final /* synthetic */ void accept(double d) {
        t0.b();
        throw null;
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void accept(int i) {
        t0.k();
        throw null;
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void accept(long j) {
        t0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ boolean q() {
        return false;
    }

    C1(BinaryOperator binaryOperator) {
        this.c = binaryOperator;
    }

    @Override // j$.util.stream.N1
    public final void h(N1 n1) {
        C1 c1 = (C1) n1;
        if (c1.a) {
            return;
        }
        r(c1.b);
    }

    @Override // j$.util.stream.d2
    public final void n(long j) {
        this.a = true;
        this.b = null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void r(Object obj) {
        if (this.a) {
            this.a = false;
            this.b = obj;
        } else {
            this.b = this.c.apply(this.b, obj);
        }
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        return this.a ? Optional.empty() : Optional.of(this.b);
    }
}
